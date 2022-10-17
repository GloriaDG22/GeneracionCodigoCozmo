/*
* 
*/
package catalogue.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import catalogue.Catalogue;
import catalogue.CataloguePackage;
import catalogue.diagram.edit.parts.CatalogueEditPart;
import catalogue.diagram.edit.parts.ComplexTaskEditPart;
import catalogue.diagram.edit.parts.ComplexTaskNameEditPart;
import catalogue.diagram.edit.parts.ParameterDefinitionEditPart;
import catalogue.diagram.edit.parts.ParameterDefinitionNameEditPart;
import catalogue.diagram.edit.parts.SimpleTaskEditPart;
import catalogue.diagram.edit.parts.SimpleTaskNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CatalogueVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Catalogue.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CatalogueEditPart.MODEL_ID.equals(view.getType())) {
				return CatalogueEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return catalogue.diagram.part.CatalogueVisualIDRegistry.getVisualID(view.getType());
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
				CatalogueDiagramEditorPlugin.getInstance()
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
		if (CataloguePackage.eINSTANCE.getCatalogue().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Catalogue) domainElement)) {
			return CatalogueEditPart.VISUAL_ID;
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
		String containerModelID = catalogue.diagram.part.CatalogueVisualIDRegistry.getModelID(containerView);
		if (!CatalogueEditPart.MODEL_ID.equals(containerModelID) && !"catalogue".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CatalogueEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = catalogue.diagram.part.CatalogueVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CatalogueEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CatalogueEditPart.VISUAL_ID:
			if (CataloguePackage.eINSTANCE.getSimpleTask().isSuperTypeOf(domainElement.eClass())) {
				return SimpleTaskEditPart.VISUAL_ID;
			}
			if (CataloguePackage.eINSTANCE.getComplexTask().isSuperTypeOf(domainElement.eClass())) {
				return ComplexTaskEditPart.VISUAL_ID;
			}
			break;
		case SimpleTaskEditPart.VISUAL_ID:
			if (CataloguePackage.eINSTANCE.getParameterDefinition().isSuperTypeOf(domainElement.eClass())) {
				return ParameterDefinitionEditPart.VISUAL_ID;
			}
			break;
		case ComplexTaskEditPart.VISUAL_ID:
			if (CataloguePackage.eINSTANCE.getParameterDefinition().isSuperTypeOf(domainElement.eClass())) {
				return ParameterDefinitionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = catalogue.diagram.part.CatalogueVisualIDRegistry.getModelID(containerView);
		if (!CatalogueEditPart.MODEL_ID.equals(containerModelID) && !"catalogue".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CatalogueEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = catalogue.diagram.part.CatalogueVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CatalogueEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CatalogueEditPart.VISUAL_ID:
			if (SimpleTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleTaskEditPart.VISUAL_ID:
			if (SimpleTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParameterDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexTaskEditPart.VISUAL_ID:
			if (ComplexTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParameterDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterDefinitionEditPart.VISUAL_ID:
			if (ParameterDefinitionNameEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Catalogue element) {
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
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CatalogueEditPart.VISUAL_ID:
			return false;
		case ParameterDefinitionEditPart.VISUAL_ID:
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
			return catalogue.diagram.part.CatalogueVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return catalogue.diagram.part.CatalogueVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return catalogue.diagram.part.CatalogueVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return catalogue.diagram.part.CatalogueVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return catalogue.diagram.part.CatalogueVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return catalogue.diagram.part.CatalogueVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
