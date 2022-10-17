/**
 */
package catalogue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see catalogue.CataloguePackage
 * @generated
 */
public interface CatalogueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogueFactory eINSTANCE = catalogue.impl.CatalogueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalogue</em>'.
	 * @generated
	 */
	Catalogue createCatalogue();

	/**
	 * Returns a new object of class '<em>Simple Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Task</em>'.
	 * @generated
	 */
	SimpleTask createSimpleTask();

	/**
	 * Returns a new object of class '<em>Complex Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Task</em>'.
	 * @generated
	 */
	ComplexTask createComplexTask();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CataloguePackage getCataloguePackage();

} //CatalogueFactory
