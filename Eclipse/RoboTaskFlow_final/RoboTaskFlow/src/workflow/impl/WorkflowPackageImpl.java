/**
 */
package workflow.impl;

import catalogue.CataloguePackage;
import catalogue.impl.CataloguePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import workflow.Activity;
import workflow.Answer;
import workflow.Final;
import workflow.Initial;
import workflow.Link;
import workflow.Loop;
import workflow.LoopType;
import workflow.Parameter;
import workflow.Question;
import workflow.Task;
import workflow.Workflow;
import workflow.WorkflowFactory;
import workflow.WorkflowPackage;

import workflow.util.WorkflowValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowPackageImpl extends EPackageImpl implements WorkflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loopTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see workflow.WorkflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkflowPackageImpl() {
		super(eNS_URI, WorkflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WorkflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkflowPackage init() {
		if (isInited) return (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

		// Obtain or create and register package
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkflowPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CataloguePackageImpl theCataloguePackage = (CataloguePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) instanceof CataloguePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI) : CataloguePackage.eINSTANCE);

		// Create package meta-data objects
		theWorkflowPackage.createPackageContents();
		theCataloguePackage.createPackageContents();

		// Initialize created meta-data
		theWorkflowPackage.initializePackageContents();
		theCataloguePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWorkflowPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WorkflowValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWorkflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, theWorkflowPackage);
		return theWorkflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Name() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Tasks() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Links() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outgoing() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Incoming() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Source() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Target() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Parameters() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_TaskDefinition() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParamDefinition() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitial() {
		return initialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Question() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Answers() {
		return (EReference)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Answer() {
		return (EAttribute)answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_Type() {
		return (EAttribute)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_NumIterations() {
		return (EAttribute)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoopType() {
		return loopTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactory getWorkflowFactory() {
		return (WorkflowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEReference(workflowEClass, WORKFLOW__TASKS);
		createEReference(workflowEClass, WORKFLOW__LINKS);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__OUTGOING);
		createEReference(taskEClass, TASK__INCOMING);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SOURCE);
		createEReference(linkEClass, LINK__TARGET);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEReference(activityEClass, ACTIVITY__PARAMETERS);
		createEReference(activityEClass, ACTIVITY__TASK_DEFINITION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEReference(parameterEClass, PARAMETER__PARAM_DEFINITION);

		initialEClass = createEClass(INITIAL);

		finalEClass = createEClass(FINAL);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__QUESTION);
		createEReference(questionEClass, QUESTION__ANSWERS);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__ANSWER);

		loopEClass = createEClass(LOOP);
		createEAttribute(loopEClass, LOOP__TYPE);
		createEAttribute(loopEClass, LOOP__NUM_ITERATIONS);

		// Create enums
		loopTypeEEnum = createEEnum(LOOP_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CataloguePackage theCataloguePackage = (CataloguePackage)EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getTask());
		initialEClass.getESuperTypes().add(this.getTask());
		finalEClass.getESuperTypes().add(this.getTask());
		questionEClass.getESuperTypes().add(this.getTask());
		answerEClass.getESuperTypes().add(this.getTask());
		loopEClass.getESuperTypes().add(this.getTask());
		loopEClass.getESuperTypes().add(this.getWorkflow());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Tasks(), this.getTask(), null, "tasks", null, 3, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Links(), this.getLink(), null, "links", null, 2, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Outgoing(), this.getLink(), this.getLink_Source(), "outgoing", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Incoming(), this.getLink(), this.getLink_Target(), "incoming", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Source(), this.getTask(), this.getTask_Outgoing(), "source", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Target(), this.getTask(), this.getTask_Incoming(), "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_TaskDefinition(), theCataloguePackage.getTaskDefinition(), null, "taskDefinition", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ParamDefinition(), theCataloguePackage.getParameterDefinition(), null, "paramDefinition", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialEClass, Initial.class, "Initial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Question(), ecorePackage.getEString(), "question", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Answers(), this.getAnswer(), null, "answers", null, 2, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_Answer(), ecorePackage.getEString(), "answer", null, 1, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoop_Type(), this.getLoopType(), "type", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_NumIterations(), ecorePackage.getEInt(), "numIterations", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(loopTypeEEnum, LoopType.class, "LoopType");
		addEEnumLiteral(loopTypeEEnum, LoopType.WHILE);
		addEEnumLiteral(loopTypeEEnum, LoopType.DO_WHILE);
		addEEnumLiteral(loopTypeEEnum, LoopType.COUNTER_BASED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.node
		createGmf_4Annotations();
		// gmf.affixed
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "constraints", "Workflow_have_one_and_only_one_initial_task Workflow_have_one_or_more_final_task"
		   });	
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "constraints", "Activities_have_one_and_only_one_input_link Activities_have_one_and_only_one_output_link"
		   });	
		addAnnotation
		  (initialEClass, 
		   source, 
		   new String[] {
			 "constraints", "One_and_only_one_output_link"
		   });	
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "constraints", "One_and_only_one_input_link"
		   });	
		addAnnotation
		  (questionEClass, 
		   source, 
		   new String[] {
			 "constraints", "One_and_only_one_input_link"
		   });	
		addAnnotation
		  (answerEClass, 
		   source, 
		   new String[] {
			 "constraints", "Answers_must_belong_to_Question One_and_only_one_output_link"
		   });	
		addAnnotation
		  (loopEClass, 
		   source, 
		   new String[] {
			 "constraints", "Loops_have_one_and_only_one_input_link Loops_have_one_and_only_one_output_link Counter_Based_Loops_must_have_numIterations_greater_than_1"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "Workflow_have_one_and_only_one_initial_task", "self.tasks->selectByType (Initial)->size()=1",
			 "Workflow_have_one_or_more_final_task", "self.tasks->selectByType (Final)->size()>=1"
		   });	
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "Activities_have_one_and_only_one_input_link", "self.incoming->size() = 1",
			 "Activities_have_one_and_only_one_output_link", "self.outgoing->size() = 1"
		   });	
		addAnnotation
		  (initialEClass, 
		   source, 
		   new String[] {
			 "One_and_only_one_output_link", "self.incoming->size() = 0 and self.outgoing->size() = 1"
		   });	
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "One_and_only_one_input_link", "self.outgoing->size() = 0 and self.incoming->size() = 1"
		   });	
		addAnnotation
		  (questionEClass, 
		   source, 
		   new String[] {
			 "One_and_only_one_input_link", "self.outgoing->size() = 0 and self.incoming->size() = 1"
		   });	
		addAnnotation
		  (answerEClass, 
		   source, 
		   new String[] {
			 "Answers_must_belong_to_Question", "self.oclContainer().oclIsTypeOf(Question)",
			 "One_and_only_one_output_link", "self.incoming->size() = 0 and self.outgoing->size() = 1"
		   });	
		addAnnotation
		  (loopEClass, 
		   source, 
		   new String[] {
			 "Loops_have_one_and_only_one_input_link", "self.incoming->size() = 1",
			 "Loops_have_one_and_only_one_output_link", "self.outgoing->size() = 1",
			 "Counter_Based_Loops_must_have_numIterations_greater_than_1", "\n\t\t\tself.type=LoopType::COUNTER_BASED implies numIterations>1"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getWorkflow_Tasks(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getQuestion_Answers(), 
		   source, 
		   new String[] {
			 "collapsible", "true",
			 "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "color", "0,0,0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "130,70",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "label", "name, value",
			 "label.pattern", "{0}: {1}",
			 "label.icon", "false",
			 "size", "130,30",
			 "color", "144,187,180",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (initialEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "size", "70,70",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/RoboTaskFlow/images/Initial.svg"
		   });	
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "size", "70,70",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/RoboTaskFlow/images/Final.svg"
		   });	
		addAnnotation
		  (questionEClass, 
		   source, 
		   new String[] {
			 "label", "question",
			 "label.icon", "true",
			 "color", "227,198,244",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (answerEClass, 
		   source, 
		   new String[] {
			 "label", "answer",
			 "label.pattern", "- {0}",
			 "label.icon", "false",
			 "color", "227,198,244",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (loopEClass, 
		   source, 
		   new String[] {
			 "label", "name, type",
			 "label.pattern", "{0}: {1}",
			 "label.icon", "true",
			 "color", "236,255,244",
			 "border.color", "0,0,0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.affixed";	
		addAnnotation
		  (getActivity_Parameters(), 
		   source, 
		   new String[] {
		   });
	}

} //WorkflowPackageImpl
