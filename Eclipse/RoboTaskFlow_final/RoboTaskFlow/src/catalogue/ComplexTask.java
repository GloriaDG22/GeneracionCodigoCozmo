/**
 */
package catalogue;

import workflow.Workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.ComplexTask#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getComplexTask()
 * @model annotation="gmf.node label='name' size='170,70' color='200,200,200' border.color='0,0,0'"
 * @generated
 */
public interface ComplexTask extends TaskDefinition {

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference.
	 * @see #setWorkflow(Workflow)
	 * @see catalogue.CataloguePackage#getComplexTask_Workflow()
	 * @model required="true"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link catalogue.ComplexTask#getWorkflow <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);
} // ComplexTask
