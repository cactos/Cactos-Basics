/**
 */
package eu.cactosfp7.optimisationplan.util;

import eu.cactosfp7.identifier.Identifier;
import eu.cactosfp7.optimisationplan.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage
 * @generated
 */
public class OptimisationplanAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OptimisationplanPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OptimisationplanPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimisationplanSwitch<Adapter> modelSwitch = new OptimisationplanSwitch<Adapter>() {
		@Override
		public Adapter caseOptimisationActionStep(OptimisationActionStep object) {
			return createOptimisationActionStepAdapter();
		}

		@Override
		public Adapter caseOptimisationStep(OptimisationStep object) {
			return createOptimisationStepAdapter();
		}

		@Override
		public Adapter caseSequentialSteps(SequentialSteps object) {
			return createSequentialStepsAdapter();
		}

		@Override
		public Adapter caseParallelSteps(ParallelSteps object) {
			return createParallelStepsAdapter();
		}

		@Override
		public Adapter caseOptimisationPlan(OptimisationPlan object) {
			return createOptimisationPlanAdapter();
		}

		@Override
		public Adapter caseOptimisationPlanRepository(OptimisationPlanRepository object) {
			return createOptimisationPlanRepositoryAdapter();
		}

		@Override
		public Adapter caseVmPlacementAction(VmPlacementAction object) {
			return createVmPlacementActionAdapter();
		}

		@Override
		public Adapter caseVmMigrationAction(VmMigrationAction object) {
			return createVmMigrationActionAdapter();
		}

		@Override
		public Adapter caseVerticalScalingAction(VerticalScalingAction object) {
			return createVerticalScalingActionAdapter();
		}

		@Override
		public Adapter caseStopVmAction(StopVmAction object) {
			return createStopVmActionAdapter();
		}

		@Override
		public Adapter caseLogicalMemoryScalingAction(LogicalMemoryScalingAction object) {
			return createLogicalMemoryScalingActionAdapter();
		}

		@Override
		public Adapter caseLogicalStorageScalingAction(LogicalStorageScalingAction object) {
			return createLogicalStorageScalingActionAdapter();
		}

		@Override
		public Adapter casePhysicalFrequencyScalingAction(PhysicalFrequencyScalingAction object) {
			return createPhysicalFrequencyScalingActionAdapter();
		}

		@Override
		public Adapter caseStartVmAction(StartVmAction object) {
			return createStartVmActionAdapter();
		}

		@Override
		public Adapter caseSuspendVmAction(SuspendVmAction object) {
			return createSuspendVmActionAdapter();
		}

		@Override
		public Adapter caseManagePhysicalNodeAction(ManagePhysicalNodeAction object) {
			return createManagePhysicalNodeActionAdapter();
		}

		@Override
		public Adapter caseVirtualCoresScalingAction(VirtualCoresScalingAction object) {
			return createVirtualCoresScalingActionAdapter();
		}

		@Override
		public Adapter caseStartApplication(StartApplication object) {
			return createStartApplicationAdapter();
		}

		@Override
		public Adapter caseStopApplication(StopApplication object) {
			return createStopApplicationAdapter();
		}

		@Override
		public Adapter caseScaleOut(ScaleOut object) {
			return createScaleOutAdapter();
		}

		@Override
		public Adapter caseScaleIn(ScaleIn object) {
			return createScaleInAdapter();
		}

		@Override
		public Adapter caseStartWhiteBoxApplication(StartWhiteBoxApplication object) {
			return createStartWhiteBoxApplicationAdapter();
		}

		@Override
		public Adapter caseStartGreyBoxApplication(StartGreyBoxApplication object) {
			return createStartGreyBoxApplicationAdapter();
		}

		@Override
		public Adapter caseStartBlackBoxApplication(StartBlackBoxApplication object) {
			return createStartBlackBoxApplicationAdapter();
		}

		@Override
		public Adapter caseConnectVmAction(ConnectVmAction object) {
			return createConnectVmActionAdapter();
		}

		@Override
		public Adapter caseResourceControlAction(ResourceControlAction object) {
			return createResourceControlActionAdapter();
		}

		@Override
		public Adapter caseIdentifier(Identifier object) {
			return createIdentifierAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.OptimisationActionStep <em>Optimisation Action Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.OptimisationActionStep
	 * @generated
	 */
	public Adapter createOptimisationActionStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.OptimisationStep <em>Optimisation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep
	 * @generated
	 */
	public Adapter createOptimisationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.SequentialSteps <em>Sequential Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.SequentialSteps
	 * @generated
	 */
	public Adapter createSequentialStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.ParallelSteps <em>Parallel Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.ParallelSteps
	 * @generated
	 */
	public Adapter createParallelStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.OptimisationPlan <em>Optimisation Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan
	 * @generated
	 */
	public Adapter createOptimisationPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.VmPlacementAction <em>Vm Placement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.VmPlacementAction
	 * @generated
	 */
	public Adapter createVmPlacementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.VmMigrationAction <em>Vm Migration Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.VmMigrationAction
	 * @generated
	 */
	public Adapter createVmMigrationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.VerticalScalingAction <em>Vertical Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.VerticalScalingAction
	 * @generated
	 */
	public Adapter createVerticalScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.StopVmAction <em>Stop Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.StopVmAction
	 * @generated
	 */
	public Adapter createStopVmActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction <em>Logical Memory Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction
	 * @generated
	 */
	public Adapter createLogicalMemoryScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction <em>Logical Storage Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.LogicalStorageScalingAction
	 * @generated
	 */
	public Adapter createLogicalStorageScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction <em>Physical Frequency Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction
	 * @generated
	 */
	public Adapter createPhysicalFrequencyScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.StartVmAction <em>Start Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.StartVmAction
	 * @generated
	 */
	public Adapter createStartVmActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.SuspendVmAction <em>Suspend Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.SuspendVmAction
	 * @generated
	 */
	public Adapter createSuspendVmActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction <em>Manage Physical Node Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction
	 * @generated
	 */
	public Adapter createManagePhysicalNodeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction <em>Virtual Cores Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.VirtualCoresScalingAction
	 * @generated
	 */
	public Adapter createVirtualCoresScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.StartApplication <em>Start Application</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.StartApplication
	 * @generated
	 */
	public Adapter createStartApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.StopApplication <em>Stop Application</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.StopApplication
	 * @generated
	 */
	public Adapter createStopApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.ScaleOut <em>Scale Out</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.ScaleOut
	 * @generated
	 */
	public Adapter createScaleOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.ScaleIn <em>Scale In</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.ScaleIn
	 * @generated
	 */
	public Adapter createScaleInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.StartWhiteBoxApplication <em>Start White Box Application</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.StartWhiteBoxApplication
	 * @generated
	 */
	public Adapter createStartWhiteBoxApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.StartGreyBoxApplication <em>Start Grey Box Application</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.StartGreyBoxApplication
	 * @generated
	 */
	public Adapter createStartGreyBoxApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.StartBlackBoxApplication <em>Start Black Box Application</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.StartBlackBoxApplication
	 * @generated
	 */
	public Adapter createStartBlackBoxApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.ConnectVmAction <em>Connect Vm Action</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.ConnectVmAction
	 * @generated
	 */
	public Adapter createConnectVmActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.ResourceControlAction <em>Resource Control Action</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.ResourceControlAction
	 * @generated
	 */
	public Adapter createResourceControlActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.cactosfp7.optimisationplan.OptimisationPlanRepository <em>Optimisation Plan Repository</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlanRepository
	 * @generated
	 */
	public Adapter createOptimisationPlanRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OptimisationplanAdapterFactory
