/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;

import javax.measure.quantity.Dimensionless;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getAffectedVm <em>Affected Vm</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getResourceShare <em>Resource Share</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getControlledHypervisor <em>Controlled Hypervisor</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getResourceControlAction()
 * @model
 * @generated
 */
public interface ResourceControlAction extends OptimisationActionStep {
	/**
	 * Returns the value of the '<em><b>Affected Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Vm</em>' reference.
	 * @see #setAffectedVm(VirtualMachine)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getResourceControlAction_AffectedVm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualMachine getAffectedVm();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getAffectedVm <em>Affected Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Vm</em>' reference.
	 * @see #getAffectedVm()
	 * @generated
	 */
	void setAffectedVm(VirtualMachine value);

	/**
	 * Returns the value of the '<em><b>Resource Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Share</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Share</em>' attribute.
	 * @see #setResourceShare(Amount)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getResourceControlAction_ResourceShare()
	 * @model dataType="eu.cactosfp7.infrastructuremodels.physicaldc.util.Amount<eu.cactosfp7.infrastructuremodels.physicaldc.util.Dimensionless>" required="true" ordered="false"
	 * @generated
	 */
	Amount<Dimensionless> getResourceShare();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getResourceShare <em>Resource Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Share</em>' attribute.
	 * @see #getResourceShare()
	 * @generated
	 */
	void setResourceShare(Amount<Dimensionless> value);

	/**
	 * Returns the value of the '<em><b>Controlled Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled Hypervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Hypervisor</em>' reference.
	 * @see #setControlledHypervisor(Hypervisor)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getResourceControlAction_ControlledHypervisor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Hypervisor getControlledHypervisor();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.ResourceControlAction#getControlledHypervisor <em>Controlled Hypervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled Hypervisor</em>' reference.
	 * @see #getControlledHypervisor()
	 * @generated
	 */
	void setControlledHypervisor(Hypervisor value);

} // ResourceControlAction
