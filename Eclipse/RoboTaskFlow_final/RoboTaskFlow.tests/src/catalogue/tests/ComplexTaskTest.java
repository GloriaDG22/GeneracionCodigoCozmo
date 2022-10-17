/**
 */
package catalogue.tests;

import catalogue.CatalogueFactory;
import catalogue.ComplexTask;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexTaskTest extends TaskDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplexTaskTest.class);
	}

	/**
	 * Constructs a new Complex Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complex Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComplexTask getFixture() {
		return (ComplexTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CatalogueFactory.eINSTANCE.createComplexTask());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ComplexTaskTest
