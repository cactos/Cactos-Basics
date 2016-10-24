/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend Vm Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.SuspendVmAction#getSuspendedVm <em>Suspended Vm</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getSuspendVmAction()
 * @model
 * @generated
 */
public interface SuspendVmAction extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Suspended Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspended Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspended Vm</em>' reference.
	 * @see #setSuspendedVm(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getSuspendVmAction_SuspendedVm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getSuspendedVm();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.SuspendVmAction#getSuspendedVm <em>Suspended Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspended Vm</em>' reference.
	 * @see #getSuspendedVm()
	 * @generated
	 */
	void setSuspendedVm(VirtualMachine value);

} // SuspendVmAction
