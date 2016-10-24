/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manage Physical Node Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getTargetState <em>Target State</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getManagedNode <em>Managed Node</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getManagePhysicalNodeAction()
 * @model
 * @generated
 */
public interface ManagePhysicalNodeAction extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Target State</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' attribute.
	 * @see eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState
	 * @see #setTargetState(NodeState)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getManagePhysicalNodeAction_TargetState()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NodeState getTargetState();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getTargetState <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' attribute.
	 * @see eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(NodeState value);

	/**
	 * Returns the value of the '<em><b>Managed Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Node</em>' reference.
	 * @see #setManagedNode(AbstractNode)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getManagePhysicalNodeAction_ManagedNode()
	 * @model ordered="false"
	 * @generated
	 */
	AbstractNode getManagedNode();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction#getManagedNode <em>Managed Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Node</em>' reference.
	 * @see #getManagedNode()
	 * @generated
	 */
	void setManagedNode(AbstractNode value);

} // ManagePhysicalNodeAction
