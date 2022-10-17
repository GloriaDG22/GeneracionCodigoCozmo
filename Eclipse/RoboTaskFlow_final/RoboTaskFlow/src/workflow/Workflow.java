/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Workflow#getTasks <em>Tasks</em>}</li>
 *   <li>{@link workflow.Workflow#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getWorkflow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Workflow_have_one_and_only_one_initial_task Workflow_have_one_or_more_final_task'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Workflow_have_one_and_only_one_initial_task='self.tasks->selectByType (Initial)->size()=1' Workflow_have_one_or_more_final_task='self.tasks->selectByType (Final)->size()>=1'"
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflow.WorkflowPackage#getWorkflow_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_Tasks()
	 * @model containment="true" lower="3"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_Links()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Link> getLinks();

} // Workflow
