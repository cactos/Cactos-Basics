package eu.cactosfp7.identifier.edit;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;

public class FixedCDOItemProviderAdapter extends CDOItemProviderAdapter {

    public FixedCDOItemProviderAdapter(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }
    
    @Override
    public Object getParent(Object object) {
        Object parent = super.getParent(object);
        if (parent == null && object instanceof EObject) {
            EObject container = ((EObject) object).eContainer();
            parent = container == null ? ((EObject) object).eResource() : container;
        }
        return parent;
    }

}
