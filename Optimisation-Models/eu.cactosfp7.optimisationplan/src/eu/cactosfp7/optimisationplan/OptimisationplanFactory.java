/**
 */
package eu.cactosfp7.optimisationplan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage
 * @generated
 */
public interface OptimisationplanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptimisationplanFactory eINSTANCE = eu.cactosfp7.optimisationplan.impl.OptimisationplanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequential Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Steps</em>'.
	 * @generated
	 */
	SequentialSteps createSequentialSteps();

	/**
	 * Returns a new object of class '<em>Parallel Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Steps</em>'.
	 * @generated
	 */
	ParallelSteps createParallelSteps();

	/**
	 * Returns a new object of class '<em>Optimisation Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimisation Plan</em>'.
	 * @generated
	 */
	OptimisationPlan createOptimisationPlan();

	/**
	 * Returns a new object of class '<em>Vm Placement Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vm Placement Action</em>'.
	 * @generated
	 */
	VmPlacementAction createVmPlacementAction();

	/**
	 * Returns a new object of class '<em>Vm Migration Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vm Migration Action</em>'.
	 * @generated
	 */
	VmMigrationAction createVmMigrationAction();

	/**
	 * Returns a new object of class '<em>Stop Vm Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Vm Action</em>'.
	 * @generated
	 */
	StopVmAction createStopVmAction();

	/**
	 * Returns a new object of class '<em>Logical Memory Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Memory Scaling Action</em>'.
	 * @generated
	 */
	LogicalMemoryScalingAction createLogicalMemoryScalingAction();

	/**
	 * Returns a new object of class '<em>Logical Storage Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Storage Scaling Action</em>'.
	 * @generated
	 */
	LogicalStorageScalingAction createLogicalStorageScalingAction();

	/**
	 * Returns a new object of class '<em>Physical Frequency Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Frequency Scaling Action</em>'.
	 * @generated
	 */
	PhysicalFrequencyScalingAction createPhysicalFrequencyScalingAction();

	/**
	 * Returns a new object of class '<em>Start Vm Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Vm Action</em>'.
	 * @generated
	 */
	StartVmAction createStartVmAction();

	/**
	 * Returns a new object of class '<em>Suspend Vm Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Vm Action</em>'.
	 * @generated
	 */
	SuspendVmAction createSuspendVmAction();

	/**
	 * Returns a new object of class '<em>Manage Physical Node Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manage Physical Node Action</em>'.
	 * @generated
	 */
	ManagePhysicalNodeAction createManagePhysicalNodeAction();

	/**
	 * Returns a new object of class '<em>Virtual Cores Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Cores Scaling Action</em>'.
	 * @generated
	 */
	VirtualCoresScalingAction createVirtualCoresScalingAction();

	/**
	 * Returns a new object of class '<em>Start Application</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Application</em>'.
	 * @generated
	 */
	StartApplication createStartApplication();

	/**
	 * Returns a new object of class '<em>Stop Application</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Application</em>'.
	 * @generated
	 */
	StopApplication createStopApplication();

	/**
	 * Returns a new object of class '<em>Scale Out</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale Out</em>'.
	 * @generated
	 */
	ScaleOut createScaleOut();

	/**
	 * Returns a new object of class '<em>Scale In</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale In</em>'.
	 * @generated
	 */
	ScaleIn createScaleIn();

	/**
	 * Returns a new object of class '<em>Start White Box Application</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Start White Box Application</em>'.
	 * @generated
	 */
	StartWhiteBoxApplication createStartWhiteBoxApplication();

	/**
	 * Returns a new object of class '<em>Start Grey Box Application</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Grey Box Application</em>'.
	 * @generated
	 */
	StartGreyBoxApplication createStartGreyBoxApplication();

	/**
	 * Returns a new object of class '<em>Start Black Box Application</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Black Box Application</em>'.
	 * @generated
	 */
	StartBlackBoxApplication createStartBlackBoxApplication();

	/**
	 * Returns a new object of class '<em>Connect Vm Action</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Vm Action</em>'.
	 * @generated
	 */
	ConnectVmAction createConnectVmAction();

	/**
	 * Returns a new object of class '<em>Resource Control Action</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Control Action</em>'.
	 * @generated
	 */
	ResourceControlAction createResourceControlAction();

	/**
	 * Returns a new object of class '<em>Optimisation Plan Repository</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimisation Plan Repository</em>'.
	 * @generated
	 */
	OptimisationPlanRepository createOptimisationPlanRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OptimisationplanPackage getOptimisationplanPackage();

} //OptimisationplanFactory
