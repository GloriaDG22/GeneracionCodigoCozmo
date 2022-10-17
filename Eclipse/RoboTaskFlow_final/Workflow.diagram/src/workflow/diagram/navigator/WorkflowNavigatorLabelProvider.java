/*
* 
*/
package workflow.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import workflow.Workflow;
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
import workflow.diagram.edit.parts.LoopNameType2EditPart;
import workflow.diagram.edit.parts.LoopNameTypeEditPart;
import workflow.diagram.edit.parts.ParameterEditPart;
import workflow.diagram.edit.parts.ParameterNameValueEditPart;
import workflow.diagram.edit.parts.Question2EditPart;
import workflow.diagram.edit.parts.QuestionEditPart;
import workflow.diagram.edit.parts.QuestionQuestion2EditPart;
import workflow.diagram.edit.parts.QuestionQuestionEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.part.WorkflowDiagramEditorPlugin;
import workflow.diagram.part.WorkflowVisualIDRegistry;
import workflow.diagram.providers.WorkflowElementTypes;
import workflow.diagram.providers.WorkflowParserProvider;

/**
 * @generated
 */
public class WorkflowNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		WorkflowDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		WorkflowDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WorkflowNavigatorItem && !isOwnView(((WorkflowNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof WorkflowNavigatorGroup) {
			WorkflowNavigatorGroup group = (WorkflowNavigatorGroup) element;
			return WorkflowDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof WorkflowNavigatorItem) {
			WorkflowNavigatorItem navigatorItem = (WorkflowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.RoboTaskFlow.org/workflow?Workflow", //$NON-NLS-1$
					WorkflowElementTypes.Workflow_1000);
		case LoopEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/workflow?Loop", //$NON-NLS-1$
					WorkflowElementTypes.Loop_2001);
		case ActivityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/workflow?Activity", //$NON-NLS-1$
					WorkflowElementTypes.Activity_2002);
		case InitialEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/workflow?Initial", //$NON-NLS-1$
					WorkflowElementTypes.Initial_2003);
		case FinalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/workflow?Final", //$NON-NLS-1$
					WorkflowElementTypes.Final_2004);
		case QuestionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/workflow?Question", //$NON-NLS-1$
					WorkflowElementTypes.Question_2005);
		case AnswerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/workflow?Answer", //$NON-NLS-1$
					WorkflowElementTypes.Answer_2006);
		case Loop2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Loop", WorkflowElementTypes.Loop_3001); //$NON-NLS-1$
		case Activity2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Activity", //$NON-NLS-1$
					WorkflowElementTypes.Activity_3002);
		case ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Parameter", //$NON-NLS-1$
					WorkflowElementTypes.Parameter_3003);
		case Initial2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Initial", //$NON-NLS-1$
					WorkflowElementTypes.Initial_3004);
		case Final2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Final", //$NON-NLS-1$
					WorkflowElementTypes.Final_3005);
		case Question2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Question", //$NON-NLS-1$
					WorkflowElementTypes.Question_3006);
		case Answer2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Answer", //$NON-NLS-1$
					WorkflowElementTypes.Answer_3007);
		case Answer3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/workflow?Answer", //$NON-NLS-1$
					WorkflowElementTypes.Answer_3008);
		case LinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.RoboTaskFlow.org/workflow?Link", WorkflowElementTypes.Link_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WorkflowDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && WorkflowElementTypes.isKnownElementType(elementType)) {
			image = WorkflowElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof WorkflowNavigatorGroup) {
			WorkflowNavigatorGroup group = (WorkflowNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WorkflowNavigatorItem) {
			WorkflowNavigatorItem navigatorItem = (WorkflowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000Text(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_2001Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002Text(view);
		case InitialEditPart.VISUAL_ID:
			return getInitial_2003Text(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_2004Text(view);
		case QuestionEditPart.VISUAL_ID:
			return getQuestion_2005Text(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_2006Text(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3001Text(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3002Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003Text(view);
		case Initial2EditPart.VISUAL_ID:
			return getInitial_3004Text(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3005Text(view);
		case Question2EditPart.VISUAL_ID:
			return getQuestion_3006Text(view);
		case Answer2EditPart.VISUAL_ID:
			return getAnswer_3007Text(view);
		case Answer3EditPart.VISUAL_ID:
			return getAnswer_3008Text(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWorkflow_1000Text(View view) {
		Workflow domainModelElement = (Workflow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_2001Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Loop_2001,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(LoopNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivity_2002Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Activity_2002,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitial_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFinal_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getQuestion_2005Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Question_2005,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(QuestionQuestionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnswer_2006Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Answer_2006,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(AnswerAnswerEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3001Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Loop_3001,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(LoopNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivity_3002Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Activity_3002,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(ActivityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameter_3003Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Parameter_3003,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(ParameterNameValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitial_3004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFinal_3005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getQuestion_3006Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Question_3006,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(QuestionQuestion2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnswer_3007Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Answer_3007,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(AnswerAnswer2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnswer_3008Text(View view) {
		IParser parser = WorkflowParserProvider.getParser(WorkflowElementTypes.Answer_3008,
				view.getElement() != null ? view.getElement() : view,
				WorkflowVisualIDRegistry.getType(AnswerAnswer3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WorkflowDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return WorkflowEditPart.MODEL_ID.equals(WorkflowVisualIDRegistry.getModelID(view));
	}

}
