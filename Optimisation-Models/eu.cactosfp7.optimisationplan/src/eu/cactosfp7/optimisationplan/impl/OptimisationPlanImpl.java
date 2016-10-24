/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.identifier.impl.IdentifierImpl;
import eu.cactosfp7.optimisationplan.ExecutionStatus;
import eu.cactosfp7.optimisationplan.OptimisationPlan;
import eu.cactosfp7.optimisationplan.OptimisationPlanRepository;
import eu.cactosfp7.optimisationplan.OptimisationStep;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimisation Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl#getExecutionStatus <em>Execution Status</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl#getExecutionStarted <em>Execution Started</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl#getExecutionStopped <em>Execution Stopped</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationPlanImpl#getOptimisationStep <em>Optimisation Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimisationPlanImpl extends IdentifierImpl implements OptimisationPlan {
	/**
	 * The default value of the '{@link #getExecutionStatus() <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionStatus EXECUTION_STATUS_EDEFAULT = ExecutionStatus.READY;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExecutionStarted() <em>Execution Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStarted()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXECUTION_STARTED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExecutionStopped() <em>Execution Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStopped()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXECUTION_STOPPED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimisationPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.OPTIMISATION_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStatus getExecutionStatus() {
		return (ExecutionStatus) eDynamicGet(OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STATUS,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStatus(ExecutionStatus newExecutionStatus) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STATUS,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STATUS, newExecutionStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return (Date) eDynamicGet(OptimisationplanPackage.OPTIMISATION_PLAN__CREATION_DATE,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_PLAN__CREATION_DATE,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExecutionStarted() {
		return (Date) eDynamicGet(OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STARTED,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STARTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStarted(Date newExecutionStarted) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STARTED,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STARTED, newExecutionStarted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExecutionStopped() {
		return (Date) eDynamicGet(OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STOPPED,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STOPPED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStopped(Date newExecutionStopped) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STOPPED,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STOPPED, newExecutionStopped);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationPlanRepository getRepository() {
		return (OptimisationPlanRepository) eDynamicGet(OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(OptimisationPlanRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRepository,
				OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(OptimisationPlanRepository newRepository) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__REPOSITORY, newRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationStep getOptimisationStep() {
		return (OptimisationStep) eDynamicGet(OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimisationStep(OptimisationStep newOptimisationStep, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newOptimisationStep,
				OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimisationStep(OptimisationStep newOptimisationStep) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP,
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP, newOptimisationStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRepository((OptimisationPlanRepository) otherEnd, msgs);
		case OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP:
			OptimisationStep optimisationStep = getOptimisationStep();
			if (optimisationStep != null)
				msgs = ((InternalEObject) optimisationStep).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP, null,
						msgs);
			return basicSetOptimisationStep((OptimisationStep) otherEnd, msgs);
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
		case OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY:
			return basicSetRepository(null, msgs);
		case OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP:
			return basicSetOptimisationStep(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY:
			return eInternalContainer().eInverseRemove(this,
					OptimisationplanPackage.OPTIMISATION_PLAN_REPOSITORY__OPTIMISATION_PLANS,
					OptimisationPlanRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STATUS:
			return getExecutionStatus();
		case OptimisationplanPackage.OPTIMISATION_PLAN__CREATION_DATE:
			return getCreationDate();
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STARTED:
			return getExecutionStarted();
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STOPPED:
			return getExecutionStopped();
		case OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY:
			return getRepository();
		case OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP:
			return getOptimisationStep();
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
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STATUS:
			setExecutionStatus((ExecutionStatus) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__CREATION_DATE:
			setCreationDate((Date) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STARTED:
			setExecutionStarted((Date) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STOPPED:
			setExecutionStopped((Date) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY:
			setRepository((OptimisationPlanRepository) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP:
			setOptimisationStep((OptimisationStep) newValue);
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
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STATUS:
			setExecutionStatus(EXECUTION_STATUS_EDEFAULT);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STARTED:
			setExecutionStarted(EXECUTION_STARTED_EDEFAULT);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STOPPED:
			setExecutionStopped(EXECUTION_STOPPED_EDEFAULT);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY:
			setRepository((OptimisationPlanRepository) null);
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP:
			setOptimisationStep((OptimisationStep) null);
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
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STATUS:
			return getExecutionStatus() != EXECUTION_STATUS_EDEFAULT;
		case OptimisationplanPackage.OPTIMISATION_PLAN__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null
					: !CREATION_DATE_EDEFAULT.equals(getCreationDate());
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STARTED:
			return EXECUTION_STARTED_EDEFAULT == null ? getExecutionStarted() != null
					: !EXECUTION_STARTED_EDEFAULT.equals(getExecutionStarted());
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STOPPED:
			return EXECUTION_STOPPED_EDEFAULT == null ? getExecutionStopped() != null
					: !EXECUTION_STOPPED_EDEFAULT.equals(getExecutionStopped());
		case OptimisationplanPackage.OPTIMISATION_PLAN__REPOSITORY:
			return getRepository() != null;
		case OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP:
			return getOptimisationStep() != null;
		}
		return super.eIsSet(featureID);
	}

} //OptimisationPlanImpl
