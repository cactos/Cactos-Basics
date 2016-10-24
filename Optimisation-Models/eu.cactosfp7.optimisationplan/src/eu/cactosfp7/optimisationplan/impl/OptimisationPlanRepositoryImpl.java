/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.optimisationplan.OptimisationPlan;
import eu.cactosfp7.optimisationplan.OptimisationPlanRepository;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimisation Plan Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanRepositoryImpl#getOptimisationPlans <em>Optimisation Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimisationPlanRepositoryImpl extends CDOObjectImpl implements OptimisationPlanRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimisationPlanRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.OPTIMISATION_PLAN_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OptimisationPlan> getOptimisationPlans() {
		return (EList<OptimisationPlan>) eDynamicGet(
				OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptimisationPlans()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS:
			return ((InternalEList<?>) getOptimisationPlans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS:
			return getOptimisationPlans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS:
			getOptimisationPlans().clear();
			getOptimisationPlans().addAll((Collection<? extends OptimisationPlan>) newValue);
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
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS:
			getOptimisationPlans().clear();
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
		case OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS:
			return !getOptimisationPlans().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OptimisationPlanRepositoryImpl
