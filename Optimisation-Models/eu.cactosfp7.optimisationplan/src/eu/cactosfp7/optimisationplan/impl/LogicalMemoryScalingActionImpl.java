/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;
import eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import javax.measure.quantity.DataAmount;
import org.eclipse.emf.ecore.EClass;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Memory Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.LogicalMemoryScalingActionImpl#getProposedSize <em>Proposed Size</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.LogicalMemoryScalingActionImpl#getScaledVirtualMemory <em>Scaled Virtual Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalMemoryScalingActionImpl extends VerticalScalingActionImpl implements LogicalMemoryScalingAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalMemoryScalingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.LOGICAL_MEMORY_SCALING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<DataAmount> getProposedSize() {
		return (Amount<DataAmount>) eDynamicGet(OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE,
				OptimisationplanPackage.Literals.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedSize(Amount<DataAmount> newProposedSize) {
		eDynamicSet(OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE,
				OptimisationplanPackage.Literals.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE, newProposedSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMemory getScaledVirtualMemory() {
		return (VirtualMemory) eDynamicGet(OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY,
				OptimisationplanPackage.Literals.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMemory basicGetScaledVirtualMemory() {
		return (VirtualMemory) eDynamicGet(OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY,
				OptimisationplanPackage.Literals.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaledVirtualMemory(VirtualMemory newScaledVirtualMemory) {
		eDynamicSet(OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY,
				OptimisationplanPackage.Literals.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY,
				newScaledVirtualMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE:
			return getProposedSize();
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY:
			if (resolve)
				return getScaledVirtualMemory();
			return basicGetScaledVirtualMemory();
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
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE:
			setProposedSize((Amount<DataAmount>) newValue);
			return;
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY:
			setScaledVirtualMemory((VirtualMemory) newValue);
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
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE:
			setProposedSize((Amount<DataAmount>) null);
			return;
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY:
			setScaledVirtualMemory((VirtualMemory) null);
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
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__PROPOSED_SIZE:
			return getProposedSize() != null;
		case OptimisationplanPackage.LOGICAL_MEMORY_SCALING_ACTION__SCALED_VIRTUAL_MEMORY:
			return basicGetScaledVirtualMemory() != null;
		}
		return super.eIsSet(featureID);
	}

} //LogicalMemoryScalingActionImpl
