/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction;
import javax.measure.quantity.Frequency;
import org.eclipse.emf.ecore.EClass;
import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Frequency Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.PhysicalFrequencyScalingActionImpl#getScaledPhysicalProcessingUnit <em>Scaled Physical Processing Unit</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.PhysicalFrequencyScalingActionImpl#getProposedFrequency <em>Proposed Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalFrequencyScalingActionImpl extends VerticalScalingActionImpl
		implements PhysicalFrequencyScalingAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFrequencyScalingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnitSpecification getScaledPhysicalProcessingUnit() {
		return (ProcessingUnitSpecification) eDynamicGet(
				OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT,
				OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnitSpecification basicGetScaledPhysicalProcessingUnit() {
		return (ProcessingUnitSpecification) eDynamicGet(
				OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT,
				OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaledPhysicalProcessingUnit(ProcessingUnitSpecification newScaledPhysicalProcessingUnit) {
		eDynamicSet(OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT,
				OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT,
				newScaledPhysicalProcessingUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amount<Frequency> getProposedFrequency() {
		return (Amount<Frequency>) eDynamicGet(
				OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY,
				OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedFrequency(Amount<Frequency> newProposedFrequency) {
		eDynamicSet(OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY,
				OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY,
				newProposedFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT:
			if (resolve)
				return getScaledPhysicalProcessingUnit();
			return basicGetScaledPhysicalProcessingUnit();
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY:
			return getProposedFrequency();
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
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT:
			setScaledPhysicalProcessingUnit((ProcessingUnitSpecification) newValue);
			return;
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY:
			setProposedFrequency((Amount<Frequency>) newValue);
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
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT:
			setScaledPhysicalProcessingUnit((ProcessingUnitSpecification) null);
			return;
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY:
			setProposedFrequency((Amount<Frequency>) null);
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
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT:
			return basicGetScaledPhysicalProcessingUnit() != null;
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY:
			return getProposedFrequency() != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalFrequencyScalingActionImpl
