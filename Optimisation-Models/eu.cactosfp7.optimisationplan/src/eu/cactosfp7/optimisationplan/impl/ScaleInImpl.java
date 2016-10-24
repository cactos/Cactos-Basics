/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVM;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.ScaleIn;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ScaleInImpl#getLoadBalancerInstance <em>Load Balancer Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ScaleInImpl#getScaledVM <em>Scaled VM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaleInImpl extends OptimisationActionStepImpl implements ScaleIn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaleInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.SCALE_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedVM getLoadBalancerInstance() {
		return (ComposedVM) eDynamicGet(OptimisationplanPackage.SCALE_IN__LOAD_BALANCER_INSTANCE,
				OptimisationplanPackage.Literals.SCALE_IN__LOAD_BALANCER_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedVM basicGetLoadBalancerInstance() {
		return (ComposedVM) eDynamicGet(OptimisationplanPackage.SCALE_IN__LOAD_BALANCER_INSTANCE,
				OptimisationplanPackage.Literals.SCALE_IN__LOAD_BALANCER_INSTANCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalancerInstance(ComposedVM newLoadBalancerInstance) {
		eDynamicSet(OptimisationplanPackage.SCALE_IN__LOAD_BALANCER_INSTANCE,
				OptimisationplanPackage.Literals.SCALE_IN__LOAD_BALANCER_INSTANCE, newLoadBalancerInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedVM getScaledVM() {
		return (ComposedVM) eDynamicGet(OptimisationplanPackage.SCALE_IN__SCALED_VM,
				OptimisationplanPackage.Literals.SCALE_IN__SCALED_VM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedVM basicGetScaledVM() {
		return (ComposedVM) eDynamicGet(OptimisationplanPackage.SCALE_IN__SCALED_VM,
				OptimisationplanPackage.Literals.SCALE_IN__SCALED_VM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaledVM(ComposedVM newScaledVM) {
		eDynamicSet(OptimisationplanPackage.SCALE_IN__SCALED_VM, OptimisationplanPackage.Literals.SCALE_IN__SCALED_VM,
				newScaledVM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.SCALE_IN__LOAD_BALANCER_INSTANCE:
			if (resolve)
				return getLoadBalancerInstance();
			return basicGetLoadBalancerInstance();
		case OptimisationplanPackage.SCALE_IN__SCALED_VM:
			if (resolve)
				return getScaledVM();
			return basicGetScaledVM();
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
		case OptimisationplanPackage.SCALE_IN__LOAD_BALANCER_INSTANCE:
			setLoadBalancerInstance((ComposedVM) newValue);
			return;
		case OptimisationplanPackage.SCALE_IN__SCALED_VM:
			setScaledVM((ComposedVM) newValue);
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
		case OptimisationplanPackage.SCALE_IN__LOAD_BALANCER_INSTANCE:
			setLoadBalancerInstance((ComposedVM) null);
			return;
		case OptimisationplanPackage.SCALE_IN__SCALED_VM:
			setScaledVM((ComposedVM) null);
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
		case OptimisationplanPackage.SCALE_IN__LOAD_BALANCER_INSTANCE:
			return basicGetLoadBalancerInstance() != null;
		case OptimisationplanPackage.SCALE_IN__SCALED_VM:
			return basicGetScaledVM() != null;
		}
		return super.eIsSet(featureID);
	}

} //ScaleInImpl
