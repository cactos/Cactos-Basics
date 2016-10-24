package eu.cactosfp7.cdosession.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.measure.quantity.DataAmount;
import javax.measure.quantity.DataRate;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Frequency;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jscience.physics.amount.Amount;

import eu.cactosfp7.infrastructuremodels.load.logical.LogicalLoadModel;
import eu.cactosfp7.infrastructuremodels.load.logical.VirtualMemoryMeasurement;
import eu.cactosfp7.infrastructuremodels.load.logical.VirtualProcessingUnitsMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.InterconnectMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.MemoryMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.PhysicalLoadModel;
import eu.cactosfp7.infrastructuremodels.load.physical.PowerConsumingEntityMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.PuMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.StorageMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.Utilization;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VM_State;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorRepository;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorType;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureType;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureTypeRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ConnectedEntity;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.MemorySpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NetworkInterconnect;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PowerDistributionUnit;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Rack;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.PowerConsumingEntity;
import eu.cactosfp7.infrastructuremodels.physicaldc.power.PowerProvidingEntity;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.Bandwidth;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.NamedElement;
import eu.cactosfp7.infrastructuremodels.physicaldc.util.UtilFactory;
import eu.cactosfp7.infrastructuremodels.util.modelbuilder.logical.VirtualMachineFactory;

public class CdoHelper {

	private static volatile boolean createVmsInCDO = false;

	private final static Logger logger = Logger.getLogger(CdoHelper.class);

	public static VirtualMachine createVMModel(LogicalDCModel logicalDcModel,
			ArchitectureTypeRepository architectureTypeRepository,
			int vcores,
			int memory,
			int diskspace,
			String imageref,
			Map<String, String> inputParameters) {
		logger.info("Going to create VirtualMachine model ...");
		// convert vm parameters
		ArchitectureType architectureTypeX86 = CdoHelper.getArchitectureTypeByName(architectureTypeRepository, "x86_64");
		if(null == architectureTypeX86){
			logger.error("Architecture type x86_64 not found.");
		}
		Amount<Frequency> amountFrequency = Amount.valueOf(0, Frequency.UNIT);
		Amount<DataAmount> amountMemory = Amount.valueOf(memory, SI.MEGA(NonSI.BYTE));
		Amount<DataAmount> amountDiskspace = Amount.valueOf(diskspace, SI.GIGA(NonSI.BYTE));
		//		VMImage instantiatedImage = CdoHelper.getVMImageByName(logicalDcModel, imageref);
		//		if (instantiatedImage == null) {
		//			// if no image found, create a new one
		//			instantiatedImage = createVmImage(logicalDcModel, imageref);
		//		}

		// create new VMImage for each new VM to set root disk size
		String imageName = imageref + "-" + diskspace + "-"+(System.currentTimeMillis() / 1000L);
		VMImage instantiatedImage = createVmImage(logicalDcModel, imageName);

		// create virtual machine and store it in logigaldcmodel
		VirtualMachineFactory vmf = new VirtualMachineFactory();
		VirtualMachine vm = vmf.createUnassignedVirtualMachine(logicalDcModel, vcores, amountFrequency, architectureTypeX86, amountMemory, amountDiskspace, instantiatedImage);
		vm.setState(VM_State.NEW);
		vm.setName("anonymous");
		vm.getVMImageInstance().getRootDisk().setCapacity(amountDiskspace);
		vm.getVMImageInstance().getRootDisk().setUsedCapacity(Amount.valueOf(0, SI.GIGA(NonSI.BYTE)));
		vm.getInputParameters().putAll(inputParameters);

		logger.info("VirtualMachine model created: " + vm);
		return vm;
	}
	
	// TODO use the Builder from model updater instead the following method
	private static VMImage createVmImage(LogicalDCModel logicalDCModel, String imageref) {
		VMImage _vmImage = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVMImage();
		_vmImage.setLogicalDCModel(logicalDCModel);
		_vmImage.setName(imageref);
		return _vmImage;
	}
	
	public static void deleteVirtualMachine(VirtualMachine vm) {
		if(vm == null) {
			logger.info("vm not found");
			return;
		}
		// remove newly created virtual machine
		// vm.getVMImageInstance().getVolumes().clear();
		if(vm.getVMImageInstance() != null) {
			if(vm.getVMImageInstance().getRootDisk() != null) {
				logger.info("remove vmImageInstance RootDisk");
				EcoreUtil.delete(vm.getVMImageInstance().getRootDisk());
			} else {
				logger.info("vmImageInstance RootDisk not set");
			}
			logger.info("remove vmImageInstance");
			EcoreUtil.delete(vm.getVMImageInstance());
		}
		logger.info("remove vm");
		vm.setHypervisor(null);
		EcoreUtil.delete(vm);
	}
	
	public static void deleteVirtualMachineOld(VirtualMachine typeToDelete) {
		/* this is the very old version. trying to align all versions by calling one class 
		 * // HERE!!!!!!!to commentara
		 * VMImageInstance vmImageInstanceFromAboutToDeleteVM = typeToDelete.getVMImageInstance();
		 * VMImage vmImage = null;
		 * // FIXME: auto edw prepei na ginei handle
		 * // if
		 * // (vmImageInstanceFromAboutToDeleteVM.getExecutedVMImage()
		 * // != null) {
		 * // vmImage =
		 * // CdoHelper.getEquivalentVMImageFromLogicalDCModel(cdoLogicalDCModel,
		 * // vmImageInstanceFromAboutToDeleteVM.getExecutedVMImage().getName());
		 * // vmImage.getVirtualMachine().remove(vmImageInstanceFromAboutToDeleteVM);
		 * // }
		 * EcoreUtil.delete(typeToDelete);
		 */
		deleteVirtualMachine(typeToDelete);
	}
	
	public static void deleteVirtualMachineInOffOrFailureState(VirtualMachine deleteVM) {
		// EcoreUtil.delete(deleteVM);
		logger.debug("Delete VM" + deleteVM.getName() + " from hypervisor with computenode in OFF or FAILURE state");
		deleteVirtualMachine(deleteVM);
	}
	
	public static <T> PhysicalDCModel findPhysicalDCModel(List<T> models) {
		return (PhysicalDCModel) findObject(PhysicalDCModel.class, models);
	}

	public static <T> PhysicalLoadModel findPhysicalLoadModel(List<T> models) {
		return (PhysicalLoadModel) findObject(PhysicalLoadModel.class, models);
	}

	public static <T> LogicalDCModel findLogicalDCModel(List<T> models) {
		return (LogicalDCModel) findObject(LogicalDCModel.class, models);
	}

	public static <T> LogicalLoadModel findLogicalLoadModel(List<T> models) {
		return (LogicalLoadModel) findObject(LogicalLoadModel.class, models);
	}

	public static <T> HypervisorRepository findHypervisorRepository(List<T> models) {
		return (HypervisorRepository) findObject(HypervisorRepository.class, models);
	}

	public static <T> ArchitectureTypeRepository findArchitectureTypeRepository(List<T> models) {
		return (ArchitectureTypeRepository) findObject(ArchitectureTypeRepository.class, models);
	}

	private static <T> T findObject(Class<?> c, List<T> models) {
		for (T object : models) {
			if (c.isAssignableFrom(object.getClass())) {
				return (T) object;
			}
		}
		return null;
	}

	public static <T> T getModelByIdentifier(List<T> models, String identifier) throws Exception {
		for (T model : models) {
			if (model instanceof ArchitectureType) {
				if (((ArchitectureType) model).getName().equals(identifier))
					return model;
			} else if (model instanceof HypervisorType) {
				if (((HypervisorType) model).getName().equals(identifier))
					return model;
			} else if (model instanceof Hypervisor) {
				if (((Hypervisor) model).getNode().getName().equals(identifier))
					return model;
			} else if (model instanceof VMImage) {
				if (((VMImage) model).getName().equals(identifier))
					return model;
			} else if (model instanceof VirtualMemory) {
				if (((VirtualMachine) ((VirtualMemory) model).getVirtualMemoryConsumingEntity()).getName().equals(identifier))
					return model;
			} else if (model instanceof VirtualProcessingUnit) {
				if (((VirtualProcessingUnit) model).getVirtualMachine().getName().equals(identifier))
					return model;
			} else if (model instanceof VirtualMemoryMeasurement) {
				if (((VirtualMachine) ((VirtualMemoryMeasurement) model).getObservedVirtualMemory().getVirtualMemoryConsumingEntity()).getName().equals(identifier))
					return model;
			} else if (model instanceof VirtualProcessingUnitsMeasurement) {
				if (((VirtualProcessingUnitsMeasurement) model).getObservedVirtualProcessingUnit().getVirtualMachine().getName().equals(identifier))
					return model;
			} else if (model instanceof MemoryMeasurement) {
				if (((MemoryMeasurement) model).getObservedMemory().getNode().getName().equals(identifier))
					return model;
			} else if (model instanceof PuMeasurement) {
				if (((PuMeasurement) model).getObservedPu().getNode().getName().equals(identifier))
					return model;
			} else if (model instanceof StorageMeasurement) {
				if (((StorageMeasurement) model).getObservedStorage().getNode().getName().equals(identifier))
					return model;
			} else if (model instanceof PowerConsumingEntityMeasurement) {
				if (((PowerConsumingEntityMeasurement) model).getPowerConsumingEntity().getName().equals(identifier))
					return model;
			} else if (model instanceof InterconnectMeasurement) {
				if (((ComputeNode) ((InterconnectMeasurement) model).getObservedInterconnect().getConnectedEntities().get(0)).getName().equals(identifier))
					return model;
			} else if (model instanceof NamedElement) {
				if (((NamedElement) model).getName().equals(identifier))
					return model;
			} else {
				throw new Exception("Can't search for type: " + model.getClass().getName());
			}
		}
		return null;
	}

	public static <T> T getModelByIdentifierForNetworkInterconnects(List<T> models, String identifier) throws Exception {
		for (T model : models) {
			if (model instanceof NetworkInterconnect) {
				for (ConnectedEntity node : ((NetworkInterconnect) model).getConnectedEntities()) {
					// Maybe other types also
					if (node instanceof ComputeNode) {
						if (((ComputeNode) node).getName().equals(identifier)) {
							return model;
						}
					}
				}
			}
		}
		return null;

	}

	public static <T> T getModelByIdentifierForPowerDistributionUnits(List<T> models, String identifier) throws Exception {
		for (T model : models) {
			if (model instanceof PowerDistributionUnit) {
				for (PowerConsumingEntity node : ((PowerDistributionUnit) model).getPowerConsumingEntities()) {
					if (node.getName().equals(identifier)) {
						return model;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Update the Physical DC Model and its nodes.
	 */
	public static void checkAndUpdatePhysicalDCModel(PhysicalDCModel cdoPhysicalDCModel,
		PhysicalDCModel hbasePhysicalDCModel,
		LogicalDCModel cdoLogicalDCModel,
		HypervisorRepository cdoHypervisorRepository,
		ArchitectureTypeRepository cdoArchitectureTypeRepository,
		boolean updateUtilisation,
		Collection<String> availableComputeNodes) throws Exception {

		if (cdoPhysicalDCModel != null && hbasePhysicalDCModel != null) {
			EList<NetworkInterconnect> cdoNetworkInterconnects = cdoPhysicalDCModel.getNetworkInterconnects();
			EList<NetworkInterconnect> hbaseNetworkInterconnects = hbasePhysicalDCModel.getNetworkInterconnects();

			logger.debug("iterating cdo NetworkInterconnects");
			for (NetworkInterconnect cdoNetworkInterconnect : cdoNetworkInterconnects) {
				// FIXME:Handles only computenodes networkinterconnects
				ComputeNode computenode = (ComputeNode) cdoNetworkInterconnect.getConnectedEntities().get(0);
				NetworkInterconnect hbaseNetworkInterconnect = null;
				if (computenode != null) {
					hbaseNetworkInterconnect = CdoHelper.getModelByIdentifierForNetworkInterconnects(hbaseNetworkInterconnects, computenode.getName());
				}
				if (hbaseNetworkInterconnect != null) {
					logger.debug("NetworkInterconnect: It exists already for computenode " + computenode.getName());
					if (hbaseNetworkInterconnect.getBandwidth() != null && cdoNetworkInterconnect.getBandwidth() != null) {
						if (!cdoNetworkInterconnect.getBandwidth().getValue().equals(hbaseNetworkInterconnect.getBandwidth().getValue())) {
							cdoNetworkInterconnect.setBandwidth(hbaseNetworkInterconnect.getBandwidth());
						}
					}
				} else {
					logger.debug("NetworkInterconnect: Won't delete it from cdo.");
				}
			}

			List<NetworkInterconnect> networkToAdd = new ArrayList<NetworkInterconnect>();

			logger.debug("iterating hbase NetworkInterconnects");
			for (NetworkInterconnect hbaseNetworkInterconnect : hbaseNetworkInterconnects) {
				ComputeNode computenode = (ComputeNode) hbaseNetworkInterconnect.getConnectedEntities().get(0);
				NetworkInterconnect cdoNetworkInterconnect = CdoHelper.getModelByIdentifierForNetworkInterconnects(cdoNetworkInterconnects, computenode.getName());

				if (cdoNetworkInterconnect == null) {
					logger.debug("NetworkInterconnect: Add the hbase model to " + computenode.getName());
					networkToAdd.add(hbaseNetworkInterconnect);
				}
			}

			for (NetworkInterconnect networkInterconnect : networkToAdd) {
				networkInterconnect.setPhysicalDCModel(cdoPhysicalDCModel);
			}

			EList<PowerDistributionUnit> cdoPowerDistributionUnits = cdoPhysicalDCModel.getPowerSupplies();
			EList<PowerDistributionUnit> hbasePowerDistributionUnits = hbasePhysicalDCModel.getPowerSupplies();

			logger.debug("iterating cdo PowerDistributionUnits");
			for (PowerDistributionUnit cdoPowerDistributionUnit : cdoPowerDistributionUnits) {
				for (PowerConsumingEntity computenode : cdoPowerDistributionUnit.getPowerConsumingEntities()) {
					PowerDistributionUnit hbasePowerDistributionUnit = null;
					if (computenode != null) {
						hbasePowerDistributionUnit = CdoHelper.getModelByIdentifierForPowerDistributionUnits(hbasePowerDistributionUnits, computenode.getName());
					}
					if (hbasePowerDistributionUnit != null) {
						logger.debug("PowerDistributionUnit: It exists already for " + computenode.getName());
						if (!cdoPowerDistributionUnit.getSuppliablePeakPower().equals(hbasePowerDistributionUnit.getSuppliablePeakPower())) {
							cdoPowerDistributionUnit.setSuppliablePeakPower(hbasePowerDistributionUnit.getSuppliablePeakPower());
						}
					} else {
						logger.debug("PowerDistributionUnit: not found in hbase: Won't delete it from cdo for " + computenode.getName());
					}
				}
			}

			List<PowerDistributionUnit> powerToAdd = new ArrayList<PowerDistributionUnit>();

			logger.debug("iterating hbase PowerDistributionUnits");
			for (PowerDistributionUnit hbasePowerDistributionUnit : hbasePowerDistributionUnits) {
				ComputeNode computenode = (ComputeNode) hbasePowerDistributionUnit.getPowerConsumingEntities().get(0);
				PowerDistributionUnit cdoPowerDistributionUnit = CdoHelper.getModelByIdentifierForPowerDistributionUnits(cdoPowerDistributionUnits, computenode.getName());

				if (cdoPowerDistributionUnit == null) {
					powerToAdd.add(hbasePowerDistributionUnit);
					logger.debug("PowerDistributionUnit: Add the hbase model to " + computenode.getName());
				}
			}
			for (PowerDistributionUnit powerDistributionUnit : powerToAdd) {
				EList<PowerDistributionUnit> units = cdoPhysicalDCModel.getPowerSupplies();
				boolean isExists = false;
				for (PowerDistributionUnit cdoPowerDistributionUnit : units) {
					if (cdoPowerDistributionUnit.getName().equals(powerDistributionUnit.getName())) {
						isExists = true;
						cdoPowerDistributionUnit.getPowerConsumingEntities().add(powerDistributionUnit.getPowerConsumingEntities().get(0));
					}
				}

				if (!isExists) {
					powerDistributionUnit.setPhysicalDCModel(cdoPhysicalDCModel);
				}
			}
		}

		EList<Rack> cdoRacks = cdoPhysicalDCModel.getRacks();
		EList<Rack> hbaseRacks = hbasePhysicalDCModel.getRacks();

		for (Rack cdoRack : cdoRacks) {
			logger.debug("iterating cdo rack: " + cdoRack.getName());
			Rack hbaseRack = CdoHelper.getModelByIdentifier(hbaseRacks, cdoRack.getName());

			if (hbaseRack != null) {
				logger.debug("Rack: It exists already: " + cdoRack.getName());

				EList<AbstractNode> cdoComputeNodes = cdoRack.getNodes();
				EList<AbstractNode> hbaseComputeNodes = hbaseRack.getNodes();

				logger.debug("iterating cdo computenodes in rack " + cdoRack.getName());
				for (AbstractNode cdoComputeNode : cdoComputeNodes) {
					AbstractNode hbaseComputeNode = CdoHelper.getModelByIdentifier(hbaseComputeNodes, cdoComputeNode.getName());

					if (hbaseComputeNode != null) {
						logger.debug("ComputeNode: It exists already " + cdoComputeNode.getName());

						if (((ComputeNode) cdoComputeNode).getHypervisor() != null
								&& !((ComputeNode) cdoComputeNode).getHypervisor().getNode().getName().equals(((ComputeNode) hbaseComputeNode).getHypervisor().getNode().getName())) {

							String cdoNodeName = ((ComputeNode) cdoComputeNode).getHypervisor().getNode().getName();
							String hbaseNodeName = ((ComputeNode) hbaseComputeNode).getHypervisor().getNode().getName();
							logger.debug("ComputeNode: hypervisors do not match for " + cdoComputeNode.getName() + ":" + cdoNodeName + " vs " + hbaseNodeName);
							Hypervisor fittingHypervisor = CdoHelper.getEquivalentHypervisorFromLogicalDCModel(cdoLogicalDCModel, (ComputeNode) hbaseComputeNode);
							if (fittingHypervisor == null) {
								logger.debug("no equivalent hypervisor found in cdoLogicalDcModel: creating hbase node: " + hbaseNodeName);
								cdoHypervisorRepository.eResource().getContents().add(((ComputeNode) hbaseComputeNode).getHypervisor());
								((ComputeNode) cdoComputeNode).setHypervisor(((ComputeNode) hbaseComputeNode).getHypervisor());
							} else {
								logger.debug("equivalent hypervisor found, setting as hypervisor for cdo node: " + fittingHypervisor.getNode().getName());
								((ComputeNode) cdoComputeNode).setHypervisor(fittingHypervisor);
							}
						}

						EList<MemorySpecification> cdoMemorySpecifications = cdoComputeNode.getMemorySpecifications();
						EList<MemorySpecification> hbaseMemorySpecifications = hbaseComputeNode.getMemorySpecifications();
						boolean isMemoryAvailable = true;
						logger.debug("validating memory for cdo and hbase computenodes: " + cdoComputeNode.getName());
						if (cdoMemorySpecifications.size() != 1) {
							logger.warn("Wrong amount of cdoMemorySpecifications " + cdoComputeNode.getName());
							isMemoryAvailable = false;
						}
						if (hbaseMemorySpecifications.size() != 1) {
							logger.warn("Wrong amount of hbaseMemorySpecifications " + hbaseComputeNode.getName());
							isMemoryAvailable = false;
						}
						if (isMemoryAvailable) {
							logger.warn("memory available for both");
							if (!cdoMemorySpecifications.get(0).getSize().equals(hbaseMemorySpecifications.get(0).getSize())) {
								cdoMemorySpecifications.get(0).setSize(hbaseMemorySpecifications.get(0).getSize());
								logger.warn("memory sizes do not match: setting to hbase value");
							}
						} else {
							logger.warn("memory not available for any (or both)");
						}
						EList<StorageSpecification> cdoStorageSpecifications = cdoComputeNode.getStorageSpecifications();
						EList<StorageSpecification> hbaseStorageSpecifications = hbaseComputeNode.getStorageSpecifications();
						boolean isStorageAvailable = true;
						logger.info("comparing storage specifications for cdo and hbase computenodes: " + cdoComputeNode.getName());
						if (cdoStorageSpecifications.size() != 1) {
							logger.warn("Wrong amount of cdoStorageSpecifications " + cdoComputeNode.getName());
							isStorageAvailable = false;
						}

						if (hbaseStorageSpecifications.size() != 1) {
							logger.warn("Wrong amount of hbaseStorageSpecifications " + hbaseComputeNode.getName());
							isStorageAvailable = false;
						}
						if (isStorageAvailable) {
							logger.warn("storage available for both");
							StorageSpecification cdostorageSpec = cdoStorageSpecifications.get(0);
							StorageSpecification hbaseStorageSpec = hbaseStorageSpecifications.get(0);

							fixStoragesize(cdostorageSpec, hbaseStorageSpec);
							fixReadBandwidth(cdostorageSpec, hbaseStorageSpec);
							fixWriteBandwidth(cdostorageSpec, hbaseStorageSpec);
							fixWriteDelay(cdostorageSpec, hbaseStorageSpec);
							fixReadDelay(cdostorageSpec, hbaseStorageSpec);
						} else {
							logger.warn("storage not available for any (or both)");
						}

						EList<ProcessingUnitSpecification> cdoProcessingUnitSpecifications = cdoComputeNode.getCpuSpecifications();
						EList<ProcessingUnitSpecification> hbaseProcessingUnitSpecifications = hbaseComputeNode.getCpuSpecifications();
						boolean isProcessingUnitAvailable = true;
						logger.info("comparing processing unit specifications for cdo and hbase computenodes: " + cdoComputeNode.getName());
						if (cdoProcessingUnitSpecifications.size() != 1) {
							logger.warn("Wrong amount of cdoProcessingUnitSpecifications " + cdoComputeNode.getName());
							isProcessingUnitAvailable = false;
						}
						if (hbaseProcessingUnitSpecifications.size() != 1) {
							logger.warn("Wrong amount of hbaseProcessingUnitSpecifications " + hbaseComputeNode.getName());
							isProcessingUnitAvailable = false;
						}
						if (isProcessingUnitAvailable) {
							if (cdoProcessingUnitSpecifications.get(0).getPuId() != hbaseProcessingUnitSpecifications.get(0).getPuId()) {
								logger.warn("fixing puid");
								cdoProcessingUnitSpecifications.get(0).setPuId(hbaseProcessingUnitSpecifications.get(0).getPuId());
							}

							if (!cdoProcessingUnitSpecifications.get(0).getFrequency().equals(hbaseProcessingUnitSpecifications.get(0).getFrequency())) {
								logger.warn("fixing frequency");
								cdoProcessingUnitSpecifications.get(0).setFrequency(hbaseProcessingUnitSpecifications.get(0).getFrequency());
							}

							if (cdoProcessingUnitSpecifications.get(0).getNumberOfCores() != hbaseProcessingUnitSpecifications.get(0).getNumberOfCores()) {
								logger.warn("fixing #cores");
								cdoProcessingUnitSpecifications.get(0).setNumberOfCores(hbaseProcessingUnitSpecifications.get(0).getNumberOfCores());
							}

							if (cdoProcessingUnitSpecifications.get(0).getSupportsTurboMode() != hbaseProcessingUnitSpecifications.get(0).getSupportsTurboMode()) {
								logger.warn("fixing turbo mode");
								cdoProcessingUnitSpecifications.get(0).setSupportsTurboMode(hbaseProcessingUnitSpecifications.get(0).getSupportsTurboMode());
							}

							if (!cdoProcessingUnitSpecifications.get(0).getArchitectureType().getName().equals(hbaseProcessingUnitSpecifications.get(0).getArchitectureType().getName())) {
								logger.warn("fixing arch type");
								ArchitectureType fittingArchitectureType = CdoHelper.getArchitectureTypeByName(cdoArchitectureTypeRepository,
										hbaseProcessingUnitSpecifications.get(0).getArchitectureType().getName());
								cdoProcessingUnitSpecifications.get(0).setArchitectureType(fittingArchitectureType);
							}
						} else {
							logger.warn("processing unit not available for any (or both)");
						}

						if (cdoComputeNode.getState().equals(NodeState.FAILURE) || cdoComputeNode.getState().equals(NodeState.UNKNOWN)) {
							logger.warn("node state for cdo computenode was FAILURE or UNKNOWN. setting to running: " + cdoComputeNode.getName());
							cdoComputeNode.setState(NodeState.RUNNING);
						}
					} else {
						logger.debug("ComputeNode: not found in HBase " + cdoComputeNode.getName());
						if (availableComputeNodes.contains(cdoComputeNode.getName())) {
							logger.debug("ComputeNode: defined in availableComputenodes: " + cdoComputeNode.getName());
							if (cdoComputeNode.getState().equals(NodeState.RUNNING)) {
								logger.debug("ComputeNode: Cannot find it in HBase, change the STATE to FAILURE.");
								cdoComputeNode.setState(NodeState.FAILURE);
								// toDeleteComputeNodes.add(cdoComputeNode);
							} else {
								logger.debug("leaving cdo state set to " + cdoComputeNode.getState());
							}
						} else {
							logger.debug("ComputeNode: not defined in availableComputenodes: should be deleted???? " + cdoComputeNode.getName());
						}
					}
					switch (cdoComputeNode.getState()) {
					case FAILURE:
						logger.debug("ComputeNode: In FAILURE state.");
						break;
					case OFF:
						logger.debug("ComputeNode: In OFF state.");
						break;
					default:
						logger.debug("ComputeNode: In other state state: " + cdoComputeNode.getState());
						break;
					}
				}

				List<AbstractNode> toAddComputeNodes = new ArrayList<AbstractNode>();

				logger.debug("iterating hbase computenodes");
				for (AbstractNode hbaseComputeNode : hbaseComputeNodes) {
					AbstractNode cdoComputeNode = CdoHelper.getModelByIdentifier(cdoComputeNodes, hbaseComputeNode.getName());

					if (cdoComputeNode == null) {
						logger.debug("ComputeNode: Add the hbase model : " + hbaseComputeNode.getName());
						toAddComputeNodes.add(hbaseComputeNode);
					}
				}

				for (AbstractNode typeToAdd : toAddComputeNodes) {
					typeToAdd.setRack(cdoRack);

					NetworkInterconnect fittingNetworkInterconnect = CdoHelper.getEquivalentNetworkInterconnectFromPhysicalDCModel(cdoPhysicalDCModel, typeToAdd.getName());
					fittingNetworkInterconnect.getConnectedEntities().clear();
					fittingNetworkInterconnect.getConnectedEntities().add(typeToAdd);
					typeToAdd.getNetworkInterconnects().clear();
					typeToAdd.getNetworkInterconnects().add(fittingNetworkInterconnect);

					PowerDistributionUnit fittingPowerDistributionUnit = CdoHelper.getEquivalentPowerDistributionUnitFromPhysicalDCModel(cdoPhysicalDCModel, typeToAdd);
					if (fittingPowerDistributionUnit != null) {
						for (PowerConsumingEntity node : fittingPowerDistributionUnit.getPowerConsumingEntities()) {
							if (node.getName().equals(typeToAdd.getName())) {
								EList<PowerProvidingEntity> connectedPowerSuppliesAtNode = typeToAdd.getPowerProvidingEntities();
								EList<PowerProvidingEntity> newConnectedPowerSuppliesAtNode = new BasicEList<PowerProvidingEntity>();
								for (PowerProvidingEntity powerSupply : connectedPowerSuppliesAtNode) {
									if (!powerSupply.cdoState().equals(CDOState.TRANSIENT)) {
										((PowerDistributionUnit) powerSupply).setHostedIn(cdoRack);
										newConnectedPowerSuppliesAtNode.add(powerSupply);
									}
								}
								typeToAdd.getPowerProvidingEntities().clear();
								typeToAdd.getPowerProvidingEntities().addAll(newConnectedPowerSuppliesAtNode);
								break;
							}
						}

					}

					for (ProcessingUnitSpecification cpu : typeToAdd.getCpuSpecifications()) {
						ArchitectureType fittingArchitectureType = CdoHelper.getArchitectureTypeByName(cdoArchitectureTypeRepository, cpu.getArchitectureType().getName());
						cpu.setArchitectureType(fittingArchitectureType);
					}
				}

			} else {
				logger.debug("Currently no point to delete a rack");
				// toDelete.add(cdoRack);
			}
		}

		// for (Rack typeToDelete : toDelete) {
		// EcoreUtil.delete(typeToDelete);
		// }

		List<Rack> toAdd = new ArrayList<Rack>();

		for (Rack hbaseRack : hbaseRacks) {
			logger.debug("iterating hbase racks: " + hbaseRack.getName());
			Rack cdoRack = CdoHelper.getModelByIdentifier(cdoRacks, hbaseRack.getName());

			if (cdoRack == null) {
				logger.debug("Rack: Add the hbase model.");
				toAdd.add(hbaseRack);
			}
		}

		for (Rack rackToAdd : toAdd) {
			EList<AbstractNode> nodes = rackToAdd.getNodes();
			for (AbstractNode node : nodes) {
				Hypervisor hypervisor = ((ComputeNode) node).getHypervisor();
				((ComputeNode) node).setHypervisor(hypervisor);
				EList<ProcessingUnitSpecification> processingUnitSpecifications = ((ComputeNode) node).getCpuSpecifications();
				for (ProcessingUnitSpecification processingUnitSpecification : processingUnitSpecifications) {
					processingUnitSpecification.setArchitectureType(CdoHelper.getArchitectureTypeByName(cdoArchitectureTypeRepository, processingUnitSpecification.getArchitectureType().getName()));
				}

				EList<PowerProvidingEntity> connectedPowerSuppliesAtNode = node.getPowerProvidingEntities();
				EList<PowerProvidingEntity> newConnectedPowerSuppliesAtNode = new BasicEList<PowerProvidingEntity>();
				for (PowerProvidingEntity powerSupply : connectedPowerSuppliesAtNode) {
					if (!powerSupply.cdoState().equals(CDOState.TRANSIENT)) {
						newConnectedPowerSuppliesAtNode.add(powerSupply);
					}
				}
				node.getPowerProvidingEntities().clear();
				node.getPowerProvidingEntities().addAll(newConnectedPowerSuppliesAtNode);
			}
			EList<PowerDistributionUnit> powerSuppliesAtRack = rackToAdd.getPowerSupplies();
			EList<PowerDistributionUnit> newpowerSuppliesAtRack = new BasicEList<PowerDistributionUnit>();
			for (PowerDistributionUnit powerSupply : powerSuppliesAtRack) {
				if (!powerSupply.cdoState().equals(CDOState.TRANSIENT)) {
					newpowerSuppliesAtRack.add(powerSupply);
				}
			}
			rackToAdd.getPowerSupplies().clear();
			rackToAdd.getPowerSupplies().addAll(newpowerSuppliesAtRack);

			rackToAdd.setPhysicalDCModel(cdoPhysicalDCModel);
		}
	}

	private static int countVms(LogicalDCModel ldcModel, String vmName) {
		if (vmName == null) {
			logger.error("cannot count vms with name: name must not be null. returning 0");
			return 0;
		}
		int counter = 0;
		for (Hypervisor h : ldcModel.getHypervisors()) {
			if (null == h)
				continue;
			for (VirtualMachine vm : h.getVirtualMachines()) {
				if (vm == null)
					continue;
				if (vmName.equals(vm.getName()))
					counter++;
			}
		}
		return counter;
	}

	/**
	 * Update the Logical DC Model and its nodes.
	 */
	public static void checkAndUpdateLogicalDCModel(LogicalDCModel cdoLogicalDCModel,
		LogicalDCModel hbaseLogicalDCModel,
		PhysicalDCModel cdoPhysicalDCModel,
		HypervisorRepository cdoHypervisorRepository,
		ArchitectureTypeRepository cdoArchitectureTypeRepository,
		boolean updateUtilisation,
		Collection<String> availableComputeNodes) throws Exception {

		if (cdoLogicalDCModel != null && hbaseLogicalDCModel != null) {
			// FIXME: auto edw prepei na ginei handle
			// CdoHelper.checkAndUpdateVMImage(cdoLogicalDCModel,
			// hbaseLogicalDCModel);
			logger.debug("checking logical dc model");

			EList<Hypervisor> cdoHypervisors = cdoLogicalDCModel.getHypervisors();
			EList<Hypervisor> hbaseHypervisors = hbaseLogicalDCModel.getHypervisors();

			// EList<Hypervisor> toDelete = new BasicEList<Hypervisor>();

			logger.debug("iterating cdo hypervisors");
			for (Hypervisor cdoHypervisor : cdoHypervisors) {
				ComputeNode computeNode = cdoHypervisor.getNode();
				Hypervisor hbaseHypervisor = null;
				logger.debug("node for hypervisor: " + (computeNode == null ? "null" : computeNode.getName()));
				if (computeNode != null) {
					hbaseHypervisor = CdoHelper.getModelByIdentifier(hbaseHypervisors, computeNode.getName());
				}

				if (hbaseHypervisor != null) {
					logger.debug("Hypervisor: It exists already in hbase for hypervisor for computenode: " + computeNode.getName());

					HypervisorType cdoHypervisorType = cdoHypervisor.getHypervisorType();
					HypervisorType hbaseHypervisorType = hbaseHypervisor.getHypervisorType();

					if (!cdoHypervisorType.getName().equals(hbaseHypervisorType.getName())) {
						logger.debug("Changing Hypervisor type for computenode " + computeNode.getName());
						HypervisorType fittingHypervisorType = CdoHelper.getHypervisorTypeByName(cdoHypervisorRepository, hbaseHypervisorType.getName());
						cdoHypervisor.setHypervisorType(fittingHypervisorType);
					}

					EList<VirtualMachine> cdoVirtualMachines = cdoHypervisor.getVirtualMachines();
					EList<VirtualMachine> hbaseVirtualMachines = hbaseHypervisor.getVirtualMachines();

					List<VirtualMachine> toDeleteVirtualMachines = new ArrayList<VirtualMachine>();

					logger.debug("iterating virtual machines");
					for (VirtualMachine cdoVirtualMachine : cdoVirtualMachines) {
						final int vmOccurrencesInHbaseModel = countVms(hbaseLogicalDCModel, cdoVirtualMachine.getName());
						final int vmOccurrencesInCdoModel = countVms(cdoLogicalDCModel, cdoVirtualMachine.getName());
						logger.debug("vm '" + cdoVirtualMachine.getName() + "' occurs " + vmOccurrencesInCdoModel + " times in CDO and " + vmOccurrencesInHbaseModel + " times in HBase");
						VirtualMachine hbaseVirtualMachine = CdoHelper.getModelByIdentifier(hbaseVirtualMachines, cdoVirtualMachine.getName());

						if (hbaseVirtualMachine != null) {
							if (vmOccurrencesInHbaseModel == 1) {
								logger.debug("VirtualMachine: It exists already in hbase: " + cdoVirtualMachine.getName());
								/*
								 * TODO VirtualInterconnects
								 */
								if (hbaseVirtualMachine.getInputParameters().get("isDeleted").equals("true")) {
									toDeleteVirtualMachines.add(cdoVirtualMachine);
									logger.debug("VirtualMachine: Delete the cdo one with DELETE request passed from runtime.");
									continue;
								}

								CdoHelper.checkAndUpdateVirtualMachineProperties(cdoVirtualMachine, hbaseVirtualMachine);

								CdoHelper.checkAndUpdateVirtualMemory(cdoVirtualMachine, hbaseVirtualMachine);

								CdoHelper.checkAndUpdateVirtualProcessingUnit(cdoVirtualMachine, hbaseVirtualMachine, cdoArchitectureTypeRepository.getArchitectureTypes());

								CdoHelper.checkAndUpdatePuAffinity(cdoVirtualMachine, hbaseVirtualMachine);
								// FIXME: auto edw prepei na ginei handle
								// CdoHelper.checkAndUpdateVMImageInstance(cdoLogicalDCModel,
								// cdoVirtualMachine, hbaseVirtualMachine);
							} else {
								logger.debug("vm '" + cdoVirtualMachine.getName() + "' occurs " + vmOccurrencesInHbaseModel + " times in HBase" + ". It will be updated when it occurs 1.");

							}

						} else {
							logger.debug("VirtualMachine: does not exists in hbase: " + cdoVirtualMachine.getName());
							if (cdoVirtualMachine.getState().equals(VM_State.IN_OPTIMISATION) || cdoVirtualMachine.getState().equals(VM_State.NEW)) {
								logger.debug("VirtualMachine: not touching " + cdoVirtualMachine.getName() + ": It is in state " + cdoVirtualMachine.getState().getName());
							} else {
								logger.debug("virtualMachine: " + cdoVirtualMachine.getName() + " is in state " + cdoVirtualMachine.getState());
								// UGLY FIX: For FCO that has a problem with
								// reporting the correct data as far as the
								// available VMs
								if (cdoVirtualMachine.getRuntimeApplicationModel() == null) {
									logger.debug("VirtualMachine " + cdoVirtualMachine.getName() + " from node "
											+ (cdoVirtualMachine.getHypervisor() != null ? cdoVirtualMachine.getHypervisor().getNode().getName() : " (hypervisor is null) ") + ": Delete the cdo one");
									toDeleteVirtualMachines.add(cdoVirtualMachine);
								} else {
									logger.debug("VirtualMachine " + cdoVirtualMachine.getName() + ": It is part of an application deployment. Don't delete the cdo one.");
								}
							}
						}
					}

					for (VirtualMachine typeToDelete : toDeleteVirtualMachines) {
						deleteVirtualMachineOld(typeToDelete);
					}

					List<VirtualMachine> toAddVirtualMachines = new ArrayList<VirtualMachine>();

					logger.debug("iterating hbase virtual machines");
					for (VirtualMachine hbaseVirtualMachine : hbaseVirtualMachines) {
						final int vmOccurrencesInHbaseModel = countVms(hbaseLogicalDCModel, hbaseVirtualMachine.getName());
						final int vmOccurrencesInCdoModel = countVms(cdoLogicalDCModel, hbaseVirtualMachine.getName());
						logger.debug("vm '" + hbaseVirtualMachine.getName() + "' occurs " + vmOccurrencesInCdoModel + " times in CDO and " + vmOccurrencesInHbaseModel + " times in HBase");
						if (vmOccurrencesInHbaseModel == 0)
							throw new IllegalStateException();

						VirtualMachine cdoVirtualMachine = CdoHelper.getModelByIdentifier(cdoVirtualMachines, hbaseVirtualMachine.getName());
						if (hbaseVirtualMachine.getInputParameters().get("isDeleted").equals("true")) {
							logger.debug("hbase virtual machine was deleted; ignoring state in cdo");
							continue;
						}
						if (cdoVirtualMachine == null) {
							logger.debug("hbase virtual machine '" + hbaseVirtualMachine.getName() + "' was not found in cdo.");
							boolean vmExists = false;
							logger.debug("searching for presence on other hypervisors: " + hbaseVirtualMachine.getName());
							outerloop: for (Hypervisor _cdoHypervisor : cdoLogicalDCModel.getHypervisors()) {
								// Skip the same _cdoHypervisor
								if (_cdoHypervisor.getNode().getName().equals(cdoHypervisor.getNode().getName()))
									continue;
								for (VirtualMachine _cdoVirtualMachine : _cdoHypervisor.getVirtualMachines()) {
									if (_cdoVirtualMachine.getName().equals(hbaseVirtualMachine.getName())) {
										logger.debug(
												"Virtual machine" + _cdoVirtualMachine.getName() + "was found in another hypervisor (" + cdoHypervisor.getNode().getName() + "), possible migration.");
										vmExists = true;
										if (_cdoVirtualMachine.getState().equals(VM_State.IN_OPTIMISATION)) {
											if (vmOccurrencesInHbaseModel > 1) {
												logger.debug("not logically migrating vm " + hbaseVirtualMachine.getName() + " as it appears " + vmOccurrencesInHbaseModel
														+ " in HBase. Waiting for only one occurrence.");
											} else {
												logger.debug("logically migrating vm " + hbaseVirtualMachine.getName() + " to "
														+ (cdoHypervisor.getNode() != null ? cdoHypervisor.getNode().getName() : "<none>"));
												// Get current cdoHypervisor
												_cdoVirtualMachine.setHypervisor(cdoHypervisor);
												_cdoVirtualMachine.setState(VM_State.RUNNING);
											}
										}
										break outerloop;
									}
								}
							}
							if (!vmExists) {
								if (createVmsInCDO) {
									logger.debug("VirtualMachine: Add the hbase element to cdo: " + hbaseVirtualMachine.getName());
									toAddVirtualMachines.add(hbaseVirtualMachine);
								} else {
									logger.debug("VirtualMachine: not found in hbase. do not do anything.");
								}
							}
						} else {

						}
					}

					for (VirtualMachine typeToAdd : toAddVirtualMachines) {
						typeToAdd.setHypervisor(cdoHypervisor);
						// FIXME: auto edw prepei na ginei handle
						// VMImage fittingVMImage =
						// CdoHelper.getEquivalentVMImageFromLogicalDCModel(cdoLogicalDCModel,
						// typeToAdd.getVMImageInstance().getExecutedVMImage().getName());

						// typeToAdd.getVMImageInstance().setExecutedVMImage(fittingVMImage);
						/*
						 * TODO
						 * 
						 * Set NetworkInterconnects
						 */

						/*
						 * TODO
						 * 
						 * Set Affine PUs
						 */

						/*
						 * 
						 * Set relation to ArchitectureType
						 */
						for (VirtualProcessingUnit vpu : typeToAdd.getVirtualProcessingUnits()) {
							if (vpu != null && vpu.getArchitectureType() != null) {
								vpu.setArchitectureType(CdoHelper.getArchitectureTypeByName(cdoArchitectureTypeRepository, vpu.getArchitectureType().getName()));
							}
						}
					}

				} else {
					logger.debug("hbase hypervisor does not exist for computenode: " + (computeNode == null ? "null" : computeNode.getName()));
					// FIXME: this does not really validate the state;
					// FIXME: there is no evidence that
					// '(cdoHypervisor.getNode()' is not null.
					if (cdoHypervisor.getNode() != null && availableComputeNodes.contains(cdoHypervisor.getNode().getName())) {
						logger.debug("Hypervisor: Don't delete the hypervisor. The compute node is in OFF or FAILURE state ---> this is just a suspicion. it is never checked in the code <---");
						EList<VirtualMachine> toDeleteVirtualMachines = new BasicEList<VirtualMachine>();
						for (VirtualMachine machine : cdoHypervisor.getVirtualMachines()) {
							toDeleteVirtualMachines.add(machine);
						}

						for (VirtualMachine deleteVM : toDeleteVirtualMachines) {
							deleteVirtualMachineInOffOrFailureState(deleteVM);
						}
					} else {
						logger.debug("hypervisor's computenode is not known or not part of the available nodes. FIXME: action missing. delete from CDO?");
					}
				}
			}

			// for (Hypervisor typeToDelete : toDelete) {
			// // HERE!!!!!!!
			// for (VirtualMachine virtualMachine :
			// typeToDelete.getVirtualMachines()) {
			// VMImageInstance vmImageInstanceFromVMOfAboutToDeleteHypervisor =
			// virtualMachine.getVMImageInstance();
			// if
			// (vmImageInstanceFromVMOfAboutToDeleteHypervisor.getExecutedVMImage()
			// != null) {
			// VMImage vmImage =
			// CdoHelper.getEquivalentVMImageFromLogicalDCModel(cdoLogicalDCModel,
			// vmImageInstanceFromVMOfAboutToDeleteHypervisor.getExecutedVMImage().getName());
			// vmImage.getVirtualMachine().remove(vmImageInstanceFromVMOfAboutToDeleteHypervisor);
			// }
			// }
			// EcoreUtil.delete(typeToDelete);
			// }

			List<Hypervisor> toAdd = new ArrayList<Hypervisor>();

			logger.debug("iterating hbase hypervisors");
			for (Hypervisor hbaseHypervisor : hbaseHypervisors) {
				Hypervisor cdoHypervisor = CdoHelper.getModelByIdentifier(cdoHypervisors, hbaseHypervisor.getNode().getName());
				if (cdoHypervisor == null) {
					logger.debug("Hypervisor: Add the hbase model to cdo: " + hbaseHypervisor.getNode().getName());
					toAdd.add(hbaseHypervisor);
				}
			}

			for (Hypervisor typeToAdd : toAdd) {
				typeToAdd.setLogicalDCModel(cdoLogicalDCModel);
				// HERE!!!!!
				for (VirtualMachine vm : typeToAdd.getVirtualMachines()) {
					// FIXME: auto edw prepei na ginei handle
					// if (vm.getVMImageInstance().getExecutedVMImage() != null)
					// {
					// VMImage fittingVMImage =
					// CdoHelper.getEquivalentVMImageFromLogicalDCModel(cdoLogicalDCModel,
					// vm.getVMImageInstance().getExecutedVMImage().getName());
					// vm.getVMImageInstance().setExecutedVMImage(fittingVMImage);
					// }
					for (VirtualProcessingUnit vpu : vm.getVirtualProcessingUnits()) {
						if (vpu != null && vpu.getArchitectureType() != null) {
							vpu.setArchitectureType(CdoHelper.getArchitectureTypeByName(cdoArchitectureTypeRepository, vpu.getArchitectureType().getName()));
						}
					}
				}

				HypervisorType fittingHypervisorType = CdoHelper.getHypervisorTypeByName(cdoHypervisorRepository, typeToAdd.getHypervisorType().getName());
				typeToAdd.setHypervisorType(fittingHypervisorType);
			}
		}

	}

	/**
	 * Fix any references between the Physical DC and Logical DC Model.
	 */
	public static void fixReferencesBetweenPhysicalDCAndLogicalDC(PhysicalDCModel cdoPhysicalDCModel, LogicalDCModel cdoLogicalDCModel) {
		EList<Hypervisor> cdoHypervisors = cdoLogicalDCModel.getHypervisors();
		for (Hypervisor cdoHypervisor : cdoHypervisors) {
			ComputeNode fittingNode = CdoHelper.getComputeNodeByName(cdoPhysicalDCModel, cdoHypervisor.getNode().getName());
			cdoHypervisor.setNode(fittingNode);
		}

		EList<Rack> cdoRacks = cdoPhysicalDCModel.getRacks();
		for (Rack rack : cdoRacks) {
			EList<AbstractNode> nodes = rack.getNodes();
			for (AbstractNode node : nodes) {
				Hypervisor hypervisor = ((ComputeNode) node).getHypervisor();
				if (hypervisor != null) {
					hypervisor.setLogicalDCModel(cdoLogicalDCModel);
					((ComputeNode) node).setHypervisor(hypervisor);
				}
			}
		}
	}

	/**
	 * Update the Physical Load Model and its nodes.
	 */
	public static void checkAndUpdatePhysicalLoadModel(PhysicalLoadModel cdoPhysicalLoadModel,
		PhysicalLoadModel hbasePhysicalLoadModel,
		PhysicalDCModel cdoPhysicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputeNodes) throws Exception {
		if (cdoPhysicalLoadModel != null && hbasePhysicalLoadModel != null) {

			CdoHelper.checkAndUpdateMemoryMeasurement(cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, availableComputeNodes);

			CdoHelper.checkAndUpdatePuMeasurement(cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, availableComputeNodes);

			CdoHelper.checkAndUpdateNetworkInterconnectMeasurement(cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, availableComputeNodes);

			CdoHelper.checkAndUpdatePowerConsumingEntityMeasurement(cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, availableComputeNodes);

			CdoHelper.checkAndUpdateStorageMeasurement(cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, availableComputeNodes);

		}
	}

	/**
	 * Update the Logical Load Model and its nodes.
	 */
	public static void checkAndUpdateLogicalLoadModel(LogicalLoadModel cdoLogicalLoadModel,
		LogicalLoadModel hbaseLogicalLoadModel,
		LogicalDCModel cdoLogicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputeNodes) throws Exception {

		if (cdoLogicalLoadModel != null && hbaseLogicalLoadModel != null) {

			CdoHelper.checkAndUpdateVirtualMemoryMeasurement(cdoLogicalLoadModel, hbaseLogicalLoadModel, cdoLogicalDCModel, updateUtilisation, availableComputeNodes);

			CdoHelper.checkAndUpdateVirtualProcessingUnitMeasurement(cdoLogicalLoadModel, hbaseLogicalLoadModel, cdoLogicalDCModel, updateUtilisation, availableComputeNodes);

		}
	}

	public static ArchitectureType getArchitectureTypeByName(ArchitectureTypeRepository repo, String architectureTypeName) {
		return (ArchitectureType) getPlainObjectReflection(ArchitectureType.class, repo.getArchitectureTypes(), architectureTypeName, "getName");
	}

	public static HypervisorType getHypervisorTypeByName(HypervisorRepository repo, String hypervisorTypeName) {
		return (HypervisorType) getPlainObjectReflection(HypervisorType.class, repo.getHypervisorTypes(), hypervisorTypeName, "getName");
	}

	public static VirtualMachine getVirtualMachineByName(Hypervisor repo, String virtualMachineName) {
		return (VirtualMachine) getPlainObjectReflection(VirtualMachine.class, repo.getVirtualMachines(), virtualMachineName, "getName");
	}

	public static Hypervisor getEquivalentHypervisorFromLogicalDCModel(LogicalDCModel repo, ComputeNode computeNode) {
		for (Hypervisor hypervisor : repo.getHypervisors()) {
			if (hypervisor.getNode().equals(computeNode)) {
				return hypervisor;
			}
		}
		return null;
	}

	// FIXME: auto edw prepei na ginei handle
	// public static VMImage
	// getEquivalentVMImageFromLogicalDCModel(LogicalDCModel repo, String
	// vmImageName) {
	// for (VMImage vmImage : repo.getVmImages()) {
	// if (vmImage.getName().equals(vmImageName)) {
	// return vmImage;
	// }
	// }
	// return null;
	// }

	public static NetworkInterconnect getEquivalentNetworkInterconnectFromPhysicalDCModel(PhysicalDCModel repo, String name) {
		for (NetworkInterconnect interconnect : repo.getNetworkInterconnects()) {
			if (((ComputeNode) interconnect.getConnectedEntities().get(0)).getName().equals(name)) {
				return interconnect;
			}
		}
		return null;
	}

	public static PowerDistributionUnit getEquivalentPowerDistributionUnitFromPhysicalDCModel(PhysicalDCModel repo, AbstractNode computeNode) {
		for (PowerDistributionUnit powerDistributionUnit : repo.getPowerSupplies()) {
			for (PowerConsumingEntity node : powerDistributionUnit.getPowerConsumingEntities()) {
				if (node.getName().equals(computeNode.getName())) {
					return powerDistributionUnit;
				}
			}
		}
		return null;
	}

	public static ComputeNode getComputeNodeByName(PhysicalDCModel cdoPhysicalDCModel, String computenodeName) {
		for (Rack rack : cdoPhysicalDCModel.getRacks()) {
			return (ComputeNode) getPlainObjectReflection(AbstractNode.class, rack.getNodes(), computenodeName, "getName");
		}
		return null;
	}

	public static ComputeNode getComputeNodeById(PhysicalDCModel cdoPhysicalDCModel, String computenodeId) {
		for (Rack rack : cdoPhysicalDCModel.getRacks()) {
			//FIXME: this for loop is useless :)
			return (ComputeNode) getPlainObjectReflection(AbstractNode.class, rack.getNodes(), computenodeId, "getId");
		}
		return null;
	}

	public static StorageSpecification getStorageSpecificationByNodeName(PhysicalDCModel cdoPhysicalDCModel, String name) {
		return (StorageSpecification) getPhysicalObjectReflection(cdoPhysicalDCModel, StorageSpecification.class, name, "getNode", "getStorageSpecifications");
	}

	public static MemorySpecification getMemoryByNodeName(PhysicalDCModel cdoPhysicalDCModel, String name) {
		return (MemorySpecification) getPhysicalObjectReflection(cdoPhysicalDCModel, MemorySpecification.class, name, "getNode", "getMemorySpecifications");
	}

	public static ProcessingUnitSpecification getProcessingUnitByNodeName(PhysicalDCModel cdoPhysicalDCModel, String name) {
		return (ProcessingUnitSpecification) getPhysicalObjectReflection(cdoPhysicalDCModel, ProcessingUnitSpecification.class, name, "getNode", "getCpuSpecifications");
	}

	public static VirtualMachine getVirtualMachineById(LogicalDCModel lldc, String virtualMachineId) {
		return printingGetVirtualMachineById(lldc, virtualMachineId, false);
	}

	public static VirtualMachine printingGetVirtualMachineById(LogicalDCModel lldc, String virtualMachineId, boolean print) {
		if(print) {
			logger.debug("scanning virtual machines for '" + virtualMachineId + "'.");
		}
		// look for vm in all hypervisors
		if(print) {
			logger.debug("length of hypervisors list: " + lldc.getHypervisors().size());
		}
		for (Hypervisor hypervisor : lldc.getHypervisors()) {
			if(print) {
				logger.debug("scanning hypervisor: " + hypervisor.getNode().getName());
			}
			for (VirtualMachine type : hypervisor.getVirtualMachines()) {
				checkForNullValues(type);
				if(print) {
					logger.debug("comparing VirtualMachine " + type + ":" + type.getName() + ", " + type.getId() + " vs " + virtualMachineId);
				}
				if (virtualMachineId.equals(type.getId())) {
					return type;
				}
			}
		}
		if(print) {
			logger.debug("scanning unassigned VMs. number of elements: " + lldc.getUnassignedVms().size());
		}
		// look for unassigned vms
		for (VirtualMachine vm : lldc.getUnassignedVms()) {
			checkForNullValues(vm);
			if(print) {
				logger.debug("comparing VirtualMachine " + vm + ":" + vm.getName() + ", " + vm.getId() + " vs " + virtualMachineId);
			}
			if (virtualMachineId.equals(vm.getId())) {
				return vm;
			}
		}
		return null;
	}

	private static void checkForNullValues(VirtualMachine type) {
		if (type == null) {
			logger.error("Current VM is zero!");
		} else if (type.getId() == null) {
			StringBuilder builder = new StringBuilder();
			String nodeName = type.getHypervisor().getNode().getName();
			builder.append("On Node " + nodeName + "\n");
			builder.append("Input parameters:\n");
			for (Entry<String, String> curEntry : type.getInputParameters().entrySet()) {
				builder.append("Key: " + curEntry.getKey() + ", Value: " + curEntry.getValue());
			}
			logger.error("ID of VM is zero! Affected VM:\n" + builder.toString());
		}
	}

	public static VMImage getVMImageByName(LogicalDCModel cdoLogicalDCModel, String name) {
		return (VMImage) getPlainObjectReflection(VMImage.class, cdoLogicalDCModel.getVolumesAndImages(), name, "getName");
	}

	// Couldn't use reflection not worth it. We save nothing.
	public static VMImageInstance getVMImageInstanceByName(LogicalDCModel cdoLogicalDCModel, String name) {
		for (Hypervisor hypervisor : cdoLogicalDCModel.getHypervisors()) {
			for (VirtualMachine vm : hypervisor.getVirtualMachines()) {
				if (vm.getVMImageInstance().getVirtualMachine().getName().equals(name)) {
					return vm.getVMImageInstance();
				}
			}
		}
		return null;
	}
	// FIXME: auto edw prepei na ginei handle
	// public static VMImage getVMImageByID(LogicalDCModel cdoLogicalDCModel,
	// String name) {
	// return (VMImage) getPlainObjectReflection(VMImage.class,
	// cdoLogicalDCModel.getVmImages(), name, "getId");
	// }
	//
	// public static VMImage getVMImageByName(LogicalDCModel cdoLogicalDCModel,
	// String name) {
	// return (VMImage) getPlainObjectReflection(VMImage.class,
	// cdoLogicalDCModel.getVmImages(), name, "getName");
	// }

	public static VirtualMemory getVirtualMemoryByVMName(LogicalDCModel cdoLogicalDCModel, String name) {
		return (VirtualMemory) getLogicalObjectReflection(cdoLogicalDCModel, VirtualMemory.class, name, "getVirtualMemoryConsumingEntity", "getVirtualMemoryUnits");
	}

	public static VirtualProcessingUnit getVirtualProcessingUnitByVMName(LogicalDCModel cdoLogicalDCModel, String name) {
		return (VirtualProcessingUnit) getLogicalObjectReflection(cdoLogicalDCModel, VirtualProcessingUnit.class, name, "getVirtualMachine", "getVirtualProcessingUnits");
	}

	private static Object getPlainObjectReflection(final Class<?> cls, final EList<?> list, final String name, final String methodNameString) {
		Class<?> noparams[] = {};
		Method method;
		try {

			method = cls.getMethod(methodNameString, noparams);
			for (Object a : list) {
				if (method.invoke(a).equals(name)) {
					return a;
				}
			}
		} catch (Exception e) {
			logger.error("getPlainObjectReflection", e);
			e.printStackTrace();
		}
		return null;
	}

	private static Object getPhysicalObjectReflection(final PhysicalDCModel physicalDCModel,
		final Class<?> cls,
		final String name,
		final String methodNameString,
		final String outterMethodNameString) {
		Class<?>[] noparams = {};
		Method method;
		try {
			method = AbstractNode.class.getMethod(outterMethodNameString, noparams);
			for (Rack rack : physicalDCModel.getRacks()) {
				for (AbstractNode node : rack.getNodes()) {
					Object object = getPlainObjectReflectionForModel(cls, ComputeNode.class, (EList<?>) method.invoke(node), name, methodNameString);
					if (object == null) {
						continue;
					} else {
						return object;
					}
				}
			}
		} catch (Exception e) {
			logger.error("getPhysicalObjectReflection", e);
			e.printStackTrace();
		}
		return null;
	}

	private static Object getLogicalObjectReflection(final LogicalDCModel cdoLogicalDCModel, final Class<?> cls, final String id, final String methodNameString, final String outterMethodNameString) {
		Class<?>[] noparams = {};
		Method method;
		try {
			method = VirtualMachine.class.getMethod(outterMethodNameString, noparams);
			for (Hypervisor hypervisor : cdoLogicalDCModel.getHypervisors()) {
				for (VirtualMachine vm : hypervisor.getVirtualMachines()) {
					Object object = getPlainObjectReflectionForModel(cls, VirtualMachine.class, (EList<?>) method.invoke(vm), id, methodNameString);
					if (object == null) {
						continue;
					} else {
						return object;
					}
				}
			}
		} catch (Exception e) {
			logger.error("getLogicalObjectReflection", e);
			e.printStackTrace();
		}
		return null;
	}

	private static Object getPlainObjectReflectionForModel(final Class<?> cls, final Class<?> clsNode, final EList<?> list, final String name, final String methodNameString) {
		Class<?> noparams[] = {};
		Method method;
		Method methodGetName;
		try {
			method = cls.getMethod(methodNameString, noparams);
			methodGetName = clsNode.getMethod("getName", noparams);
			for (Object a : list) {
				if (methodGetName.invoke(method.invoke(a)).equals(name)) {
					return a;
				}
			}
		} catch (Exception e) {
			logger.error("getPlainObjectReflectionForModel", e);
			e.printStackTrace();
		}
		return null;
	}
	// FIXME: auto edw prepei na ginei handle
	// private static void checkAndUpdateVMImage(LogicalDCModel
	// cdoLogicalDCModel, LogicalDCModel hbaseLogicalDCModel) throws Exception {
	// EList<VMImage> cdoVMImages = cdoLogicalDCModel.getVmImages();
	// EList<VMImage> hbaseVMImages = hbaseLogicalDCModel.getVmImages();
	//
	// // EList<VMImage> toDeleteVMImages = new BasicEList<VMImage>();
	// for (VMImage cdoVmImage : cdoVMImages) {
	// VMImage hbaseVmImage = CdoHelper.getModelByIdentifier(hbaseVMImages,
	// cdoVmImage.getName());
	// if (hbaseVmImage != null) {
	// logger.debug("VMImage: It exists already.");
	// /*
	// * Check something else except the name
	// */
	// } else {
	// logger.debug("VMImage: Don't delete the VMImage, the VMImageInstance only
	// will be removed from VMImage when the VM cannot be found in HBase.");
	// // toDeleteVMImages.add(cdoVmImage);
	// }
	// }
	// // for (VMImage typeToDelete : toDeleteVMImages) {
	// // EcoreUtil.delete(typeToDelete);
	// // }
	//
	// EList<VMImage> toAddVMImages = new BasicEList<VMImage>();
	//
	// for (VMImage hbaseVMImage : hbaseVMImages) {
	// VMImage cdoVMImage = CdoHelper.getModelByIdentifier(cdoVMImages,
	// hbaseVMImage.getName());
	// if (cdoVMImage == null) {
	// logger.debug("VirtualMemory: Add the hbase model.");
	// toAddVMImages.add(hbaseVMImage);
	// }
	// }
	//
	// for (VMImage typeToAdd : toAddVMImages) {
	//
	// EList<VMImage> vmImages = cdoLogicalDCModel.getVmImages();
	// boolean isExists = false;
	// for (VMImage cdoImage : vmImages) {
	// if (cdoImage.getName().equals(typeToAdd.getName())) {
	// isExists = true;
	// cdoImage.getVirtualMachine().add(typeToAdd.getVirtualMachine().get(0));
	// }
	// }
	//
	// if (!isExists) {
	// typeToAdd.setLogicalDCModel(cdoLogicalDCModel);
	//
	// }
	// }
	//
	// }

	private static void checkAndUpdateVirtualMachineProperties(VirtualMachine cdoVirtualMachine, VirtualMachine hbaseVirtualMachine) {
		if (!cdoVirtualMachine.getState().equals(VM_State.IN_OPTIMISATION)) {
			if (!cdoVirtualMachine.getState().equals(hbaseVirtualMachine.getState())) {
				logger.debug("VirtualMachine state: changing from" + cdoVirtualMachine.getState() + " to " + hbaseVirtualMachine.getState() + " for " + cdoVirtualMachine.getName());
				cdoVirtualMachine.setState(hbaseVirtualMachine.getState());
			}
		}
		// START - Don't update the input parameters. They are static.
		// for (String key : hbaseVirtualMachine.getInputParameters().keySet())
		// {
		// if (cdoVirtualMachine.getInputParameters().get(key) == null ||
		// cdoVirtualMachine.getInputParameters().get(key) !=
		// hbaseVirtualMachine.getInputParameters().get(key)) {
		// cdoVirtualMachine.getInputParameters().put(key,
		// hbaseVirtualMachine.getInputParameters().get(key));
		// }
		// }

		// for (String key :
		// hbaseVirtualMachine.getInstantiationProperties().keySet()) {
		// if (cdoVirtualMachine.getInstantiationProperties().get(key) == null
		// || cdoVirtualMachine.getInstantiationProperties().get(key) !=
		// hbaseVirtualMachine.getInstantiationProperties().get(key)) {
		// cdoVirtualMachine.getInstantiationProperties().put(key,
		// hbaseVirtualMachine.getInstantiationProperties().get(key));
		// }
		// }
		// END - Don't update the input parameters. They are static.
	}
	// FIXME: auto edw prepei na ginei handle
	// private static void checkAndUpdateVMImageInstance(LogicalDCModel
	// cdoLogicalDCModel, VirtualMachine cdoVirtualMachine, VirtualMachine
	// hbaseVirtualMachine) throws Exception {
	// VMImageInstance cdoVmImageInstance =
	// cdoVirtualMachine.getVMImageInstance();
	// VMImageInstance hbaseVmImageInstance =
	// hbaseVirtualMachine.getVMImageInstance();
	//
	// VMImage fittingVMImage =
	// CdoHelper.getEquivalentVMImageFromLogicalDCModel(cdoLogicalDCModel,
	// hbaseVmImageInstance.getExecutedVMImage().getName());
	// if (fittingVMImage == null) {
	// VMImage vmImageFromHBase = hbaseVmImageInstance.getExecutedVMImage();
	// cdoLogicalDCModel.eResource().getContents().add(vmImageFromHBase);
	// cdoVmImageInstance.setExecutedVMImage(vmImageFromHBase);
	// } else {
	// cdoVmImageInstance.setExecutedVMImage(fittingVMImage);
	// }
	//
	// if (cdoVmImageInstance.getLocalStorageSize() == null ||
	// cdoVmImageInstance.getLocalStorageSize() !=
	// hbaseVmImageInstance.getLocalStorageSize()) {
	// cdoVmImageInstance.setLocalStorageSize(hbaseVmImageInstance.getLocalStorageSize());
	// }
	// }

	private static void checkAndUpdateVirtualMemory(VirtualMachine cdoVirtualMachine, VirtualMachine hbaseVirtualMachine) throws Exception {
		EList<VirtualMemory> cdoVirtualMemories = cdoVirtualMachine.getVirtualMemoryUnits();
		EList<VirtualMemory> hbaseVirtualMemories = hbaseVirtualMachine.getVirtualMemoryUnits();

		List<VirtualMemory> toDeleteVirtualMemories = new ArrayList<VirtualMemory>();

		for (VirtualMemory cdoVirtualMemory : cdoVirtualMemories) {
			VirtualMemory hbaseVirtualMemory = CdoHelper.getModelByIdentifier(hbaseVirtualMemories, ((VirtualMachine) cdoVirtualMemory.getVirtualMemoryConsumingEntity()).getName());

			if (hbaseVirtualMemory != null) {
				logger.debug("VirtualMemory: It exists already.");
				if (hbaseVirtualMemory.getProvisioned() != null) {
					if (cdoVirtualMemory.getProvisioned() == null || cdoVirtualMemory.getProvisioned().getEstimatedValue() != hbaseVirtualMemory.getProvisioned().getEstimatedValue()) {
						cdoVirtualMemory.setProvisioned(hbaseVirtualMemory.getProvisioned());
					}
				}

			} else {
				logger.debug("VirtualMemory: Delete the cdo one.");
				toDeleteVirtualMemories.add(cdoVirtualMemory);
			}
		}

		for (VirtualMemory typeToDelete : toDeleteVirtualMemories) {
			EcoreUtil.delete(typeToDelete);
		}

		List<VirtualMemory> toAddVirtualMemories = new ArrayList<VirtualMemory>();

		for (VirtualMemory hbaseVirtualMemory : hbaseVirtualMemories) {
			VirtualMemory cdoVirtualMemory = CdoHelper.getModelByIdentifier(cdoVirtualMemories, ((VirtualMachine) hbaseVirtualMemory.getVirtualMemoryConsumingEntity()).getName());
			if (cdoVirtualMemory == null) {
				logger.debug("VirtualMemory: Add the hbase model.");
				toAddVirtualMemories.add(hbaseVirtualMemory);
			}
		}

		for (VirtualMemory typeToAdd : toAddVirtualMemories) {
			typeToAdd.setVirtualMemoryConsumingEntity(cdoVirtualMachine);
		}

	}

	private static void checkAndUpdateVirtualProcessingUnit(VirtualMachine cdoVirtualMachine, VirtualMachine hbaseVirtualMachine, EList<ArchitectureType> architectureTypes) throws Exception {
		EList<VirtualProcessingUnit> cdoVirtualPus = cdoVirtualMachine.getVirtualProcessingUnits();
		EList<VirtualProcessingUnit> hbaseVirtualPus = hbaseVirtualMachine.getVirtualProcessingUnits();

		List<VirtualProcessingUnit> toDelete = new ArrayList<VirtualProcessingUnit>();

		for (VirtualProcessingUnit cdoVirtualPu : cdoVirtualPus) {
			VirtualProcessingUnit hbaseVirtualPu = CdoHelper.getModelByIdentifier(hbaseVirtualPus, cdoVirtualPu.getVirtualMachine().getName());

			if (hbaseVirtualPu != null) {
				logger.debug("VirtualPu: It exists already.");
				/*
				 * ArchitectureType
				 */
				if (cdoVirtualPu.getArchitectureType() != null && hbaseVirtualPu.getArchitectureType() != null) {
					if (!cdoVirtualPu.getArchitectureType().getName().equals(hbaseVirtualPu.getArchitectureType().getName())) {
						cdoVirtualPu.setArchitectureType(CdoHelper.getModelByIdentifier(architectureTypes, hbaseVirtualPu.getArchitectureType().getName()));
					}
				}

				/*
				 * Virtual Cores
				 */
				if (cdoVirtualPu.getVirtualCores() != hbaseVirtualPu.getVirtualCores()) {
					cdoVirtualPu.setVirtualCores(hbaseVirtualPu.getVirtualCores());
				}

				/*
				 * Frequency
				 */
				// if
				// (!cdoVirtualPu.getFrequency().equals(hbaseVirtualPu.getFrequency()))
				// {
				// cdoVirtualPu.setFrequency(hbaseVirtualPu.getFrequency());
				// }

			} else {
				logger.debug("VirtualPu: Delete the cdo one.");
				// Delete the node, because it isn't
				// in the current hbase data anymore
				toDelete.add(cdoVirtualPu);
			}
		}

		for (VirtualProcessingUnit typeToDelete : toDelete) {
			EcoreUtil.delete(typeToDelete);
		}

		List<VirtualProcessingUnit> toAdd = new ArrayList<VirtualProcessingUnit>();

		for (VirtualProcessingUnit newVirtualPu : hbaseVirtualPus) {
			VirtualProcessingUnit oldVirtualPu = CdoHelper.getModelByIdentifier(cdoVirtualPus, newVirtualPu.getVirtualMachine().getName());

			if (oldVirtualPu == null) {
				logger.debug("VirtualPu: Add the new model.");
				toAdd.add(newVirtualPu);
			}
		}
		for (VirtualProcessingUnit typeToAdd : toAdd) {
			typeToAdd.setVirtualMachine(cdoVirtualMachine);
		}

	}

	private static void checkAndUpdatePuAffinity(VirtualMachine cdoVirtualMachine, VirtualMachine hbaseVirtualMachine) throws Exception {
		/*
		 * TODO Not yet implemented. PuAffinity is not set at the moment anyway.
		 */

	}

	private static void checkAndUpdateVirtualMemoryMeasurement(LogicalLoadModel cdoLogicalLoadModel,
		LogicalLoadModel hbaseLogicalLoadModel,
		LogicalDCModel cdoLogicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputenodes) throws Exception {

		EList<VirtualMemoryMeasurement> cdoVirtualMemoryMeasurements = cdoLogicalLoadModel.getVirtualMemoryMeasurements();
		EList<VirtualMemoryMeasurement> hbaseVirtualMemoryMeasurements = hbaseLogicalLoadModel.getVirtualMemoryMeasurements();

		List<VirtualMemoryMeasurement> toDelete = new ArrayList<VirtualMemoryMeasurement>();

		for (VirtualMemoryMeasurement cdoVirtualMemoryMeasurement : cdoVirtualMemoryMeasurements) {

			if (cdoVirtualMemoryMeasurement.getObservedVirtualMemory() == null) {
				toDelete.add(cdoVirtualMemoryMeasurement);
				continue;
			}
			VirtualMemoryMeasurement hbaseVirtualMemoryMeasurement = CdoHelper.getModelByIdentifier(hbaseVirtualMemoryMeasurements,
					((VirtualMachine) cdoVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity()).getName());

			VirtualMachine vmFromVirtualMemoryMeasurement = (VirtualMachine) cdoVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity();

			if (hbaseVirtualMemoryMeasurement != null && vmFromVirtualMemoryMeasurement.getHypervisor() != null) {
				logger.debug("VirtualMemoryMeasurement: It exists already.");
				/*
				 * 
				 * Compare the VirtualMemoryMeasurement
				 * 
				 * [x] ID [x] Utilization
				 */

				/*
				 * Utilization
				 * 
				 * TODO Check if this is correct: We assume there is always one
				 * and only one Utilization:
				 */
				if (cdoVirtualMemoryMeasurement.getObservedVirtualMemory() != null && ((VirtualMachine) cdoVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity())
						.getName().equals(((VirtualMachine) hbaseVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity()).getName())) {
					// Same observed Memory
				} else if (hbaseVirtualMemoryMeasurement.getObservedVirtualMemory() != null) {
					// Change to other observed memory
					cdoVirtualMemoryMeasurement.setObservedVirtualMemory(CdoHelper.getVirtualMemoryByVMName(cdoLogicalDCModel,
							((VirtualMachine) hbaseVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity()).getName()));
				} else {
					// no observed memory at all...
				}

				if (updateUtilisation) {
					if (cdoVirtualMemoryMeasurement.getUtilization().getValue() != hbaseVirtualMemoryMeasurement.getUtilization().getValue()) {

						cdoVirtualMemoryMeasurement.getUtilization().setValue(hbaseVirtualMemoryMeasurement.getUtilization().getValue());
					}
				}

			} else {
				VirtualMachine machine = (VirtualMachine) cdoVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity();
				if (machine.getHypervisor() != null) {
					if (availableComputenodes.contains(machine.getHypervisor().getNode().getName())) {
						logger.debug("VirtualMemoryMeasurement: Delete the cdo one.");
						toDelete.add(cdoVirtualMemoryMeasurement);
					}
				} else {
					logger.debug("VirtualMemoryMeasurement: Delete the cdo one, the hypervisor of the VM is empty");
					toDelete.add(cdoVirtualMemoryMeasurement);
				}
			}
		}

		for (VirtualMemoryMeasurement typeToDelete : toDelete) {

			EcoreUtil.delete(typeToDelete);
		}

		List<VirtualMemoryMeasurement> toAdd = new ArrayList<VirtualMemoryMeasurement>();

		for (VirtualMemoryMeasurement hbaseVirtualMemoryMeasurement : hbaseVirtualMemoryMeasurements) {
			VirtualMemoryMeasurement cdoVirtualMemoryMeasurement = CdoHelper.getModelByIdentifier(cdoVirtualMemoryMeasurements,
					((VirtualMachine) hbaseVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity()).getName());
			if (((VirtualMachine) hbaseVirtualMemoryMeasurement.getObservedVirtualMemory().getVirtualMemoryConsumingEntity()).getInputParameters().get("isDeleted").equals("true"))
				continue;
			if (cdoVirtualMemoryMeasurement == null) {
				logger.debug("VirtualMemoryMeasurement: Add the hbase model.");
				toAdd.add(hbaseVirtualMemoryMeasurement);
			}
		}

		for (VirtualMemoryMeasurement typeToAdd : toAdd) {
			typeToAdd.setLogicalLoadModel(cdoLogicalLoadModel);
			typeToAdd.setObservedVirtualMemory(
					CdoHelper.getVirtualMemoryByVMName(cdoLogicalDCModel, ((VirtualMachine) typeToAdd.getObservedVirtualMemory().getVirtualMemoryConsumingEntity()).getName()));
		}

	}

	private static void checkAndUpdateVirtualProcessingUnitMeasurement(LogicalLoadModel cdoLogicalLoadModel,
		LogicalLoadModel hbaseLogicalLoadModel,
		LogicalDCModel cdoLogicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputenodes) throws Exception {

		EList<VirtualProcessingUnitsMeasurement> cdoVirtualProcessingUnitMeasurements = cdoLogicalLoadModel.getVirtualProcessingUnitMeasurements();
		EList<VirtualProcessingUnitsMeasurement> hbaseVirtualProcessingUnitMeasurements = hbaseLogicalLoadModel.getVirtualProcessingUnitMeasurements();

		List<VirtualProcessingUnitsMeasurement> toDelete = new ArrayList<VirtualProcessingUnitsMeasurement>();

		for (VirtualProcessingUnitsMeasurement cdoVirtualProcessingUnitMeasurement : cdoVirtualProcessingUnitMeasurements) {
			if (cdoVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit() == null) {
				toDelete.add(cdoVirtualProcessingUnitMeasurement);
				continue;
			}
			VirtualProcessingUnitsMeasurement hbaseVirtualProcessingUnitMeasurement = CdoHelper.getModelByIdentifier(hbaseVirtualProcessingUnitMeasurements,
					cdoVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine().getName());
			VirtualMachine vmFromVirtualProcessingUnit = cdoVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine();

			if (hbaseVirtualProcessingUnitMeasurement != null && vmFromVirtualProcessingUnit.getHypervisor() != null) {
				logger.debug("VirtualProcessingUnitMeasurement: It exists already.");
				if (cdoVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit() != null && !cdoVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine()
						.getName().equals(hbaseVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine().getName())) {
					cdoVirtualProcessingUnitMeasurement.setObservedVirtualProcessingUnit(
							CdoHelper.getVirtualProcessingUnitByVMName(cdoLogicalDCModel, hbaseVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine().getName()));
				}
				if (updateUtilisation) {
					if (cdoVirtualProcessingUnitMeasurement.getUtilization().getValue() != hbaseVirtualProcessingUnitMeasurement.getUtilization().getValue()) {
						cdoVirtualProcessingUnitMeasurement.getUtilization().setValue(hbaseVirtualProcessingUnitMeasurement.getUtilization().getValue());
					}
				}
			} else {
				VirtualMachine machine = cdoVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine();
				if (machine.getHypervisor() != null) {
					if (availableComputenodes.contains(cdoVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine().getHypervisor().getNode().getName())) {
						logger.debug("VirtualProcessingUnitMeasurement: Delete the cdo one.");
						toDelete.add(cdoVirtualProcessingUnitMeasurement);
					}
				} else {
					logger.debug("VirtualProcessingUnitMeasurement: Delete the cdo one, the hypervisor of the VM is empty.");
					toDelete.add(cdoVirtualProcessingUnitMeasurement);
				}
			}
		}

		for (VirtualProcessingUnitsMeasurement typeToDelete : toDelete) {
			EcoreUtil.delete(typeToDelete);
		}

		List<VirtualProcessingUnitsMeasurement> toAdd = new ArrayList<VirtualProcessingUnitsMeasurement>();

		for (VirtualProcessingUnitsMeasurement hbaseVirtualProcessingUnitMeasurement : hbaseVirtualProcessingUnitMeasurements) {
			VirtualProcessingUnitsMeasurement cdoVirtualProcessingUnitMeasurement = CdoHelper.getModelByIdentifier(cdoVirtualProcessingUnitMeasurements,
					hbaseVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine().getName());
			if (hbaseVirtualProcessingUnitMeasurement.getObservedVirtualProcessingUnit().getVirtualMachine().getInputParameters().get("isDeleted").equals("true"))
				continue;
			if (cdoVirtualProcessingUnitMeasurement == null) {
				logger.debug("VirtualProcessingUnitMeasurement: Add the hbase model.");
				toAdd.add(hbaseVirtualProcessingUnitMeasurement);
			}
		}

		for (VirtualProcessingUnitsMeasurement typeToAdd : toAdd) {
			typeToAdd.setLogicalLoadModel(cdoLogicalLoadModel);
			typeToAdd.setObservedVirtualProcessingUnit(CdoHelper.getVirtualProcessingUnitByVMName(cdoLogicalDCModel, typeToAdd.getObservedVirtualProcessingUnit().getVirtualMachine().getName()));
		}
	}

	private static void checkAndUpdateMemoryMeasurement(PhysicalLoadModel cdoPhysicalLoadModel,
		PhysicalLoadModel hbasePhysicalLoadModel,
		PhysicalDCModel cdoPhysicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputenodes) throws Exception {
		checkAndUpdatePhysicalLoadMeasurement(MemoryMeasurement.class, MemorySpecification.class, "getMemoryMeasurements", "getUtilization", null, null, null, null, null, "getObservedMemory",
				"setObservedMemory", "getMemoryByNodeName", cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, true, false, false, availableComputenodes);
	}

	private static void checkAndUpdatePuMeasurement(PhysicalLoadModel cdoPhysicalLoadModel,
		PhysicalLoadModel hbasePhysicalLoadModel,
		PhysicalDCModel cdoPhysicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputenodes) throws Exception {
		checkAndUpdatePhysicalLoadMeasurement(PuMeasurement.class, ProcessingUnitSpecification.class, "getCpuMeasurement", "getUtilization", null, null, null, null, null, "getObservedPu",
				"setObservedPu", "getProcessingUnitByNodeName", cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, true, false, false, availableComputenodes);
	}

	private static void checkAndUpdateStorageMeasurement(PhysicalLoadModel cdoPhysicalLoadModel,
		PhysicalLoadModel hbasePhysicalLoadModel,
		PhysicalDCModel cdoPhysicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputenodes) throws Exception {
		checkAndUpdatePhysicalLoadMeasurement(StorageMeasurement.class, StorageSpecification.class, "getStorageMeasurement", "getStorageUtilization", null, "getReadThroughput", "getWriteThroughput",
				"setReadThroughput", "setWriteThroughput", "getObservedStorage", "setObservedStorage", "getStorageSpecificationByNodeName", cdoPhysicalLoadModel, hbasePhysicalLoadModel,
				cdoPhysicalDCModel, updateUtilisation, true, true, false, availableComputenodes);
	}

	private static void checkAndUpdateNetworkInterconnectMeasurement(PhysicalLoadModel cdoPhysicalLoadModel,
		PhysicalLoadModel hbasePhysicalLoadModel,
		PhysicalDCModel cdoPhysicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputenodes) throws Exception {
		checkAndUpdatePhysicalLoadMeasurement(InterconnectMeasurement.class, NetworkInterconnect.class, "getInterconnectMeasurement", "getMeasuredThroughput", "setMeasuredThroughput", null, null,
				null, null, "getObservedInterconnect", "setObservedInterconnect", "getEquivalentNetworkInterconnectFromPhysicalDCModel", cdoPhysicalLoadModel, hbasePhysicalLoadModel,
				cdoPhysicalDCModel, updateUtilisation, false, false, true, availableComputenodes);
	}

	private static void checkAndUpdatePowerConsumingEntityMeasurement(PhysicalLoadModel cdoPhysicalLoadModel,
		PhysicalLoadModel hbasePhysicalLoadModel,
		PhysicalDCModel cdoPhysicalDCModel,
		boolean updateUtilisation,
		Collection<String> availableComputenodes) throws Exception {
		checkAndUpdatePhysicalLoadMeasurement(PowerConsumingEntityMeasurement.class, null, "getPowerConsumingEntityMeasurements", "getCurrentConsumption", "setCurrentConsumption", null, null, null,
				null, "getPowerConsumingEntity", "setPowerConsumingEntity", "getComputeNodeByName", cdoPhysicalLoadModel, hbasePhysicalLoadModel, cdoPhysicalDCModel, updateUtilisation, false, false,
				false, availableComputenodes);
	}

	@SuppressWarnings("unchecked")
	private static <T> void checkAndUpdatePhysicalLoadMeasurement(Class<?> clsMain,
		Class<?> clsExtra,
		String getMeasurementsString,
		String getMeasurementGetUtilString,
		String getMeasurementSetUtilString,
		String getReadThroughputString,
		String getWriteThroughputString,
		String getSetReadThroughputString,
		String getSetWriteThroughputString,
		String getObservedString,
		String getSetObservedString,
		String getDeclaredMethodFromCdoHelperString,
		PhysicalLoadModel cdoPhysicalLoadModel,
		PhysicalLoadModel hbasePhysicalLoadModel,
		PhysicalDCModel cdoPhysicalDCModel,
		boolean updateUtilisation,
		boolean isUtilizationPresent,
		boolean isMeasurementExtraInfo,
		boolean isNetworkInterconnect,
		Collection<String> availableComputenodes) throws Exception {

		Method getMeasurementsMethod = getMethodFromClass(PhysicalLoadModel.class, getMeasurementsString);
		Method getMeasurementGetUtilMethod = getMethodFromClass(clsMain, getMeasurementGetUtilString);
		Method getValueFromUtil = getMethodFromClass(Utilization.class, "getValue");
		Method getSetValueFromUtil = getMethodFromClass(Utilization.class, "setValue", Amount.class);
		Method getMeasurementSetUtilMethod = null;
		if (getMeasurementSetUtilString != null) {
			getMeasurementSetUtilMethod = getMethodFromClass(clsMain, getMeasurementSetUtilString, Amount.class);
		}
		Method getReadThroughputMethod = null;
		Method getWriteThroughputMethod = null;
		Method getSetReadThroughputMethod = null;
		Method getSetWriteThroughputMethod = null;
		if (isMeasurementExtraInfo) {
			getReadThroughputMethod = getMethodFromClass(clsMain, getReadThroughputString);
			getWriteThroughputMethod = getMethodFromClass(clsMain, getWriteThroughputString);
			getSetReadThroughputMethod = getMethodFromClass(clsMain, getSetReadThroughputString, Amount.class);
			getSetWriteThroughputMethod = getMethodFromClass(clsMain, getSetWriteThroughputString, Amount.class);
		}
		Method setPhysicalLoadModelMethod = getMethodFromClass(clsMain, "setPhysicalLoadModel", PhysicalLoadModel.class);
		Method getObservedMethod = getMethodFromClass(clsMain, getObservedString);
		Method getComputeNodeNameMethod = getMethodFromClass(ComputeNode.class, "getName");
		Method getSetObservedMethod = null;
		Method getDeclaredMethodFromCdoHelper = CdoHelper.class.getDeclaredMethod(getDeclaredMethodFromCdoHelperString, PhysicalDCModel.class, String.class);
		Method getNodeFromObservedClassMethod = null;
		if (clsExtra != null) {
			if (isNetworkInterconnect) {
				getNodeFromObservedClassMethod = getMethodFromClass(clsExtra, "getConnectedEntities");
			} else {
				getNodeFromObservedClassMethod = getMethodFromClass(clsExtra, "getNode");
			}
			getSetObservedMethod = getMethodFromClass(clsMain, getSetObservedString, clsExtra);
		} else {
			getSetObservedMethod = getMethodFromClass(clsMain, getSetObservedString, PowerConsumingEntity.class);
		}

		EList<EObject> cdoNodeMeasurements = (EList<EObject>) getMeasurementsMethod.invoke(cdoPhysicalLoadModel);
		EList<EObject> hbaseNodeMeasurements = (EList<EObject>) getMeasurementsMethod.invoke(hbasePhysicalLoadModel);

		List<EObject> toDelete = new ArrayList<EObject>();

		for (EObject cdoNodeMeasurement : cdoNodeMeasurements) {
			ComputeNode computeNode = getComputeNodeForObject(isNetworkInterconnect, getNodeFromObservedClassMethod, getObservedMethod, cdoNodeMeasurement);
			EObject hbaseNodeMeasurement = null;
			if (computeNode != null) {
				hbaseNodeMeasurement = CdoHelper.getModelByIdentifier(hbaseNodeMeasurements, (String) getComputeNodeNameMethod.invoke(computeNode));
			}
			if (hbaseNodeMeasurement != null) {
				logger.debug(clsMain.getSimpleName() + ": It exists already.");
				if (clsExtra != null) {
					if (getObservedMethod.invoke(cdoNodeMeasurement) != null
							&& !getComputeNodeNameMethod.invoke(getComputeNodeForObject(isNetworkInterconnect, getNodeFromObservedClassMethod, getObservedMethod, cdoNodeMeasurement))
									.equals(getComputeNodeNameMethod.invoke(getComputeNodeForObject(isNetworkInterconnect, getNodeFromObservedClassMethod, getObservedMethod, cdoNodeMeasurement)))) {
						getSetObservedMethod.invoke(cdoNodeMeasurement, getDeclaredMethodFromCdoHelper.invoke(null, cdoPhysicalDCModel,
								getComputeNodeNameMethod.invoke(getComputeNodeForObject(isNetworkInterconnect, getNodeFromObservedClassMethod, getObservedMethod, cdoNodeMeasurement))));
					}
				}
				if (updateUtilisation) {
					try {
						if (isUtilizationPresent) {
							if (getValueFromUtil.invoke(getMeasurementGetUtilMethod.invoke(cdoNodeMeasurement)) != getValueFromUtil.invoke(getMeasurementGetUtilMethod.invoke(hbaseNodeMeasurement))) {
								getSetValueFromUtil.invoke(getMeasurementGetUtilMethod.invoke(cdoNodeMeasurement), getValueFromUtil.invoke(getMeasurementGetUtilMethod.invoke(hbaseNodeMeasurement)));

							}
						} else {
							if (getMeasurementGetUtilMethod.invoke(cdoNodeMeasurement) != getMeasurementGetUtilMethod.invoke(hbaseNodeMeasurement)) {
								getMeasurementSetUtilMethod.invoke(cdoNodeMeasurement, getMeasurementGetUtilMethod.invoke(hbaseNodeMeasurement));
							}
						}

						if (isMeasurementExtraInfo) {
							if (getReadThroughputMethod.invoke(cdoNodeMeasurement) != getReadThroughputMethod.invoke(hbaseNodeMeasurement)) {
								getSetReadThroughputMethod.invoke(cdoNodeMeasurement, getReadThroughputMethod.invoke(hbaseNodeMeasurement));
							}
							if (getWriteThroughputMethod.invoke(cdoNodeMeasurement) != getWriteThroughputMethod.invoke(hbaseNodeMeasurement)) {
								getSetWriteThroughputMethod.invoke(cdoNodeMeasurement, getWriteThroughputMethod.invoke(hbaseNodeMeasurement));
							}
						}
					} catch (Exception e) {
						if (availableComputenodes.contains(computeNode.getName())) {
							logger.warn(clsMain.getSimpleName() + ": Delete the cdo one, because there was an exception while comparing.Exception: " + e);
							toDelete.add(cdoNodeMeasurement);
						} else {
							logger.info("not a known computenode. leaving as is");
						}
					}
				}
			} else {
				if (availableComputenodes.contains(computeNode.getName())) {
					logger.debug(clsMain.getSimpleName() + ": Delete the cdo one.");
					toDelete.add(cdoNodeMeasurement);
				} else {
					logger.info("not a known computenode. leaving as is");
				}
			}
		}

		for (EObject typeToDelete : toDelete) {
			EcoreUtil.delete((EObject) typeToDelete);
		}

		List<EObject> toAdd = new ArrayList<EObject>();

		for (EObject hbaseNodeMeasurement : hbaseNodeMeasurements) {
			EObject cdoNodeMeasurement = CdoHelper.getModelByIdentifier(cdoNodeMeasurements,
					(String) getComputeNodeNameMethod.invoke(getComputeNodeForObject(isNetworkInterconnect, getNodeFromObservedClassMethod, getObservedMethod, hbaseNodeMeasurement)));

			if (cdoNodeMeasurement == null) {
				logger.debug(clsMain.getSimpleName() + ": Add the hbase model.");
				toAdd.add(hbaseNodeMeasurement);
			}
		}
		for (EObject typeToAdd : toAdd) {
			setPhysicalLoadModelMethod.invoke(typeToAdd, cdoPhysicalLoadModel);
			if (getObservedMethod.invoke(typeToAdd) != null) {
				getSetObservedMethod.invoke(typeToAdd, getDeclaredMethodFromCdoHelper.invoke(null, cdoPhysicalDCModel,
						getComputeNodeNameMethod.invoke(getComputeNodeForObject(isNetworkInterconnect, getNodeFromObservedClassMethod, getObservedMethod, typeToAdd))));
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static ComputeNode getComputeNodeForObject(boolean isNetworkInterconnect, Method getNodeFromObservedClassMethod, Method getObservedMethod, Object object) throws Exception {
		ComputeNode computeNode = null;
		if (!isNetworkInterconnect) {
			if (getNodeFromObservedClassMethod != null) {
				computeNode = (ComputeNode) getNodeFromObservedClassMethod.invoke(getObservedMethod.invoke(object));
			} else {
				computeNode = (ComputeNode) getObservedMethod.invoke(object);
			}
		} else {
			if (getObservedMethod.invoke(object) != null && !((EList<ComputeNode>) getNodeFromObservedClassMethod.invoke(getObservedMethod.invoke(object))).isEmpty())
				computeNode = ((EList<ComputeNode>) getNodeFromObservedClassMethod.invoke(getObservedMethod.invoke(object))).get(0);
		}
		return computeNode;
	}

	private static Method getMethodFromClass(Class<?> cls, String methodName) throws Exception {
		Class<?> noparams[] = {};
		return getMethodFromClass(cls, methodName, noparams);
	}

	private static Method getMethodFromClass(Class<?> cls, String methodName, Class<?>... parameterTypes) throws Exception {
		return cls.getMethod(methodName, parameterTypes);
	}
	private static void fixStoragesize(StorageSpecification cdoSpec, StorageSpecification hbaseSpec) {
		Amount<DataAmount> cdoSize = cdoSpec.getSize();
		Amount<DataAmount> hbaseSize = hbaseSpec.getSize();
		if(cdoSize == null && hbaseSize == null) return;
		if(cdoSize == null || !cdoSize.equals(hbaseSize)) {
			logger.warn("fixing size from " + cdoSize + " to " + hbaseSize);
			cdoSpec.setSize(hbaseSize == null ? null : hbaseSize.copy());
		}
	}
	
	private static void fixReadBandwidth(StorageSpecification cdoSpec, StorageSpecification hbaseSpec) {
		Bandwidth cdoBw = cdoSpec.getReadBandwidth();
		Bandwidth hbaseBw = cdoSpec.getReadBandwidth();
		if(cdoBw == null && hbaseBw == null) return;
		else if(cdoBw == null && hbaseBw != null) {
			cdoBw = UtilFactory.INSTANCE.createBandwidth();
			cdoSpec.setReadBandwidth(cdoBw);
			fixAnyBandwith(cdoBw, hbaseBw, "Read");
		} else if(hbaseBw == null){
			logger.warn("fixing read bandwidth to null");
			cdoSpec.setReadBandwidth(null);
		} else {
			fixAnyBandwith(cdoBw, hbaseBw, "Read");
		}
	}
	
	private static void fixWriteBandwidth(StorageSpecification cdoSpec, StorageSpecification hbaseSpec) {
		Bandwidth cdoBw = cdoSpec.getWriteBandwidth();
		Bandwidth hbaseBw = cdoSpec.getWriteBandwidth();
		if(cdoBw == null && hbaseBw == null) return;
		else if(cdoBw == null && hbaseBw != null) {
			cdoBw = UtilFactory.INSTANCE.createBandwidth();
			cdoSpec.setWriteBandwidth(cdoBw);
			fixAnyBandwith(cdoBw, hbaseBw, "Write");
		} else if(hbaseBw == null){
			logger.warn("fixing write bandwidth to null");
			cdoSpec.setWriteBandwidth(null);
		} else {
			fixAnyBandwith(cdoBw, hbaseBw, "Write");
		}
	}
	
	private static void fixWriteDelay(StorageSpecification cdoSpec, StorageSpecification hbaseSpec) {
		Amount<Duration> cdoDelay = cdoSpec.getWriteDelay();
		Amount<Duration> hbaseDelay = cdoSpec.getWriteDelay();
		
		if(cdoDelay == null && hbaseDelay == null) return;
		if(cdoDelay == null || !cdoDelay.equals(hbaseDelay)) {
			logger.warn("fixing write delay from " +  cdoDelay + " to " + hbaseDelay);
			cdoSpec.setWriteDelay(hbaseDelay == null ? null : hbaseDelay.copy());
		}
	}
	
	private static void fixReadDelay(StorageSpecification cdoSpec, StorageSpecification hbaseSpec) {
		Amount<Duration> cdoDelay = cdoSpec.getReadDelay();
		Amount<Duration> hbaseDelay = cdoSpec.getReadDelay();
		
		if(cdoDelay == null && hbaseDelay == null) return;
		if(cdoDelay == null || !cdoDelay.equals(hbaseDelay)) {
			logger.warn("fixing read delay from " +  cdoDelay + " to " + hbaseDelay);
			cdoSpec.setReadDelay(hbaseDelay == null ? null : hbaseDelay.copy());
		}
	}
	
	private static void fixAnyBandwith(Bandwidth cdoBw, Bandwidth hbaseBw, String name) {
		Amount<DataRate> cdoValue = cdoBw.getValue();
		Amount<DataRate> hbaseValue = hbaseBw.getValue();
		if(cdoValue == null && hbaseValue == null) return;
		if(cdoValue == null || !cdoValue.equals(hbaseValue)) {
			logger.warn("fixing " + name + " bandwidth from " + cdoValue + " to " + hbaseValue);
			cdoBw.setValue(hbaseValue == null ? null : hbaseValue.copy());
		}
	}
}
