/**
 */
package catalogue.tests;

import catalogue.CatalogueFactory;
import catalogue.SimpleTask;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleTaskTest extends TaskDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleTaskTest.class);
	}

	/**
	 * Constructs a new Simple Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleTask getFixture() {
		return (SimpleTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CatalogueFactory.eINSTANCE.createSimpleTask());
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

} //SimpleTaskTest
