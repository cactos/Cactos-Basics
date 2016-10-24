/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.identifier.impl.IdentifierImpl;
import eu.cactosfp7.optimisationplan.ExecutionStatus;
import eu.cactosfp7.optimisationplan.OptimisationPlan;
import eu.cactosfp7.optimisationplan.OptimisationStep;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.ParallelSteps;
import eu.cactosfp7.optimisationplan.SequentialSteps;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimisation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl#getSequentialSteps <em>Sequential Steps</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl#getParallelSteps <em>Parallel Steps</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl#getOptimisationPlan <em>Optimisation Plan</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl#getExecutionStatus <em>Execution Status</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl#getExecutionStarted <em>Execution Started</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.OptimisationStepImpl#getExecutionStopped <em>Execution Stopped</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptimisationStepImpl extends IdentifierImpl implements OptimisationStep {
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
	protected OptimisationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.OPTIMISATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialSteps getSequentialSteps() {
		return (SequentialSteps) eDynamicGet(OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__SEQUENTIAL_STEPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequentialSteps(SequentialSteps newSequentialSteps, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSequentialSteps,
				OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequentialSteps(SequentialSteps newSequentialSteps) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__SEQUENTIAL_STEPS, newSequentialSteps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelSteps getParallelSteps() {
		return (ParallelSteps) eDynamicGet(OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__PARALLEL_STEPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParallelSteps(ParallelSteps newParallelSteps, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParallelSteps,
				OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelSteps(ParallelSteps newParallelSteps) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__PARALLEL_STEPS, newParallelSteps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationPlan getOptimisationPlan() {
		return (OptimisationPlan) eDynamicGet(OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__OPTIMISATION_PLAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimisationPlan(OptimisationPlan newOptimisationPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOptimisationPlan,
				OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimisationPlan(OptimisationPlan newOptimisationPlan) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__OPTIMISATION_PLAN, newOptimisationPlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStatus getExecutionStatus() {
		return (ExecutionStatus) eDynamicGet(OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STATUS,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__EXECUTION_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStatus(ExecutionStatus newExecutionStatus) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STATUS,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__EXECUTION_STATUS, newExecutionStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExecutionStarted() {
		return (Date) eDynamicGet(OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STARTED,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__EXECUTION_STARTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStarted(Date newExecutionStarted) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STARTED,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__EXECUTION_STARTED, newExecutionStarted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExecutionStopped() {
		return (Date) eDynamicGet(OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STOPPED,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__EXECUTION_STOPPED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStopped(Date newExecutionStopped) {
		eDynamicSet(OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STOPPED,
				OptimisationplanPackage.Literals.OPTIMISATION_STEP__EXECUTION_STOPPED, newExecutionStopped);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSequentialSteps((SequentialSteps) otherEnd, msgs);
		case OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParallelSteps((ParallelSteps) otherEnd, msgs);
		case OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOptimisationPlan((OptimisationPlan) otherEnd, msgs);
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
		case OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS:
			return basicSetSequentialSteps(null, msgs);
		case OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS:
			return basicSetParallelSteps(null, msgs);
		case OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN:
			return basicSetOptimisationPlan(null, msgs);
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
		case OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS:
			return eInternalContainer().eInverseRemove(this,
					OptimisationplanPackage.SEQUENTIAL_STEPS__OPTIMISATION_STEPS, SequentialSteps.class, msgs);
		case OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS:
			return eInternalContainer().eInverseRemove(this, OptimisationplanPackage.PARALLEL_STEPS__OPTIMISATION_STEPS,
					ParallelSteps.class, msgs);
		case OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN:
			return eInternalContainer().eInverseRemove(this,
					OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP, OptimisationPlan.class, msgs);
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
		case OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS:
			return getSequentialSteps();
		case OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS:
			return getParallelSteps();
		case OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN:
			return getOptimisationPlan();
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STATUS:
			return getExecutionStatus();
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STARTED:
			return getExecutionStarted();
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STOPPED:
			return getExecutionStopped();
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
		case OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS:
			setSequentialSteps((SequentialSteps) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS:
			setParallelSteps((ParallelSteps) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN:
			setOptimisationPlan((OptimisationPlan) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STATUS:
			setExecutionStatus((ExecutionStatus) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STARTED:
			setExecutionStarted((Date) newValue);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STOPPED:
			setExecutionStopped((Date) newValue);
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
		case OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS:
			setSequentialSteps((SequentialSteps) null);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS:
			setParallelSteps((ParallelSteps) null);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN:
			setOptimisationPlan((OptimisationPlan) null);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STATUS:
			setExecutionStatus(EXECUTION_STATUS_EDEFAULT);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STARTED:
			setExecutionStarted(EXECUTION_STARTED_EDEFAULT);
			return;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STOPPED:
			setExecutionStopped(EXECUTION_STOPPED_EDEFAULT);
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
		case OptimisationplanPackage.OPTIMISATION_STEP__SEQUENTIAL_STEPS:
			return getSequentialSteps() != null;
		case OptimisationplanPackage.OPTIMISATION_STEP__PARALLEL_STEPS:
			return getParallelSteps() != null;
		case OptimisationplanPackage.OPTIMISATION_STEP__OPTIMISATION_PLAN:
			return getOptimisationPlan() != null;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STATUS:
			return getExecutionStatus() != EXECUTION_STATUS_EDEFAULT;
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STARTED:
			return EXECUTION_STARTED_EDEFAULT == null ? getExecutionStarted() != null
					: !EXECUTION_STARTED_EDEFAULT.equals(getExecutionStarted());
		case OptimisationplanPackage.OPTIMISATION_STEP__EXECUTION_STOPPED:
			return EXECUTION_STOPPED_EDEFAULT == null ? getExecutionStopped() != null
					: !EXECUTION_STOPPED_EDEFAULT.equals(getExecutionStopped());
		}
		return super.eIsSet(featureID);
	}

} //OptimisationStepImpl
