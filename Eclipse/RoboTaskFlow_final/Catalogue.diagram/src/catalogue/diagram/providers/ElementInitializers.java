/*
 * 
 */
package catalogue.diagram.providers;

import catalogue.diagram.part.CatalogueDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CatalogueDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CatalogueDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
