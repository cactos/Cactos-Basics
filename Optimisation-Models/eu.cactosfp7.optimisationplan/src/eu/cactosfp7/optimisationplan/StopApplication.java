/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.StopApplication#getApplicationInstance <em>Application Instance</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStopApplication()
 * @model
 * @generated
 */
public interface StopApplication extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Application Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Instance</em>' reference.
	 * @see #setApplicationInstance(ApplicationInstance)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStopApplication_ApplicationInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ApplicationInstance getApplicationInstance();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.StopApplication#getApplicationInstance <em>Application Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Instance</em>' reference.
	 * @see #getApplicationInstance()
	 * @generated
	 */
	void setApplicationInstance(ApplicationInstance value);

} // StopApplication
