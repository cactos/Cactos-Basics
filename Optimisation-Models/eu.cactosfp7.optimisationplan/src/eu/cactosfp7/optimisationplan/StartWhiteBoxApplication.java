/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxUserBehaviourTemplate;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start White Box Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.StartWhiteBoxApplication#getWhiteBoxUserBehaviourTemplate <em>White Box User Behaviour Template</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStartWhiteBoxApplication()
 * @model
 * @generated
 */
public interface StartWhiteBoxApplication extends StartApplication {
	/**
	 * Returns the value of the '<em><b>White Box User Behaviour Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Box User Behaviour Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Box User Behaviour Template</em>' containment reference.
	 * @see #setWhiteBoxUserBehaviourTemplate(WhiteBoxUserBehaviourTemplate)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getStartWhiteBoxApplication_WhiteBoxUserBehaviourTemplate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	WhiteBoxUserBehaviourTemplate getWhiteBoxUserBehaviourTemplate();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.StartWhiteBoxApplication#getWhiteBoxUserBehaviourTemplate <em>White Box User Behaviour Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Box User Behaviour Template</em>' containment reference.
	 * @see #getWhiteBoxUserBehaviourTemplate()
	 * @generated
	 */
	void setWhiteBoxUserBehaviourTemplate(WhiteBoxUserBehaviourTemplate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='applicationTemplate.oclIsTypeOf(logicaldc::application::WhiteBoxApplicationTemplate)\r\n'"
	 * @generated
	 */
	boolean ApplicationTemplateMustBeWhitBoxApplicationTemplate(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // StartWhiteBoxApplication
