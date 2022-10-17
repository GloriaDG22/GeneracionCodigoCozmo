/*
* 
*/
package catalogue.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import catalogue.Catalogue;
import catalogue.ComplexTask;
import catalogue.ParameterDefinition;
import catalogue.SimpleTask;
import catalogue.TaskDefinition;
import catalogue.diagram.edit.parts.CatalogueEditPart;
import catalogue.diagram.edit.parts.ComplexTaskEditPart;
import catalogue.diagram.edit.parts.ParameterDefinitionEditPart;
import catalogue.diagram.edit.parts.SimpleTaskEditPart;

/**
 * @generated
 */
public class CatalogueDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<CatalogueNodeDescriptor> getSemanticChildren(View view) {
		switch (CatalogueVisualIDRegistry.getVisualID(view)) {
		case CatalogueEditPart.VISUAL_ID:
			return getCatalogue_1000SemanticChildren(view);
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2001SemanticChildren(view);
		case ComplexTaskEditPart.VISUAL_ID:
			return getComplexTask_2002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CatalogueNodeDescriptor> getCatalogue_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Catalogue modelElement = (Catalogue) view.getElement();
		LinkedList<CatalogueNodeDescriptor> result = new LinkedList<CatalogueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGathers().iterator(); it.hasNext();) {
			TaskDefinition childElement = (TaskDefinition) it.next();
			int visualID = CatalogueVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleTaskEditPart.VISUAL_ID) {
				result.add(new CatalogueNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComplexTaskEditPart.VISUAL_ID) {
				result.add(new CatalogueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CatalogueNodeDescriptor> getSimpleTask_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleTask modelElement = (SimpleTask) view.getElement();
		LinkedList<CatalogueNodeDescriptor> result = new LinkedList<CatalogueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParamsDefinitions().iterator(); it.hasNext();) {
			ParameterDefinition childElement = (ParameterDefinition) it.next();
			int visualID = CatalogueVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterDefinitionEditPart.VISUAL_ID) {
				result.add(new CatalogueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CatalogueNodeDescriptor> getComplexTask_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComplexTask modelElement = (ComplexTask) view.getElement();
		LinkedList<CatalogueNodeDescriptor> result = new LinkedList<CatalogueNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParamsDefinitions().iterator(); it.hasNext();) {
			ParameterDefinition childElement = (ParameterDefinition) it.next();
			int visualID = CatalogueVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterDefinitionEditPart.VISUAL_ID) {
				result.add(new CatalogueNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CatalogueLinkDescriptor> getContainedLinks(View view) {
		switch (CatalogueVisualIDRegistry.getVisualID(view)) {
		case CatalogueEditPart.VISUAL_ID:
			return getCatalogue_1000ContainedLinks(view);
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2001ContainedLinks(view);
		case ComplexTaskEditPart.VISUAL_ID:
			return getComplexTask_2002ContainedLinks(view);
		case ParameterDefinitionEditPart.VISUAL_ID:
			return getParameterDefinition_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CatalogueLinkDescriptor> getIncomingLinks(View view) {
		switch (CatalogueVisualIDRegistry.getVisualID(view)) {
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2001IncomingLinks(view);
		case ComplexTaskEditPart.VISUAL_ID:
			return getComplexTask_2002IncomingLinks(view);
		case ParameterDefinitionEditPart.VISUAL_ID:
			return getParameterDefinition_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CatalogueLinkDescriptor> getOutgoingLinks(View view) {
		switch (CatalogueVisualIDRegistry.getVisualID(view)) {
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2001OutgoingLinks(view);
		case ComplexTaskEditPart.VISUAL_ID:
			return getComplexTask_2002OutgoingLinks(view);
		case ParameterDefinitionEditPart.VISUAL_ID:
			return getParameterDefinition_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getCatalogue_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getSimpleTask_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getComplexTask_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getParameterDefinition_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getSimpleTask_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getComplexTask_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getParameterDefinition_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getSimpleTask_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getComplexTask_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CatalogueLinkDescriptor> getParameterDefinition_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<CatalogueNodeDescriptor> getSemanticChildren(View view) {
			return CatalogueDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CatalogueLinkDescriptor> getContainedLinks(View view) {
			return CatalogueDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CatalogueLinkDescriptor> getIncomingLinks(View view) {
			return CatalogueDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CatalogueLinkDescriptor> getOutgoingLinks(View view) {
			return CatalogueDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
