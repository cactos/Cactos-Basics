/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.identifier.Identifier;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimisation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationStep#getSequentialSteps <em>Sequential Steps</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationStep#getParallelSteps <em>Parallel Steps</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationStep#getOptimisationPlan <em>Optimisation Plan</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStatus <em>Execution Status</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStarted <em>Execution Started</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStopped <em>Execution Stopped</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationStep()
 * @model abstract="true"
 * @generated
 */
public interface OptimisationStep extends Identifier {
	/**
	 * Returns the value of the '<em><b>Sequential Steps</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.SequentialSteps#getOptimisationSteps <em>Optimisation Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential Steps</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential Steps</em>' container reference.
	 * @see #setSequentialSteps(SequentialSteps)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationStep_SequentialSteps()
	 * @see eu.cactosfp7.optimisationplan.SequentialSteps#getOptimisationSteps
	 * @model opposite="optimisationSteps" transient="false" ordered="false"
	 * @generated
	 */
	SequentialSteps getSequentialSteps();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getSequentialSteps <em>Sequential Steps</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequential Steps</em>' container reference.
	 * @see #getSequentialSteps()
	 * @generated
	 */
	void setSequentialSteps(SequentialSteps value);

	/**
	 * Returns the value of the '<em><b>Parallel Steps</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.ParallelSteps#getOptimisationSteps <em>Optimisation Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Steps</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Steps</em>' container reference.
	 * @see #setParallelSteps(ParallelSteps)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationStep_ParallelSteps()
	 * @see eu.cactosfp7.optimisationplan.ParallelSteps#getOptimisationSteps
	 * @model opposite="optimisationSteps" transient="false" ordered="false"
	 * @generated
	 */
	ParallelSteps getParallelSteps();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getParallelSteps <em>Parallel Steps</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Steps</em>' container reference.
	 * @see #getParallelSteps()
	 * @generated
	 */
	void setParallelSteps(ParallelSteps value);

	/**
	 * Returns the value of the '<em><b>Optimisation Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getOptimisationStep <em>Optimisation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimisation Plan</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Plan</em>' container reference.
	 * @see #setOptimisationPlan(OptimisationPlan)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationStep_OptimisationPlan()
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getOptimisationStep
	 * @model opposite="optimisationStep" transient="false" ordered="false"
	 * @generated
	 */
	OptimisationPlan getOptimisationPlan();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getOptimisationPlan <em>Optimisation Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimisation Plan</em>' container reference.
	 * @see #getOptimisationPlan()
	 * @generated
	 */
	void setOptimisationPlan(OptimisationPlan value);

	/**
	 * Returns the value of the '<em><b>Execution Status</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.cactosfp7.optimisationplan.ExecutionStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Status</em>' attribute.
	 * @see eu.cactosfp7.optimisationplan.ExecutionStatus
	 * @see #setExecutionStatus(ExecutionStatus)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationStep_ExecutionStatus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionStatus getExecutionStatus();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStatus <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Status</em>' attribute.
	 * @see eu.cactosfp7.optimisationplan.ExecutionStatus
	 * @see #getExecutionStatus()
	 * @generated
	 */
	void setExecutionStatus(ExecutionStatus value);

	/**
	 * Returns the value of the '<em><b>Execution Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Started</em>' attribute.
	 * @see #setExecutionStarted(Date)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationStep_ExecutionStarted()
	 * @model ordered="false"
	 * @generated
	 */
	Date getExecutionStarted();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStarted <em>Execution Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Started</em>' attribute.
	 * @see #getExecutionStarted()
	 * @generated
	 */
	void setExecutionStarted(Date value);

	/**
	 * Returns the value of the '<em><b>Execution Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Stopped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Stopped</em>' attribute.
	 * @see #setExecutionStopped(Date)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationStep_ExecutionStopped()
	 * @model ordered="false"
	 * @generated
	 */
	Date getExecutionStopped();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getExecutionStopped <em>Execution Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Stopped</em>' attribute.
	 * @see #getExecutionStopped()
	 * @generated
	 */
	void setExecutionStopped(Date value);

} // OptimisationStep
