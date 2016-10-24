/**
 */
package eu.cactosfp7.optimisationplan.provider;

import eu.cactosfp7.identifier.provider.IdentifierItemProvider;
import eu.cactosfp7.optimisationplan.OptimisationPlan;
import eu.cactosfp7.optimisationplan.OptimisationplanFactory;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.optimisationplan.OptimisationPlan} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimisationPlanItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationPlanItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addExecutionStatusPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addExecutionStartedPropertyDescriptor(object);
			addExecutionStoppedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Execution Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OptimisationPlan_executionStatus_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OptimisationPlan_executionStatus_feature",
								"_UI_OptimisationPlan_type"),
						OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STATUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OptimisationPlan_creationDate_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OptimisationPlan_creationDate_feature",
						"_UI_OptimisationPlan_type"),
				OptimisationplanPackage.Literals.OPTIMISATION_PLAN__CREATION_DATE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Execution Started feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionStartedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OptimisationPlan_executionStarted_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OptimisationPlan_executionStarted_feature",
								"_UI_OptimisationPlan_type"),
						OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STARTED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Execution Stopped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionStoppedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OptimisationPlan_executionStopped_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OptimisationPlan_executionStopped_feature",
								"_UI_OptimisationPlan_type"),
						OptimisationplanPackage.Literals.OPTIMISATION_PLAN__EXECUTION_STOPPED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OptimisationPlan.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OptimisationPlan"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OptimisationPlan) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_OptimisationPlan_type")
				: getString("_UI_OptimisationPlan_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OptimisationPlan.class)) {
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STATUS:
		case OptimisationplanPackage.OPTIMISATION_PLAN__CREATION_DATE:
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STARTED:
		case OptimisationplanPackage.OPTIMISATION_PLAN__EXECUTION_STOPPED:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case OptimisationplanPackage.OPTIMISATION_PLAN__OPTIMISATION_STEP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createSequentialSteps()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createParallelSteps()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createVmPlacementAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createVmMigrationAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createStopVmAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createLogicalMemoryScalingAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createLogicalStorageScalingAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createPhysicalFrequencyScalingAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createStartVmAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createSuspendVmAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createManagePhysicalNodeAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createVirtualCoresScalingAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createStartApplication()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createStopApplication()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createScaleOut()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createScaleIn()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createStartWhiteBoxApplication()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createConnectVmAction()));

		newChildDescriptors
				.add(createChildParameter(OptimisationplanPackage.Literals.OPTIMISATION_PLAN__OPTIMISATION_STEP,
						OptimisationplanFactory.eINSTANCE.createResourceControlAction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OptimisationplanEditPlugin.INSTANCE;
	}

}
