/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;

import javax.measure.quantity.DataAmount;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Memory Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getProposedSize <em>Proposed Size</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getScaledVirtualMemory <em>Scaled Virtual Memory</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getLogicalMemoryScalingAction()
 * @model
 * @generated
 */
public interface LogicalMemoryScalingAction extends VerticalScalingAction {
	/**
	 * Returns the value of the '<em><b>Proposed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Size</em>' attribute.
	 * @see #setProposedSize(Amount)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getLogicalMemoryScalingAction_ProposedSize()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.DataAmount>" required="true" ordered="false"
	 * @generated
	 */
	Amount<DataAmount> getProposedSize();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getProposedSize <em>Proposed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Size</em>' attribute.
	 * @see #getProposedSize()
	 * @generated
	 */
	void setProposedSize(Amount<DataAmount> value);

	/**
	 * Returns the value of the '<em><b>Scaled Virtual Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaled Virtual Memory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaled Virtual Memory</em>' reference.
	 * @see #setScaledVirtualMemory(VirtualMemory)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getLogicalMemoryScalingAction_ScaledVirtualMemory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMemory getScaledVirtualMemory();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.LogicalMemoryScalingAction#getScaledVirtualMemory <em>Scaled Virtual Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaled Virtual Memory</em>' reference.
	 * @see #getScaledVirtualMemory()
	 * @generated
	 */
	void setScaledVirtualMemory(VirtualMemory value);

} // LogicalMemoryScalingAction
