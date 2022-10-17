/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Question#getQuestion <em>Question</em>}</li>
 *   <li>{@link workflow.Question#getAnswers <em>Answers</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='One_and_only_one_input_link'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot One_and_only_one_input_link='self.outgoing->size() = 0 and self.incoming->size() = 1'"
 *        annotation="gmf.node label='question' label.icon='true' color='227,198,244' border.color='0,0,0'"
 * @generated
 */
public interface Question extends Task {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see workflow.WorkflowPackage#getQuestion_Question()
	 * @model required="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link workflow.Question#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getQuestion_Answers()
	 * @model containment="true" lower="2"
	 *        annotation="gmf.compartment collapsible='true' layout='list'"
	 * @generated
	 */
	EList<Answer> getAnswers();

} // Question
