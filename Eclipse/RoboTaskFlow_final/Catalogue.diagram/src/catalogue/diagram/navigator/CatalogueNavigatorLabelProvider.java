/*
* 
*/
package catalogue.diagram.navigator;

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

import catalogue.Catalogue;
import catalogue.diagram.edit.parts.CatalogueEditPart;
import catalogue.diagram.edit.parts.ComplexTaskEditPart;
import catalogue.diagram.edit.parts.ComplexTaskNameEditPart;
import catalogue.diagram.edit.parts.ParameterDefinitionEditPart;
import catalogue.diagram.edit.parts.ParameterDefinitionNameEditPart;
import catalogue.diagram.edit.parts.SimpleTaskEditPart;
import catalogue.diagram.edit.parts.SimpleTaskNameEditPart;
import catalogue.diagram.part.CatalogueDiagramEditorPlugin;
import catalogue.diagram.part.CatalogueVisualIDRegistry;
import catalogue.diagram.providers.CatalogueElementTypes;
import catalogue.diagram.providers.CatalogueParserProvider;

/**
 * @generated
 */
public class CatalogueNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		CatalogueDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CatalogueDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CatalogueNavigatorItem && !isOwnView(((CatalogueNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof CatalogueNavigatorGroup) {
			CatalogueNavigatorGroup group = (CatalogueNavigatorGroup) element;
			return CatalogueDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CatalogueNavigatorItem) {
			CatalogueNavigatorItem navigatorItem = (CatalogueNavigatorItem) element;
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
		switch (CatalogueVisualIDRegistry.getVisualID(view)) {
		case CatalogueEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.RoboTaskFlow.org/catalogue?Catalogue", //$NON-NLS-1$
					CatalogueElementTypes.Catalogue_1000);
		case SimpleTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/catalogue?SimpleTask", //$NON-NLS-1$
					CatalogueElementTypes.SimpleTask_2001);
		case ComplexTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.RoboTaskFlow.org/catalogue?ComplexTask", //$NON-NLS-1$
					CatalogueElementTypes.ComplexTask_2002);
		case ParameterDefinitionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.RoboTaskFlow.org/catalogue?ParameterDefinition", //$NON-NLS-1$
					CatalogueElementTypes.ParameterDefinition_3001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CatalogueDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CatalogueElementTypes.isKnownElementType(elementType)) {
			image = CatalogueElementTypes.getImage(elementType);
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
		if (element instanceof CatalogueNavigatorGroup) {
			CatalogueNavigatorGroup group = (CatalogueNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CatalogueNavigatorItem) {
			CatalogueNavigatorItem navigatorItem = (CatalogueNavigatorItem) element;
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
		switch (CatalogueVisualIDRegistry.getVisualID(view)) {
		case CatalogueEditPart.VISUAL_ID:
			return getCatalogue_1000Text(view);
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2001Text(view);
		case ComplexTaskEditPart.VISUAL_ID:
			return getComplexTask_2002Text(view);
		case ParameterDefinitionEditPart.VISUAL_ID:
			return getParameterDefinition_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getCatalogue_1000Text(View view) {
		Catalogue domainModelElement = (Catalogue) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CatalogueDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSimpleTask_2001Text(View view) {
		IParser parser = CatalogueParserProvider.getParser(CatalogueElementTypes.SimpleTask_2001,
				view.getElement() != null ? view.getElement() : view,
				CatalogueVisualIDRegistry.getType(SimpleTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CatalogueDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexTask_2002Text(View view) {
		IParser parser = CatalogueParserProvider.getParser(CatalogueElementTypes.ComplexTask_2002,
				view.getElement() != null ? view.getElement() : view,
				CatalogueVisualIDRegistry.getType(ComplexTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CatalogueDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameterDefinition_3001Text(View view) {
		IParser parser = CatalogueParserProvider.getParser(CatalogueElementTypes.ParameterDefinition_3001,
				view.getElement() != null ? view.getElement() : view,
				CatalogueVisualIDRegistry.getType(ParameterDefinitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CatalogueDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return CatalogueEditPart.MODEL_ID.equals(CatalogueVisualIDRegistry.getModelID(view));
	}

}
