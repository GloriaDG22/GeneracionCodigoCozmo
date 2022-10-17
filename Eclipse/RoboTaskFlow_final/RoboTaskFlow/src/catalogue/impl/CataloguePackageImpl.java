/**
 */
package catalogue.impl;

import catalogue.Catalogue;
import catalogue.CatalogueFactory;
import catalogue.CataloguePackage;
import catalogue.ComplexTask;
import catalogue.ParameterDefinition;
import catalogue.ParameterType;
import catalogue.SimpleTask;
import catalogue.TaskDefinition;

import catalogue.util.CatalogueValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import workflow.WorkflowPackage;
import workflow.impl.WorkflowPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CataloguePackageImpl extends EPackageImpl implements CataloguePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

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
	 * @see catalogue.CataloguePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CataloguePackageImpl() {
		super(eNS_URI, CatalogueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CataloguePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CataloguePackage init() {
		if (isInited) return (CataloguePackage)EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI);

		// Obtain or create and register package
		CataloguePackageImpl theCataloguePackage = (CataloguePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CataloguePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CataloguePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);

		// Create package meta-data objects
		theCataloguePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();

		// Initialize created meta-data
		theCataloguePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCataloguePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CatalogueValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCataloguePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CataloguePackage.eNS_URI, theCataloguePackage);
		return theCataloguePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogue() {
		return catalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogue_Name() {
		return (EAttribute)catalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogue_Gathers() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDefinition() {
		return taskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskDefinition_Name() {
		return (EAttribute)taskDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDefinition_ParamsDefinitions() {
		return (EReference)taskDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTask() {
		return simpleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexTask() {
		return complexTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexTask_Workflow() {
		return (EReference)complexTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinition_Name() {
		return (EAttribute)parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinition_Type() {
		return (EAttribute)parameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDefinition_BoundTo() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueFactory getCatalogueFactory() {
		return (CatalogueFactory)getEFactoryInstance();
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
		catalogueEClass = createEClass(CATALOGUE);
		createEAttribute(catalogueEClass, CATALOGUE__NAME);
		createEReference(catalogueEClass, CATALOGUE__GATHERS);

		taskDefinitionEClass = createEClass(TASK_DEFINITION);
		createEAttribute(taskDefinitionEClass, TASK_DEFINITION__NAME);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__PARAMS_DEFINITIONS);

		simpleTaskEClass = createEClass(SIMPLE_TASK);

		complexTaskEClass = createEClass(COMPLEX_TASK);
		createEReference(complexTaskEClass, COMPLEX_TASK__WORKFLOW);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__NAME);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__TYPE);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__BOUND_TO);

		// Create enums
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
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
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleTaskEClass.getESuperTypes().add(this.getTaskDefinition());
		complexTaskEClass.getESuperTypes().add(this.getTaskDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(catalogueEClass, Catalogue.class, "Catalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogue_Name(), ecorePackage.getEString(), "name", null, 1, 1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_Gathers(), this.getTaskDefinition(), null, "gathers", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDefinitionEClass, TaskDefinition.class, "TaskDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_ParamsDefinitions(), this.getParameterDefinition(), null, "paramsDefinitions", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTaskEClass, SimpleTask.class, "SimpleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexTaskEClass, ComplexTask.class, "ComplexTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexTask_Workflow(), theWorkflowPackage.getWorkflow(), null, "workflow", null, 1, 1, ComplexTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinition_Type(), this.getParameterType(), "type", null, 1, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_BoundTo(), theWorkflowPackage.getParameter(), null, "boundTo", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.NUMBER);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BOOLEAN);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.affixed
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
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
		  (catalogueEClass, 
		   source, 
		   new String[] {
			 "constraints", "TaskDefinitions_must_have_unique_names"
		   });	
		addAnnotation
		  (taskDefinitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names"
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
		  (catalogueEClass, 
		   source, 
		   new String[] {
			 "TaskDefinitions_must_have_unique_names", "self.gathers->isUnique(name)"
		   });	
		addAnnotation
		  (taskDefinitionEClass, 
		   source, 
		   new String[] {
			 "ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names", "self.paramsDefinitions->isUnique(name)"
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
		  (catalogueEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.affixed";	
		addAnnotation
		  (getTaskDefinition_ParamsDefinitions(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (simpleTaskEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "130,70",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (complexTaskEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "size", "170,70",
			 "color", "200,200,200",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (parameterDefinitionEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "size", "120,30",
			 "color", "144,187,180",
			 "border.color", "0,0,0"
		   });
	}

} //CataloguePackageImpl
