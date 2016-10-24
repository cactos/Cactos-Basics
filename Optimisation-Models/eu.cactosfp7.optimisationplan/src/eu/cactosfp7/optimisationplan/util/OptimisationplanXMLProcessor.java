/**
 */
package eu.cactosfp7.optimisationplan.util;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimisationplanXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationplanXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		OptimisationplanPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the OptimisationplanResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new OptimisationplanResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new OptimisationplanResourceFactoryImpl());
		}
		return registrations;
	}

} //OptimisationplanXMLProcessor
