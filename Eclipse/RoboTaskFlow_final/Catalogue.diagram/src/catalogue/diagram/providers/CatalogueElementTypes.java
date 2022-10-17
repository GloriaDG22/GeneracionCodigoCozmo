/*
 * 
 */
package catalogue.diagram.providers;

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

import catalogue.CataloguePackage;
import catalogue.diagram.edit.parts.CatalogueEditPart;
import catalogue.diagram.edit.parts.ComplexTaskEditPart;
import catalogue.diagram.edit.parts.ParameterDefinitionEditPart;
import catalogue.diagram.edit.parts.SimpleTaskEditPart;
import catalogue.diagram.part.CatalogueDiagramEditorPlugin;

/**
 * @generated
 */
public class CatalogueElementTypes {

	/**
	* @generated
	*/
	private CatalogueElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CatalogueDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Catalogue_1000 = getElementType("Catalogue.diagram.Catalogue_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleTask_2001 = getElementType("Catalogue.diagram.SimpleTask_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexTask_2002 = getElementType("Catalogue.diagram.ComplexTask_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ParameterDefinition_3001 = getElementType(
			"Catalogue.diagram.ParameterDefinition_3001"); //$NON-NLS-1$

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

			elements.put(Catalogue_1000, CataloguePackage.eINSTANCE.getCatalogue());

			elements.put(SimpleTask_2001, CataloguePackage.eINSTANCE.getSimpleTask());

			elements.put(ComplexTask_2002, CataloguePackage.eINSTANCE.getComplexTask());

			elements.put(ParameterDefinition_3001, CataloguePackage.eINSTANCE.getParameterDefinition());
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
			KNOWN_ELEMENT_TYPES.add(Catalogue_1000);
			KNOWN_ELEMENT_TYPES.add(SimpleTask_2001);
			KNOWN_ELEMENT_TYPES.add(ComplexTask_2002);
			KNOWN_ELEMENT_TYPES.add(ParameterDefinition_3001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CatalogueEditPart.VISUAL_ID:
			return Catalogue_1000;
		case SimpleTaskEditPart.VISUAL_ID:
			return SimpleTask_2001;
		case ComplexTaskEditPart.VISUAL_ID:
			return ComplexTask_2002;
		case ParameterDefinitionEditPart.VISUAL_ID:
			return ParameterDefinition_3001;
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
			return catalogue.diagram.providers.CatalogueElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return catalogue.diagram.providers.CatalogueElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return catalogue.diagram.providers.CatalogueElementTypes.getElement(elementTypeAdapter);
		}
	};

}
