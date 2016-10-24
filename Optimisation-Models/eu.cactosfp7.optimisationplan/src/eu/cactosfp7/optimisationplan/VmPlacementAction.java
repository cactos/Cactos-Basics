/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.PuAffinity;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualDisk;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import javax.measure.quantity.DataAmount;
import org.eclipse.emf.common.util.EList;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vm Placement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getTargetHost <em>Target Host</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getVmImage <em>Vm Image</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getPuAffinity <em>Pu Affinity</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedMemory <em>Proposed Memory</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedStorage <em>Proposed Storage</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedVirtualCores <em>Proposed Virtual Cores</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getUnassignedVirtualMachine <em>Unassigned Virtual Machine</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction()
 * @model
 * @generated
 */
public interface VmPlacementAction extends OptimisationActionStep {
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
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction_TargetHost()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hypervisor getTargetHost();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getTargetHost <em>Target Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Host</em>' reference.
	 * @see #getTargetHost()
	 * @generated
	 */
	void setTargetHost(Hypervisor value);

	/**
	 * Returns the value of the '<em><b>Vm Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Image</em>' reference.
	 * @see #setVmImage(VirtualDisk)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction_VmImage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualDisk getVmImage();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getVmImage <em>Vm Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Image</em>' reference.
	 * @see #getVmImage()
	 * @generated
	 */
	void setVmImage(VirtualDisk value);

	/**
	 * Returns the value of the '<em><b>Pu Affinity</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.infrastructuremodels.logicaldc.core.PuAffinity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pu Affinity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pu Affinity</em>' containment reference list.
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction_PuAffinity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PuAffinity> getPuAffinity();

	/**
	 * Returns the value of the '<em><b>Proposed Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Memory</em>' attribute.
	 * @see #setProposedMemory(Amount)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction_ProposedMemory()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.DataAmount>" required="true" ordered="false"
	 * @generated
	 */
	Amount<DataAmount> getProposedMemory();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedMemory <em>Proposed Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Memory</em>' attribute.
	 * @see #getProposedMemory()
	 * @generated
	 */
	void setProposedMemory(Amount<DataAmount> value);

	/**
	 * Returns the value of the '<em><b>Proposed Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Storage</em>' attribute.
	 * @see #setProposedStorage(Amount)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction_ProposedStorage()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.DataAmount>" required="true" ordered="false"
	 * @generated
	 */
	Amount<DataAmount> getProposedStorage();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedStorage <em>Proposed Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Storage</em>' attribute.
	 * @see #getProposedStorage()
	 * @generated
	 */
	void setProposedStorage(Amount<DataAmount> value);

	/**
	 * Returns the value of the '<em><b>Proposed Virtual Cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Virtual Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Virtual Cores</em>' attribute.
	 * @see #setProposedVirtualCores(int)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction_ProposedVirtualCores()
	 * @model default="1" required="true" ordered="false"
	 * @generated
	 */
	int getProposedVirtualCores();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getProposedVirtualCores <em>Proposed Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Virtual Cores</em>' attribute.
	 * @see #getProposedVirtualCores()
	 * @generated
	 */
	void setProposedVirtualCores(int value);

	/**
	 * Returns the value of the '<em><b>Unassigned Virtual Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unassigned Virtual Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unassigned Virtual Machine</em>' reference.
	 * @see #setUnassignedVirtualMachine(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVmPlacementAction_UnassignedVirtualMachine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getUnassignedVirtualMachine();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VmPlacementAction#getUnassignedVirtualMachine <em>Unassigned Virtual Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unassigned Virtual Machine</em>' reference.
	 * @see #getUnassignedVirtualMachine()
	 * @generated
	 */
	void setUnassignedVirtualMachine(VirtualMachine value);

} // VmPlacementAction
