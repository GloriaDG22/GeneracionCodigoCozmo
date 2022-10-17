/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Answer#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getAnswer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Answers_must_belong_to_Question One_and_only_one_output_link'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Answers_must_belong_to_Question='self.oclContainer().oclIsTypeOf(Question)' One_and_only_one_output_link='self.incoming->size() = 0 and self.outgoing->size() = 1'"
 *        annotation="gmf.node label='answer' label.pattern='- {0}' label.icon='false' color='227,198,244' border.color='0,0,0'"
 * @generated
 */
public interface Answer extends Task {
	/**
	 * Returns the value of the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' attribute.
	 * @see #setAnswer(String)
	 * @see workflow.WorkflowPackage#getAnswer_Answer()
	 * @model required="true"
	 * @generated
	 */
	String getAnswer();

	/**
	 * Sets the value of the '{@link workflow.Answer#getAnswer <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' attribute.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(String value);

} // Answer
