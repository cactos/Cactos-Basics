/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.StopVmAction;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Vm Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.StopVmActionImpl#getStoppedVm <em>Stopped Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopVmActionImpl extends OptimisationActionStepImpl implements StopVmAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopVmActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.STOP_VM_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getStoppedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.STOP_VM_ACTION__STOPPED_VM,
				OptimisationplanPackage.Literals.STOP_VM_ACTION__STOPPED_VM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetStoppedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.STOP_VM_ACTION__STOPPED_VM,
				OptimisationplanPackage.Literals.STOP_VM_ACTION__STOPPED_VM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoppedVm(VirtualMachine newStoppedVm) {
		eDynamicSet(OptimisationplanPackage.STOP_VM_ACTION__STOPPED_VM,
				OptimisationplanPackage.Literals.STOP_VM_ACTION__STOPPED_VM, newStoppedVm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.STOP_VM_ACTION__STOPPED_VM:
			if (resolve)
				return getStoppedVm();
			return basicGetStoppedVm();
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
		case OptimisationplanPackage.STOP_VM_ACTION__STOPPED_VM:
			setStoppedVm((VirtualMachine) newValue);
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
		case OptimisationplanPackage.STOP_VM_ACTION__STOPPED_VM:
			setStoppedVm((VirtualMachine) null);
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
		case OptimisationplanPackage.STOP_VM_ACTION__STOPPED_VM:
			return basicGetStoppedVm() != null;
		}
		return super.eIsSet(featureID);
	}

} //StopVmActionImpl
