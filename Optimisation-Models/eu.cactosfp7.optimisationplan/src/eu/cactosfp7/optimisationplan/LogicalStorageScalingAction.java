/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;

import javax.measure.quantity.DataAmount;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Storage Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getProposedLocalSize <em>Proposed Local Size</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getVMImageInstance <em>VM Image Instance</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getLogicalStorageScalingAction()
 * @model
 * @generated
 */
public interface LogicalStorageScalingAction extends VerticalScalingAction {
	/**
	 * Returns the value of the '<em><b>Proposed Local Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Local Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Local Size</em>' attribute.
	 * @see #setProposedLocalSize(Amount)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getLogicalStorageScalingAction_ProposedLocalSize()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.DataAmount>" required="true" ordered="false"
	 * @generated
	 */
	Amount<DataAmount> getProposedLocalSize();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getProposedLocalSize <em>Proposed Local Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Local Size</em>' attribute.
	 * @see #getProposedLocalSize()
	 * @generated
	 */
	void setProposedLocalSize(Amount<DataAmount> value);

	/**
	 * Returns the value of the '<em><b>VM Image Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VM Image Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VM Image Instance</em>' reference.
	 * @see #setVMImageInstance(VMImageInstance)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getLogicalStorageScalingAction_VMImageInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VMImageInstance getVMImageInstance();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.LogicalStorageScalingAction#getVMImageInstance <em>VM Image Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VM Image Instance</em>' reference.
	 * @see #getVMImageInstance()
	 * @generated
	 */
	void setVMImageInstance(VMImageInstance value);

} // LogicalStorageScalingAction
