/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.VirtualCoresScalingAction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Cores Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VirtualCoresScalingActionImpl#getProposedNumberOfCores <em>Proposed Number Of Cores</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.VirtualCoresScalingActionImpl#getScaledvirtualPu <em>Scaledvirtual Pu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualCoresScalingActionImpl extends VerticalScalingActionImpl implements VirtualCoresScalingAction {
	/**
	 * The default value of the '{@link #getProposedNumberOfCores() <em>Proposed Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposedNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected static final int PROPOSED_NUMBER_OF_CORES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualCoresScalingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.VIRTUAL_CORES_SCALING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProposedNumberOfCores() {
		return (Integer) eDynamicGet(OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES,
				OptimisationplanPackage.Literals.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedNumberOfCores(int newProposedNumberOfCores) {
		eDynamicSet(OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES,
				OptimisationplanPackage.Literals.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES,
				newProposedNumberOfCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualProcessingUnit getScaledvirtualPu() {
		return (VirtualProcessingUnit) eDynamicGet(
				OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU,
				OptimisationplanPackage.Literals.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualProcessingUnit basicGetScaledvirtualPu() {
		return (VirtualProcessingUnit) eDynamicGet(
				OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU,
				OptimisationplanPackage.Literals.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaledvirtualPu(VirtualProcessingUnit newScaledvirtualPu) {
		eDynamicSet(OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU,
				OptimisationplanPackage.Literals.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU, newScaledvirtualPu);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES:
			return getProposedNumberOfCores();
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU:
			if (resolve)
				return getScaledvirtualPu();
			return basicGetScaledvirtualPu();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES:
			setProposedNumberOfCores((Integer) newValue);
			return;
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU:
			setScaledvirtualPu((VirtualProcessingUnit) newValue);
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
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES:
			setProposedNumberOfCores(PROPOSED_NUMBER_OF_CORES_EDEFAULT);
			return;
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU:
			setScaledvirtualPu((VirtualProcessingUnit) null);
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
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__PROPOSED_NUMBER_OF_CORES:
			return getProposedNumberOfCores() != PROPOSED_NUMBER_OF_CORES_EDEFAULT;
		case OptimisationplanPackage.VIRTUAL_CORES_SCALING_ACTION__SCALEDVIRTUAL_PU:
			return basicGetScaledvirtualPu() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualCoresScalingActionImpl
