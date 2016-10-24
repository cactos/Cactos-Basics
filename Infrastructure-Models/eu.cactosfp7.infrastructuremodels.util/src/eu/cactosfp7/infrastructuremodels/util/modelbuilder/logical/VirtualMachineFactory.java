package eu.cactosfp7.infrastructuremodels.util.modelbuilder.logical;

import javax.measure.quantity.DataAmount;
import javax.measure.quantity.Frequency;

import org.jscience.physics.amount.Amount;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VM_State;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureType;

public class VirtualMachineFactory implements IVirtualMachineFactory {

	/**
	 * Creates a new, VM that is yet to be assigned.
	 * @param model The model in which the VM is created.
	 * @param vcores The number of vcores assigned to the VM.
	 * @param vFrequency The frequency of the virtual CPUs.
	 * @param architecture type of the required PUs.
	 * @param memory The memory assigned to the VM.
	 * @param diskspace The disk space of the primary volume assigned to the VM.
	 * @param instantiatedImage The image with which the VM is instantiated.
	 * @return The created VM. The volume has not been assigned to a physical machine yet, so this needs to be handled after the assignment.
	 */
	public VirtualMachine createUnassignedVirtualMachine(LogicalDCModel model, int vcores, Amount<Frequency> vFrequency, ArchitectureType type, Amount<DataAmount> memory, Amount<DataAmount> diskspace, VMImage instantiatedImage) {
		final CoreFactory factory = CoreFactory.INSTANCE;
        VirtualMachine vm = factory.createVirtualMachine();
		vm.setState(VM_State.UNASSIGNED);
		VirtualMemory virtualMemory = factory.createVirtualMemory();
		virtualMemory.setProvisioned(memory);
		vm.getVirtualMemoryUnits().add(virtualMemory);
		VMImageInstance vmImageInstance = factory.createVMImageInstance();
		vmImageInstance.setRootDisk(instantiatedImage);
		vm.setVMImageInstance(vmImageInstance);
		
		VirtualProcessingUnit virtualProcessingUnit = factory.createVirtualProcessingUnit();
		virtualProcessingUnit.setVirtualCores(vcores);
		virtualProcessingUnit.setArchitectureType(type);
		virtualProcessingUnit.setName("cpu-"+type+"-"+vcores+"cores");
        vm.getVirtualProcessingUnits().add(virtualProcessingUnit);
		
		vm.setLogicalDCModel(model);
		
		return vm;
	}
}
