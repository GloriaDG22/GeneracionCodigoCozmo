/*
* 
*/
package workflow.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import workflow.Activity;
import workflow.Answer;
import workflow.Final;
import workflow.Initial;
import workflow.Link;
import workflow.Loop;
import workflow.Parameter;
import workflow.Question;
import workflow.Task;
import workflow.Workflow;
import workflow.WorkflowPackage;
import workflow.diagram.edit.parts.Activity2EditPart;
import workflow.diagram.edit.parts.ActivityEditPart;
import workflow.diagram.edit.parts.Answer2EditPart;
import workflow.diagram.edit.parts.Answer3EditPart;
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
import workflow.diagram.edit.parts.ParameterEditPart;
import workflow.diagram.edit.parts.Question2EditPart;
import workflow.diagram.edit.parts.QuestionEditPart;
import workflow.diagram.edit.parts.QuestionQuestionAnswersCompartment2EditPart;
import workflow.diagram.edit.parts.QuestionQuestionAnswersCompartmentEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getSemanticChildren(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000SemanticChildren(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002SemanticChildren(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3002SemanticChildren(view);
		case LoopLoopTasksCompartmentEditPart.VISUAL_ID:
			return getLoopLoopTasksCompartment_7001SemanticChildren(view);
		case LoopLoopTasksCompartment2EditPart.VISUAL_ID:
			return getLoopLoopTasksCompartment_7002SemanticChildren(view);
		case QuestionQuestionAnswersCompartmentEditPart.VISUAL_ID:
			return getQuestionQuestionAnswersCompartment_7003SemanticChildren(view);
		case QuestionQuestionAnswersCompartment2EditPart.VISUAL_ID:
			return getQuestionQuestionAnswersCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getWorkflow_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Workflow modelElement = (Workflow) view.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinalEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == QuestionEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnswerEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getActivity_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) view.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getActivity_3002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) view.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getLoopLoopTasksCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Activity2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Initial2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Final2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Question2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Answer3EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getLoopLoopTasksCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Activity2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Initial2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Final2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Question2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Answer3EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getQuestionQuestionAnswersCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Question modelElement = (Question) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnswers().iterator(); it.hasNext();) {
			Answer childElement = (Answer) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Answer2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowNodeDescriptor> getQuestionQuestionAnswersCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Question modelElement = (Question) containerView.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnswers().iterator(); it.hasNext();) {
			Answer childElement = (Answer) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Answer2EditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getContainedLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000ContainedLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_2001ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002ContainedLinks(view);
		case InitialEditPart.VISUAL_ID:
			return getInitial_2003ContainedLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_2004ContainedLinks(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2005ContainedLinks(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_2006ContainedLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3001ContainedLinks(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3002ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003ContainedLinks(view);
		case Initial2EditPart.VISUAL_ID:
			return getInitial_3004ContainedLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3005ContainedLinks(view);
		case Question2EditPart.VISUAL_ID:
			return getQuestion_3006ContainedLinks(view);
		case Answer2EditPart.VISUAL_ID:
			return getAnswer_3007ContainedLinks(view);
		case Answer3EditPart.VISUAL_ID:
			return getAnswer_3008ContainedLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case LoopEditPart.VISUAL_ID:
			return getLoop_2001IncomingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002IncomingLinks(view);
		case InitialEditPart.VISUAL_ID:
			return getInitial_2003IncomingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_2004IncomingLinks(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2005IncomingLinks(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_2006IncomingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3001IncomingLinks(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3002IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003IncomingLinks(view);
		case Initial2EditPart.VISUAL_ID:
			return getInitial_3004IncomingLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3005IncomingLinks(view);
		case Question2EditPart.VISUAL_ID:
			return getQuestion_3006IncomingLinks(view);
		case Answer2EditPart.VISUAL_ID:
			return getAnswer_3007IncomingLinks(view);
		case Answer3EditPart.VISUAL_ID:
			return getAnswer_3008IncomingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case LoopEditPart.VISUAL_ID:
			return getLoop_2001OutgoingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002OutgoingLinks(view);
		case InitialEditPart.VISUAL_ID:
			return getInitial_2003OutgoingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_2004OutgoingLinks(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2005OutgoingLinks(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_2006OutgoingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3001OutgoingLinks(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3002OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003OutgoingLinks(view);
		case Initial2EditPart.VISUAL_ID:
			return getInitial_3004OutgoingLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3005OutgoingLinks(view);
		case Question2EditPart.VISUAL_ID:
			return getQuestion_3006OutgoingLinks(view);
		case Answer2EditPart.VISUAL_ID:
			return getAnswer_3007OutgoingLinks(view);
		case Answer3EditPart.VISUAL_ID:
			return getAnswer_3008OutgoingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflow_1000ContainedLinks(View view) {
		Workflow modelElement = (Workflow) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLoop_2001ContainedLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getActivity_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInitial_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFinal_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getQuestion_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLoop_3001ContainedLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getActivity_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getParameter_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInitial_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFinal_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getQuestion_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLoop_2001IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getActivity_2002IncomingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInitial_2003IncomingLinks(View view) {
		Initial modelElement = (Initial) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFinal_2004IncomingLinks(View view) {
		Final modelElement = (Final) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getQuestion_2005IncomingLinks(View view) {
		Question modelElement = (Question) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_2006IncomingLinks(View view) {
		Answer modelElement = (Answer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLoop_3001IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getActivity_3002IncomingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getParameter_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInitial_3004IncomingLinks(View view) {
		Initial modelElement = (Initial) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFinal_3005IncomingLinks(View view) {
		Final modelElement = (Final) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getQuestion_3006IncomingLinks(View view) {
		Question modelElement = (Question) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_3007IncomingLinks(View view) {
		Answer modelElement = (Answer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_3008IncomingLinks(View view) {
		Answer modelElement = (Answer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLoop_2001OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getActivity_2002OutgoingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInitial_2003OutgoingLinks(View view) {
		Initial modelElement = (Initial) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFinal_2004OutgoingLinks(View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getQuestion_2005OutgoingLinks(View view) {
		Question modelElement = (Question) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_2006OutgoingLinks(View view) {
		Answer modelElement = (Answer) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLoop_3001OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getActivity_3002OutgoingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getParameter_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getInitial_3004OutgoingLinks(View view) {
		Initial modelElement = (Initial) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getFinal_3005OutgoingLinks(View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getQuestion_3006OutgoingLinks(View view) {
		Question modelElement = (Question) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_3007OutgoingLinks(View view) {
		Answer modelElement = (Answer) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getAnswer_3008OutgoingLinks(View view) {
		Answer modelElement = (Answer) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(Workflow container) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != WorkflowVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSource();
			result.add(
					new WorkflowLinkDescriptor(src, dst, link, WorkflowElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4001(Task target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WorkflowPackage.eINSTANCE.getLink_Target()
					|| false == setting.getEObject() instanceof Link) {
				continue;
			}
			Link link = (Link) setting.getEObject();
			if (LinkEditPart.VISUAL_ID != WorkflowVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSource();
			result.add(new WorkflowLinkDescriptor(src, target, link, WorkflowElementTypes.Link_4001,
					LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkflowLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(Task source) {
		Workflow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Workflow) {
				container = (Workflow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != WorkflowVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new WorkflowLinkDescriptor(src, dst, link, WorkflowElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<WorkflowNodeDescriptor> getSemanticChildren(View view) {
			return WorkflowDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getContainedLinks(View view) {
			return WorkflowDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
			return WorkflowDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
			return WorkflowDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
