/**
 */
package eu.cactosfp7.optimisationplan.util;

import eu.cactosfp7.identifier.Identifier;
import eu.cactosfp7.optimisationplan.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage
 * @generated
 */
public class OptimisationplanSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OptimisationplanPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanSwitch() {
		if (modelPackage == null) {
			modelPackage = OptimisationplanPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case OptimisationplanPackage.OPTIMISATION_ACTION_STEP: {
			OptimisationActionStep optimisationActionStep = (OptimisationActionStep) theEObject;
			T result = caseOptimisationActionStep(optimisationActionStep);
			if (result == null)
				result = caseOptimisationStep(optimisationActionStep);
			if (result == null)
				result = caseIdentifier(optimisationActionStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.OPTIMISATION_STEP: {
			OptimisationStep optimisationStep = (OptimisationStep) theEObject;
			T result = caseOptimisationStep(optimisationStep);
			if (result == null)
				result = caseIdentifier(optimisationStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.SEQUENTIAL_STEPS: {
			SequentialSteps sequentialSteps = (SequentialSteps) theEObject;
			T result = caseSequentialSteps(sequentialSteps);
			if (result == null)
				result = caseOptimisationStep(sequentialSteps);
			if (result == null)
				result = caseIdentifier(sequentialSteps);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.PARALLEL_STEPS: {
			ParallelSteps parallelSteps = (ParallelSteps) theEObject;
			T result = caseParallelSteps(parallelSteps);
			if (result == null)
				result = caseOptimisationStep(parallelSteps);
			if (result == null)
				result = caseIdentifier(parallelSteps);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.OPTIMISATION_PLAN: {
			OptimisationPlan optimisationPlan = (OptimisationPlan) theEObject;
			T result = caseOptimisationPlan(optimisationPlan);
			if (result == null)
				result = caseIdentifier(optimisationPlan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY: {
			OptimisationPlanRepository optimisationPlanRepository = (OptimisationPlanRepository) theEObject;
			T result = caseOptimisationPlanRepository(optimisationPlanRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.VM_PLACEMENT_ACTION: {
			VmPlacementAction vmPlacementAction = (VmPlacementAction) theEObject;
			T result = caseVmPlacementAction(vmPlacementAction);
			if (result == null)
				result = caseOptimisationActionStep(vmPlacementAction);
			if (result == null)
				result = caseOptimisationStep(vmPlacementAction);
			if (result == null)
				result = caseIdentifier(vmPlacementAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.VM_MIGRATION_ACTION: {
			VmMigrationAction vmMigrationAction = (VmMigrationAction) theEObject;
			T result = caseVmMigrationAction(vmMigrationAction);
			if (result == null)
				result = caseOptimisationActionStep(vmMigrationAction);
			if (result == null)
				result = caseOptimisationStep(vmMigrationAction);
			if (result == null)
				result = caseIdentifier(vmMigrationAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.VERTICAL_SCALING_ACTION: {
			VerticalScalingAction verticalScalingAction = (VerticalScalingAction) theEObject;
			T result = caseVerticalScalingAction(verticalScalingAction);
			if (result == null)
				result = caseOptimisationActionStep(verticalScalingAction);
			if (result == null)
				result = caseOptimisationStep(verticalScalingAction);
			if (result == null)
				result = caseIdentifier(verticalScalingAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.STOP_VM_ACTION: {
			StopVmAction stopVmAction = (StopVmAction) theEObject;
			T result = caseStopVmAction(stopVmAction);
			if (result == null)
				result = caseOptimisationActionStep(stopVmAction);
			if (result == null)
				result = caseOptimisationStep(stopVmAction);
			if (result == null)
				result = caseIdentifier(stopVmAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION: {
			LogicalMemoryScalingAction logicalMemoryScalingAction = (LogicalMemoryScalingAction) theEObject;
			T result = caseLogicalMemoryScalingAction(logicalMemoryScalingAction);
			if (result == null)
				result = caseVerticalScalingAction(logicalMemoryScalingAction);
			if (result == null)
				result = caseOptimisationActionStep(logicalMemoryScalingAction);
			if (result == null)
				result = caseOptimisationStep(logicalMemoryScalingAction);
			if (result == null)
				result = caseIdentifier(logicalMemoryScalingAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION: {
			LogicalStorageScalingAction logicalStorageScalingAction = (LogicalStorageScalingAction) theEObject;
			T result = caseLogicalStorageScalingAction(logicalStorageScalingAction);
			if (result == null)
				result = caseVerticalScalingAction(logicalStorageScalingAction);
			if (result == null)
				result = caseOptimisationActionStep(logicalStorageScalingAction);
			if (result == null)
				result = caseOptimisationStep(logicalStorageScalingAction);
			if (result == null)
				result = caseIdentifier(logicalStorageScalingAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION: {
			PhysicalFrequencyScalingAction physicalFrequencyScalingAction = (PhysicalFrequencyScalingAction) theEObject;
			T result = casePhysicalFrequencyScalingAction(physicalFrequencyScalingAction);
			if (result == null)
				result = caseVerticalScalingAction(physicalFrequencyScalingAction);
			if (result == null)
				result = caseOptimisationActionStep(physicalFrequencyScalingAction);
			if (result == null)
				result = caseOptimisationStep(physicalFrequencyScalingAction);
			if (result == null)
				result = caseIdentifier(physicalFrequencyScalingAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.START_VM_ACTION: {
			StartVmAction startVmAction = (StartVmAction) theEObject;
			T result = caseStartVmAction(startVmAction);
			if (result == null)
				result = caseOptimisationActionStep(startVmAction);
			if (result == null)
				result = caseOptimisationStep(startVmAction);
			if (result == null)
				result = caseIdentifier(startVmAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.SUSPEND_VM_ACTION: {
			SuspendVmAction suspendVmAction = (SuspendVmAction) theEObject;
			T result = caseSuspendVmAction(suspendVmAction);
			if (result == null)
				result = caseOptimisationActionStep(suspendVmAction);
			if (result == null)
				result = caseOptimisationStep(suspendVmAction);
			if (result == null)
				result = caseIdentifier(suspendVmAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION: {
			ManagePhysicalNodeAction managePhysicalNodeAction = (ManagePhysicalNodeAction) theEObject;
			T result = caseManagePhysicalNodeAction(managePhysicalNodeAction);
			if (result == null)
				result = caseOptimisationActionStep(managePhysicalNodeAction);
			if (result == null)
				result = caseOptimisationStep(managePhysicalNodeAction);
			if (result == null)
				result = caseIdentifier(managePhysicalNodeAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION: {
			VirtualCoresScalingAction virtualCoresScalingAction = (VirtualCoresScalingAction) theEObject;
			T result = caseVirtualCoresScalingAction(virtualCoresScalingAction);
			if (result == null)
				result = caseVerticalScalingAction(virtualCoresScalingAction);
			if (result == null)
				result = caseOptimisationActionStep(virtualCoresScalingAction);
			if (result == null)
				result = caseOptimisationStep(virtualCoresScalingAction);
			if (result == null)
				result = caseIdentifier(virtualCoresScalingAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.START_APPLICATION: {
			StartApplication startApplication = (StartApplication) theEObject;
			T result = caseStartApplication(startApplication);
			if (result == null)
				result = caseOptimisationActionStep(startApplication);
			if (result == null)
				result = caseOptimisationStep(startApplication);
			if (result == null)
				result = caseIdentifier(startApplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.STOP_APPLICATION: {
			StopApplication stopApplication = (StopApplication) theEObject;
			T result = caseStopApplication(stopApplication);
			if (result == null)
				result = caseOptimisationActionStep(stopApplication);
			if (result == null)
				result = caseOptimisationStep(stopApplication);
			if (result == null)
				result = caseIdentifier(stopApplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.SCALE_OUT: {
			ScaleOut scaleOut = (ScaleOut) theEObject;
			T result = caseScaleOut(scaleOut);
			if (result == null)
				result = caseOptimisationActionStep(scaleOut);
			if (result == null)
				result = caseOptimisationStep(scaleOut);
			if (result == null)
				result = caseIdentifier(scaleOut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.SCALE_IN: {
			ScaleIn scaleIn = (ScaleIn) theEObject;
			T result = caseScaleIn(scaleIn);
			if (result == null)
				result = caseOptimisationActionStep(scaleIn);
			if (result == null)
				result = caseOptimisationStep(scaleIn);
			if (result == null)
				result = caseIdentifier(scaleIn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION: {
			StartWhiteBoxApplication startWhiteBoxApplication = (StartWhiteBoxApplication) theEObject;
			T result = caseStartWhiteBoxApplication(startWhiteBoxApplication);
			if (result == null)
				result = caseStartApplication(startWhiteBoxApplication);
			if (result == null)
				result = caseOptimisationActionStep(startWhiteBoxApplication);
			if (result == null)
				result = caseOptimisationStep(startWhiteBoxApplication);
			if (result == null)
				result = caseIdentifier(startWhiteBoxApplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.START_GREY_BOX_APPLICATION: {
			StartGreyBoxApplication startGreyBoxApplication = (StartGreyBoxApplication) theEObject;
			T result = caseStartGreyBoxApplication(startGreyBoxApplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.START_BLACK_BOX_APPLICATION: {
			StartBlackBoxApplication startBlackBoxApplication = (StartBlackBoxApplication) theEObject;
			T result = caseStartBlackBoxApplication(startBlackBoxApplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.CONNECT_VM_ACTION: {
			ConnectVmAction connectVmAction = (ConnectVmAction) theEObject;
			T result = caseConnectVmAction(connectVmAction);
			if (result == null)
				result = caseOptimisationActionStep(connectVmAction);
			if (result == null)
				result = caseOptimisationStep(connectVmAction);
			if (result == null)
				result = caseIdentifier(connectVmAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION: {
			ResourceControlAction resourceControlAction = (ResourceControlAction) theEObject;
			T result = caseResourceControlAction(resourceControlAction);
			if (result == null)
				result = caseOptimisationActionStep(resourceControlAction);
			if (result == null)
				result = caseOptimisationStep(resourceControlAction);
			if (result == null)
				result = caseIdentifier(resourceControlAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimisation Action Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimisation Action Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimisationActionStep(OptimisationActionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimisation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimisation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimisationStep(OptimisationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialSteps(SequentialSteps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelSteps(ParallelSteps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimisation Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimisation Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimisationPlan(OptimisationPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vm Placement Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vm Placement Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmPlacementAction(VmPlacementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vm Migration Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vm Migration Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmMigrationAction(VmMigrationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalScalingAction(VerticalScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Vm Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Vm Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopVmAction(StopVmAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Memory Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Memory Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalMemoryScalingAction(LogicalMemoryScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Storage Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Storage Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalStorageScalingAction(LogicalStorageScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Frequency Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Frequency Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalFrequencyScalingAction(PhysicalFrequencyScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Vm Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Vm Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartVmAction(StartVmAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend Vm Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend Vm Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendVmAction(SuspendVmAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manage Physical Node Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manage Physical Node Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagePhysicalNodeAction(ManagePhysicalNodeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Cores Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Cores Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualCoresScalingAction(VirtualCoresScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Application</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartApplication(StartApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Application</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopApplication(StopApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Out</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleOut(ScaleOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale In</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleIn(ScaleIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start White Box Application</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start White Box Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartWhiteBoxApplication(StartWhiteBoxApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Grey Box Application</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Grey Box Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartGreyBoxApplication(StartGreyBoxApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Black Box Application</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Black Box Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartBlackBoxApplication(StartBlackBoxApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect Vm Action</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect Vm Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectVmAction(ConnectVmAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Control Action</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Control Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceControlAction(ResourceControlAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimisation Plan Repository</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimisation Plan Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimisationPlanRepository(OptimisationPlanRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OptimisationplanSwitch
