/*
* 
*/
package workflow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import workflow.diagram.edit.commands.Answer2CreateCommand;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class QuestionQuestionAnswersCompartmentItemSemanticEditPolicy extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public QuestionQuestionAnswersCompartmentItemSemanticEditPolicy() {
		super(WorkflowElementTypes.Question_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkflowElementTypes.Answer_3007 == req.getElementType()) {
			return getGEFWrapper(new Answer2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
