/**
 */
package eu.cactosfp7.identifier;

import java.util.Map;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Inherit from this entity to make an element uniquely identifiable.<br />
 *     Identifiers&nbsp;are&nbsp;not&nbsp;fixed&nbsp;to&nbsp;one&nbsp;realization.<br />
 *     GUIDs&nbsp;are&nbsp;recommend.&nbsp;GUIDs&nbsp;are&nbsp;described&nbsp;in&nbsp;their&nbsp;own&nbsp;model.&nbsp;See&nbsp;GUIDModel&nbsp;(GUID.emx).<br />
 *     Identifier&nbsp;implementations&nbsp;can&nbsp;be&nbsp;found&nbsp;in&nbsp;external&nbsp;projects&nbsp;only.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.identifier.Identifier#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.identifier.IdentifierPackage#getIdentifier()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Identifier extends CDOObject {
	/**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifier attribute, in the default PCM implementation, this field is filled with a randomly generated UUID value
     * <!-- end-model-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see eu.cactosfp7.identifier.IdentifierPackage#getIdentifier_Id()
     * @model id="true" required="true" ordered="false"
     *        extendedMetaData="name='id' namespace='http://sdq.ipd.uka.de/Identifier/1.0'"
     * @generated
     */
	String getId();

	/**
     * Sets the value of the '{@link eu.cactosfp7.identifier.Identifier#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
	void setId(String value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * --self.allInstances()->isUnique(p | p.id)
     * Identifier.allInstances()->isUnique(p: Identifier | p.id)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
	boolean idHasToBeUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Identifier
