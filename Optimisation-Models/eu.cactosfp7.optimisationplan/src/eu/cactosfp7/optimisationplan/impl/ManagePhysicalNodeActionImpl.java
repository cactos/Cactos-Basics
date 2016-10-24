/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.AbstractNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.NodeState;

import eu.cactosfp7.optimisationplan.ManagePhysicalNodeAction;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manage Physical Node Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ManagePhysicalNodeActionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ManagePhysicalNodeActionImpl#getManagedNode <em>Managed Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagePhysicalNodeActionImpl extends OptimisationActionStepImpl implements ManagePhysicalNodeAction {
	/**
	 * The default value of the '{@link #getTargetState() <em>Target State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected static final NodeState TARGET_STATE_EDEFAULT = NodeState.OFF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagePhysicalNodeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.MANAGE_PHYSICAL_NODE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeState getTargetState() {
		return (NodeState) eDynamicGet(OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE,
				OptimisationplanPackage.Literals.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(NodeState newTargetState) {
		eDynamicSet(OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE,
				OptimisationplanPackage.Literals.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE, newTargetState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getManagedNode() {
		return (AbstractNode) eDynamicGet(OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE,
				OptimisationplanPackage.Literals.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetManagedNode() {
		return (AbstractNode) eDynamicGet(OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE,
				OptimisationplanPackage.Literals.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagedNode(AbstractNode newManagedNode) {
		eDynamicSet(OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE,
				OptimisationplanPackage.Literals.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE, newManagedNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE:
			return getTargetState();
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE:
			if (resolve)
				return getManagedNode();
			return basicGetManagedNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE:
			setTargetState((NodeState) newValue);
			return;
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE:
			setManagedNode((AbstractNode) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE:
			setTargetState(TARGET_STATE_EDEFAULT);
			return;
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE:
			setManagedNode((AbstractNode) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__TARGET_STATE:
			return getTargetState() != TARGET_STATE_EDEFAULT;
		case OptimisationplanPackage.MANAGE_PHYSICAL_NODE_ACTION__MANAGED_NODE:
			return basicGetManagedNode() != null;
		}
		return super.eIsSet(featureID);
	}

} //ManagePhysicalNodeActionImpl
