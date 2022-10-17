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
public class WorkflowModelingAssistantProviderOfLoop2EditPart extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Loop2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Loop2EditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((Loop2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Loop2EditPart source, IGraphicalEditPart targetEditPart) {
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
		return doGetTypesForTarget((Loop2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Loop2EditPart source, IElementType relationshipType) {
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
		return doGetRelTypesOnTarget((Loop2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Loop2EditPart target) {
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
		return doGetTypesForSource((Loop2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Loop2EditPart target, IElementType relationshipType) {
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
