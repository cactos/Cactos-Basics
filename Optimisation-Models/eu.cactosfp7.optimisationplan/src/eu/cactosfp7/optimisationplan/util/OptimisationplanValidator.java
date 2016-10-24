/**
 */
package eu.cactosfp7.optimisationplan.util;

import eu.cactosfp7.identifier.util.IdentifierValidator;
import eu.cactosfp7.optimisationplan.*;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage
 * @generated
 */
public class OptimisationplanValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OptimisationplanValidator INSTANCE = new OptimisationplanValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.cactosfp7.optimisationplan";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Application Template Must Be Whit Box Application Template' of 'Start White Box Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_WHITE_BOX_APPLICATION__APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return OptimisationplanPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case OptimisationplanPackage.OPTIMISATION_ACTION_STEP:
			return validateOptimisationActionStep((OptimisationActionStep) value, diagnostics, context);
		case OptimisationplanPackage.OPTIMISATION_STEP:
			return validateOptimisationStep((OptimisationStep) value, diagnostics, context);
		case OptimisationplanPackage.SEQUENTIAL_STEPS:
			return validateSequentialSteps((SequentialSteps) value, diagnostics, context);
		case OptimisationplanPackage.PARALLEL_STEPS:
			return validateParallelSteps((ParallelSteps) value, diagnostics, context);
		case OptimisationplanPackage.OPTIMISATION_PLAN:
			return validateOptimisationPlan((OptimisationPlan) value, diagnostics, context);
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY:
			return validateOptimisationPlanRepository((OptimisationPlanRepository) value, diagnostics, context);
		case OptimisationplanPackage.VM_PLACEMENT_ACTION:
			return validateVmPlacementAction((VmPlacementAction) value, diagnostics, context);
		case OptimisationplanPackage.VM_MIGRATION_ACTION:
			return validateVmMigrationAction((VmMigrationAction) value, diagnostics, context);
		case OptimisationplanPackage.VERTICAL_SCALING_ACTION:
			return validateVerticalScalingAction((VerticalScalingAction) value, diagnostics, context);
		case OptimisationplanPackage.STOP_VM_ACTION:
			return validateStopVmAction((StopVmAction) value, diagnostics, context);
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION:
			return validateLogicalMemoryScalingAction((LogicalMemoryScalingAction) value, diagnostics, context);
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION:
			return validateLogicalStorageScalingAction((LogicalStorageScalingAction) value, diagnostics, context);
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION:
			return validatePhysicalFrequencyScalingAction((PhysicalFrequencyScalingAction) value, diagnostics, context);
		case OptimisationplanPackage.START_VM_ACTION:
			return validateStartVmAction((StartVmAction) value, diagnostics, context);
		case OptimisationplanPackage.SUSPEND_VM_ACTION:
			return validateSuspendVmAction((SuspendVmAction) value, diagnostics, context);
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION:
			return validateManagePhysicalNodeAction((ManagePhysicalNodeAction) value, diagnostics, context);
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION:
			return validateVirtualCoresScalingAction((VirtualCoresScalingAction) value, diagnostics, context);
		case OptimisationplanPackage.START_APPLICATION:
			return validateStartApplication((StartApplication) value, diagnostics, context);
		case OptimisationplanPackage.STOP_APPLICATION:
			return validateStopApplication((StopApplication) value, diagnostics, context);
		case OptimisationplanPackage.SCALE_OUT:
			return validateScaleOut((ScaleOut) value, diagnostics, context);
		case OptimisationplanPackage.SCALE_IN:
			return validateScaleIn((ScaleIn) value, diagnostics, context);
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION:
			return validateStartWhiteBoxApplication((StartWhiteBoxApplication) value, diagnostics, context);
		case OptimisationplanPackage.START_GREY_BOX_APPLICATION:
			return validateStartGreyBoxApplication((StartGreyBoxApplication) value, diagnostics, context);
		case OptimisationplanPackage.START_BLACK_BOX_APPLICATION:
			return validateStartBlackBoxApplication((StartBlackBoxApplication) value, diagnostics, context);
		case OptimisationplanPackage.CONNECT_VM_ACTION:
			return validateConnectVmAction((ConnectVmAction) value, diagnostics, context);
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION:
			return validateResourceControlAction((ResourceControlAction) value, diagnostics, context);
		case OptimisationplanPackage.EXECUTION_STATUS:
			return validateExecutionStatus((ExecutionStatus) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimisationActionStep(OptimisationActionStep optimisationActionStep,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) optimisationActionStep, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) optimisationActionStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) optimisationActionStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) optimisationActionStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) optimisationActionStep, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) optimisationActionStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) optimisationActionStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) optimisationActionStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) optimisationActionStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(optimisationActionStep, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimisationStep(OptimisationStep optimisationStep, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) optimisationStep, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) optimisationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(optimisationStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequentialSteps(SequentialSteps sequentialSteps, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) sequentialSteps, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) sequentialSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(sequentialSteps, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParallelSteps(ParallelSteps parallelSteps, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) parallelSteps, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) parallelSteps, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(parallelSteps, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimisationPlan(OptimisationPlan optimisationPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) optimisationPlan, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) optimisationPlan, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(optimisationPlan, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimisationPlanRepository(OptimisationPlanRepository optimisationPlanRepository,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) optimisationPlanRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmPlacementAction(VmPlacementAction vmPlacementAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) vmPlacementAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) vmPlacementAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(vmPlacementAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmMigrationAction(VmMigrationAction vmMigrationAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) vmMigrationAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) vmMigrationAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(vmMigrationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalScalingAction(VerticalScalingAction verticalScalingAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) verticalScalingAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) verticalScalingAction, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(verticalScalingAction, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopVmAction(StopVmAction stopVmAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) stopVmAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) stopVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(stopVmAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalMemoryScalingAction(LogicalMemoryScalingAction logicalMemoryScalingAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) logicalMemoryScalingAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) logicalMemoryScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) logicalMemoryScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) logicalMemoryScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) logicalMemoryScalingAction, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) logicalMemoryScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) logicalMemoryScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) logicalMemoryScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) logicalMemoryScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(logicalMemoryScalingAction, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalStorageScalingAction(LogicalStorageScalingAction logicalStorageScalingAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) logicalStorageScalingAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) logicalStorageScalingAction, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) logicalStorageScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) logicalStorageScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) logicalStorageScalingAction, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) logicalStorageScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) logicalStorageScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) logicalStorageScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) logicalStorageScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(logicalStorageScalingAction, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFrequencyScalingAction(PhysicalFrequencyScalingAction physicalFrequencyScalingAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) physicalFrequencyScalingAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) physicalFrequencyScalingAction, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) physicalFrequencyScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) physicalFrequencyScalingAction, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) physicalFrequencyScalingAction,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) physicalFrequencyScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) physicalFrequencyScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) physicalFrequencyScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) physicalFrequencyScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(physicalFrequencyScalingAction,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartVmAction(StartVmAction startVmAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) startVmAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) startVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(startVmAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuspendVmAction(SuspendVmAction suspendVmAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) suspendVmAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) suspendVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(suspendVmAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagePhysicalNodeAction(ManagePhysicalNodeAction managePhysicalNodeAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) managePhysicalNodeAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) managePhysicalNodeAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) managePhysicalNodeAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) managePhysicalNodeAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) managePhysicalNodeAction, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) managePhysicalNodeAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) managePhysicalNodeAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) managePhysicalNodeAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) managePhysicalNodeAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(managePhysicalNodeAction, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualCoresScalingAction(VirtualCoresScalingAction virtualCoresScalingAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) virtualCoresScalingAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) virtualCoresScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) virtualCoresScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) virtualCoresScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) virtualCoresScalingAction, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) virtualCoresScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) virtualCoresScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) virtualCoresScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) virtualCoresScalingAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(virtualCoresScalingAction, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartApplication(StartApplication startApplication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) startApplication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) startApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(startApplication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopApplication(StopApplication stopApplication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) stopApplication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) stopApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(stopApplication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleOut(ScaleOut scaleOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) scaleOut, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) scaleOut, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(scaleOut, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleIn(ScaleIn scaleIn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) scaleIn, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) scaleIn, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(scaleIn, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartWhiteBoxApplication(StartWhiteBoxApplication startWhiteBoxApplication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) startWhiteBoxApplication, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) startWhiteBoxApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) startWhiteBoxApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) startWhiteBoxApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) startWhiteBoxApplication, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) startWhiteBoxApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) startWhiteBoxApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) startWhiteBoxApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) startWhiteBoxApplication, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(startWhiteBoxApplication, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateStartWhiteBoxApplication_ApplicationTemplateMustBeWhitBoxApplicationTemplate(
					startWhiteBoxApplication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ApplicationTemplateMustBeWhitBoxApplicationTemplate constraint of '<em>Start White Box Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartWhiteBoxApplication_ApplicationTemplateMustBeWhitBoxApplicationTemplate(
			StartWhiteBoxApplication startWhiteBoxApplication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return startWhiteBoxApplication.ApplicationTemplateMustBeWhitBoxApplicationTemplate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartGreyBoxApplication(StartGreyBoxApplication startGreyBoxApplication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) startGreyBoxApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartBlackBoxApplication(StartBlackBoxApplication startBlackBoxApplication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) startBlackBoxApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectVmAction(ConnectVmAction connectVmAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) connectVmAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) connectVmAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(connectVmAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControlAction(ResourceControlAction resourceControlAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject) resourceControlAction, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms((EObject) resourceControlAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms((EObject) resourceControlAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained((EObject) resourceControlAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired((EObject) resourceControlAction, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves((EObject) resourceControlAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID((EObject) resourceControlAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique((EObject) resourceControlAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique((EObject) resourceControlAction, diagnostics, context);
		if (result || diagnostics != null)
			result &= identifierValidator.validateIdentifier_idHasToBeUnique(resourceControlAction, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionStatus(ExecutionStatus executionStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OptimisationplanValidator
