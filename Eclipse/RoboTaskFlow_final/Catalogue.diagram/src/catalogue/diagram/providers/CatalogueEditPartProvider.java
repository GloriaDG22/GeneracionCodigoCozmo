/*
 * 
 */
package catalogue.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import catalogue.diagram.edit.parts.CatalogueEditPart;
import catalogue.diagram.edit.parts.CatalogueEditPartFactory;
import catalogue.diagram.part.CatalogueVisualIDRegistry;

/**
 * @generated
 */
public class CatalogueEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public CatalogueEditPartProvider() {
		super(new CatalogueEditPartFactory(), CatalogueVisualIDRegistry.TYPED_INSTANCE, CatalogueEditPart.MODEL_ID);
	}

}
