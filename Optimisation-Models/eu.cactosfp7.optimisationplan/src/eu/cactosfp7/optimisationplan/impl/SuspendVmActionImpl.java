/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.SuspendVmAction;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspend Vm Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.SuspendVmActionImpl#getSuspendedVm <em>Suspended Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuspendVmActionImpl extends OptimisationActionStepImpl implements SuspendVmAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspendVmActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.SUSPEND_VM_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getSuspendedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.SUSPEND_VM_ACTION__SUSPENDED_VM,
				OptimisationplanPackage.Literals.SUSPEND_VM_ACTION__SUSPENDED_VM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetSuspendedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.SUSPEND_VM_ACTION__SUSPENDED_VM,
				OptimisationplanPackage.Literals.SUSPEND_VM_ACTION__SUSPENDED_VM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspendedVm(VirtualMachine newSuspendedVm) {
		eDynamicSet(OptimisationplanPackage.SUSPEND_VM_ACTION__SUSPENDED_VM,
				OptimisationplanPackage.Literals.SUSPEND_VM_ACTION__SUSPENDED_VM, newSuspendedVm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.SUSPEND_VM_ACTION__SUSPENDED_VM:
			if (resolve)
				return getSuspendedVm();
			return basicGetSuspendedVm();
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
		case OptimisationplanPackage.SUSPEND_VM_ACTION__SUSPENDED_VM:
			setSuspendedVm((VirtualMachine) newValue);
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
		case OptimisationplanPackage.SUSPEND_VM_ACTION__SUSPENDED_VM:
			setSuspendedVm((VirtualMachine) null);
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
		case OptimisationplanPackage.SUSPEND_VM_ACTION__SUSPENDED_VM:
			return basicGetSuspendedVm() != null;
		}
		return super.eIsSet(featureID);
	}

} //SuspendVmActionImpl
