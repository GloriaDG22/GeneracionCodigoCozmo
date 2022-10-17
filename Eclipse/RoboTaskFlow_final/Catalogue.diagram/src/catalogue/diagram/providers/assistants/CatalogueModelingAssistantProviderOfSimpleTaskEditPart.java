/*
 * 
 */
package catalogue.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import catalogue.diagram.providers.CatalogueElementTypes;
import catalogue.diagram.providers.CatalogueModelingAssistantProvider;

/**
 * @generated
 */
public class CatalogueModelingAssistantProviderOfSimpleTaskEditPart extends CatalogueModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CatalogueElementTypes.ParameterDefinition_3001);
		return types;
	}

}
