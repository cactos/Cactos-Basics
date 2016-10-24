/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.PuAffinity;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vm Migration Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getMigratedVm <em>Migrated Vm</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getTargetHost <em>Target Host</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getPuAffinityAfterMigration <em>Pu Affinity After Migration</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getSourceHost <em>Source Host</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmMigrationAction()
 * @model
 * @generated
 */
public interface VmMigrationAction extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Migrated Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migrated Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migrated Vm</em>' reference.
	 * @see #setMigratedVm(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmMigrationAction_MigratedVm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getMigratedVm();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getMigratedVm <em>Migrated Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migrated Vm</em>' reference.
	 * @see #getMigratedVm()
	 * @generated
	 */
	void setMigratedVm(VirtualMachine value);

	/**
	 * Returns the value of the '<em><b>Target Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Host</em>' reference.
	 * @see #setTargetHost(Hypervisor)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmMigrationAction_TargetHost()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hypervisor getTargetHost();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getTargetHost <em>Target Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Host</em>' reference.
	 * @see #getTargetHost()
	 * @generated
	 */
	void setTargetHost(Hypervisor value);

	/**
	 * Returns the value of the '<em><b>Pu Affinity After Migration</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.infrastructuremodels.logicaldc.core.PuAffinity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pu Affinity After Migration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pu Affinity After Migration</em>' containment reference list.
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmMigrationAction_PuAffinityAfterMigration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PuAffinity> getPuAffinityAfterMigration();

	/**
	 * Returns the value of the '<em><b>Source Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Host</em>' reference.
	 * @see #setSourceHost(Hypervisor)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmMigrationAction_SourceHost()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hypervisor getSourceHost();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmMigrationAction#getSourceHost <em>Source Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Host</em>' reference.
	 * @see #getSourceHost()
	 * @generated
	 */
	void setSourceHost(Hypervisor value);

} // VmMigrationAction
