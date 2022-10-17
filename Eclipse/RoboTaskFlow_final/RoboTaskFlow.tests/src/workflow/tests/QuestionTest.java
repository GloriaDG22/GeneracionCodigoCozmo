/**
 */
package workflow.tests;

import junit.textui.TestRunner;

import workflow.Question;
import workflow.WorkflowFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionTest.class);
	}

	/**
	 * Constructs a new Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Question getFixture() {
		return (Question)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkflowFactory.eINSTANCE.createQuestion());
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

} //QuestionTest
