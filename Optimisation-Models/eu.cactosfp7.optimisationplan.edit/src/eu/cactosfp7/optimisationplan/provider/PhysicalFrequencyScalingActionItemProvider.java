/**
 */
package eu.cactosfp7.optimisationplan.provider;

import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.optimisationplan.PhysicalFrequencyScalingAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalFrequencyScalingActionItemProvider extends VerticalScalingActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFrequencyScalingActionItemProvider(AdapterFactory adapterFactory) {
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

			addScaledPhysicalProcessingUnitPropertyDescriptor(object);
			addProposedFrequencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scaled Physical Processing Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaledPhysicalProcessingUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PhysicalFrequencyScalingAction_scaledPhysicalProcessingUnit_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PhysicalFrequencyScalingAction_scaledPhysicalProcessingUnit_feature",
						"_UI_PhysicalFrequencyScalingAction_type"),
				OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION__SCALED_PHYSICAL_PROCESSING_UNIT,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Proposed Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProposedFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PhysicalFrequencyScalingAction_proposedFrequency_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_PhysicalFrequencyScalingAction_proposedFrequency_feature",
								"_UI_PhysicalFrequencyScalingAction_type"),
						OptimisationplanPackage.Literals.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY, true,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PhysicalFrequencyScalingAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalFrequencyScalingAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalFrequencyScalingAction) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_PhysicalFrequencyScalingAction_type")
				: getString("_UI_PhysicalFrequencyScalingAction_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalFrequencyScalingAction.class)) {
		case OptimisationplanPackage.PHYSICAL_FREQUENCY_SCALING_ACTION__PROPOSED_FREQUENCY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
