/*
 * 
 */
package workflow.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import workflow.diagram.edit.parts.Activity2EditPart;
import workflow.diagram.edit.parts.ActivityEditPart;
import workflow.diagram.edit.parts.Answer2EditPart;
import workflow.diagram.edit.parts.Answer3EditPart;
import workflow.diagram.edit.parts.AnswerEditPart;
import workflow.diagram.edit.parts.Final2EditPart;
import workflow.diagram.edit.parts.FinalEditPart;
import workflow.diagram.edit.parts.Initial2EditPart;
import workflow.diagram.edit.parts.InitialEditPart;
import workflow.diagram.edit.parts.Loop2EditPart;
import workflow.diagram.edit.parts.LoopEditPart;
import workflow.diagram.edit.parts.Question2EditPart;
import workflow.diagram.edit.parts.QuestionEditPart;
import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowModelingAssistantProvider;

/**
 * @generated
 */
public class WorkflowModelingAssistantProviderOfActivityEditPart extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.Parameter_3003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ActivityEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ActivityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ActivityEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ActivityEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof LoopEditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof InitialEditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof FinalEditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof QuestionEditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof AnswerEditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Loop2EditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Activity2EditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Initial2EditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Final2EditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Question2EditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Answer2EditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Answer3EditPart) {
			types.add(WorkflowElementTypes.Link_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ActivityEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ActivityEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.Link_4001) {
			types.add(WorkflowElementTypes.Loop_2001);
			types.add(WorkflowElementTypes.Activity_2002);
			types.add(WorkflowElementTypes.Initial_2003);
			types.add(WorkflowElementTypes.Final_2004);
			types.add(WorkflowElementTypes.Question_2005);
			types.add(WorkflowElementTypes.Answer_2006);
			types.add(WorkflowElementTypes.Loop_3001);
			types.add(WorkflowElementTypes.Activity_3002);
			types.add(WorkflowElementTypes.Initial_3004);
			types.add(WorkflowElementTypes.Final_3005);
			types.add(WorkflowElementTypes.Question_3006);
			types.add(WorkflowElementTypes.Answer_3007);
			types.add(WorkflowElementTypes.Answer_3008);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ActivityEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ActivityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WorkflowElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ActivityEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ActivityEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkflowElementTypes.Link_4001) {
			types.add(WorkflowElementTypes.Loop_2001);
			types.add(WorkflowElementTypes.Activity_2002);
			types.add(WorkflowElementTypes.Initial_2003);
			types.add(WorkflowElementTypes.Final_2004);
			types.add(WorkflowElementTypes.Question_2005);
			types.add(WorkflowElementTypes.Answer_2006);
			types.add(WorkflowElementTypes.Loop_3001);
			types.add(WorkflowElementTypes.Activity_3002);
			types.add(WorkflowElementTypes.Initial_3004);
			types.add(WorkflowElementTypes.Final_3005);
			types.add(WorkflowElementTypes.Question_3006);
			types.add(WorkflowElementTypes.Answer_3007);
			types.add(WorkflowElementTypes.Answer_3008);
		}
		return types;
	}

}
