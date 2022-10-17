/**
 */
package workflow.impl;

import catalogue.ParameterDefinition;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workflow.Parameter;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link workflow.impl.ParameterImpl#getParamDefinition <em>Param Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParamDefinition() <em>Param Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamDefinition()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition paramDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition getParamDefinition() {
		if (paramDefinition != null && paramDefinition.eIsProxy()) {
			InternalEObject oldParamDefinition = (InternalEObject)paramDefinition;
			paramDefinition = (ParameterDefinition)eResolveProxy(oldParamDefinition);
			if (paramDefinition != oldParamDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.PARAMETER__PARAM_DEFINITION, oldParamDefinition, paramDefinition));
			}
		}
		return paramDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition basicGetParamDefinition() {
		return paramDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamDefinition(ParameterDefinition newParamDefinition) {
		ParameterDefinition oldParamDefinition = paramDefinition;
		paramDefinition = newParamDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PARAMETER__PARAM_DEFINITION, oldParamDefinition, paramDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.PARAMETER__NAME:
				return getName();
			case WorkflowPackage.PARAMETER__VALUE:
				return getValue();
			case WorkflowPackage.PARAMETER__PARAM_DEFINITION:
				if (resolve) return getParamDefinition();
				return basicGetParamDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		ActivityImpl containerActivity;
		System.out.println("eSet ParameterImpl " + getName());
		switch (featureID) {
			case WorkflowPackage.PARAMETER__NAME:

				System.out.println("eSet ParameterImpl");
				if(getName()!=null){

					System.out.println("NO ES null");
					setParamDefinition((ParameterDefinition)null);	
					containerActivity = (ActivityImpl)eContainer();
					containerActivity.eSet(WorkflowPackage.ACTIVITY__PARAMETERS, (String)newValue);
				}else{
					setName((String)newValue);
					// Si existe una relación del parametro con paramDefinition 
					// se queda el nombre de ParamDef
					if(getParamDefinition()!=null){
	
						System.out.println("set param def");
						containerActivity = (ActivityImpl)eContainer();
						setName(paramDefinition.getName() + "_" + containerActivity.getName());
					}
				}
				return;
			case WorkflowPackage.PARAMETER__VALUE:
				System.out.println("eSet ParameterImpl => Setting PARAMETER__VALUE: "+ getValue() + " => " + (String) newValue);
				setValue((String)newValue);
				return;
			case WorkflowPackage.PARAMETER__PARAM_DEFINITION:

				System.out.println("eSet Modificar definición");
				if(getParamDefinition()!=null){

					System.out.println("NO ES null");
					setParamDefinition((ParameterDefinition)null);	
					containerActivity = (ActivityImpl)eContainer();
					containerActivity.eSet(WorkflowPackage.ACTIVITY__PARAMETERS, (ParameterDefinition)newValue);
				}else{
					setParamDefinition((ParameterDefinition)newValue);
					
				}
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	@Override
	public void eUnset(int featureID) {
		ActivityImpl containerActivity;
		switch (featureID) {
			case WorkflowPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case WorkflowPackage.PARAMETER__PARAM_DEFINITION:

				System.out.println("eUnSet ParameterImpl");
				// Se entra aquí al borrar un parametro de la actividad => Volver a cargar los parámetros de la definición
				// Borra el enlace entre el param actual y su paramDefinition
				setParamDefinition((ParameterDefinition)null);	
				containerActivity = (ActivityImpl)eContainer();
				containerActivity.eSet(WorkflowPackage.ACTIVITY__PARAMETERS, null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case WorkflowPackage.PARAMETER__PARAM_DEFINITION:
				return paramDefinition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
