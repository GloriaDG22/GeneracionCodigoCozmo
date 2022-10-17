/**
 */
package catalogue.util;

import catalogue.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see catalogue.CataloguePackage
 * @generated
 */
public class CatalogueValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CatalogueValidator INSTANCE = new CatalogueValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "catalogue";

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
	public CatalogueValidator() {
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
	  return CataloguePackage.eINSTANCE;
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
			case CataloguePackage.CATALOGUE:
				return validateCatalogue((Catalogue)value, diagnostics, context);
			case CataloguePackage.TASK_DEFINITION:
				return validateTaskDefinition((TaskDefinition)value, diagnostics, context);
			case CataloguePackage.SIMPLE_TASK:
				return validateSimpleTask((SimpleTask)value, diagnostics, context);
			case CataloguePackage.COMPLEX_TASK:
				return validateComplexTask((ComplexTask)value, diagnostics, context);
			case CataloguePackage.PARAMETER_DEFINITION:
				return validateParameterDefinition((ParameterDefinition)value, diagnostics, context);
			case CataloguePackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogue(Catalogue catalogue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(catalogue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(catalogue, diagnostics, context);
		if (result || diagnostics != null) result &= validateCatalogue_TaskDefinitions_must_have_unique_names(catalogue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TaskDefinitions_must_have_unique_names constraint of '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CATALOGUE__TASK_DEFINITIONS_MUST_HAVE_UNIQUE_NAMES__EEXPRESSION = "self.gathers->isUnique(name)";

	/**
	 * Validates the TaskDefinitions_must_have_unique_names constraint of '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogue_TaskDefinitions_must_have_unique_names(Catalogue catalogue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CataloguePackage.Literals.CATALOGUE,
				 catalogue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TaskDefinitions_must_have_unique_names",
				 CATALOGUE__TASK_DEFINITIONS_MUST_HAVE_UNIQUE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskDefinition(TaskDefinition taskDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taskDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(taskDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskDefinition_ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names(taskDefinition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names constraint of '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK_DEFINITION__PARAMETER_DEFINITIONS_OF_ATASK_DEFINITION_MUST_HAVE_UNIQUE_NAMES__EEXPRESSION = "self.paramsDefinitions->isUnique(name)";

	/**
	 * Validates the ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names constraint of '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskDefinition_ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names(TaskDefinition taskDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CataloguePackage.Literals.TASK_DEFINITION,
				 taskDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names",
				 TASK_DEFINITION__PARAMETER_DEFINITIONS_OF_ATASK_DEFINITION_MUST_HAVE_UNIQUE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleTask(SimpleTask simpleTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskDefinition_ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names(simpleTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexTask(ComplexTask complexTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(complexTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(complexTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaskDefinition_ParameterDefinitions_of_a_TaskDefinition_must_have_unique_names(complexTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDefinition(ParameterDefinition parameterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //CatalogueValidator
