/**
 */
package eu.cactosfp7.optimisationplan;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Cores Scaling Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getProposedNumberOfCores <em>Proposed Number Of Cores</em>}</li>
 *   <li>{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getScaledvirtualPu <em>Scaledvirtual Pu</em>}</li>
 * </ul>
 *
 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVirtualCoresScalingAction()
 * @model
 * @generated
 */
public interface VirtualCoresScalingAction extends VerticalScalingAction {
	/**
	 * Returns the value of the '<em><b>Proposed Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Number Of Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Number Of Cores</em>' attribute.
	 * @see #setProposedNumberOfCores(int)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVirtualCoresScalingAction_ProposedNumberOfCores()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getProposedNumberOfCores();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getProposedNumberOfCores <em>Proposed Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Number Of Cores</em>' attribute.
	 * @see #getProposedNumberOfCores()
	 * @generated
	 */
	void setProposedNumberOfCores(int value);

	/**
	 * Returns the value of the '<em><b>Scaledvirtual Pu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaledvirtual Pu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaledvirtual Pu</em>' reference.
	 * @see #setScaledvirtualPu(VirtualProcessingUnit)
	 * @see eu.cactosfp7.optimisationplan.OptimisationplanPackage#getVirtualCoresScalingAction_ScaledvirtualPu()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualProcessingUnit getScaledvirtualPu();

	/**
	 * Sets the value of the '{@link eu.cactosfp7.optimisationplan.VirtualCoresScalingAction#getScaledvirtualPu <em>Scaledvirtual Pu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaledvirtual Pu</em>' reference.
	 * @see #getScaledvirtualPu()
	 * @generated
	 */
	void setScaledvirtualPu(VirtualProcessingUnit value);

} // VirtualCoresScalingAction
