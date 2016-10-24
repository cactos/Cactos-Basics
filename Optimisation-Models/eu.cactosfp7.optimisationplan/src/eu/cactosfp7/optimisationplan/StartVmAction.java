/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Vm Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.StartVmAction#getStartedVm <em>Started Vm</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStartVmAction()
 * @model
 * @generated
 */
public interface StartVmAction extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Started Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Vm</em>' reference.
	 * @see #setStartedVm(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStartVmAction_StartedVm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getStartedVm();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.StartVmAction#getStartedVm <em>Started Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started Vm</em>' reference.
	 * @see #getStartedVm()
	 * @generated
	 */
	void setStartedVm(VirtualMachine value);

} // StartVmAction
