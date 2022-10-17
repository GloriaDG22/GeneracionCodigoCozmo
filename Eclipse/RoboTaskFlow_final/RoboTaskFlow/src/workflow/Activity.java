/**
 */
package workflow;

import catalogue.TaskDefinition;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Activity#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Activity#getParameters <em>Parameters</em>}</li>
 *   <li>{@link workflow.Activity#getTaskDefinition <em>Task Definition</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getActivity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Activities_have_one_and_only_one_input_link Activities_have_one_and_only_one_output_link'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Activities_have_one_and_only_one_input_link='self.incoming->size() = 1' Activities_have_one_and_only_one_output_link='self.outgoing->size() = 1'"
 *        annotation="gmf.node label='name' size='130,70' border.color='0,0,0'"
 * @generated
 */
public interface Activity extends Task {
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
	 * @see workflow.WorkflowPackage#getActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getActivity_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Task Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Definition</em>' reference.
	 * @see #setTaskDefinition(TaskDefinition)
	 * @see workflow.WorkflowPackage#getActivity_TaskDefinition()
	 * @model required="true"
	 * @generated
	 */
	TaskDefinition getTaskDefinition();

	/**
	 * Sets the value of the '{@link workflow.Activity#getTaskDefinition <em>Task Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Definition</em>' reference.
	 * @see #getTaskDefinition()
	 * @generated
	 */
	void setTaskDefinition(TaskDefinition value);

} // Activity
