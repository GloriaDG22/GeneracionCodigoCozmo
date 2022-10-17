
/*
 * 
 */
package catalogue.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import catalogue.diagram.providers.CatalogueElementTypes;

/**
 * @generated
 */
public class CataloguePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createComplexTask1CreationTool());
		paletteContainer.add(createParameterDefinition2CreationTool());
		paletteContainer.add(createSimpleTask3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createComplexTask1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComplexTask1CreationTool_title,
				Messages.ComplexTask1CreationTool_desc,
				Collections.singletonList(CatalogueElementTypes.ComplexTask_2002));
		entry.setId("createComplexTask1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CatalogueElementTypes.getImageDescriptor(CatalogueElementTypes.ComplexTask_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParameterDefinition2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ParameterDefinition2CreationTool_title,
				Messages.ParameterDefinition2CreationTool_desc,
				Collections.singletonList(CatalogueElementTypes.ParameterDefinition_3001));
		entry.setId("createParameterDefinition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CatalogueElementTypes.getImageDescriptor(CatalogueElementTypes.ParameterDefinition_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSimpleTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SimpleTask3CreationTool_title,
				Messages.SimpleTask3CreationTool_desc,
				Collections.singletonList(CatalogueElementTypes.SimpleTask_2001));
		entry.setId("createSimpleTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CatalogueElementTypes.getImageDescriptor(CatalogueElementTypes.SimpleTask_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
