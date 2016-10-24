/**
 */
package eu.cactosfp7.optimisationplan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.SequentialSteps#getOptimisationSteps <em>Optimisation Steps</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getSequentialSteps()
 * @model
 * @generated
 */
public interface SequentialSteps extends OptimisationStep {
	/**
	 * Returns the value of the '<em><b>Optimisation Steps</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.optimisationplan.OptimisationStep}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.OptimisationStep#getSequentialSteps <em>Sequential Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimisation Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Steps</em>' containment reference list.
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getSequentialSteps_OptimisationSteps()
	 * @see eu.cactosfp7.optimisationplan.OptimisationStep#getSequentialSteps
	 * @model opposite="sequentialSteps" containment="true"
	 * @generated
	 */
	EList<OptimisationStep> getOptimisationSteps();

} // SequentialSteps
