/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.identifier.IdentifierPackage;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.impl.ApplicationPackageImpl;

import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.impl.HypervisorPackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.impl.ArchitecturetypePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.impl.CorePackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.power.impl.PowerPackageImpl;

import eu.cactosfp7.infrastructuremodels.physicaldc.util.impl.UtilPackageImpl;

import eu.cactosfp7.optimisationplan.ConnectVmAction;
import eu.cactosfp7.optimisationplan.ExecutionStatus;
import eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction;
import eu.cactosfp7.optimisationplan.LogicalStorageScalingAction;
import eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction;
import eu.cactosfp7.optimisationplan.OptimisationActionStep;
import eu.cactosfp7.optimisationplan.OptimisationPlan;
import eu.cactosfp7.optimisationplan.OptimisationPlanRepository;
import eu.cactosfp7.optimisationplan.OptimisationStep;
import eu.cactosfp7.optimisationplan.OptimisationplanFactory;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.ParallelSteps;
import eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction;
import eu.cactosfp7.optimisationplan.ResourceControlAction;
import eu.cactosfp7.optimisationplan.ScaleIn;
import eu.cactosfp7.optimisationplan.ScaleOut;
import eu.cactosfp7.optimisationplan.SequentialSteps;
import eu.cactosfp7.optimisationplan.StartApplication;
import eu.cactosfp7.optimisationplan.StartBlackBoxApplication;
import eu.cactosfp7.optimisationplan.StartGreyBoxApplication;
import eu.cactosfp7.optimisationplan.StartVmAction;
import eu.cactosfp7.optimisationplan.StartWhiteBoxApplication;
import eu.cactosfp7.optimisationplan.StopApplication;
import eu.cactosfp7.optimisationplan.StopVmAction;
import eu.cactosfp7.optimisationplan.SuspendVmAction;
import eu.cactosfp7.optimisationplan.VerticalScalingAction;
import eu.cactosfp7.optimisationplan.VirtualCoresScalingAction;
import eu.cactosfp7.optimisationplan.VmMigrationAction;
import eu.cactosfp7.optimisationplan.VmPlacementAction;

