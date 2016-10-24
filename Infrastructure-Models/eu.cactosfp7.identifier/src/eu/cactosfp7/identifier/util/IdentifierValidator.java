/**
 */
package eu.cactosfp7.identifier.util;

import eu.cactosfp7.identifier.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.cactosfp7.identifier.IdentifierPackage
 * @generated
 */
public class IdentifierValidator extends EObjectValidator {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final IdentifierValidator INSTANCE = new IdentifierValidator();

	/**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
	public static final String DIAGNOSTIC_SOURCE = "eu.cactosfp7.identifier";

	/**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Has To Be Unique' of 'Identifier'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final int IDENTIFIER__ID_HAS_TO_BE_UNIQUE = 1;

	/**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IdentifierValidator() {
        super();
    }

	/**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EPackage getEPackage() {
      return IdentifierPackage.eINSTANCE;
    }

	/**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case IdentifierPackage.IDENTIFIER:
                return validateIdentifier((Identifier)value, diagnostics, context);
            default:
                return true;
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment((EObject)identifier, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)identifier, diagnostics, context);
        if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(identifier, diagnostics, context);
        return result;
    }

	/**
     * Validates the idHasToBeUnique constraint of '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateIdentifier_idHasToBeUnique(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return identifier.idHasToBeUnique(diagnostics, context);
    }

	/**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //IdentifierValidator
