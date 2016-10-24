/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Vm Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.StopVmAction#getStoppedVm <em>Stopped Vm</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStopVmAction()
 * @model
 * @generated
 */
public interface StopVmAction extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Stopped Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stopped Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopped Vm</em>' reference.
	 * @see #setStoppedVm(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStopVmAction_StoppedVm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getStoppedVm();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.StopVmAction#getStoppedVm <em>Stopped Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stopped Vm</em>' reference.
	 * @see #getStoppedVm()
	 * @generated
	 */
	void setStoppedVm(VirtualMachine value);

} // StopVmAction
