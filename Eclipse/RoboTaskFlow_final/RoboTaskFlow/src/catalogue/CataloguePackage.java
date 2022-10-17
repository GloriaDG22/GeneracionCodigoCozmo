/**
 */
package catalogue;

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
 * @see catalogue.CatalogueFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CataloguePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalogue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.RoboTaskFlow.org/catalogue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalogue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CataloguePackage eINSTANCE = catalogue.impl.CataloguePackageImpl.init();

	/**
	 * The meta object id for the '{@link catalogue.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.CatalogueImpl
	 * @see catalogue.impl.CataloguePackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gathers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__GATHERS = 1;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link catalogue.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.TaskDefinitionImpl
	 * @see catalogue.impl.CataloguePackageImpl#getTaskDefinition()
	 * @generated
	 */
	int TASK_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Params Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__PARAMS_DEFINITIONS = 1;

	/**
	 * The number of structural features of the '<em>Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link catalogue.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.SimpleTaskImpl
	 * @see catalogue.impl.CataloguePackageImpl#getSimpleTask()
	 * @generated
	 */
	int SIMPLE_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__NAME = TASK_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Params Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__PARAMS_DEFINITIONS = TASK_DEFINITION__PARAMS_DEFINITIONS;

	/**
	 * The number of structural features of the '<em>Simple Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK_FEATURE_COUNT = TASK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.ComplexTaskImpl <em>Complex Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.ComplexTaskImpl
	 * @see catalogue.impl.CataloguePackageImpl#getComplexTask()
	 * @generated
	 */
	int COMPLEX_TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TASK__NAME = TASK_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Params Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TASK__PARAMS_DEFINITIONS = TASK_DEFINITION__PARAMS_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TASK__WORKFLOW = TASK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TASK_FEATURE_COUNT = TASK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link catalogue.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.ParameterDefinitionImpl
	 * @see catalogue.impl.CataloguePackageImpl#getParameterDefinition()
	 * @generated
	 */
	int PARAMETER_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Bound To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__BOUND_TO = 2;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link catalogue.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.ParameterType
	 * @see catalogue.impl.CataloguePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link catalogue.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see catalogue.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Catalogue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see catalogue.Catalogue#getName()
	 * @see #getCatalogue()
	 * @generated
	 */
	EAttribute getCatalogue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Catalogue#getGathers <em>Gathers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gathers</em>'.
	 * @see catalogue.Catalogue#getGathers()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Gathers();

	/**
	 * Returns the meta object for class '{@link catalogue.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Definition</em>'.
	 * @see catalogue.TaskDefinition
	 * @generated
	 */
	EClass getTaskDefinition();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.TaskDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see catalogue.TaskDefinition#getName()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EAttribute getTaskDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.TaskDefinition#getParamsDefinitions <em>Params Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params Definitions</em>'.
	 * @see catalogue.TaskDefinition#getParamsDefinitions()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_ParamsDefinitions();

	/**
	 * Returns the meta object for class '{@link catalogue.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Task</em>'.
	 * @see catalogue.SimpleTask
	 * @generated
	 */
	EClass getSimpleTask();

	/**
	 * Returns the meta object for class '{@link catalogue.ComplexTask <em>Complex Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Task</em>'.
	 * @see catalogue.ComplexTask
	 * @generated
	 */
	EClass getComplexTask();

	/**
	 * Returns the meta object for the reference '{@link catalogue.ComplexTask#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow</em>'.
	 * @see catalogue.ComplexTask#getWorkflow()
	 * @see #getComplexTask()
	 * @generated
	 */
	EReference getComplexTask_Workflow();

	/**
	 * Returns the meta object for class '{@link catalogue.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see catalogue.ParameterDefinition
	 * @generated
	 */
	EClass getParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.ParameterDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see catalogue.ParameterDefinition#getName()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EAttribute getParameterDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.ParameterDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see catalogue.ParameterDefinition#getType()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EAttribute getParameterDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link catalogue.ParameterDefinition#getBoundTo <em>Bound To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound To</em>'.
	 * @see catalogue.ParameterDefinition#getBoundTo()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_BoundTo();

	/**
	 * Returns the meta object for enum '{@link catalogue.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see catalogue.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogueFactory getCatalogueFactory();

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
		 * The meta object literal for the '{@link catalogue.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.CatalogueImpl
		 * @see catalogue.impl.CataloguePackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE__NAME = eINSTANCE.getCatalogue_Name();

		/**
		 * The meta object literal for the '<em><b>Gathers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__GATHERS = eINSTANCE.getCatalogue_Gathers();

		/**
		 * The meta object literal for the '{@link catalogue.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.TaskDefinitionImpl
		 * @see catalogue.impl.CataloguePackageImpl#getTaskDefinition()
		 * @generated
		 */
		EClass TASK_DEFINITION = eINSTANCE.getTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEFINITION__NAME = eINSTANCE.getTaskDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Params Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__PARAMS_DEFINITIONS = eINSTANCE.getTaskDefinition_ParamsDefinitions();

		/**
		 * The meta object literal for the '{@link catalogue.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.SimpleTaskImpl
		 * @see catalogue.impl.CataloguePackageImpl#getSimpleTask()
		 * @generated
		 */
		EClass SIMPLE_TASK = eINSTANCE.getSimpleTask();

		/**
		 * The meta object literal for the '{@link catalogue.impl.ComplexTaskImpl <em>Complex Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.ComplexTaskImpl
		 * @see catalogue.impl.CataloguePackageImpl#getComplexTask()
		 * @generated
		 */
		EClass COMPLEX_TASK = eINSTANCE.getComplexTask();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TASK__WORKFLOW = eINSTANCE.getComplexTask_Workflow();

		/**
		 * The meta object literal for the '{@link catalogue.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.ParameterDefinitionImpl
		 * @see catalogue.impl.CataloguePackageImpl#getParameterDefinition()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION__NAME = eINSTANCE.getParameterDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION__TYPE = eINSTANCE.getParameterDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Bound To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__BOUND_TO = eINSTANCE.getParameterDefinition_BoundTo();

		/**
		 * The meta object literal for the '{@link catalogue.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.ParameterType
		 * @see catalogue.impl.CataloguePackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

	}

} //CataloguePackage
