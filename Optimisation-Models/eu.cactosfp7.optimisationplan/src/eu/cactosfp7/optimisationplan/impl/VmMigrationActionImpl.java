/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.PuAffinity;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.VmMigrationAction;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vm Migration Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl#getMigratedVm <em>Migrated Vm</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl#getTargetHost <em>Target Host</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl#getPuAffinityAfterMigration <em>Pu Affinity After Migration</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VmMigrationActionImpl#getSourceHost <em>Source Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VmMigrationActionImpl extends OptimisationActionStepImpl implements VmMigrationAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmMigrationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.VM_MIGRATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getMigratedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.VM_MIGRATION_ACTION__MIGRATED_VM,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__MIGRATED_VM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine basicGetMigratedVm() {
		return (VirtualMachine) eDynamicGet(OptimisationplanPackage.VM_MIGRATION_ACTION__MIGRATED_VM,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__MIGRATED_VM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMigratedVm(VirtualMachine newMigratedVm) {
		eDynamicSet(OptimisationplanPackage.VM_MIGRATION_ACTION__MIGRATED_VM,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__MIGRATED_VM, newMigratedVm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor getTargetHost() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.VM_MIGRATION_ACTION__TARGET_HOST,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__TARGET_HOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor basicGetTargetHost() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.VM_MIGRATION_ACTION__TARGET_HOST,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__TARGET_HOST, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHost(Hypervisor newTargetHost) {
		eDynamicSet(OptimisationplanPackage.VM_MIGRATION_ACTION__TARGET_HOST,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__TARGET_HOST, newTargetHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PuAffinity> getPuAffinityAfterMigration() {
		return (EList<PuAffinity>) eDynamicGet(OptimisationplanPackage.VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor getSourceHost() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.VM_MIGRATION_ACTION__SOURCE_HOST,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__SOURCE_HOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor basicGetSourceHost() {
		return (Hypervisor) eDynamicGet(OptimisationplanPackage.VM_MIGRATION_ACTION__SOURCE_HOST,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__SOURCE_HOST, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceHost(Hypervisor newSourceHost) {
		eDynamicSet(OptimisationplanPackage.VM_MIGRATION_ACTION__SOURCE_HOST,
				OptimisationplanPackage.Literals.VM_MIGRATION_ACTION__SOURCE_HOST, newSourceHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OptimisationplanPackage.VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION:
			return ((InternalEList<?>) getPuAffinityAfterMigration()).basicRemove(otherEnd, msgs);
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
		case OptimisationplanPackage.VM_MIGRATION_ACTION__MIGRATED_VM:
			if (resolve)
				return getMigratedVm();
			return basicGetMigratedVm();
		case OptimisationplanPackage.VM_MIGRATION_ACTION__TARGET_HOST:
			if (resolve)
				return getTargetHost();
			return basicGetTargetHost();
		case OptimisationplanPackage.VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION:
			return getPuAffinityAfterMigration();
		case OptimisationplanPackage.VM_MIGRATION_ACTION__SOURCE_HOST:
			if (resolve)
				return getSourceHost();
			return basicGetSourceHost();
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
		case OptimisationplanPackage.VM_MIGRATION_ACTION__MIGRATED_VM:
			setMigratedVm((VirtualMachine) newValue);
			return;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__TARGET_HOST:
			setTargetHost((Hypervisor) newValue);
			return;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION:
			getPuAffinityAfterMigration().clear();
			getPuAffinityAfterMigration().addAll((Collection<? extends PuAffinity>) newValue);
			return;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__SOURCE_HOST:
			setSourceHost((Hypervisor) newValue);
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
		case OptimisationplanPackage.VM_MIGRATION_ACTION__MIGRATED_VM:
			setMigratedVm((VirtualMachine) null);
			return;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__TARGET_HOST:
			setTargetHost((Hypervisor) null);
			return;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION:
			getPuAffinityAfterMigration().clear();
			return;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__SOURCE_HOST:
			setSourceHost((Hypervisor) null);
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
		case OptimisationplanPackage.VM_MIGRATION_ACTION__MIGRATED_VM:
			return basicGetMigratedVm() != null;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__TARGET_HOST:
			return basicGetTargetHost() != null;
		case OptimisationplanPackage.VM_MIGRATION_ACTION__PU_AFFINITY_AFTER_MIGRATION:
			return !getPuAffinityAfterMigration().isEmpty();
		case OptimisationplanPackage.VM_MIGRATION_ACTION__SOURCE_HOST:
			return basicGetSourceHost() != null;
		}
		return super.eIsSet(featureID);
	}

} //VmMigrationActionImpl
