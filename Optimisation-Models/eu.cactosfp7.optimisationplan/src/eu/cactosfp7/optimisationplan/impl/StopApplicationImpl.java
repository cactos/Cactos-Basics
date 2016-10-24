/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.ApplicationInstance;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.StopApplication;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.StopApplicationImpl#getApplicationInstance <em>Application Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopApplicationImpl extends OptimisationActionStepImpl implements StopApplication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.STOP_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInstance getApplicationInstance() {
		return (ApplicationInstance) eDynamicGet(OptimisationplanPackage.STOP_APPLICATION__APPLICATION_INSTANCE,
				OptimisationplanPackage.Literals.STOP_APPLICATION__APPLICATION_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInstance basicGetApplicationInstance() {
		return (ApplicationInstance) eDynamicGet(OptimisationplanPackage.STOP_APPLICATION__APPLICATION_INSTANCE,
				OptimisationplanPackage.Literals.STOP_APPLICATION__APPLICATION_INSTANCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationInstance(ApplicationInstance newApplicationInstance) {
		eDynamicSet(OptimisationplanPackage.STOP_APPLICATION__APPLICATION_INSTANCE,
				OptimisationplanPackage.Literals.STOP_APPLICATION__APPLICATION_INSTANCE, newApplicationInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.STOP_APPLICATION__APPLICATION_INSTANCE:
			if (resolve)
				return getApplicationInstance();
			return basicGetApplicationInstance();
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
		case OptimisationplanPackage.STOP_APPLICATION__APPLICATION_INSTANCE:
			setApplicationInstance((ApplicationInstance) newValue);
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
		case OptimisationplanPackage.STOP_APPLICATION__APPLICATION_INSTANCE:
			setApplicationInstance((ApplicationInstance) null);
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
		case OptimisationplanPackage.STOP_APPLICATION__APPLICATION_INSTANCE:
			return basicGetApplicationInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //StopApplicationImpl
