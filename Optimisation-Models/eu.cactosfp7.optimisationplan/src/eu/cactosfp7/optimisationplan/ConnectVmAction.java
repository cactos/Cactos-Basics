/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Vm Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.ConnectVmAction#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.ConnectVmAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getConnectVmAction()
 * @model
 * @generated
 */
public interface ConnectVmAction extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getConnectVmAction_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getSource();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ConnectVmAction#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VirtualMachine value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getConnectVmAction_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getTarget();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ConnectVmAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(VirtualMachine value);

} // ConnectVmAction
