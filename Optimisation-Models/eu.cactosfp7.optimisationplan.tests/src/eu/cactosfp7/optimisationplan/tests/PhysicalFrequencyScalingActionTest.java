/**
 */
package eu.cactosfp7.optimisationplan.tests;

import eu.cactosfp7.optimisationplan.OptimisationplanFactory;
import eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Physical Frequency Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalFrequencyScalingActionTest extends VerticalScalingActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhysicalFrequencyScalingActionTest.class);
	}

	/**
	 * Constructs a new Physical Frequency Scaling Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFrequencyScalingActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Physical Frequency Scaling Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PhysicalFrequencyScalingAction getFixture() {
		return (PhysicalFrequencyScalingAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptimisationplanFactory.eINSTANCE.createPhysicalFrequencyScalingAction());
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

} //PhysicalFrequencyScalingActionTest
