/*
* 
*/
package workflow.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import workflow.Workflow;
import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.Activity2EditPart;
import workflow.diagram.edit.parts.ActivityEditPart;
import workflow.diagram.edit.parts.ActivityName2EditPart;
import workflow.diagram.edit.parts.ActivityNameEditPart;
import workflow.diagram.edit.parts.Answer2EditPart;
import workflow.diagram.edit.parts.Answer3EditPart;
import workflow.diagram.edit.parts.AnswerAnswer2EditPart;
import workflow.diagram.edit.parts.AnswerAnswer3EditPart;
import workflow.diagram.edit.parts.AnswerAnswerEditPart;
import workflow.diagram.edit.parts.AnswerEditPart;
import workflow.diagram.edit.parts.Final2EditPart;
import workflow.diagram.edit.parts.FinalEditPart;
import workflow.diagram.edit.parts.Initial2EditPart;
import workflow.diagram.edit.parts.InitialEditPart;
import workflow.diagram.edit.parts.LinkEditPart;
import workflow.diagram.edit.parts.Loop2EditPart;
import workflow.diagram.edit.parts.LoopEditPart;
import workflow.diagram.edit.parts.LoopLoopTasksCompartment2EditPart;
import workflow.diagram.edit.parts.LoopLoopTasksCompartmentEditPart;
import workflow.diagram.edit.parts.LoopNameType2EditPart;
import workflow.diagram.edit.parts.LoopNameTypeEditPart;
import workflow.diagram.edit.parts.ParameterEditPart;
import workflow.diagram.edit.parts.ParameterNameValueEditPart;
import workflow.diagram.edit.parts.Question2EditPart;
import workflow.diagram.edit.parts.QuestionEditPart;
import workflow.diagram.edit.parts.QuestionQuestion2EditPart;
import workflow.diagram.edit.parts.QuestionQuestionAnswersCompartment2EditPart;
import workflow.diagram.edit.parts.QuestionQuestionAnswersCompartmentEditPart;
import workflow.diagram.edit.parts.QuestionQuestionEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WorkflowVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Workflow.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WorkflowEditPart.MODEL_ID.equals(view.getType())) {
				return WorkflowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				WorkflowDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WorkflowPackage.eINSTANCE.getWorkflow().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Workflow) domainElement)) {
			return WorkflowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = workflow.diagram.part.WorkflowVisualIDRegistry.getModelID(containerView);
		if (!WorkflowEditPart.MODEL_ID.equals(containerModelID) && !"workflow".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkflowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WorkflowEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getInitial().isSuperTypeOf(domainElement.eClass())) {
				return InitialEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getFinal().isSuperTypeOf(domainElement.eClass())) {
				return FinalEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getQuestion().isSuperTypeOf(domainElement.eClass())) {
				return QuestionEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getAnswer().isSuperTypeOf(domainElement.eClass())) {
				return AnswerEditPart.VISUAL_ID;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case Activity2EditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case LoopLoopTasksCompartmentEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return Activity2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getInitial().isSuperTypeOf(domainElement.eClass())) {
				return Initial2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getFinal().isSuperTypeOf(domainElement.eClass())) {
				return Final2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getQuestion().isSuperTypeOf(domainElement.eClass())) {
				return Question2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getAnswer().isSuperTypeOf(domainElement.eClass())) {
				return Answer3EditPart.VISUAL_ID;
			}
			break;
		case LoopLoopTasksCompartment2EditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return Activity2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getInitial().isSuperTypeOf(domainElement.eClass())) {
				return Initial2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getFinal().isSuperTypeOf(domainElement.eClass())) {
				return Final2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getQuestion().isSuperTypeOf(domainElement.eClass())) {
				return Question2EditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getAnswer().isSuperTypeOf(domainElement.eClass())) {
				return Answer3EditPart.VISUAL_ID;
			}
			break;
		case QuestionQuestionAnswersCompartmentEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getAnswer().isSuperTypeOf(domainElement.eClass())) {
				return Answer2EditPart.VISUAL_ID;
			}
			break;
		case QuestionQuestionAnswersCompartment2EditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getAnswer().isSuperTypeOf(domainElement.eClass())) {
				return Answer2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = workflow.diagram.part.WorkflowVisualIDRegistry.getModelID(containerView);
		if (!WorkflowEditPart.MODEL_ID.equals(containerModelID) && !"workflow".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkflowEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WorkflowEditPart.VISUAL_ID:
			if (LoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnswerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopEditPart.VISUAL_ID:
			if (LoopNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopTasksCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionEditPart.VISUAL_ID:
			if (QuestionQuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionQuestionAnswersCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnswerEditPart.VISUAL_ID:
			if (AnswerAnswerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Loop2EditPart.VISUAL_ID:
			if (LoopNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopTasksCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Activity2EditPart.VISUAL_ID:
			if (ActivityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (ParameterNameValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Question2EditPart.VISUAL_ID:
			if (QuestionQuestion2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionQuestionAnswersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Answer2EditPart.VISUAL_ID:
			if (AnswerAnswer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Answer3EditPart.VISUAL_ID:
			if (AnswerAnswer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopLoopTasksCompartmentEditPart.VISUAL_ID:
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Activity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Initial2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Final2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Question2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Answer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopLoopTasksCompartment2EditPart.VISUAL_ID:
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Activity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Initial2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Final2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Question2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Answer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionQuestionAnswersCompartmentEditPart.VISUAL_ID:
			if (Answer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionQuestionAnswersCompartment2EditPart.VISUAL_ID:
			if (Answer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WorkflowPackage.eINSTANCE.getLink().isSuperTypeOf(domainElement.eClass())) {
			return LinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Workflow element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case LoopLoopTasksCompartmentEditPart.VISUAL_ID:
		case LoopLoopTasksCompartment2EditPart.VISUAL_ID:
		case QuestionQuestionAnswersCompartmentEditPart.VISUAL_ID:
		case QuestionQuestionAnswersCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WorkflowEditPart.VISUAL_ID:
			return false;
		case InitialEditPart.VISUAL_ID:
		case FinalEditPart.VISUAL_ID:
		case AnswerEditPart.VISUAL_ID:
		case ParameterEditPart.VISUAL_ID:
		case Initial2EditPart.VISUAL_ID:
		case Final2EditPart.VISUAL_ID:
		case Answer2EditPart.VISUAL_ID:
		case Answer3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return workflow.diagram.part.WorkflowVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
