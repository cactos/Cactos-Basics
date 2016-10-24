/**
 * 
 */
package eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.util;

import java.util.logging.Logger;

import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureType;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureTypeRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitecturetypeFactory;

/**Provides pre-defined architecture types and utility function to handle them.
 * 
 * @author hgroenda
 *
 */
public class ArchitectureTypeUtil {
	/** Singleton of this class. */
	public static final ArchitectureTypeUtil INSTANCE = new ArchitectureTypeUtil();
	/** Logger of this class. */
	public static final Logger logger = Logger.getLogger(ArchitectureType.class.getCanonicalName());
	
	/** Factory for creating the default types. */
	private final ArchitecturetypeFactory af = ArchitecturetypeFactory.INSTANCE;
	
	/** UUID of the pre-defined type for x86 generic processors. */
	public static final String ARCHITECTURE_TYPE_x86_GENERIC_UUID = "_dCJp4CVyEeWoe8Y6mDPGVA";  
	/** UUID of the pre-defined type for x86 Intel-based processors. */
	public static final String ARCHITECTURE_TYPE_x86_INTEL_UUID = "_dCJp4CVyEeWoe8Y6mDPGVB";  
	/** UUID of the pre-defined type for x86 AMD-based processors. */
	public static final String ARCHITECTURE_TYPE_x86_AMD_UUID = "_dCJp4CVyEeWoe8Y6mDPGVC";  
	
	public ArchitectureTypeUtil() {
	}
	
	/**Retrieves the given architecture type (based on its UUID) from the repository.
	 * Adds the provided pre-defined type to the repository if it was not contained there before.
	 * @param repo The repository.
	 * @param uuid The architecture type.
	 * @return The architecture type. <code>null</code> if the provided UUID does not match a pre-defined type.
	 */
	public ArchitectureType createOrGet(ArchitectureTypeRepository repo, String uuid) {
		for (ArchitectureType existingType : repo.getArchitectureTypes()) {
			if (existingType.getId().equals(uuid)) {
				return existingType;
			}
		}
		ArchitectureType at = createPredefinedType(uuid);
		if (at!= null)
			repo.getArchitectureTypes().add(at);
		return at;
	}
	
	/**Create the pre-defined types including all necessary contained references.
	 * @param uuid The UUID of the pre-defined type.
	 * @return Pre-defined type. <code>null</code> if the provided UUID does not match a predefined type.
	 */
	private ArchitectureType createPredefinedType(String uuid) {
		ArchitectureType at = af.createArchitectureType();
		at.setId(uuid);
		switch (uuid) {
		case ARCHITECTURE_TYPE_x86_GENERIC_UUID:
			at.setName("x86 (generic)");
			break;
		case ARCHITECTURE_TYPE_x86_INTEL_UUID:
			at.setName("x86 (Intel-based)");
			break;
		case ARCHITECTURE_TYPE_x86_AMD_UUID:
			at.setName("x86 (AMD-based)");
			break;
		default:
			return null;
		}
		return at;
	}
}
