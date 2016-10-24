/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVM;
import eu.cactosfp7.infrastructuremodels.logicaldc.application.ScalableVMImageConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.ScaleOut#getLoadBalancerInstance <em>Load Balancer Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.ScaleOut#getScalingConnector <em>Scaling Connector</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getScaleOut()
 * @model
 * @generated
 */
public interface ScaleOut extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Load Balancer Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balancer Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancer Instance</em>' reference.
	 * @see #setLoadBalancerInstance(ComposedVM)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getScaleOut_LoadBalancerInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComposedVM getLoadBalancerInstance();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ScaleOut#getLoadBalancerInstance <em>Load Balancer Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Instance</em>' reference.
	 * @see #getLoadBalancerInstance()
	 * @generated
	 */
	void setLoadBalancerInstance(ComposedVM value);

	/**
	 * Returns the value of the '<em><b>Scaling Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Connector</em>' reference.
	 * @see #setScalingConnector(ScalableVMImageConnector)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getScaleOut_ScalingConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ScalableVMImageConnector getScalingConnector();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ScaleOut#getScalingConnector <em>Scaling Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Connector</em>' reference.
	 * @see #getScalingConnector()
	 * @generated
	 */
	void setScalingConnector(ScalableVMImageConnector value);

} // ScaleOut
