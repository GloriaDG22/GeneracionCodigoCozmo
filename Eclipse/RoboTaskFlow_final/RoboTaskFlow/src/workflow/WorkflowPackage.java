/**
 */
package workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workflow.WorkflowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.RoboTaskFlow.org/workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.WorkflowImpl
	 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__LINKS = 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TaskImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.LinkImpl
	 * @see workflow.impl.WorkflowPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ActivityImpl
	 * @see workflow.impl.WorkflowPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARAMETERS = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TASK_DEFINITION = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link workflow.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ParameterImpl
	 * @see workflow.impl.WorkflowPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Param Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAM_DEFINITION = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.InitialImpl
	 * @see workflow.impl.WorkflowPackageImpl#getInitial()
	 * @generated
	 */
	int INITIAL = 5;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__INCOMING = TASK__INCOMING;

	/**
	 * The number of structural features of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.FinalImpl
	 * @see workflow.impl.WorkflowPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 6;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__INCOMING = TASK__INCOMING;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.QuestionImpl
	 * @see workflow.impl.WorkflowPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 7;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANSWERS = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.AnswerImpl
	 * @see workflow.impl.WorkflowPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 8;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ANSWER = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.LoopImpl
	 * @see workflow.impl.WorkflowPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 9;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__TASKS = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LINKS = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__TYPE = TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NUM_ITERATIONS = TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = TASK_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link workflow.LoopType <em>Loop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.LoopType
	 * @see workflow.impl.WorkflowPackageImpl#getLoopType()
	 * @generated
	 */
	int LOOP_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see workflow.Workflow#getTasks()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Workflow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see workflow.Workflow#getLinks()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Links();

	/**
	 * Returns the meta object for class '{@link workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see workflow.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link workflow.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see workflow.Task#getOutgoing()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link workflow.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see workflow.Task#getIncoming()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Incoming();

	/**
	 * Returns the meta object for class '{@link workflow.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see workflow.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link workflow.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see workflow.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link workflow.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see workflow.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for class '{@link workflow.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see workflow.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Activity#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see workflow.Activity#getParameters()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Parameters();

	/**
	 * Returns the meta object for the reference '{@link workflow.Activity#getTaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Definition</em>'.
	 * @see workflow.Activity#getTaskDefinition()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_TaskDefinition();

	/**
	 * Returns the meta object for class '{@link workflow.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see workflow.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see workflow.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the reference '{@link workflow.Parameter#getParamDefinition <em>Param Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param Definition</em>'.
	 * @see workflow.Parameter#getParamDefinition()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParamDefinition();

	/**
	 * Returns the meta object for class '{@link workflow.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see workflow.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for class '{@link workflow.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see workflow.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for class '{@link workflow.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see workflow.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see workflow.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Question#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see workflow.Question#getAnswers()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Answers();

	/**
	 * Returns the meta object for class '{@link workflow.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see workflow.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Answer#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see workflow.Answer#getAnswer()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Answer();

	/**
	 * Returns the meta object for class '{@link workflow.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see workflow.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Loop#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see workflow.Loop#getType()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Type();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Loop#getNumIterations <em>Num Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Iterations</em>'.
	 * @see workflow.Loop#getNumIterations()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_NumIterations();

	/**
	 * Returns the meta object for enum '{@link workflow.LoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loop Type</em>'.
	 * @see workflow.LoopType
	 * @generated
	 */
	EEnum getLoopType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.WorkflowImpl
		 * @see workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TASKS = eINSTANCE.getWorkflow_Tasks();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__LINKS = eINSTANCE.getWorkflow_Links();

		/**
		 * The meta object literal for the '{@link workflow.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TaskImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTGOING = eINSTANCE.getTask_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INCOMING = eINSTANCE.getTask_Incoming();

		/**
		 * The meta object literal for the '{@link workflow.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.LinkImpl
		 * @see workflow.impl.WorkflowPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '{@link workflow.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ActivityImpl
		 * @see workflow.impl.WorkflowPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PARAMETERS = eINSTANCE.getActivity_Parameters();

		/**
		 * The meta object literal for the '<em><b>Task Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TASK_DEFINITION = eINSTANCE.getActivity_TaskDefinition();

		/**
		 * The meta object literal for the '{@link workflow.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ParameterImpl
		 * @see workflow.impl.WorkflowPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Param Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAM_DEFINITION = eINSTANCE.getParameter_ParamDefinition();

		/**
		 * The meta object literal for the '{@link workflow.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.InitialImpl
		 * @see workflow.impl.WorkflowPackageImpl#getInitial()
		 * @generated
		 */
		EClass INITIAL = eINSTANCE.getInitial();

		/**
		 * The meta object literal for the '{@link workflow.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.FinalImpl
		 * @see workflow.impl.WorkflowPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '{@link workflow.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.QuestionImpl
		 * @see workflow.impl.WorkflowPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANSWERS = eINSTANCE.getQuestion_Answers();

		/**
		 * The meta object literal for the '{@link workflow.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.AnswerImpl
		 * @see workflow.impl.WorkflowPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__ANSWER = eINSTANCE.getAnswer_Answer();

		/**
		 * The meta object literal for the '{@link workflow.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.LoopImpl
		 * @see workflow.impl.WorkflowPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__TYPE = eINSTANCE.getLoop_Type();

		/**
		 * The meta object literal for the '<em><b>Num Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__NUM_ITERATIONS = eINSTANCE.getLoop_NumIterations();

		/**
		 * The meta object literal for the '{@link workflow.LoopType <em>Loop Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.LoopType
		 * @see workflow.impl.WorkflowPackageImpl#getLoopType()
		 * @generated
		 */
		EEnum LOOP_TYPE = eINSTANCE.getLoopType();

	}

} //WorkflowPackage
