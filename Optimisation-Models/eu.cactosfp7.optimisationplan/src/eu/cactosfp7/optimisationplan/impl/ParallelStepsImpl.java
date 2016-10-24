/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.optimisationplan.OptimisationStep;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.ParallelSteps;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.ParallelStepsImpl#getOptimisationSteps <em>Optimisation Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelStepsImpl extends OptimisationStepImpl implements ParallelSteps {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelStepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.PARALLEL_STEPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OptimisationStep> getOptimisationSteps() {
		return (EList<OptimisationStep>) eDynamicGet(OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS,
				OptimisationplanPackage.Literals.PARALLEL_STEPS__OPTIMISATION_STEPS, true, true);
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
		case OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptimisationSteps()).basicAdd(otherEnd,
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
		case OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS:
			return ((InternalEList<?>) getOptimisationSteps()).basicRemove(otherEnd, msgs);
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
		case OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS:
			return getOptimisationSteps();
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
		case OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS:
			getOptimisationSteps().clear();
			getOptimisationSteps().addAll((Collection<? extends OptimisationStep>) newValue);
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
		case OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS:
			getOptimisationSteps().clear();
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
		case OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS:
			return !getOptimisationSteps().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParallelStepsImpl
