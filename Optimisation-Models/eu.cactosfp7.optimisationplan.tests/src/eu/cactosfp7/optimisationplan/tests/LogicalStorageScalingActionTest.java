/**
 */
package eu.cactosfp7.optimisationplan.tests;

import eu.cactosfp7.optimisationplan.LogicalStorageScalingAction;
import eu.cactosfp7.optimisationplan.OptimisationplanFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logical Storage Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalStorageScalingActionTest extends VerticalScalingActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicalStorageScalingActionTest.class);
	}

	/**
	 * Constructs a new Logical Storage Scaling Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalStorageScalingActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logical Storage Scaling Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicalStorageScalingAction getFixture() {
		return (LogicalStorageScalingAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptimisationplanFactory.eINSTANCE.createLogicalStorageScalingAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LogicalStorageScalingActionTest
