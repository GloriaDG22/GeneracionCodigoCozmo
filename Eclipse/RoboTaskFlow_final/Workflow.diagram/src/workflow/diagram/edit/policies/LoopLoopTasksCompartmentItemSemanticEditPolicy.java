/*
* 
*/
package workflow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import workflow.diagram.edit.commands.Activity2CreateCommand;
import workflow.diagram.edit.commands.Answer3CreateCommand;
import workflow.diagram.edit.commands.Final2CreateCommand;
import workflow.diagram.edit.commands.Initial2CreateCommand;
import workflow.diagram.edit.commands.Loop2CreateCommand;
import workflow.diagram.edit.commands.Question2CreateCommand;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class LoopLoopTasksCompartmentItemSemanticEditPolicy extends WorkflowBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LoopLoopTasksCompartmentItemSemanticEditPolicy() {
		super(WorkflowElementTypes.Loop_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkflowElementTypes.Loop_3001 == req.getElementType()) {
			return getGEFWrapper(new Loop2CreateCommand(req));
		}
		if (WorkflowElementTypes.Activity_3002 == req.getElementType()) {
			return getGEFWrapper(new Activity2CreateCommand(req));
		}
		if (WorkflowElementTypes.Initial_3004 == req.getElementType()) {
			return getGEFWrapper(new Initial2CreateCommand(req));
		}
		if (WorkflowElementTypes.Final_3005 == req.getElementType()) {
			return getGEFWrapper(new Final2CreateCommand(req));
		}
		if (WorkflowElementTypes.Question_3006 == req.getElementType()) {
			return getGEFWrapper(new Question2CreateCommand(req));
		}
		if (WorkflowElementTypes.Answer_3008 == req.getElementType()) {
			return getGEFWrapper(new Answer3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
