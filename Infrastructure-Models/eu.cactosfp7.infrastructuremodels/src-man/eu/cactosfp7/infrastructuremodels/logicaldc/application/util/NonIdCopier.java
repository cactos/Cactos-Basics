package eu.cactosfp7.infrastructuremodels.logicaldc.application.util;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

/**Copier for models that does not copy IDs of elements.
 * @author hgroenda
 *
 */
public class NonIdCopier extends Copier {
	private static final long serialVersionUID = 1L;

    /**
     * Creates an instance.
     */
    public NonIdCopier()
    {
      super();
    }

    /**
     * Creates an instance that resolves proxies or not as specified.
     * @param resolveProxies whether proxies should be resolved while copying.
     */
    public NonIdCopier(boolean resolveProxies)
    {
      super(resolveProxies);
    }

    /**
     * Creates an instance that resolves proxies or not and uses non-copied references or not as specified.
     * @param resolveProxies whether proxies should be resolved while copying.
     * @param useOriginalReferences whether non-copied references should be used while copying.
     */
    public NonIdCopier(boolean resolveProxies, boolean useOriginalReferences)
    {
        super(resolveProxies, useOriginalReferences);
    }
	
	/**
     * Returns a self-contained copy of the eObject along the containment hierarchy.
     * @param eObject the object to copy.
     * @return the copy.
     * @see Copier
     */
	public static <T extends EObject> T nonIdCopy(T eObject)
	{
		NonIdCopier copier = new NonIdCopier();
	    EObject result = copier.copy(eObject);
	    copier.copyReferences();

	    @SuppressWarnings("unchecked")T t = (T)result;
	    return t;
	}

	@Override
	protected void copyAttributeValue(EAttribute eAttribute, EObject eObject, Object value, Setting setting) {
		if (!eAttribute.isID()) {
			super.copyAttributeValue(eAttribute, eObject, value, setting);
		}
	}
}
