/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.optimisationplan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimisationplanFactoryImpl extends EFactoryImpl implements OptimisationplanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OptimisationplanFactory init() {
		try {
			OptimisationplanFactory theOptimisationplanFactory = (OptimisationplanFactory) EPackage.Registry.INSTANCE
					.getEFactory(OptimisationplanPackage.eNS_URI);
			if (theOptimisationplanFactory != null) {
				return theOptimisationplanFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OptimisationplanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OptimisationplanPackage.SEQUENTIAL_STEPS:
			return (EObject) createSequentialSteps();
		case OptimisationplanPackage.PARALLEL_STEPS:
			return (EObject) createParallelSteps();
		case OptimisationplanPackage.OPTIMISATION_PLAN:
			return (EObject) createOptimisationPlan();
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY:
			return (EObject) createOptimisationPlanRepository();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION:
			return (EObject) createVmPlacementAction();
		case OptimisationplanPackage.VM_MIGRATION_ACTION:
			return (EObject) createVmMigrationAction();
		case OptimisationplanPackage.STOP_VM_ACTION:
			return (EObject) createStopVmAction();
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION:
			return (EObject) createLogicalMemoryScalingAction();
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION:
			return (EObject) createLogicalStorageScalingAction();
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION:
			return (EObject) createPhysicalFrequencyScalingAction();
		case OptimisationplanPackage.START_VM_ACTION:
			return (EObject) createStartVmAction();
		case OptimisationplanPackage.SUSPEND_VM_ACTION:
			return (EObject) createSuspendVmAction();
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION:
			return (EObject) createManagePhysicalNodeAction();
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION:
			return (EObject) createVirtualCoresScalingAction();
		case OptimisationplanPackage.START_APPLICATION:
			return (EObject) createStartApplication();
		case OptimisationplanPackage.STOP_APPLICATION:
			return (EObject) createStopApplication();
		case OptimisationplanPackage.SCALE_OUT:
			return (EObject) createScaleOut();
		case OptimisationplanPackage.SCALE_IN:
			return (EObject) createScaleIn();
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION:
			return (EObject) createStartWhiteBoxApplication();
		case OptimisationplanPackage.START_GREY_BOX_APPLICATION:
			return (EObject) createStartGreyBoxApplication();
		case OptimisationplanPackage.START_BLACK_BOX_APPLICATION:
			return (EObject) createStartBlackBoxApplication();
		case OptimisationplanPackage.CONNECT_VM_ACTION:
			return (EObject) createConnectVmAction();
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION:
			return (EObject) createResourceControlAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case OptimisationplanPackage.EXECUTION_STATUS:
			return createExecutionStatusFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case OptimisationplanPackage.EXECUTION_STATUS:
			return convertExecutionStatusToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialSteps createSequentialSteps() {
		SequentialStepsImpl sequentialSteps = new SequentialStepsImpl();
		return sequentialSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelSteps createParallelSteps() {
		ParallelStepsImpl parallelSteps = new ParallelStepsImpl();
		return parallelSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationPlan createOptimisationPlan() {
		OptimisationPlanImpl optimisationPlan = new OptimisationPlanImpl();
		return optimisationPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPlacementAction createVmPlacementAction() {
		VmPlacementActionImpl vmPlacementAction = new VmPlacementActionImpl();
		return vmPlacementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmMigrationAction createVmMigrationAction() {
		VmMigrationActionImpl vmMigrationAction = new VmMigrationActionImpl();
		return vmMigrationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopVmAction createStopVmAction() {
		StopVmActionImpl stopVmAction = new StopVmActionImpl();
		return stopVmAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalMemoryScalingAction createLogicalMemoryScalingAction() {
		LogicalMemoryScalingActionImpl logicalMemoryScalingAction = new LogicalMemoryScalingActionImpl();
		return logicalMemoryScalingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalStorageScalingAction createLogicalStorageScalingAction() {
		LogicalStorageScalingActionImpl logicalStorageScalingAction = new LogicalStorageScalingActionImpl();
		return logicalStorageScalingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFrequencyScalingAction createPhysicalFrequencyScalingAction() {
		PhysicalFrequencyScalingActionImpl physicalFrequencyScalingAction = new PhysicalFrequencyScalingActionImpl();
		return physicalFrequencyScalingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartVmAction createStartVmAction() {
		StartVmActionImpl startVmAction = new StartVmActionImpl();
		return startVmAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspendVmAction createSuspendVmAction() {
		SuspendVmActionImpl suspendVmAction = new SuspendVmActionImpl();
		return suspendVmAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagePhysicalNodeAction createManagePhysicalNodeAction() {
		ManagePhysicalNodeActionImpl managePhysicalNodeAction = new ManagePhysicalNodeActionImpl();
		return managePhysicalNodeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualCoresScalingAction createVirtualCoresScalingAction() {
		VirtualCoresScalingActionImpl virtualCoresScalingAction = new VirtualCoresScalingActionImpl();
		return virtualCoresScalingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public StartApplication createStartApplication() {
		StartApplicationImpl startApplication = new StartApplicationImpl();
		return startApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public StopApplication createStopApplication() {
		StopApplicationImpl stopApplication = new StopApplicationImpl();
		return stopApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleOut createScaleOut() {
		ScaleOutImpl scaleOut = new ScaleOutImpl();
		return scaleOut;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleIn createScaleIn() {
		ScaleInImpl scaleIn = new ScaleInImpl();
		return scaleIn;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public StartWhiteBoxApplication createStartWhiteBoxApplication() {
		StartWhiteBoxApplicationImpl startWhiteBoxApplication = new StartWhiteBoxApplicationImpl();
		return startWhiteBoxApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public StartGreyBoxApplication createStartGreyBoxApplication() {
		StartGreyBoxApplicationImpl startGreyBoxApplication = new StartGreyBoxApplicationImpl();
		return startGreyBoxApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public StartBlackBoxApplication createStartBlackBoxApplication() {
		StartBlackBoxApplicationImpl startBlackBoxApplication = new StartBlackBoxApplicationImpl();
		return startBlackBoxApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectVmAction createConnectVmAction() {
		ConnectVmActionImpl connectVmAction = new ConnectVmActionImpl();
		return connectVmAction;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControlAction createResourceControlAction() {
		ResourceControlActionImpl resourceControlAction = new ResourceControlActionImpl();
		return resourceControlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationPlanRepository createOptimisationPlanRepository() {
		OptimisationPlanRepositoryImpl optimisationPlanRepository = new OptimisationPlanRepositoryImpl();
		return optimisationPlanRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStatus createExecutionStatusFromString(EDataType eDataType, String initialValue) {
		ExecutionStatus result = ExecutionStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanPackage getOptimisationplanPackage() {
		return (OptimisationplanPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OptimisationplanPackage getPackage() {
		return OptimisationplanPackage.eINSTANCE;
	}

} //OptimisationplanFactoryImpl
