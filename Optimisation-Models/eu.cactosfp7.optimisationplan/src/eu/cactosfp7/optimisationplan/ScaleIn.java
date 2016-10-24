/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ComposedVM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.ScaleIn#getLoadBalancerInstance <em>Load Balancer Instance</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.ScaleIn#getScaledVM <em>Scaled VM</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getScaleIn()
 * @model
 * @generated
 */
public interface ScaleIn extends OptimisationActionStep {
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
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getScaleIn_LoadBalancerInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComposedVM getLoadBalancerInstance();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ScaleIn#getLoadBalancerInstance <em>Load Balancer Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Instance</em>' reference.
	 * @see #getLoadBalancerInstance()
	 * @generated
	 */
	void setLoadBalancerInstance(ComposedVM value);

	/**
	 * Returns the value of the '<em><b>Scaled VM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaled VM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaled VM</em>' reference.
	 * @see #setScaledVM(ComposedVM)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getScaleIn_ScaledVM()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComposedVM getScaledVM();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ScaleIn#getScaledVM <em>Scaled VM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaled VM</em>' reference.
	 * @see #getScaledVM()
	 * @generated
	 */
	void setScaledVM(ComposedVM value);

} // ScaleIn
