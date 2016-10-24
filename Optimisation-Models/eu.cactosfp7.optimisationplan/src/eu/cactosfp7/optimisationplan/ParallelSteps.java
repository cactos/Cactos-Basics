/**
 */
package eu.cactosfp7.optimisationplan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.ParallelSteps#getOptimisationSteps <em>Optimisation Steps</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getParallelSteps()
 * @model
 * @generated
 */
public interface ParallelSteps extends OptimisationStep {
	/**
	 * Returns the value of the '<em><b>Optimisation Steps</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.optimisationplan.OptimisationStep}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getParallelSteps <em>Parallel Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimisation Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Steps</em>' containment reference list.
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getParallelSteps_OptimisationSteps()
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getParallelSteps
	 * @model opposite="parallelSteps" containment="true" ordered="false"
	 * @generated
	 */
	EList<OptimisationStep> getOptimisationSteps();

} // ParallelSteps
