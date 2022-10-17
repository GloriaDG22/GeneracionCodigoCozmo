/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Task#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link workflow.Task#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(Link)
	 * @see workflow.WorkflowPackage#getTask_Outgoing()
	 * @see workflow.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Link getOutgoing();

	/**
	 * Sets the value of the '{@link workflow.Task#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(Link value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Link)
	 * @see workflow.WorkflowPackage#getTask_Incoming()
	 * @see workflow.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Link getIncoming();

	/**
	 * Sets the value of the '{@link workflow.Task#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Link value);

} // Task
