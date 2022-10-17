/*
* 
*/
package catalogue.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import catalogue.diagram.part.CatalogueVisualIDRegistry;

/**
 * @generated
 */
public class CatalogueNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 3003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 3002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof CatalogueNavigatorItem) {
			CatalogueNavigatorItem item = (CatalogueNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CatalogueVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
