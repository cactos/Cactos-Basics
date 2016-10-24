/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification;

import javax.measure.quantity.Frequency;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Frequency Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getScaledPhysicalProcessingUnit <em>Scaled Physical Processing Unit</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getProposedFrequency <em>Proposed Frequency</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getPhysicalFrequencyScalingAction()
 * @model
 * @generated
 */
public interface PhysicalFrequencyScalingAction extends VerticalScalingAction {
	/**
	 * Returns the value of the '<em><b>Scaled Physical Processing Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaled Physical Processing Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaled Physical Processing Unit</em>' reference.
	 * @see #setScaledPhysicalProcessingUnit(ProcessingUnitSpecification)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getPhysicalFrequencyScalingAction_ScaledPhysicalProcessingUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessingUnitSpecification getScaledPhysicalProcessingUnit();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getScaledPhysicalProcessingUnit <em>Scaled Physical Processing Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaled Physical Processing Unit</em>' reference.
	 * @see #getScaledPhysicalProcessingUnit()
	 * @generated
	 */
	void setScaledPhysicalProcessingUnit(ProcessingUnitSpecification value);

	/**
	 * Returns the value of the '<em><b>Proposed Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Frequency</em>' attribute.
	 * @see #setProposedFrequency(Amount)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getPhysicalFrequencyScalingAction_ProposedFrequency()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.Frequency>" required="true" ordered="false"
	 * @generated
	 */
	Amount<Frequency> getProposedFrequency();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction#getProposedFrequency <em>Proposed Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Frequency</em>' attribute.
	 * @see #getProposedFrequency()
	 * @generated
	 */
	void setProposedFrequency(Amount<Frequency> value);

} // PhysicalFrequencyScalingAction
