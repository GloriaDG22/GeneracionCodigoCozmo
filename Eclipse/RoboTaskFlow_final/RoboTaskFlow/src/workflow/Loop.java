/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Loop#getType <em>Type</em>}</li>
 *   <li>{@link workflow.Loop#getNumIterations <em>Num Iterations</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getLoop()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Loops_have_one_and_only_one_input_link Loops_have_one_and_only_one_output_link Counter_Based_Loops_must_have_numIterations_greater_than_1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Loops_have_one_and_only_one_input_link='self.incoming->size() = 1' Loops_have_one_and_only_one_output_link='self.outgoing->size() = 1' Counter_Based_Loops_must_have_numIterations_greater_than_1='\n\t\t\tself.type=LoopType::COUNTER_BASED implies numIterations>1'"
 *        annotation="gmf.node label='name, type' label.pattern='{0}: {1}' label.icon='true' color='236,255,244' border.color='0,0,0'"
 * @generated
 */
public interface Loop extends Task, Workflow {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link workflow.LoopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see workflow.LoopType
	 * @see #setType(LoopType)
	 * @see workflow.WorkflowPackage#getLoop_Type()
	 * @model required="true"
	 * @generated
	 */
	LoopType getType();

	/**
	 * Sets the value of the '{@link workflow.Loop#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see workflow.LoopType
	 * @see #getType()
	 * @generated
	 */
	void setType(LoopType value);

	/**
	 * Returns the value of the '<em><b>Num Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Iterations</em>' attribute.
	 * @see #setNumIterations(int)
	 * @see workflow.WorkflowPackage#getLoop_NumIterations()
	 * @model
	 * @generated
	 */
	int getNumIterations();

	/**
	 * Sets the value of the '{@link workflow.Loop#getNumIterations <em>Num Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Iterations</em>' attribute.
	 * @see #getNumIterations()
	 * @generated
	 */
	void setNumIterations(int value);

} // Loop
