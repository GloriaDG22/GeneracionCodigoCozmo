/*
* 
*/
package workflow.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import workflow.diagram.edit.parts.LoopLoopTasksCompartment2EditPart;
import workflow.diagram.edit.parts.LoopLoopTasksCompartmentEditPart;
import workflow.diagram.edit.parts.ParameterEditPart;
import workflow.diagram.edit.parts.Question2EditPart;
import workflow.diagram.edit.parts.QuestionEditPart;
import workflow.diagram.edit.parts.QuestionQuestionAnswersCompartment2EditPart;
import workflow.diagram.edit.parts.QuestionQuestionAnswersCompartmentEditPart;
import workflow.diagram.edit.parts.WorkflowEditPart;
import workflow.diagram.part.Messages;
import workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class WorkflowNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public WorkflowNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<WorkflowNavigatorItem> result = new ArrayList<WorkflowNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, WorkflowEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof WorkflowNavigatorGroup) {
			WorkflowNavigatorGroup group = (WorkflowNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WorkflowNavigatorItem) {
			WorkflowNavigatorItem navigatorItem = (WorkflowNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {

		case WorkflowEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			WorkflowNavigatorGroup links = new WorkflowNavigatorGroup(Messages.NavigatorGroupName_Workflow_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(InitialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(FinalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(QuestionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(AnswerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case LoopEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Loop_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Loop_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Activity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Initial2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Final2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Question2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Answer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InitialEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Initial_2003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Initial_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FinalEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Final_2004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Final_2004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case QuestionEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Question_2005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Question_2005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(QuestionQuestionAnswersCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Answer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AnswerEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Answer_2006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Answer_2006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Loop2EditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Activity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Initial2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Final2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Question2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopLoopTasksCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Answer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Activity2EditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Activity_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Activity_3002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Initial2EditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Initial_3004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Initial_3004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Final2EditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Final_3005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Final_3005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Question2EditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Question_3006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Question_3006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(QuestionQuestionAnswersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WorkflowVisualIDRegistry.getType(Answer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Answer2EditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Answer_3007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Answer_3007_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Answer3EditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkflowNavigatorGroup incominglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Answer_3008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WorkflowNavigatorGroup outgoinglinks = new WorkflowNavigatorGroup(
					Messages.NavigatorGroupName_Answer_3008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LinkEditPart.VISUAL_ID: {
			LinkedList<WorkflowAbstractNavigatorItem> result = new LinkedList<WorkflowAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkflowNavigatorGroup target = new WorkflowNavigatorGroup(Messages.NavigatorGroupName_Link_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkflowNavigatorGroup source = new WorkflowNavigatorGroup(Messages.NavigatorGroupName_Link_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(InitialEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(FinalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(QuestionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(AnswerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Activity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Initial2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Final2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Question2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Answer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Answer3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(InitialEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(FinalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(QuestionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(AnswerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Activity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Initial2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Final2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Question2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Answer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkflowVisualIDRegistry.getType(Answer3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WorkflowEditPart.MODEL_ID.equals(WorkflowVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<WorkflowNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<WorkflowNavigatorItem> result = new ArrayList<WorkflowNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new WorkflowNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<WorkflowNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof WorkflowAbstractNavigatorItem) {
			WorkflowAbstractNavigatorItem abstractNavigatorItem = (WorkflowAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
