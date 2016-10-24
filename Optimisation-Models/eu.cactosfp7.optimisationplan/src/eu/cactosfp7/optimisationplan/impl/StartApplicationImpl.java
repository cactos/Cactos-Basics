/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationTemplate;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.StartApplication;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.StartApplicationImpl#getApplicationTemplate <em>Application Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartApplicationImpl extends OptimisationActionStepImpl implements StartApplication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.START_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTemplate getApplicationTemplate() {
		return (ApplicationTemplate) eDynamicGet(OptimisationplanPackage.START_APPLICATION__APPLICATION_TEMPLATE,
				OptimisationplanPackage.Literals.START_APPLICATION__APPLICATION_TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTemplate basicGetApplicationTemplate() {
		return (ApplicationTemplate) eDynamicGet(OptimisationplanPackage.START_APPLICATION__APPLICATION_TEMPLATE,
				OptimisationplanPackage.Literals.START_APPLICATION__APPLICATION_TEMPLATE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationTemplate(ApplicationTemplate newApplicationTemplate) {
		eDynamicSet(OptimisationplanPackage.START_APPLICATION__APPLICATION_TEMPLATE,
				OptimisationplanPackage.Literals.START_APPLICATION__APPLICATION_TEMPLATE, newApplicationTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.START_APPLICATION__APPLICATION_TEMPLATE:
			if (resolve)
				return getApplicationTemplate();
			return basicGetApplicationTemplate();
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
		case OptimisationplanPackage.START_APPLICATION__APPLICATION_TEMPLATE:
			setApplicationTemplate((ApplicationTemplate) newValue);
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
		case OptimisationplanPackage.START_APPLICATION__APPLICATION_TEMPLATE:
			setApplicationTemplate((ApplicationTemplate) null);
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
		case OptimisationplanPackage.START_APPLICATION__APPLICATION_TEMPLATE:
			return basicGetApplicationTemplate() != null;
		}
		return super.eIsSet(featureID);
	}

} //StartApplicationImpl
