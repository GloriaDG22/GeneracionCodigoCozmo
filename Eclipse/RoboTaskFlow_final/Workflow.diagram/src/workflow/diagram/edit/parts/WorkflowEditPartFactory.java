/*
 * 
 */
package workflow.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WorkflowVisualIDRegistry.getVisualID(view)) {

			case WorkflowEditPart.VISUAL_ID:
				return new WorkflowEditPart(view);

			case LoopEditPart.VISUAL_ID:
				return new LoopEditPart(view);

			case LoopNameTypeEditPart.VISUAL_ID:
				return new LoopNameTypeEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case InitialEditPart.VISUAL_ID:
				return new InitialEditPart(view);

			case FinalEditPart.VISUAL_ID:
				return new FinalEditPart(view);

			case QuestionEditPart.VISUAL_ID:
				return new QuestionEditPart(view);

			case QuestionQuestionEditPart.VISUAL_ID:
				return new QuestionQuestionEditPart(view);

			case AnswerEditPart.VISUAL_ID:
				return new AnswerEditPart(view);

			case AnswerAnswerEditPart.VISUAL_ID:
				return new AnswerAnswerEditPart(view);

			case Loop2EditPart.VISUAL_ID:
				return new Loop2EditPart(view);

			case LoopNameType2EditPart.VISUAL_ID:
				return new LoopNameType2EditPart(view);

			case Activity2EditPart.VISUAL_ID:
				return new Activity2EditPart(view);

			case ActivityName2EditPart.VISUAL_ID:
				return new ActivityName2EditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterNameValueEditPart.VISUAL_ID:
				return new ParameterNameValueEditPart(view);

			case Initial2EditPart.VISUAL_ID:
				return new Initial2EditPart(view);

			case Final2EditPart.VISUAL_ID:
				return new Final2EditPart(view);

			case Question2EditPart.VISUAL_ID:
				return new Question2EditPart(view);

			case QuestionQuestion2EditPart.VISUAL_ID:
				return new QuestionQuestion2EditPart(view);

			case Answer2EditPart.VISUAL_ID:
				return new Answer2EditPart(view);

			case AnswerAnswer2EditPart.VISUAL_ID:
				return new AnswerAnswer2EditPart(view);

			case Answer3EditPart.VISUAL_ID:
				return new Answer3EditPart(view);

			case AnswerAnswer3EditPart.VISUAL_ID:
				return new AnswerAnswer3EditPart(view);

			case LoopLoopTasksCompartmentEditPart.VISUAL_ID:
				return new LoopLoopTasksCompartmentEditPart(view);

			case LoopLoopTasksCompartment2EditPart.VISUAL_ID:
				return new LoopLoopTasksCompartment2EditPart(view);

			case QuestionQuestionAnswersCompartmentEditPart.VISUAL_ID:
				return new QuestionQuestionAnswersCompartmentEditPart(view);

			case QuestionQuestionAnswersCompartment2EditPart.VISUAL_ID:
				return new QuestionQuestionAnswersCompartment2EditPart(view);

			case LinkEditPart.VISUAL_ID:
				return new LinkEditPart(view);

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
