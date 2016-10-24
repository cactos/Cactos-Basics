/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.ResourceControlAction;

import javax.measure.quantity.Dimensionless;

import org.eclipse.emf.ecore.EClass;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ResourceControlActionImpl#getAffectedVm <em>Affected Vm</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ResourceControlActionImpl#getResourceShare <em>Resource Share</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ResourceControlActionImpl#getControlledHypervisor <em>Controlled Hypervisor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceControlActionImpl extends OptimisationActionStepImpl implements ResourceControlAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceControlActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getAffectedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__AFFECTED_VM,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__AFFECTED_VM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetAffectedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__AFFECTED_VM,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__AFFECTED_VM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedVm(VirtualMachine newAffectedVm) {
		eDynamicSet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__AFFECTED_VM,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__AFFECTED_VM, newAffectedVm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<Dimensionless> getResourceShare() {
		return (Amount<Dimensionless>) eDynamicGet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceShare(Amount<Dimensionless> newResourceShare) {
		eDynamicSet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE, newResourceShare);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor getControlledHypervisor() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor basicGetControlledHypervisor() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledHypervisor(Hypervisor newControlledHypervisor) {
		eDynamicSet(OptimisationplanPackage.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR,
				OptimisationplanPackage.Literals.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR,
				newControlledHypervisor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__AFFECTED_VM:
			if (resolve)
				return getAffectedVm();
			return basicGetAffectedVm();
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE:
			return getResourceShare();
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR:
			if (resolve)
				return getControlledHypervisor();
			return basicGetControlledHypervisor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__AFFECTED_VM:
			setAffectedVm((VirtualMachine) newValue);
			return;
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE:
			setResourceShare((Amount<Dimensionless>) newValue);
			return;
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR:
			setControlledHypervisor((Hypervisor) newValue);
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
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__AFFECTED_VM:
			setAffectedVm((VirtualMachine) null);
			return;
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE:
			setResourceShare((Amount<Dimensionless>) null);
			return;
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR:
			setControlledHypervisor((Hypervisor) null);
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
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__AFFECTED_VM:
			return basicGetAffectedVm() != null;
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__RESOURCE_SHARE:
			return getResourceShare() != null;
		case OptimisationplanPackage.RESOURCE_CONTROL_ACTION__CONTROLLED_HYPERVISOR:
			return basicGetControlledHypervisor() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceControlActionImpl
