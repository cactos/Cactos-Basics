/**
 */
package eu.cactosfp7.identifier;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p>
 *     Provides a package for uniquely identifiable elements
 * </p>
 * <!-- end-model-doc -->
 * @see eu.cactosfp7.identifier.IdentifierFactory
 * @model kind="package"
 * @generated
 */
public interface IdentifierPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "identifier";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.cactosfp7.eu/Identifier/1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "identifier";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	IdentifierPackage eINSTANCE = eu.cactosfp7.identifier.impl.IdentifierPackageImpl.init();

	/**
     * The meta object id for the '{@link eu.cactosfp7.identifier.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see eu.cactosfp7.identifier.impl.IdentifierImpl
     * @see eu.cactosfp7.identifier.impl.IdentifierPackageImpl#getIdentifier()
     * @generated
     */
	int IDENTIFIER = 0;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IDENTIFIER__ID = 0;

	/**
     * The number of structural features of the '<em>Identifier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IDENTIFIER_FEATURE_COUNT = 1;

	/**
     * The operation id for the '<em>Id Has To Be Unique</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
     * The number of operations of the '<em>Identifier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IDENTIFIER_OPERATION_COUNT = 1;


	/**
     * Returns the meta object for class '{@link eu.cactosfp7.identifier.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifier</em>'.
     * @see eu.cactosfp7.identifier.Identifier
     * @generated
     */
	EClass getIdentifier();

	/**
     * Returns the meta object for the attribute '{@link eu.cactosfp7.identifier.Identifier#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see eu.cactosfp7.identifier.Identifier#getId()
     * @see #getIdentifier()
     * @generated
     */
	EAttribute getIdentifier_Id();

	/**
     * Returns the meta object for the '{@link eu.cactosfp7.identifier.Identifier#idHasToBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Has To Be Unique</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Id Has To Be Unique</em>' operation.
     * @see eu.cactosfp7.identifier.Identifier#idHasToBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
	EOperation getIdentifier__IdHasToBeUnique__DiagnosticChain_Map();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	IdentifierFactory getIdentifierFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link eu.cactosfp7.identifier.impl.IdentifierImpl <em>Identifier</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see eu.cactosfp7.identifier.impl.IdentifierImpl
         * @see eu.cactosfp7.identifier.impl.IdentifierPackageImpl#getIdentifier()
         * @generated
         */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
         * The meta object literal for the '<em><b>Id Has To Be Unique</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdentifier__IdHasToBeUnique__DiagnosticChain_Map();

	}

} //IdentifierPackage
