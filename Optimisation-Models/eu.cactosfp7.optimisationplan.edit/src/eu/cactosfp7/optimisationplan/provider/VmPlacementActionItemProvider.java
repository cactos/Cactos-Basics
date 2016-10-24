/**
 */
package eu.cactosfp7.optimisationplan.provider;

import eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory;
import eu.cactosfp7.optimisationplan.OptimisationplanPackage;
import eu.cactosfp7.optimisationplan.VmPlacementAction;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.cactosfp7.optimisationplan.VmPlacementAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VmPlacementActionItemProvider extends OptimisationActionStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPlacementActionItemProvider(AdapterFactory adapterFactory) {
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

			addTargetHostPropertyDescriptor(object);
			addVmImagePropertyDescriptor(object);
			addProposedMemoryPropertyDescriptor(object);
			addProposedStoragePropertyDescriptor(object);
			addProposedVirtualCoresPropertyDescriptor(object);
			addUnassignedVirtualMachinePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VmPlacementAction_targetHost_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VmPlacementAction_targetHost_feature",
								"_UI_VmPlacementAction_type"),
						OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__TARGET_HOST, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Vm Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVmImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VmPlacementAction_vmImage_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VmPlacementAction_vmImage_feature",
						"_UI_VmPlacementAction_type"),
				OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__VM_IMAGE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Proposed Memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProposedMemoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VmPlacementAction_proposedMemory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VmPlacementAction_proposedMemory_feature",
								"_UI_VmPlacementAction_type"),
						OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_MEMORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Proposed Storage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProposedStoragePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VmPlacementAction_proposedStorage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VmPlacementAction_proposedStorage_feature",
								"_UI_VmPlacementAction_type"),
						OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_STORAGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Proposed Virtual Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProposedVirtualCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VmPlacementAction_proposedVirtualCores_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VmPlacementAction_proposedVirtualCores_feature", "_UI_VmPlacementAction_type"),
						OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES, true, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Unassigned Virtual Machine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnassignedVirtualMachinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_VmPlacementAction_unassignedVirtualMachine_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_VmPlacementAction_unassignedVirtualMachine_feature", "_UI_VmPlacementAction_type"),
						OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__UNASSIGNED_VIRTUAL_MACHINE, true, false,
						true, null, null, null));
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
			childrenFeatures.add(OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PU_AFFINITY);
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
	 * This returns VmPlacementAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VmPlacementAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VmPlacementAction) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_VmPlacementAction_type")
				: getString("_UI_VmPlacementAction_type") + " " + label;
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

		switch (notification.getFeatureID(VmPlacementAction.class)) {
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_MEMORY:
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_STORAGE:
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PROPOSED_VIRTUAL_CORES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case OptimisationplanPackage.VM_PLACEMENT_ACTION__PU_AFFINITY:
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

		newChildDescriptors.add(createChildParameter(OptimisationplanPackage.Literals.VM_PLACEMENT_ACTION__PU_AFFINITY,
				CoreFactory.INSTANCE.createPuAffinity()));
	}

}
