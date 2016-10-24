/**
 */
package eu.cactosfp7.optimisationplan.tests;

import eu.cactosfp7.optimisationplan.OptimisationplanFactory;
import eu.cactosfp7.optimisationplan.VmPlacementAction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vm Placement Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmPlacementActionTest extends OptimisationActionStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VmPlacementActionTest.class);
	}

	/**
	 * Constructs a new Vm Placement Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPlacementActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vm Placement Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VmPlacementAction getFixture() {
		return (VmPlacementAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptimisationplanFactory.eINSTANCE.createVmPlacementAction());
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

} //VmPlacementActionTest
