/**
 */
package workflow.impl;

import catalogue.TaskDefinition;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Activity;
import workflow.Parameter;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.ActivityImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link workflow.impl.ActivityImpl#getTaskDefinition <em>Task Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends TaskImpl implements Activity {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getTaskDefinition() <em>Task Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDefinition()
	 * @generated
	 * @ordered
	 */
	protected TaskDefinition taskDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, WorkflowPackage.ACTIVITY__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition getTaskDefinition() {
		if (taskDefinition != null && taskDefinition.eIsProxy()) {
			InternalEObject oldTaskDefinition = (InternalEObject)taskDefinition;
			taskDefinition = (TaskDefinition)eResolveProxy(oldTaskDefinition);
			if (taskDefinition != oldTaskDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ACTIVITY__TASK_DEFINITION, oldTaskDefinition, taskDefinition));
			}
		}
		return taskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition basicGetTaskDefinition() {
		return taskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskDefinition(TaskDefinition newTaskDefinition) {
		TaskDefinition oldTaskDefinition = taskDefinition;
		taskDefinition = newTaskDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__TASK_DEFINITION, oldTaskDefinition, taskDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.ACTIVITY__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.ACTIVITY__NAME:
				return getName();
			case WorkflowPackage.ACTIVITY__PARAMETERS:
				return getParameters();
			case WorkflowPackage.ACTIVITY__TASK_DEFINITION:
				if (resolve) return getTaskDefinition();
				return basicGetTaskDefinition();
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
		System.out.println("eSet ActivityImpl " + getName());
		switch (featureID) {
			case WorkflowPackage.ACTIVITY__NAME:
				setName((String)newValue);
				System.out.println("Modificando NAME");
				return;
			
			case WorkflowPackage.ACTIVITY__PARAMETERS:
				System.out.println("Modificando PARAMETERS");
				System.out.println("Intento ilegal de modificar parametros");
				copyParameter();
				return;
				
			case WorkflowPackage.ACTIVITY__TASK_DEFINITION:
				System.out.println("Modificando TASK DEFINITION " );
				if(getTaskDefinition()!=null){
					// se ha cambiado la taskDefinition pero se ha vuelto a poner la misma => no hacer nada!!
					if (getTaskDefinition().getName().equals(((TaskDefinition)newValue).getName())) {
						System.out.println("Intento de cambiar la taskdefinition por ella misma... No se hace nada");
						setTaskDefinition((TaskDefinition)newValue);
					}
					else {
						// Cargar la nueva definicion y copiar sus parámetros
						System.out.println("cambio de taskdefinition... Copiar parámetros");
						setTaskDefinition((TaskDefinition)newValue);
						
						copyParameter();
					}
						
				}
				else { // Cuando se añade una TaskDefinition la primera vez
					System.out.println("Asigna nueva TASK DEFINITION " + ((TaskDefinition)newValue).getName());
					setTaskDefinition((TaskDefinition)newValue);
					
					if(((TaskDefinition)newValue).getName() != null){ //si no hay valor no hacer nada
						System.out.println("Asigna nueva PARAM DEFINITION ");
						// Cargar la nueva definicion y copiar sus parámetros
						copyParameter();
					}
				}
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	public void copyParameter(){
		ParameterImpl param;
		if (taskDefinition.getParamsDefinitions()!=null){
			getParameters().clear();
			for(int i=0; i<taskDefinition.getParamsDefinitions().size(); i++){
				// Para cada paramDefinition en la nueva TaskDefinition
				param = new ParameterImpl();
				// Ponemos su nombre como el del paramDefinition
				param.setName(taskDefinition.getParamsDefinitions().get(i).getName() + "_" + getName());
				// Enlazamos el parametro con su paramDefinition
				param.setParamDefinition(taskDefinition.getParamsDefinitions().get(i));
				getParameters().add((Parameter) param);

			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.ACTIVITY__PARAMETERS:
				getParameters().clear();
				return;
			case WorkflowPackage.ACTIVITY__TASK_DEFINITION:
				setTaskDefinition((TaskDefinition)null);
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
			case WorkflowPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.ACTIVITY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WorkflowPackage.ACTIVITY__TASK_DEFINITION:
				return taskDefinition != null;
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
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
