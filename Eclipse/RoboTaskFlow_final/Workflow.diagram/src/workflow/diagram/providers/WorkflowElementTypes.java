/*
 * 
 */
package workflow.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

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
import workflow.diagram.edit.parts.ParameterEditPart;
import workflow.diagram.edit.parts.Question2EditPart;
import workflow.diagram.edit.parts.QuestionEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.part.WorkflowDiagramEditorPlugin;

/**
 * @generated
 */
public class WorkflowElementTypes {

	/**
	* @generated
	*/
	private WorkflowElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WorkflowDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Workflow_1000 = getElementType("Workflow.diagram.Workflow_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_2001 = getElementType("Workflow.diagram.Loop_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Activity_2002 = getElementType("Workflow.diagram.Activity_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Initial_2003 = getElementType("Workflow.diagram.Initial_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Final_2004 = getElementType("Workflow.diagram.Final_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Question_2005 = getElementType("Workflow.diagram.Question_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Answer_2006 = getElementType("Workflow.diagram.Answer_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_3001 = getElementType("Workflow.diagram.Loop_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Activity_3002 = getElementType("Workflow.diagram.Activity_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parameter_3003 = getElementType("Workflow.diagram.Parameter_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Initial_3004 = getElementType("Workflow.diagram.Initial_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Final_3005 = getElementType("Workflow.diagram.Final_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Question_3006 = getElementType("Workflow.diagram.Question_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Answer_3007 = getElementType("Workflow.diagram.Answer_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Answer_3008 = getElementType("Workflow.diagram.Answer_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Link_4001 = getElementType("Workflow.diagram.Link_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Workflow_1000, WorkflowPackage.eINSTANCE.getWorkflow());

			elements.put(Loop_2001, WorkflowPackage.eINSTANCE.getLoop());

			elements.put(Activity_2002, WorkflowPackage.eINSTANCE.getActivity());

			elements.put(Initial_2003, WorkflowPackage.eINSTANCE.getInitial());

			elements.put(Final_2004, WorkflowPackage.eINSTANCE.getFinal());

			elements.put(Question_2005, WorkflowPackage.eINSTANCE.getQuestion());

			elements.put(Answer_2006, WorkflowPackage.eINSTANCE.getAnswer());

			elements.put(Loop_3001, WorkflowPackage.eINSTANCE.getLoop());

			elements.put(Activity_3002, WorkflowPackage.eINSTANCE.getActivity());

			elements.put(Parameter_3003, WorkflowPackage.eINSTANCE.getParameter());

			elements.put(Initial_3004, WorkflowPackage.eINSTANCE.getInitial());

			elements.put(Final_3005, WorkflowPackage.eINSTANCE.getFinal());

			elements.put(Question_3006, WorkflowPackage.eINSTANCE.getQuestion());

			elements.put(Answer_3007, WorkflowPackage.eINSTANCE.getAnswer());

			elements.put(Answer_3008, WorkflowPackage.eINSTANCE.getAnswer());

			elements.put(Link_4001, WorkflowPackage.eINSTANCE.getLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Workflow_1000);
			KNOWN_ELEMENT_TYPES.add(Loop_2001);
			KNOWN_ELEMENT_TYPES.add(Activity_2002);
			KNOWN_ELEMENT_TYPES.add(Initial_2003);
			KNOWN_ELEMENT_TYPES.add(Final_2004);
			KNOWN_ELEMENT_TYPES.add(Question_2005);
			KNOWN_ELEMENT_TYPES.add(Answer_2006);
			KNOWN_ELEMENT_TYPES.add(Loop_3001);
			KNOWN_ELEMENT_TYPES.add(Activity_3002);
			KNOWN_ELEMENT_TYPES.add(Parameter_3003);
			KNOWN_ELEMENT_TYPES.add(Initial_3004);
			KNOWN_ELEMENT_TYPES.add(Final_3005);
			KNOWN_ELEMENT_TYPES.add(Question_3006);
			KNOWN_ELEMENT_TYPES.add(Answer_3007);
			KNOWN_ELEMENT_TYPES.add(Answer_3008);
			KNOWN_ELEMENT_TYPES.add(Link_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WorkflowEditPart.VISUAL_ID:
			return Workflow_1000;
		case LoopEditPart.VISUAL_ID:
			return Loop_2001;
		case ActivityEditPart.VISUAL_ID:
			return Activity_2002;
		case InitialEditPart.VISUAL_ID:
			return Initial_2003;
		case FinalEditPart.VISUAL_ID:
			return Final_2004;
		case QuestionEditPart.VISUAL_ID:
			return Question_2005;
		case AnswerEditPart.VISUAL_ID:
			return Answer_2006;
		case Loop2EditPart.VISUAL_ID:
			return Loop_3001;
		case Activity2EditPart.VISUAL_ID:
			return Activity_3002;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_3003;
		case Initial2EditPart.VISUAL_ID:
			return Initial_3004;
		case Final2EditPart.VISUAL_ID:
			return Final_3005;
		case Question2EditPart.VISUAL_ID:
			return Question_3006;
		case Answer2EditPart.VISUAL_ID:
			return Answer_3007;
		case Answer3EditPart.VISUAL_ID:
			return Answer_3008;
		case LinkEditPart.VISUAL_ID:
			return Link_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return workflow.diagram.providers.WorkflowElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return workflow.diagram.providers.WorkflowElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return workflow.diagram.providers.WorkflowElementTypes.getElement(elementTypeAdapter);
		}
	};

}
