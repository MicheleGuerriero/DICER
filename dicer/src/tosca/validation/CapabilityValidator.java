/**
 *
 * $Id$
 */
package tosca.validation;

import org.eclipse.emf.common.util.EList;

import tosca.Attribute;
import tosca.Property;

/**
 * A sample validator interface for {@link tosca.Capability}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CapabilityValidator {
    boolean validate();

    boolean validateType(String value);
    boolean validateDescription(String value);
    boolean validateProperties(EList<Property> value);
    boolean validateAttributes(EList<Attribute> value);
    boolean validateCapability_name(String value);
}
