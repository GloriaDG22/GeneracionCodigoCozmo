/*
 * 
 */
package workflow.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowModelingAssistantProvider;

/**
 * @generated
 */
public class WorkflowModelingAssistantProviderOfWorkflowEditPart extends WorkflowModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(WorkflowElementTypes.Loop_2001);
		types.add(WorkflowElementTypes.Activity_2002);
		types.add(WorkflowElementTypes.Initial_2003);
		types.add(WorkflowElementTypes.Final_2004);
		types.add(WorkflowElementTypes.Question_2005);
		types.add(WorkflowElementTypes.Answer_2006);
		return types;
	}

}
