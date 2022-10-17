/**
 */
package catalogue;

import org.eclipse.emf.ecore.EObject;
import workflow.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.ParameterDefinition#getName <em>Name</em>}</li>
 *   <li>{@link catalogue.ParameterDefinition#getType <em>Type</em>}</li>
 *   <li>{@link catalogue.ParameterDefinition#getBoundTo <em>Bound To</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getParameterDefinition()
 * @model annotation="gmf.node label='name' label.icon='false' size='120,30' color='144,187,180' border.color='0,0,0'"
 * @generated
 */
public interface ParameterDefinition extends EObject {
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
	 * @see catalogue.CataloguePackage#getParameterDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link catalogue.ParameterDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link catalogue.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see catalogue.ParameterType
	 * @see #setType(ParameterType)
	 * @see catalogue.CataloguePackage#getParameterDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link catalogue.ParameterDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see catalogue.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Bound To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound To</em>' reference.
	 * @see #setBoundTo(Parameter)
	 * @see catalogue.CataloguePackage#getParameterDefinition_BoundTo()
	 * @model
	 * @generated
	 */
	Parameter getBoundTo();

	/**
	 * Sets the value of the '{@link catalogue.ParameterDefinition#getBoundTo <em>Bound To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound To</em>' reference.
	 * @see #getBoundTo()
	 * @generated
	 */
	void setBoundTo(Parameter value);

} // ParameterDefinition
