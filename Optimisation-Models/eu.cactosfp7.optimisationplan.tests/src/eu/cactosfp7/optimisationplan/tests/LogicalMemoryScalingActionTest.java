/**
 */
package eu.cactosfp7.optimisationplan.tests;

import eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction;
import eu.cactosfp7.optimisationplan.OptimisationplanFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logical Memory Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalMemoryScalingActionTest extends VerticalScalingActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicalMemoryScalingActionTest.class);
	}

	/**
	 * Constructs a new Logical Memory Scaling Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalMemoryScalingActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logical Memory Scaling Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicalMemoryScalingAction getFixture() {
		return (LogicalMemoryScalingAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptimisationplanFactory.eINSTANCE.createLogicalMemoryScalingAction());
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

} //LogicalMemoryScalingActionTest
