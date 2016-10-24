/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import eu.cactosfp7.optimisationplan.ConnectVmAction;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect Vm Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ConnectVmActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ConnectVmActionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectVmActionImpl extends OptimisationActionStepImpl implements ConnectVmAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectVmActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.CONNECT_VM_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getSource() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.CONNECT_VM_ACTION__SOURCE,
				OptimisationplanPackage.Literals.CONNECT_VM_ACTION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetSource() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.CONNECT_VM_ACTION__SOURCE,
				OptimisationplanPackage.Literals.CONNECT_VM_ACTION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(VirtualMachine newSource) {
		eDynamicSet(OptimisationplanPackage.CONNECT_VM_ACTION__SOURCE,
				OptimisationplanPackage.Literals.CONNECT_VM_ACTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getTarget() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.CONNECT_VM_ACTION__TARGET,
				OptimisationplanPackage.Literals.CONNECT_VM_ACTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetTarget() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.CONNECT_VM_ACTION__TARGET,
				OptimisationplanPackage.Literals.CONNECT_VM_ACTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(VirtualMachine newTarget) {
		eDynamicSet(OptimisationplanPackage.CONNECT_VM_ACTION__TARGET,
				OptimisationplanPackage.Literals.CONNECT_VM_ACTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.CONNECT_VM_ACTION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case OptimisationplanPackage.CONNECT_VM_ACTION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case OptimisationplanPackage.CONNECT_VM_ACTION__SOURCE:
			setSource((VirtualMachine) newValue);
			return;
		case OptimisationplanPackage.CONNECT_VM_ACTION__TARGET:
			setTarget((VirtualMachine) newValue);
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
		case OptimisationplanPackage.CONNECT_VM_ACTION__SOURCE:
			setSource((VirtualMachine) null);
			return;
		case OptimisationplanPackage.CONNECT_VM_ACTION__TARGET:
			setTarget((VirtualMachine) null);
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
		case OptimisationplanPackage.CONNECT_VM_ACTION__SOURCE:
			return basicGetSource() != null;
		case OptimisationplanPackage.CONNECT_VM_ACTION__TARGET:
			return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectVmActionImpl
