/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.PuAffinity;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.VmPlacementAction;
import java.util.Collection;
import javax.measure.quantity.DataAmount;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vm Placement Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl#getTargetHost <em>Target Host</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl#getVmImage <em>Vm Image</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl#getPuAffinity <em>Pu Affinity</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl#getProposedMemory <em>Proposed Memory</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl#getProposedStorage <em>Proposed Storage</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl#getProposedVirtualCores <em>Proposed Virtual Cores</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmPlacementActionImpl#getUnassignedVirtualMachine <em>Unassigned Virtual Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VmPlacementActionImpl extends OptimisationActionStepImpl implements VmPlacementAction {
	/**
	 * The default value of the '{@link #getProposedVirtualCores() <em>Proposed Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposedVirtualCores()
	 * @generated
	 * @ordered
	 */
	protected static final int PROPOSED_VIRTUAL_CORES_EDEFAULT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmPlacementActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor getTargetHost() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__TARGET_HOST,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__TARGET_HOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor basicGetTargetHost() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__TARGET_HOST,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__TARGET_HOST, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHost(Hypervisor newTargetHost) {
		eDynamicSet(OptimisationplanPackage.VM_PLACEMENT_ACTION__TARGET_HOST,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__TARGET_HOST, newTargetHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualDisk getVmImage() {
		return (VirtualDisk) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__VM_IMAGE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__VM_IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualDisk basicGetVmImage() {
		return (VirtualDisk) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__VM_IMAGE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__VM_IMAGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmImage(VirtualDisk newVmImage) {
		eDynamicSet(OptimisationplanPackage.VM_PLACEMENT_ACTION__VM_IMAGE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__VM_IMAGE, newVmImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PuAffinity> getPuAffinity() {
		return (EList<PuAffinity>) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__PU_AFFINITY,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PU_AFFINITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<DataAmount> getProposedMemory() {
		return (Amount<DataAmount>) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_MEMORY,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_MEMORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedMemory(Amount<DataAmount> newProposedMemory) {
		eDynamicSet(OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_MEMORY,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_MEMORY, newProposedMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<DataAmount> getProposedStorage() {
		return (Amount<DataAmount>) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_STORAGE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_STORAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedStorage(Amount<DataAmount> newProposedStorage) {
		eDynamicSet(OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_STORAGE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_STORAGE, newProposedStorage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProposedVirtualCores() {
		return (Integer) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedVirtualCores(int newProposedVirtualCores) {
		eDynamicSet(OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES, newProposedVirtualCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getUnassignedVirtualMachine() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetUnassignedVirtualMachine() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnassignedVirtualMachine(VirtualMachine newUnassignedVirtualMachine) {
		eDynamicSet(OptimisationplanPackage.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE,
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE,
				newUnassignedVirtualMachine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PU_AFFINITY:
			return ((InternalEList<?>) getPuAffinity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__TARGET_HOST:
			if (resolve)
				return getTargetHost();
			return basicGetTargetHost();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__VM_IMAGE:
			if (resolve)
				return getVmImage();
			return basicGetVmImage();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PU_AFFINITY:
			return getPuAffinity();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_MEMORY:
			return getProposedMemory();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_STORAGE:
			return getProposedStorage();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES:
			return getProposedVirtualCores();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE:
			if (resolve)
				return getUnassignedVirtualMachine();
			return basicGetUnassignedVirtualMachine();
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
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__TARGET_HOST:
			setTargetHost((Hypervisor) newValue);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__VM_IMAGE:
			setVmImage((VirtualDisk) newValue);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PU_AFFINITY:
			getPuAffinity().clear();
			getPuAffinity().addAll((Collection<? extends PuAffinity>) newValue);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_MEMORY:
			setProposedMemory((Amount<DataAmount>) newValue);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_STORAGE:
			setProposedStorage((Amount<DataAmount>) newValue);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES:
			setProposedVirtualCores((Integer) newValue);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE:
			setUnassignedVirtualMachine((VirtualMachine) newValue);
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
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__TARGET_HOST:
			setTargetHost((Hypervisor) null);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__VM_IMAGE:
			setVmImage((VirtualDisk) null);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PU_AFFINITY:
			getPuAffinity().clear();
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_MEMORY:
			setProposedMemory((Amount<DataAmount>) null);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_STORAGE:
			setProposedStorage((Amount<DataAmount>) null);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES:
			setProposedVirtualCores(PROPOSED_VIRTUAL_CORES_EDEFAULT);
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE:
			setUnassignedVirtualMachine((VirtualMachine) null);
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
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__TARGET_HOST:
			return basicGetTargetHost() != null;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__VM_IMAGE:
			return basicGetVmImage() != null;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PU_AFFINITY:
			return !getPuAffinity().isEmpty();
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_MEMORY:
			return getProposedMemory() != null;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_STORAGE:
			return getProposedStorage() != null;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES:
			return getProposedVirtualCores() != PROPOSED_VIRTUAL_CORES_EDEFAULT;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE:
			return basicGetUnassignedVirtualMachine() != null;
		}
		return super.eIsSet(featureID);
	}

} //VmPlacementActionImpl
