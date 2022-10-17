/*
 * 
 */
package catalogue.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import catalogue.diagram.part.CatalogueVisualIDRegistry;

/**
 * @generated
 */
public class CatalogueEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CatalogueVisualIDRegistry.getVisualID(view)) {

			case CatalogueEditPart.VISUAL_ID:
				return new CatalogueEditPart(view);

			case SimpleTaskEditPart.VISUAL_ID:
				return new SimpleTaskEditPart(view);

			case SimpleTaskNameEditPart.VISUAL_ID:
				return new SimpleTaskNameEditPart(view);

			case ComplexTaskEditPart.VISUAL_ID:
				return new ComplexTaskEditPart(view);

			case ComplexTaskNameEditPart.VISUAL_ID:
				return new ComplexTaskNameEditPart(view);

			case ParameterDefinitionEditPart.VISUAL_ID:
				return new ParameterDefinitionEditPart(view);

			case ParameterDefinitionNameEditPart.VISUAL_ID:
				return new ParameterDefinitionNameEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
