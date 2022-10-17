/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Catalogue#getName <em>Name</em>}</li>
 *   <li>{@link catalogue.Catalogue#getGathers <em>Gathers</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getCatalogue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TaskDefinitions_must_have_unique_names'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TaskDefinitions_must_have_unique_names='self.gathers->isUnique(name)'"
 * @generated
 */
public interface Catalogue extends EObject {
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
	 * @see catalogue.CataloguePackage#getCatalogue_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link catalogue.Catalogue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gathers</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.TaskDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gathers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gathers</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getCatalogue_Gathers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskDefinition> getGathers();

} // Catalogue
