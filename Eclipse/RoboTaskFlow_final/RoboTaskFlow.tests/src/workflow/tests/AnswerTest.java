/**
 */
package workflow.tests;

import junit.textui.TestRunner;

import workflow.Answer;
import workflow.WorkflowFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnswerTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnswerTest.class);
	}

	/**
	 * Constructs a new Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Answer getFixture() {
		return (Answer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkflowFactory.eINSTANCE.createAnswer());
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

} //AnswerTest
