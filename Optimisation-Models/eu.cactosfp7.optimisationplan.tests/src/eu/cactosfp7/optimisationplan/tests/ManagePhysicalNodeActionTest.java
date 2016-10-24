/**
 */
package eu.cactosfp7.optimisationplan.tests;

import eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction;
import eu.cactosfp7.optimisationplan.OptimisationplanFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manage Physical Node Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagePhysicalNodeActionTest extends OptimisationActionStepTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(ManagePhysicalNodeActionTest.class);
	}

    /**
	 * Constructs a new Manage Physical Node Action test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ManagePhysicalNodeActionTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Manage Physical Node Action test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected ManagePhysicalNodeAction getFixture() {
		return (ManagePhysicalNodeAction)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(OptimisationplanFactory.eINSTANCE.createManagePhysicalNodeAction());
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

} //ManagePhysicalNodeActionTest
