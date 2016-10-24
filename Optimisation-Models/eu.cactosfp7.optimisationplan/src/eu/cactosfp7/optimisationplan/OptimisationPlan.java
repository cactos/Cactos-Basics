/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.identifier.Identifier;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimisation Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStatus <em>Execution Status</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStarted <em>Execution Started</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStopped <em>Execution Stopped</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getRepository <em>Repository</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getOptimisationStep <em>Optimisation Step</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlan()
 * @model
 * @generated
 */
public interface OptimisationPlan extends Identifier {
	/**
	 * Returns the value of the '<em><b>Execution Status</b></em>' attribute.
	 * The default value is <code>"READY"</code>.
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
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlan_ExecutionStatus()
	 * @model default="READY" required="true" ordered="false"
	 * @generated
	 */
	ExecutionStatus getExecutionStatus();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStatus <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Status</em>' attribute.
	 * @see eu.cactosfp7.optimisationplan.ExecutionStatus
	 * @see #getExecutionStatus()
	 * @generated
	 */
	void setExecutionStatus(ExecutionStatus value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlan_CreationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

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
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlan_ExecutionStarted()
	 * @model ordered="false"
	 * @generated
	 */
	Date getExecutionStarted();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStarted <em>Execution Started</em>}' attribute.
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
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlan_ExecutionStopped()
	 * @model ordered="false"
	 * @generated
	 */
	Date getExecutionStopped();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getExecutionStopped <em>Execution Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Stopped</em>' attribute.
	 * @see #getExecutionStopped()
	 * @generated
	 */
	void setExecutionStopped(Date value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.OptimisationPlanRepository#getOptimisationPlans <em>Optimisation Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(OptimisationPlanRepository)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlan_Repository()
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlanRepository#getOptimisationPlans
	 * @model opposite="optimisationPlans" transient="false" ordered="false"
	 * @generated
	 */
	OptimisationPlanRepository getRepository();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(OptimisationPlanRepository value);

	/**
	 * Returns the value of the '<em><b>Optimisation Step</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getOptimisationPlan <em>Optimisation Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimisation Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Step</em>' containment reference.
	 * @see #setOptimisationStep(OptimisationStep)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlan_OptimisationStep()
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getOptimisationPlan
	 * @model opposite="optimisationPlan" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OptimisationStep getOptimisationStep();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getOptimisationStep <em>Optimisation Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimisation Step</em>' containment reference.
	 * @see #getOptimisationStep()
	 * @generated
	 */
	void setOptimisationStep(OptimisationStep value);

} // OptimisationPlan
