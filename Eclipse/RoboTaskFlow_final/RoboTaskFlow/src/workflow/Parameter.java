/**
 */
package workflow;

import catalogue.ParameterDefinition;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link workflow.Parameter#getParamDefinition <em>Param Definition</em>}</li>
 * </ul>
 *
 * @see workflow.WorkflowPackage#getParameter()
 * @model annotation="gmf.node label='name, value' label.pattern='{0}: {1}' label.icon='false' size='130,30' color='144,187,180' border.color='0,0,0'"
 * @generated
 */
public interface Parameter extends EObject {
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
	 * @see workflow.WorkflowPackage#getParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see workflow.WorkflowPackage#getParameter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link workflow.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Param Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Definition</em>' reference.
	 * @see #setParamDefinition(ParameterDefinition)
	 * @see workflow.WorkflowPackage#getParameter_ParamDefinition()
	 * @model required="true"
	 * @generated
	 */
	ParameterDefinition getParamDefinition();

	/**
	 * Sets the value of the '{@link workflow.Parameter#getParamDefinition <em>Param Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Definition</em>' reference.
	 * @see #getParamDefinition()
	 * @generated
	 */
	void setParamDefinition(ParameterDefinition value);

} // Parameter
