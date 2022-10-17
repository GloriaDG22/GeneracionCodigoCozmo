/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.TaskDefinition#getName <em>Name</em>}</li>
 *   <li>{@link catalogue.TaskDefinition#getParamsDefinitions <em>Params Definitions</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getTaskDefinition()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names='self.paramsDefinitions->isUnique(name)'"
 * @generated
 */
public interface TaskDefinition extends EObject {
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
	 * @see catalogue.CataloguePackage#getTaskDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link catalogue.TaskDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Params Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.ParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params Definitions</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getTaskDefinition_ParamsDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDefinition> getParamsDefinitions();

} // TaskDefinition
