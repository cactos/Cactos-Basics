/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.StartVmAction;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Vm Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.StartVmActionImpl#getStartedVm <em>Started Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartVmActionImpl extends OptimisationActionStepImpl implements StartVmAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartVmActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.START_VM_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getStartedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.START_VM_ACTION__STARTED_VM,
				OptimisationplanPackage.Literals.START_VM_ACTION__STARTED_VM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetStartedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.START_VM_ACTION__STARTED_VM,
				OptimisationplanPackage.Literals.START_VM_ACTION__STARTED_VM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartedVm(VirtualMachine newStartedVm) {
		eDynamicSet(OptimisationplanPackage.START_VM_ACTION__STARTED_VM,
				OptimisationplanPackage.Literals.START_VM_ACTION__STARTED_VM, newStartedVm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.START_VM_ACTION__STARTED_VM:
			if (resolve)
				return getStartedVm();
			return basicGetStartedVm();
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
		case OptimisationplanPackage.START_VM_ACTION__STARTED_VM:
			setStartedVm((VirtualMachine) newValue);
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
		case OptimisationplanPackage.START_VM_ACTION__STARTED_VM:
			setStartedVm((VirtualMachine) null);
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
		case OptimisationplanPackage.START_VM_ACTION__STARTED_VM:
			return basicGetStartedVm() != null;
		}
		return super.eIsSet(featureID);
	}

} //StartVmActionImpl
