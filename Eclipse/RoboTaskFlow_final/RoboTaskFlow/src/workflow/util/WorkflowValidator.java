/**
 */
package workflow.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public class WorkflowValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WorkflowValidator INSTANCE = new WorkflowValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "workflow";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WorkflowPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WorkflowPackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case WorkflowPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case WorkflowPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case WorkflowPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case WorkflowPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case WorkflowPackage.INITIAL:
				return validateInitial((Initial)value, diagnostics, context);
			case WorkflowPackage.FINAL:
				return validateFinal((Final)value, diagnostics, context);
			case WorkflowPackage.QUESTION:
				return validateQuestion((Question)value, diagnostics, context);
			case WorkflowPackage.ANSWER:
				return validateAnswer((Answer)value, diagnostics, context);
			case WorkflowPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case WorkflowPackage.LOOP_TYPE:
				return validateLoopType((LoopType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workflow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_Workflow_have_one_and_only_one_initial_task(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_Workflow_have_one_or_more_final_task(workflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Workflow_have_one_and_only_one_initial_task constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__WORKFLOW_HAVE_ONE_AND_ONLY_ONE_INITIAL_TASK__EEXPRESSION = "self.tasks->selectByType (Initial)->size()=1";

	/**
	 * Validates the Workflow_have_one_and_only_one_initial_task constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_Workflow_have_one_and_only_one_initial_task(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Workflow_have_one_and_only_one_initial_task",
				 WORKFLOW__WORKFLOW_HAVE_ONE_AND_ONLY_ONE_INITIAL_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Workflow_have_one_or_more_final_task constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__WORKFLOW_HAVE_ONE_OR_MORE_FINAL_TASK__EEXPRESSION = "self.tasks->selectByType (Final)->size()>=1";

	/**
	 * Validates the Workflow_have_one_or_more_final_task constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_Workflow_have_one_or_more_final_task(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Workflow_have_one_or_more_final_task",
				 WORKFLOW__WORKFLOW_HAVE_ONE_OR_MORE_FINAL_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Activities_have_one_and_only_one_input_link(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Activities_have_one_and_only_one_output_link(activity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Activities_have_one_and_only_one_input_link constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__ACTIVITIES_HAVE_ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION = "self.incoming->size() = 1";

	/**
	 * Validates the Activities_have_one_and_only_one_input_link constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_Activities_have_one_and_only_one_input_link(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Activities_have_one_and_only_one_input_link",
				 ACTIVITY__ACTIVITIES_HAVE_ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Activities_have_one_and_only_one_output_link constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__ACTIVITIES_HAVE_ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION = "self.outgoing->size() = 1";

	/**
	 * Validates the Activities_have_one_and_only_one_output_link constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_Activities_have_one_and_only_one_output_link(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Activities_have_one_and_only_one_output_link",
				 ACTIVITY__ACTIVITIES_HAVE_ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitial(Initial initial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(initial, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validateInitial_One_and_only_one_output_link(initial, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the One_and_only_one_output_link constraint of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INITIAL__ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION = "self.incoming->size() = 0 and self.outgoing->size() = 1";

	/**
	 * Validates the One_and_only_one_output_link constraint of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitial_One_and_only_one_output_link(Initial initial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.INITIAL,
				 initial,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "One_and_only_one_output_link",
				 INITIAL__ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinal(Final final_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(final_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinal_One_and_only_one_input_link(final_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the One_and_only_one_input_link constraint of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL__ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION = "self.outgoing->size() = 0 and self.incoming->size() = 1";

	/**
	 * Validates the One_and_only_one_input_link constraint of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinal_One_and_only_one_input_link(Final final_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.FINAL,
				 final_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "One_and_only_one_input_link",
				 FINAL__ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(question, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_One_and_only_one_input_link(question, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the One_and_only_one_input_link constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUESTION__ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION = "self.outgoing->size() = 0 and self.incoming->size() = 1";

	/**
	 * Validates the One_and_only_one_input_link constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_One_and_only_one_input_link(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.QUESTION,
				 question,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "One_and_only_one_input_link",
				 QUESTION__ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswer(Answer answer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(answer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnswer_Answers_must_belong_to_Question(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnswer_One_and_only_one_output_link(answer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Answers_must_belong_to_Question constraint of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANSWER__ANSWERS_MUST_BELONG_TO_QUESTION__EEXPRESSION = "self.oclContainer().oclIsTypeOf(Question)";

	/**
	 * Validates the Answers_must_belong_to_Question constraint of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswer_Answers_must_belong_to_Question(Answer answer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.ANSWER,
				 answer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Answers_must_belong_to_Question",
				 ANSWER__ANSWERS_MUST_BELONG_TO_QUESTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the One_and_only_one_output_link constraint of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANSWER__ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION = "self.incoming->size() = 0 and self.outgoing->size() = 1";

	/**
	 * Validates the One_and_only_one_output_link constraint of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswer_One_and_only_one_output_link(Answer answer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.ANSWER,
				 answer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "One_and_only_one_output_link",
				 ANSWER__ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_Workflow_have_one_and_only_one_initial_task(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_Workflow_have_one_or_more_final_task(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoop_Loops_have_one_and_only_one_input_link(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoop_Loops_have_one_and_only_one_output_link(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoop_Counter_Based_Loops_must_have_numIterations_greater_than_1(loop, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Loops_have_one_and_only_one_input_link constraint of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP__LOOPS_HAVE_ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION = "self.incoming->size() = 1";

	/**
	 * Validates the Loops_have_one_and_only_one_input_link constraint of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop_Loops_have_one_and_only_one_input_link(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.LOOP,
				 loop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Loops_have_one_and_only_one_input_link",
				 LOOP__LOOPS_HAVE_ONE_AND_ONLY_ONE_INPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Loops_have_one_and_only_one_output_link constraint of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP__LOOPS_HAVE_ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION = "self.outgoing->size() = 1";

	/**
	 * Validates the Loops_have_one_and_only_one_output_link constraint of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop_Loops_have_one_and_only_one_output_link(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.LOOP,
				 loop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Loops_have_one_and_only_one_output_link",
				 LOOP__LOOPS_HAVE_ONE_AND_ONLY_ONE_OUTPUT_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Counter_Based_Loops_must_have_numIterations_greater_than_1 constraint of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP__COUNTER_BASED_LOOPS_MUST_HAVE_NUM_ITERATIONS_GREATER_THAN_1__EEXPRESSION = "\n" +
		"\t\t\tself.type=LoopType::COUNTER_BASED implies numIterations>1";

	/**
	 * Validates the Counter_Based_Loops_must_have_numIterations_greater_than_1 constraint of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop_Counter_Based_Loops_must_have_numIterations_greater_than_1(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WorkflowPackage.Literals.LOOP,
				 loop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Counter_Based_Loops_must_have_numIterations_greater_than_1",
				 LOOP__COUNTER_BASED_LOOPS_MUST_HAVE_NUM_ITERATIONS_GREATER_THAN_1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopType(LoopType loopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WorkflowValidator
