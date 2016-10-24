/**
 */
package eu.cactosfp7.optimisationplan.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>optimisationplan</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimisationplanTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OptimisationplanTests("optimisationplan Tests");
		suite.addTestSuite(SequentialStepsTest.class);
		suite.addTestSuite(ParallelStepsTest.class);
		suite.addTestSuite(OptimisationPlanTest.class);
		suite.addTestSuite(VmPlacementActionTest.class);
		suite.addTestSuite(VmMigrationActionTest.class);
		suite.addTestSuite(StopVmActionTest.class);
		suite.addTestSuite(LogicalMemoryScalingActionTest.class);
		suite.addTestSuite(LogicalStorageScalingActionTest.class);
		suite.addTestSuite(PhysicalFrequencyScalingActionTest.class);
		suite.addTestSuite(StartVmActionTest.class);
		suite.addTestSuite(SuspendVmActionTest.class);
		suite.addTestSuite(ManagePhysicalNodeActionTest.class);
		suite.addTestSuite(VirtualCoresScalingActionTest.class);
		suite.addTestSuite(ScaleOutTest.class);
		suite.addTestSuite(ScaleInTest.class);
		suite.addTestSuite(ConnectVmActionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanTests(String name) {
		super(name);
	}

} //OptimisationplanTests
