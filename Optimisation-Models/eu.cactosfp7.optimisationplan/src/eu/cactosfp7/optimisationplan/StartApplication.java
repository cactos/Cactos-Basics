/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.StartApplication#getApplicationTemplate <em>Application Template</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStartApplication()
 * @model
 * @generated
 */
public interface StartApplication extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Application Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Template</em>' reference.
	 * @see #setApplicationTemplate(ApplicationTemplate)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStartApplication_ApplicationTemplate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ApplicationTemplate getApplicationTemplate();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.StartApplication#getApplicationTemplate <em>Application Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Template</em>' reference.
	 * @see #getApplicationTemplate()
	 * @generated
	 */
	void setApplicationTemplate(ApplicationTemplate value);

} // StartApplication