import eu.cactosfp7.optimisationplan.util.OptimisationplanValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimisationplanPackageImpl extends EPackageImpl implements OptimisationplanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimisationActionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimisationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimisationPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimisationPlanRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmPlacementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmMigrationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalScalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopVmActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalMemoryScalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalStorageScalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFrequencyScalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startVmActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendVmActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managePhysicalNodeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualCoresScalingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startWhiteBoxApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startGreyBoxApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startBlackBoxApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectVmActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceControlActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OptimisationplanPackageImpl() {
		super(eNS_URI, OptimisationplanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OptimisationplanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OptimisationplanPackage init() {
		if (isInited)
			return (OptimisationplanPackage) EPackage.Registry.INSTANCE.getEPackage(OptimisationplanPackage.eNS_URI);

		// Obtain or create and register package
		OptimisationplanPackageImpl theOptimisationplanPackage = (OptimisationplanPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof OptimisationplanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new OptimisationplanPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ArchitecturetypePackageImpl.eINSTANCE.eClass();
		UtilPackageImpl.eINSTANCE.eClass();
		PowerPackageImpl.eINSTANCE.eClass();
		CorePackageImpl.eINSTANCE.eClass();
		HypervisorPackageImpl.eINSTANCE.eClass();
		ApplicationPackageImpl.eINSTANCE.eClass();
		eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl.eINSTANCE.eClass();

		// Create package meta-data objects
		theOptimisationplanPackage.createPackageContents();

		// Initialize created meta-data
		theOptimisationplanPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theOptimisationplanPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return OptimisationplanValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theOptimisationplanPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OptimisationplanPackage.eNS_URI, theOptimisationplanPackage);
		return theOptimisationplanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimisationActionStep() {
		return optimisationActionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimisationStep() {
		return optimisationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationStep_SequentialSteps() {
		return (EReference) optimisationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationStep_ParallelSteps() {
		return (EReference) optimisationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationStep_OptimisationPlan() {
		return (EReference) optimisationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationStep_ExecutionStatus() {
		return (EAttribute) optimisationStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationStep_ExecutionStarted() {
		return (EAttribute) optimisationStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationStep_ExecutionStopped() {
		return (EAttribute) optimisationStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialSteps() {
		return sequentialStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialSteps_OptimisationSteps() {
		return (EReference) sequentialStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelSteps() {
		return parallelStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelSteps_OptimisationSteps() {
		return (EReference) parallelStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimisationPlan() {
		return optimisationPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationPlan_ExecutionStatus() {
		return (EAttribute) optimisationPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationPlan_CreationDate() {
		return (EAttribute) optimisationPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationPlan_ExecutionStarted() {
		return (EAttribute) optimisationPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimisationPlan_ExecutionStopped() {
		return (EAttribute) optimisationPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationPlan_Repository() {
		return (EReference) optimisationPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationPlan_OptimisationStep() {
		return (EReference) optimisationPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimisationPlanRepository() {
		return optimisationPlanRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimisationPlanRepository_OptimisationPlans() {
		return (EReference) optimisationPlanRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVmPlacementAction() {
		return vmPlacementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmPlacementAction_TargetHost() {
		return (EReference) vmPlacementActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmPlacementAction_VmImage() {
		return (EReference) vmPlacementActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmPlacementAction_PuAffinity() {
		return (EReference) vmPlacementActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmPlacementAction_ProposedMemory() {
		return (EAttribute) vmPlacementActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmPlacementAction_ProposedStorage() {
		return (EAttribute) vmPlacementActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmPlacementAction_ProposedVirtualCores() {
		return (EAttribute) vmPlacementActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmPlacementAction_UnassignedVirtualMachine() {
		return (EReference) vmPlacementActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVmMigrationAction() {
		return vmMigrationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmMigrationAction_MigratedVm() {
		return (EReference) vmMigrationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmMigrationAction_TargetHost() {
		return (EReference) vmMigrationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmMigrationAction_PuAffinityAfterMigration() {
		return (EReference) vmMigrationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmMigrationAction_SourceHost() {
		return (EReference) vmMigrationActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalScalingAction() {
		return verticalScalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopVmAction() {
		return stopVmActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopVmAction_StoppedVm() {
		return (EReference) stopVmActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalMemoryScalingAction() {
		return logicalMemoryScalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalMemoryScalingAction_ProposedSize() {
		return (EAttribute) logicalMemoryScalingActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalMemoryScalingAction_ScaledVirtualMemory() {
		return (EReference) logicalMemoryScalingActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalStorageScalingAction() {
		return logicalStorageScalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalStorageScalingAction_ProposedLocalSize() {
		return (EAttribute) logicalStorageScalingActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalStorageScalingAction_VMImageInstance() {
		return (EReference) logicalStorageScalingActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalFrequencyScalingAction() {
		return physicalFrequencyScalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFrequencyScalingAction_ScaledPhysicalProcessingUnit() {
		return (EReference) physicalFrequencyScalingActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalFrequencyScalingAction_ProposedFrequency() {
		return (EAttribute) physicalFrequencyScalingActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartVmAction() {
		return startVmActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartVmAction_StartedVm() {
		return (EReference) startVmActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspendVmAction() {
		return suspendVmActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuspendVmAction_SuspendedVm() {
		return (EReference) suspendVmActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagePhysicalNodeAction() {
		return managePhysicalNodeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagePhysicalNodeAction_TargetState() {
		return (EAttribute) managePhysicalNodeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagePhysicalNodeAction_ManagedNode() {
		return (EReference) managePhysicalNodeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualCoresScalingAction() {
		return virtualCoresScalingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualCoresScalingAction_ProposedNumberOfCores() {
		return (EAttribute) virtualCoresScalingActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualCoresScalingAction_ScaledvirtualPu() {
		return (EReference) virtualCoresScalingActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartApplication() {
		return startApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartApplication_ApplicationTemplate() {
		return (EReference) startApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopApplication() {
		return stopApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopApplication_ApplicationInstance() {
		return (EReference) stopApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleOut() {
		return scaleOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaleOut_LoadBalancerInstance() {
		return (EReference) scaleOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaleOut_ScalingConnector() {
		return (EReference) scaleOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleIn() {
		return scaleInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaleIn_LoadBalancerInstance() {
		return (EReference) scaleInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaleIn_ScaledVM() {
		return (EReference) scaleInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartWhiteBoxApplication() {
		return startWhiteBoxApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartWhiteBoxApplication_WhiteBoxUserBehaviourTemplate() {
		return (EReference) startWhiteBoxApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartWhiteBoxApplication__ApplicationTemplateMustBeWhitBoxApplicationTemplate__DiagnosticChain_Map() {
		return startWhiteBoxApplicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartGreyBoxApplication() {
		return startGreyBoxApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartBlackBoxApplication() {
		return startBlackBoxApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectVmAction() {
		return connectVmActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectVmAction_Source() {
		return (EReference) connectVmActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectVmAction_Target() {
		return (EReference) connectVmActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceControlAction() {
		return resourceControlActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceControlAction_AffectedVm() {
		return (EReference) resourceControlActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceControlAction_ResourceShare() {
		return (EAttribute) resourceControlActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceControlAction_ControlledHypervisor() {
		return (EReference) resourceControlActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionStatus() {
		return executionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanFactory getOptimisationplanFactory() {
		return (OptimisationplanFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		optimisationActionStepEClass = createEClass(OPTIMISATION_ACTION_STEP);

		optimisationStepEClass = createEClass(OPTIMISATION_STEP);
		createEReference(optimisationStepEClass, OPTIMISATION_STEP__SEQUENTIAL_STEPS);
		createEReference(optimisationStepEClass, OPTIMISATION_STEP__PARALLEL_STEPS);
		createEReference(optimisationStepEClass, OPTIMISATION_STEP__OPTIMISATION_PLAN);
		createEAttribute(optimisationStepEClass, OPTIMISATION_STEP__EXECUTION_STATUS);
		createEAttribute(optimisationStepEClass, OPTIMISATION_STEP__EXECUTION_STARTED);
		createEAttribute(optimisationStepEClass, OPTIMISATION_STEP__EXECUTION_STOPPED);

		sequentialStepsEClass = createEClass(SEQUENTIAL_STEPS);
		createEReference(sequentialStepsEClass, SEQUENTIAL_STEPS__OPTIMISATION_STEPS);

		parallelStepsEClass = createEClass(PARALLEL_STEPS);
		createEReference(parallelStepsEClass, PARALLEL_STEPS__OPTIMISATION_STEPS);

		optimisationPlanEClass = createEClass(OPTIMISATION_PLAN);
		createEAttribute(optimisationPlanEClass, OPTIMISATION_PLAN__EXECUTION_STATUS);
		createEAttribute(optimisationPlanEClass, OPTIMISATION_PLAN__CREATION_DATE);
		createEAttribute(optimisationPlanEClass, OPTIMISATION_PLAN__EXECUTION_STARTED);
		createEAttribute(optimisationPlanEClass, OPTIMISATION_PLAN__EXECUTION_STOPPED);
		createEReference(optimisationPlanEClass, OPTIMISATION_PLAN__REPOSITORY);
		createEReference(optimisationPlanEClass, OPTIMISATION_PLAN__OPTIMISATION_STEP);

		optimisationPlanRepositoryEClass = createEClass(OPTIMISATION_PLAN_REPOSITORY);
		createEReference(optimisationPlanRepositoryEClass, OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS);

		vmPlacementActionEClass = createEClass(VM_PLACEMENT_ACTION);
		createEReference(vmPlacementActionEClass, VM_PLACEMENT_ACTION__TARGET_HOST);
		createEReference(vmPlacementActionEClass, VM_PLACEMENT_ACTION__VM_IMAGE);
		createEReference(vmPlacementActionEClass, VM_PLACEMENT_ACTION__PU_AFFINITY);
		createEAttribute(vmPlacementActionEClass, VM_PLACEMENT_ACTION__PROPOSED_MEMORY);
		createEAttribute(vmPlacementActionEClass, VM_PLACEMENT_ACTION__PROPOSED_STORAGE);
		createEAttribute(vmPlacementActionEClass, VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES);
		createEReference(vmPlacementActionEClass, VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE);

		vmMigrationActionEClass = createEClass(VM_MIGRATION_ACTION);
		createEReference(vmMigrationActionEClass, VM_MIGRATION_ACTION__MIGRATED_VM);
		createEReference(vmMigrationActionEClass, VM_MIGRATION_ACTION__TARGET_HOST);
		createEReference(vmMigrationActionEClass, VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION);
		createEReference(vmMigrationActionEClass, VM_MIGRATION_ACTION__SOURCE_HOST);

		verticalScalingActionEClass = createEClass(VERTICAL_SCALING_ACTION);

		stopVmActionEClass = createEClass(STOP_VM_ACTION);
		createEReference(stopVmActionEClass, STOP_VM_ACTION__STOPPED_VM);

		logicalMemoryScalingActionEClass = createEClass(LOGICAL_MEMORY_SCALING_ACTION);
		createEAttribute(logicalMemoryScalingActionEClass, LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE);
		createEReference(logicalMemoryScalingActionEClass, LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY);

		logicalStorageScalingActionEClass = createEClass(LOGICAL_STORAGE_SCALING_ACTION);
		createEAttribute(logicalStorageScalingActionEClass, LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE);
		createEReference(logicalStorageScalingActionEClass, LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE);

		physicalFrequencyScalingActionEClass = createEClass(PHYSICAL_FREQUENCY_SCALING_ACTION);
		createEReference(physicalFrequencyScalingActionEClass,
				PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT);
		createEAttribute(physicalFrequencyScalingActionEClass, PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY);

		startVmActionEClass = createEClass(START_VM_ACTION);
		createEReference(startVmActionEClass, START_VM_ACTION__STARTED_VM);

		suspendVmActionEClass = createEClass(SUSPEND_VM_ACTION);
		createEReference(suspendVmActionEClass, SUSPEND_VM_ACTION__SUSPENDED_VM);

		managePhysicalNodeActionEClass = createEClass(MANAGE_PHYSICAL_NODE_ACTION);
		createEAttribute(managePhysicalNodeActionEClass, MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE);
		createEReference(managePhysicalNodeActionEClass, MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE);

		virtualCoresScalingActionEClass = createEClass(VIRTUAL_CORES_SCALING_ACTION);
		createEAttribute(virtualCoresScalingActionEClass, VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES);
		createEReference(virtualCoresScalingActionEClass, VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU);

		startApplicationEClass = createEClass(START_APPLICATION);
		createEReference(startApplicationEClass, START_APPLICATION__APPLICATION_TEMPLATE);

		stopApplicationEClass = createEClass(STOP_APPLICATION);
		createEReference(stopApplicationEClass, STOP_APPLICATION__APPLICATION_INSTANCE);

		scaleOutEClass = createEClass(SCALE_OUT);
		createEReference(scaleOutEClass, SCALE_OUT__LOAD_BALANCER_INSTANCE);
		createEReference(scaleOutEClass, SCALE_OUT__SCALING_CONNECTOR);

		scaleInEClass = createEClass(SCALE_IN);
		createEReference(scaleInEClass, SCALE_IN__LOAD_BALANCER_INSTANCE);
		createEReference(scaleInEClass, SCALE_IN__SCALED_VM);

		startWhiteBoxApplicationEClass = createEClass(START_WHITE_BOX_APPLICATION);
		createEReference(startWhiteBoxApplicationEClass,
				START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE);
		createEOperation(startWhiteBoxApplicationEClass,
				START_WHITE_BOX_APPLICATION___APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTICCHAIN_MAP);

		startGreyBoxApplicationEClass = createEClass(START_GREY_BOX_APPLICATION);

		startBlackBoxApplicationEClass = createEClass(START_BLACK_BOX_APPLICATION);

		connectVmActionEClass = createEClass(CONNECT_VM_ACTION);
		createEReference(connectVmActionEClass, CONNECT_VM_ACTION__SOURCE);
		createEReference(connectVmActionEClass, CONNECT_VM_ACTION__TARGET);

		resourceControlActionEClass = createEClass(RESOURCE_CONTROL_ACTION);
		createEReference(resourceControlActionEClass, RESOURCE_CONTROL_ACTION__AFFECTED_VM);
		createEAttribute(resourceControlActionEClass, RESOURCE_CONTROL_ACTION__RESOURCE_SHARE);
		createEReference(resourceControlActionEClass, RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR);

		// Create enums
		executionStatusEEnum = createEEnum(EXECUTION_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(IdentifierPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl theCorePackage_1 = (eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(eu.cactosfp7.infrastructuremodels.logicaldc.core.impl.CorePackageImpl.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(UtilPackageImpl.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(CorePackageImpl.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(ApplicationPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		optimisationActionStepEClass.getESuperTypes().add(this.getOptimisationStep());
		optimisationStepEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		sequentialStepsEClass.getESuperTypes().add(this.getOptimisationStep());
		parallelStepsEClass.getESuperTypes().add(this.getOptimisationStep());
		optimisationPlanEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		vmPlacementActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		vmMigrationActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		verticalScalingActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		stopVmActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		logicalMemoryScalingActionEClass.getESuperTypes().add(this.getVerticalScalingAction());
		logicalStorageScalingActionEClass.getESuperTypes().add(this.getVerticalScalingAction());
		physicalFrequencyScalingActionEClass.getESuperTypes().add(this.getVerticalScalingAction());
		startVmActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		suspendVmActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		managePhysicalNodeActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		virtualCoresScalingActionEClass.getESuperTypes().add(this.getVerticalScalingAction());
		startApplicationEClass.getESuperTypes().add(this.getOptimisationActionStep());
		stopApplicationEClass.getESuperTypes().add(this.getOptimisationActionStep());
		scaleOutEClass.getESuperTypes().add(this.getOptimisationActionStep());
		scaleInEClass.getESuperTypes().add(this.getOptimisationActionStep());
		startWhiteBoxApplicationEClass.getESuperTypes().add(this.getStartApplication());
		connectVmActionEClass.getESuperTypes().add(this.getOptimisationActionStep());
		resourceControlActionEClass.getESuperTypes().add(this.getOptimisationActionStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(optimisationActionStepEClass, OptimisationActionStep.class, "OptimisationActionStep", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optimisationStepEClass, OptimisationStep.class, "OptimisationStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimisationStep_SequentialSteps(), this.getSequentialSteps(),
				this.getSequentialSteps_OptimisationSteps(), "sequentialSteps", null, 0, 1, OptimisationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOptimisationStep_ParallelSteps(), this.getParallelSteps(),
				this.getParallelSteps_OptimisationSteps(), "parallelSteps", null, 0, 1, OptimisationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOptimisationStep_OptimisationPlan(), this.getOptimisationPlan(),
				this.getOptimisationPlan_OptimisationStep(), "optimisationPlan", null, 0, 1, OptimisationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOptimisationStep_ExecutionStatus(), this.getExecutionStatus(), "executionStatus", null, 1, 1,
				OptimisationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOptimisationStep_ExecutionStarted(), ecorePackage.getEDate(), "executionStarted", null, 0, 1,
				OptimisationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOptimisationStep_ExecutionStopped(), ecorePackage.getEDate(), "executionStopped", null, 0, 1,
				OptimisationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(sequentialStepsEClass, SequentialSteps.class, "SequentialSteps", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequentialSteps_OptimisationSteps(), this.getOptimisationStep(),
				this.getOptimisationStep_SequentialSteps(), "optimisationSteps", null, 0, -1, SequentialSteps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelStepsEClass, ParallelSteps.class, "ParallelSteps", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelSteps_OptimisationSteps(), this.getOptimisationStep(),
				this.getOptimisationStep_ParallelSteps(), "optimisationSteps", null, 0, -1, ParallelSteps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(optimisationPlanEClass, OptimisationPlan.class, "OptimisationPlan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptimisationPlan_ExecutionStatus(), this.getExecutionStatus(), "executionStatus", "READY", 1,
				1, OptimisationPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOptimisationPlan_CreationDate(), theEcorePackage.getEDate(), "creationDate", null, 1, 1,
				OptimisationPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOptimisationPlan_ExecutionStarted(), theEcorePackage.getEDate(), "executionStarted", null, 0,
				1, OptimisationPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOptimisationPlan_ExecutionStopped(), theEcorePackage.getEDate(), "executionStopped", null, 0,
				1, OptimisationPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOptimisationPlan_Repository(), this.getOptimisationPlanRepository(),
				this.getOptimisationPlanRepository_OptimisationPlans(), "repository", null, 0, 1,
				OptimisationPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOptimisationPlan_OptimisationStep(), this.getOptimisationStep(),
				this.getOptimisationStep_OptimisationPlan(), "optimisationStep", null, 1, 1, OptimisationPlan.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(optimisationPlanRepositoryEClass, OptimisationPlanRepository.class, "OptimisationPlanRepository",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimisationPlanRepository_OptimisationPlans(), this.getOptimisationPlan(),
				this.getOptimisationPlan_Repository(), "optimisationPlans", null, 0, -1,
				OptimisationPlanRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vmPlacementActionEClass, VmPlacementAction.class, "VmPlacementAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVmPlacementAction_TargetHost(), theCorePackage_1.getHypervisor(), null, "targetHost", null, 1,
				1, VmPlacementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVmPlacementAction_VmImage(), theCorePackage_1.getVirtualDisk(), null, "vmImage", null, 1, 1,
				VmPlacementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVmPlacementAction_PuAffinity(), theCorePackage_1.getPuAffinity(), null, "puAffinity", null, 0,
				-1, VmPlacementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		EGenericType g1 = createEGenericType(theUtilPackage.getAmount());
		EGenericType g2 = createEGenericType(theUtilPackage.getDataAmount());
		g1.getETypeArguments().add(g2);
		initEAttribute(getVmPlacementAction_ProposedMemory(), g1, "proposedMemory", null, 1, 1, VmPlacementAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDataAmount());
		g1.getETypeArguments().add(g2);
		initEAttribute(getVmPlacementAction_ProposedStorage(), g1, "proposedStorage", null, 1, 1,
				VmPlacementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVmPlacementAction_ProposedVirtualCores(), ecorePackage.getEInt(), "proposedVirtualCores", "1",
				1, 1, VmPlacementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVmPlacementAction_UnassignedVirtualMachine(), theCorePackage_1.getVirtualMachine(), null,
				"unassignedVirtualMachine", null, 1, 1, VmPlacementAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vmMigrationActionEClass, VmMigrationAction.class, "VmMigrationAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVmMigrationAction_MigratedVm(), theCorePackage_1.getVirtualMachine(), null, "migratedVm",
				null, 1, 1, VmMigrationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVmMigrationAction_TargetHost(), theCorePackage_1.getHypervisor(), null, "targetHost", null, 1,
				1, VmMigrationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVmMigrationAction_PuAffinityAfterMigration(), theCorePackage_1.getPuAffinity(), null,
				"puAffinityAfterMigration", null, 0, -1, VmMigrationAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVmMigrationAction_SourceHost(), theCorePackage_1.getHypervisor(), null, "sourceHost", null, 1,
				1, VmMigrationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(verticalScalingActionEClass, VerticalScalingAction.class, "VerticalScalingAction", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopVmActionEClass, StopVmAction.class, "StopVmAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopVmAction_StoppedVm(), theCorePackage_1.getVirtualMachine(), null, "stoppedVm", null, 1, 1,
				StopVmAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalMemoryScalingActionEClass, LogicalMemoryScalingAction.class, "LogicalMemoryScalingAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDataAmount());
		g1.getETypeArguments().add(g2);
		initEAttribute(getLogicalMemoryScalingAction_ProposedSize(), g1, "proposedSize", null, 1, 1,
				LogicalMemoryScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogicalMemoryScalingAction_ScaledVirtualMemory(), theCorePackage_1.getVirtualMemory(), null,
				"scaledVirtualMemory", null, 1, 1, LogicalMemoryScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalStorageScalingActionEClass, LogicalStorageScalingAction.class, "LogicalStorageScalingAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDataAmount());
		g1.getETypeArguments().add(g2);
		initEAttribute(getLogicalStorageScalingAction_ProposedLocalSize(), g1, "proposedLocalSize", null, 1, 1,
				LogicalStorageScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogicalStorageScalingAction_VMImageInstance(), theCorePackage_1.getVMImageInstance(), null,
				"vMImageInstance", null, 1, 1, LogicalStorageScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(physicalFrequencyScalingActionEClass, PhysicalFrequencyScalingAction.class,
				"PhysicalFrequencyScalingAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalFrequencyScalingAction_ScaledPhysicalProcessingUnit(),
				theCorePackage.getProcessingUnitSpecification(), null, "scaledPhysicalProcessingUnit", null, 1, 1,
				PhysicalFrequencyScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getFrequency());
		g1.getETypeArguments().add(g2);
		initEAttribute(getPhysicalFrequencyScalingAction_ProposedFrequency(), g1, "proposedFrequency", null, 1, 1,
				PhysicalFrequencyScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startVmActionEClass, StartVmAction.class, "StartVmAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartVmAction_StartedVm(), theCorePackage_1.getVirtualMachine(), null, "startedVm", null, 1,
				1, StartVmAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(suspendVmActionEClass, SuspendVmAction.class, "SuspendVmAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuspendVmAction_SuspendedVm(), theCorePackage_1.getVirtualMachine(), null, "suspendedVm",
				null, 1, 1, SuspendVmAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(managePhysicalNodeActionEClass, ManagePhysicalNodeAction.class, "ManagePhysicalNodeAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagePhysicalNodeAction_TargetState(), theCorePackage.getNodeState(), "targetState", null, 1,
				1, ManagePhysicalNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getManagePhysicalNodeAction_ManagedNode(), theCorePackage.getAbstractNode(), null, "managedNode",
				null, 0, 1, ManagePhysicalNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualCoresScalingActionEClass, VirtualCoresScalingAction.class, "VirtualCoresScalingAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualCoresScalingAction_ProposedNumberOfCores(), ecorePackage.getEInt(),
				"proposedNumberOfCores", null, 1, 1, VirtualCoresScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualCoresScalingAction_ScaledvirtualPu(), theCorePackage_1.getVirtualProcessingUnit(),
				null, "scaledvirtualPu", null, 1, 1, VirtualCoresScalingAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startApplicationEClass, StartApplication.class, "StartApplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartApplication_ApplicationTemplate(), theApplicationPackage.getApplicationTemplate(), null,
				"applicationTemplate", null, 1, 1, StartApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stopApplicationEClass, StopApplication.class, "StopApplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopApplication_ApplicationInstance(), theApplicationPackage.getApplicationInstance(), null,
				"applicationInstance", null, 1, 1, StopApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scaleOutEClass, ScaleOut.class, "ScaleOut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScaleOut_LoadBalancerInstance(), theApplicationPackage.getComposedVM(), null,
				"loadBalancerInstance", null, 1, 1, ScaleOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScaleOut_ScalingConnector(), theApplicationPackage.getScalableVMImageConnector(), null,
				"scalingConnector", null, 1, 1, ScaleOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scaleInEClass, ScaleIn.class, "ScaleIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScaleIn_LoadBalancerInstance(), theApplicationPackage.getComposedVM(), null,
				"loadBalancerInstance", null, 1, 1, ScaleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScaleIn_ScaledVM(), theApplicationPackage.getComposedVM(), null, "scaledVM", null, 1, 1,
				ScaleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startWhiteBoxApplicationEClass, StartWhiteBoxApplication.class, "StartWhiteBoxApplication",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartWhiteBoxApplication_WhiteBoxUserBehaviourTemplate(),
				theApplicationPackage.getWhiteBoxUserBehaviourTemplate(), null, "whiteBoxUserBehaviourTemplate", null,
				1, 1, StartWhiteBoxApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(
				getStartWhiteBoxApplication__ApplicationTemplateMustBeWhitBoxApplicationTemplate__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ApplicationTemplateMustBeWhitBoxApplicationTemplate", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(startGreyBoxApplicationEClass, StartGreyBoxApplication.class, "StartGreyBoxApplication",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startBlackBoxApplicationEClass, StartBlackBoxApplication.class, "StartBlackBoxApplication",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectVmActionEClass, ConnectVmAction.class, "ConnectVmAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectVmAction_Source(), theCorePackage_1.getVirtualMachine(), null, "source", null, 1, 1,
				ConnectVmAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectVmAction_Target(), theCorePackage_1.getVirtualMachine(), null, "target", null, 1, 1,
				ConnectVmAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceControlActionEClass, ResourceControlAction.class, "ResourceControlAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceControlAction_AffectedVm(), theCorePackage_1.getVirtualMachine(), null, "affectedVm",
				null, 1, 1, ResourceControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getAmount());
		g2 = createEGenericType(theUtilPackage.getDimensionless());
		g1.getETypeArguments().add(g2);
		initEAttribute(getResourceControlAction_ResourceShare(), g1, "resourceShare", null, 1, 1,
				ResourceControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceControlAction_ControlledHypervisor(), theCorePackage_1.getHypervisor(), null,
				"controlledHypervisor", null, 1, 1, ResourceControlAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(executionStatusEEnum, ExecutionStatus.class, "ExecutionStatus");
		addEEnumLiteral(executionStatusEEnum, ExecutionStatus.READY);
		addEEnumLiteral(executionStatusEEnum, ExecutionStatus.IN_EXECUTION);
		addEEnumLiteral(executionStatusEEnum, ExecutionStatus.COMPLETED_SUCCESSFUL);
		addEEnumLiteral(executionStatusEEnum, ExecutionStatus.COMPLETED_FAILED);

		// Create resource
		createResource(eNS_URI);
	}

} //OptimisationplanPackageImpl
