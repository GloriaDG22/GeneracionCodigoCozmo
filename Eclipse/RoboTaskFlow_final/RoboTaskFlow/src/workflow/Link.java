/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Link#getSource <em>Source</em>}</li>
 *   <li>{@link workflow.Link#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getLink()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' color='0,0,0'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Task)
	 * @see workflow.WorkflowPackage#getLink_Source()
	 * @see workflow.Task#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Task getSource();

	/**
	 * Sets the value of the '{@link workflow.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Task value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Task)
	 * @see workflow.WorkflowPackage#getLink_Target()
	 * @see workflow.Task#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Task getTarget();

	/**
	 * Sets the value of the '{@link workflow.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Task value);

} // Link
