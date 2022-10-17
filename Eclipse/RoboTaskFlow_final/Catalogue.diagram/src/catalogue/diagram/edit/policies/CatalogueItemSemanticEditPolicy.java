/*
* 
*/
package catalogue.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import catalogue.diagram.edit.commands.ComplexTaskCreateCommand;
import catalogue.diagram.edit.commands.SimpleTaskCreateCommand;
import catalogue.diagram.providers.CatalogueElementTypes;

/**
 * @generated
 */
public class CatalogueItemSemanticEditPolicy extends CatalogueBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CatalogueItemSemanticEditPolicy() {
		super(CatalogueElementTypes.Catalogue_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CatalogueElementTypes.SimpleTask_2001 == req.getElementType()) {
			return getGEFWrapper(new SimpleTaskCreateCommand(req));
		}
		if (CatalogueElementTypes.ComplexTask_2002 == req.getElementType()) {
			return getGEFWrapper(new ComplexTaskCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
