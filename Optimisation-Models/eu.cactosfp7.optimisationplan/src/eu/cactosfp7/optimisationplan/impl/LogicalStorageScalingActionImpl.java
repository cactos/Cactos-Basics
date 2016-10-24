/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.optimisationplan.LogicalStorageScalingAction;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import javax.measure.quantity.DataAmount;
import org.eclipse.emf.ecore.EClass;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Storage Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.LogicalStorageScalingActionImpl#getProposedLocalSize <em>Proposed Local Size</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.LogicalStorageScalingActionImpl#getVMImageInstance <em>VM Image Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalStorageScalingActionImpl extends VerticalScalingActionImpl implements LogicalStorageScalingAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalStorageScalingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.LOGICAL_STORAGE_SCALING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<DataAmount> getProposedLocalSize() {
		return (Amount<DataAmount>) eDynamicGet(
				OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE,
				OptimisationplanPackage.Literals.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedLocalSize(Amount<DataAmount> newProposedLocalSize) {
		eDynamicSet(OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE,
				OptimisationplanPackage.Literals.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE,
				newProposedLocalSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMImageInstance getVMImageInstance() {
		return (VMImageInstance) eDynamicGet(OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE,
				OptimisationplanPackage.Literals.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMImageInstance basicGetVMImageInstance() {
		return (VMImageInstance) eDynamicGet(OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE,
				OptimisationplanPackage.Literals.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVMImageInstance(VMImageInstance newVMImageInstance) {
		eDynamicSet(OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE,
				OptimisationplanPackage.Literals.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE, newVMImageInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE:
			return getProposedLocalSize();
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE:
			if (resolve)
				return getVMImageInstance();
			return basicGetVMImageInstance();
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
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE:
			setProposedLocalSize((Amount<DataAmount>) newValue);
			return;
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE:
			setVMImageInstance((VMImageInstance) newValue);
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
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE:
			setProposedLocalSize((Amount<DataAmount>) null);
			return;
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE:
			setVMImageInstance((VMImageInstance) null);
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
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__PROPOSED_LOCAL_SIZE:
			return getProposedLocalSize() != null;
		case OptimisationplanPackage.LOGICAL_STORAGE_SCALING_ACTION__VM_IMAGE_INSTANCE:
			return basicGetVMImageInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //LogicalStorageScalingActionImpl
