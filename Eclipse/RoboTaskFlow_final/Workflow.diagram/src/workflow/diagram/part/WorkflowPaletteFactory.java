
/*
 * 
 */
package workflow.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createAnswer2CreationTool());
		paletteContainer.add(createFinal3CreationTool());
		paletteContainer.add(createInitial4CreationTool());
		paletteContainer.add(createLoop5CreationTool());
		paletteContainer.add(createQuestion6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createLink1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivity1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Activity_3002);
		types.add(WorkflowElementTypes.Activity_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Activity1CreationTool_title,
				Messages.Activity1CreationTool_desc, types);
		entry.setId("createActivity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Activity_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnswer2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WorkflowElementTypes.Answer_3007);
		types.add(WorkflowElementTypes.Answer_3008);
		types.add(WorkflowElementTypes.Answer_2006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Answer2CreationTool_title,
				Messages.Answer2CreationTool_desc, types);
		entry.setId("createAnswer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Answer_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinal3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Final_3005);
		types.add(WorkflowElementTypes.Final_2004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Final3CreationTool_title,
				Messages.Final3CreationTool_desc, types);
		entry.setId("createFinal3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Final_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitial4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Initial_3004);
		types.add(WorkflowElementTypes.Initial_2003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Initial4CreationTool_title,
				Messages.Initial4CreationTool_desc, types);
		entry.setId("createInitial4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Initial_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLoop5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Loop_2001);
		types.add(WorkflowElementTypes.Loop_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Loop5CreationTool_title,
				Messages.Loop5CreationTool_desc, types);
		entry.setId("createLoop5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Loop_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQuestion6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.Question_3006);
		types.add(WorkflowElementTypes.Question_2005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Question6CreationTool_title,
				Messages.Question6CreationTool_desc, types);
		entry.setId("createQuestion6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Question_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Link1CreationTool_title,
				Messages.Link1CreationTool_desc, Collections.singletonList(WorkflowElementTypes.Link_4001));
		entry.setId("createLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes.getImageDescriptor(WorkflowElementTypes.Link_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
