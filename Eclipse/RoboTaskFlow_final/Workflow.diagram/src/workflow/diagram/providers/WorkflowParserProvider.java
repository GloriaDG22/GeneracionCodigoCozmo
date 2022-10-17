/*
 * 
 */
package workflow.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.ActivityName2EditPart;
import workflow.diagram.edit.parts.ActivityNameEditPart;
import workflow.diagram.edit.parts.AnswerAnswer2EditPart;
import workflow.diagram.edit.parts.AnswerAnswer3EditPart;
import workflow.diagram.edit.parts.AnswerAnswerEditPart;
import workflow.diagram.edit.parts.LoopNameType2EditPart;
import workflow.diagram.edit.parts.LoopNameTypeEditPart;
import workflow.diagram.edit.parts.ParameterNameValueEditPart;
import workflow.diagram.edit.parts.QuestionQuestion2EditPart;
import workflow.diagram.edit.parts.QuestionQuestionEditPart;
import workflow.diagram.parsers.MessageFormatParser;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser loopNameType_5007Parser;

	/**
	* @generated
	*/
	private IParser getLoopNameType_5007Parser() {
		if (loopNameType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getWorkflow_Name(),
					WorkflowPackage.eINSTANCE.getLoop_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			loopNameType_5007Parser = parser;
		}
		return loopNameType_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser activityName_5008Parser;

	/**
	* @generated
	*/
	private IParser getActivityName_5008Parser() {
		if (activityName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5008Parser = parser;
		}
		return activityName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser questionQuestion_5009Parser;

	/**
	* @generated
	*/
	private IParser getQuestionQuestion_5009Parser() {
		if (questionQuestion_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getQuestion_Question() };
			MessageFormatParser parser = new MessageFormatParser(features);
			questionQuestion_5009Parser = parser;
		}
		return questionQuestion_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser answerAnswer_5010Parser;

	/**
	* @generated
	*/
	private IParser getAnswerAnswer_5010Parser() {
		if (answerAnswer_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getAnswer_Answer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- {0}"); //$NON-NLS-1$
			parser.setEditPattern("- {0}"); //$NON-NLS-1$
			answerAnswer_5010Parser = parser;
		}
		return answerAnswer_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser loopNameType_5006Parser;

	/**
	* @generated
	*/
	private IParser getLoopNameType_5006Parser() {
		if (loopNameType_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getWorkflow_Name(),
					WorkflowPackage.eINSTANCE.getLoop_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			loopNameType_5006Parser = parser;
		}
		return loopNameType_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser activityName_5002Parser;

	/**
	* @generated
	*/
	private IParser getActivityName_5002Parser() {
		if (activityName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5002Parser = parser;
		}
		return activityName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser parameterNameValue_5001Parser;

	/**
	* @generated
	*/
	private IParser getParameterNameValue_5001Parser() {
		if (parameterNameValue_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getParameter_Name(),
					WorkflowPackage.eINSTANCE.getParameter_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			parameterNameValue_5001Parser = parser;
		}
		return parameterNameValue_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser questionQuestion_5004Parser;

	/**
	* @generated
	*/
	private IParser getQuestionQuestion_5004Parser() {
		if (questionQuestion_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getQuestion_Question() };
			MessageFormatParser parser = new MessageFormatParser(features);
			questionQuestion_5004Parser = parser;
		}
		return questionQuestion_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser answerAnswer_5003Parser;

	/**
	* @generated
	*/
	private IParser getAnswerAnswer_5003Parser() {
		if (answerAnswer_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getAnswer_Answer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- {0}"); //$NON-NLS-1$
			parser.setEditPattern("- {0}"); //$NON-NLS-1$
			answerAnswer_5003Parser = parser;
		}
		return answerAnswer_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser answerAnswer_5005Parser;

	/**
	* @generated
	*/
	private IParser getAnswerAnswer_5005Parser() {
		if (answerAnswer_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE.getAnswer_Answer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- {0}"); //$NON-NLS-1$
			parser.setEditPattern("- {0}"); //$NON-NLS-1$
			answerAnswer_5005Parser = parser;
		}
		return answerAnswer_5005Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LoopNameTypeEditPart.VISUAL_ID:
			return getLoopNameType_5007Parser();
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5008Parser();
		case QuestionQuestionEditPart.VISUAL_ID:
			return getQuestionQuestion_5009Parser();
		case AnswerAnswerEditPart.VISUAL_ID:
			return getAnswerAnswer_5010Parser();
		case LoopNameType2EditPart.VISUAL_ID:
			return getLoopNameType_5006Parser();
		case ActivityName2EditPart.VISUAL_ID:
			return getActivityName_5002Parser();
		case ParameterNameValueEditPart.VISUAL_ID:
			return getParameterNameValue_5001Parser();
		case QuestionQuestion2EditPart.VISUAL_ID:
			return getQuestionQuestion_5004Parser();
		case AnswerAnswer2EditPart.VISUAL_ID:
			return getAnswerAnswer_5003Parser();
		case AnswerAnswer3EditPart.VISUAL_ID:
			return getAnswerAnswer_5005Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WorkflowVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WorkflowVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WorkflowElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
