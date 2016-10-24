/**
 */
package eu.cactosfp7.optimisationplan;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimisation Plan Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.OptimisationPlanRepository#getOptimisationPlans <em>Optimisation Plans</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlanRepository()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OptimisationPlanRepository extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Optimisation Plans</b></em>' containment reference list.
	 * The list contents are of type {@link eu.cactosfp7.optimisationplan.OptimisationPlan}.
	 * It is bidirectional and its opposite is '{@link eu.cactosfp7.optimisationplan.OptimisationPlan#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimisation Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimisation Plans</em>' containment reference list.
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getOptimisationPlanRepository_OptimisationPlans()
	 * @see eu.cactosfp7.optimisationplan.OptimisationPlan#getRepository
	 * @model opposite="repository" containment="true" ordered="false"
	 * @generated
	 */
	EList<OptimisationPlan> getOptimisationPlans();

} // OptimisationPlanRepository
