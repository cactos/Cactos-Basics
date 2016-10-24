/**
 */
package eu.cactosfp7.optimisationplan.impl;

import eu.cactosfp7.infrastructuremodels.logicaldc.application.WhiteBoxUserBehaviourTemplate;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.StartWhiteBoxApplication;

import eu.cactosfp7.optimisationplan.util.OptimisationplanValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start White Box Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.cactosfp7.optimisationplan.impl.StartWhiteBoxApplicationImpl#getWhiteBoxUserBehaviourTemplate <em>White Box User Behaviour Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartWhiteBoxApplicationImpl extends StartApplicationImpl implements StartWhiteBoxApplication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartWhiteBoxApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimisationplanPackage.Literals.START_WHITE_BOX_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteBoxUserBehaviourTemplate getWhiteBoxUserBehaviourTemplate() {
		return (WhiteBoxUserBehaviourTemplate) eDynamicGet(
				OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE,
				OptimisationplanPackage.Literals.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhiteBoxUserBehaviourTemplate(
			WhiteBoxUserBehaviourTemplate newWhiteBoxUserBehaviourTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newWhiteBoxUserBehaviourTemplate,
				OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteBoxUserBehaviourTemplate(WhiteBoxUserBehaviourTemplate newWhiteBoxUserBehaviourTemplate) {
		eDynamicSet(OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE,
				OptimisationplanPackage.Literals.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE,
				newWhiteBoxUserBehaviourTemplate);
	}

	/**
	 * The cached OCL expression body for the '{@link #ApplicationTemplateMustBeWhitBoxApplicationTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Application Template Must Be Whit Box Application Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ApplicationTemplateMustBeWhitBoxApplicationTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "applicationTemplate.oclIsTypeOf(logicaldc::application::WhiteBoxApplicationTemplate)";
	/**
	 * The cached OCL invariant for the '{@link #ApplicationTemplateMustBeWhitBoxApplicationTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Application Template Must Be Whit Box Application Template</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ApplicationTemplateMustBeWhitBoxApplicationTemplate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ApplicationTemplateMustBeWhitBoxApplicationTemplate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(OptimisationplanPackage.Literals.START_WHITE_BOX_APPLICATION);
			try {
				APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(
								APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(this)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(Diagnostic.ERROR, OptimisationplanValidator.DIAGNOSTIC_SOURCE,
								OptimisationplanValidator.START_WHITE_BOX_APPLICATION__APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "ApplicationTemplateMustBeWhitBoxApplicationTemplate",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE:
			return basicSetWhiteBoxUserBehaviourTemplate(null, msgs);
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
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE:
			return getWhiteBoxUserBehaviourTemplate();
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
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE:
			setWhiteBoxUserBehaviourTemplate((WhiteBoxUserBehaviourTemplate) newValue);
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
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE:
			setWhiteBoxUserBehaviourTemplate((WhiteBoxUserBehaviourTemplate) null);
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
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION__WHITE_BOX_USER_BEHAVIOUR_TEMPLATE:
			return getWhiteBoxUserBehaviourTemplate() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case OptimisationplanPackage.START_WHITE_BOX_APPLICATION___APPLICATION_TEMPLATE_MUST_BE_WHIT_BOX_APPLICATION_TEMPLATE__DIAGNOSTICCHAIN_MAP:
			return ApplicationTemplateMustBeWhitBoxApplicationTemplate((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //StartWhiteBoxApplicationImpl
