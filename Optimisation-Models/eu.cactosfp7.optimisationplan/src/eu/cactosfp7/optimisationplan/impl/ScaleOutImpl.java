/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVM;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.ScaleOut;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ScaleOutImpl#getLoadBalancerInstance <em>Load Balancer Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ScaleOutImpl#getScalingConnector <em>Scaling Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaleOutImpl extends OptimisationActionStepImpl implements ScaleOut {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaleOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.SCALE_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedVM getLoadBalancerInstance() {
		return (ComposedVM) eDynamicGet(OptimisationplanPackage.SCALE_OUT__LOAD_BALANCER_INSTANCE,
				OptimisationplanPackage.Literals.SCALE_OUT__LOAD_BALANCER_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedVM basicGetLoadBalancerInstance() {
		return (ComposedVM) eDynamicGet(OptimisationplanPackage.SCALE_OUT__LOAD_BALANCER_INSTANCE,
				OptimisationplanPackage.Literals.SCALE_OUT__LOAD_BALANCER_INSTANCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalancerInstance(ComposedVM newLoadBalancerInstance) {
		eDynamicSet(OptimisationplanPackage.SCALE_OUT__LOAD_BALANCER_INSTANCE,
				OptimisationplanPackage.Literals.SCALE_OUT__LOAD_BALANCER_INSTANCE, newLoadBalancerInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalableVMImageConnector getScalingConnector() {
		return (ScalableVMImageConnector) eDynamicGet(OptimisationplanPackage.SCALE_OUT__SCALING_CONNECTOR,
				OptimisationplanPackage.Literals.SCALE_OUT__SCALING_CONNECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalableVMImageConnector basicGetScalingConnector() {
		return (ScalableVMImageConnector) eDynamicGet(OptimisationplanPackage.SCALE_OUT__SCALING_CONNECTOR,
				OptimisationplanPackage.Literals.SCALE_OUT__SCALING_CONNECTOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingConnector(ScalableVMImageConnector newScalingConnector) {
		eDynamicSet(OptimisationplanPackage.SCALE_OUT__SCALING_CONNECTOR,
				OptimisationplanPackage.Literals.SCALE_OUT__SCALING_CONNECTOR, newScalingConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.SCALE_OUT__LOAD_BALANCER_INSTANCE:
			if (resolve)
				return getLoadBalancerInstance();
			return basicGetLoadBalancerInstance();
		case OptimisationplanPackage.SCALE_OUT__SCALING_CONNECTOR:
			if (resolve)
				return getScalingConnector();
			return basicGetScalingConnector();
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
		case OptimisationplanPackage.SCALE_OUT__LOAD_BALANCER_INSTANCE:
			setLoadBalancerInstance((ComposedVM) newValue);
			return;
		case OptimisationplanPackage.SCALE_OUT__SCALING_CONNECTOR:
			setScalingConnector((ScalableVMImageConnector) newValue);
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
		case OptimisationplanPackage.SCALE_OUT__LOAD_BALANCER_INSTANCE:
			setLoadBalancerInstance((ComposedVM) null);
			return;
		case OptimisationplanPackage.SCALE_OUT__SCALING_CONNECTOR:
			setScalingConnector((ScalableVMImageConnector) null);
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
		case OptimisationplanPackage.SCALE_OUT__LOAD_BALANCER_INSTANCE:
			return basicGetLoadBalancerInstance() != null;
		case OptimisationplanPackage.SCALE_OUT__SCALING_CONNECTOR:
			return basicGetScalingConnector() != null;
		}
		return super.eIsSet(featureID);
	}

} //ScaleOutImpl
