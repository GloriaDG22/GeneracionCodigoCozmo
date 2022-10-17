/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.ComplexTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import workflow.Workflow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.ComplexTaskImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTaskImpl extends TaskDefinitionImpl implements ComplexTask {
	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow workflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.COMPLEX_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		if (workflow != null && workflow.eIsProxy()) {
			InternalEObject oldWorkflow = (InternalEObject)workflow;
			workflow = (Workflow)eResolveProxy(oldWorkflow);
			if (workflow != oldWorkflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CataloguePackage.COMPLEX_TASK__WORKFLOW, oldWorkflow, workflow));
			}
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow basicGetWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		Workflow oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPLEX_TASK__WORKFLOW, oldWorkflow, workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CataloguePackage.COMPLEX_TASK__WORKFLOW:
				if (resolve) return getWorkflow();
				return basicGetWorkflow();
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
		switch (featureID) {
			case CataloguePackage.COMPLEX_TASK__WORKFLOW:
				setWorkflow((Workflow)newValue);

				// Si se cambia el workflow asignado a un ComplexTask poner como nombre
				// del ComplexTask el del workflow
				if(getWorkflow()!=null)
					setName(workflow.getName());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CataloguePackage.COMPLEX_TASK__WORKFLOW:
				setWorkflow((Workflow)null);
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
			case CataloguePackage.COMPLEX_TASK__WORKFLOW:
				return workflow != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexTaskImpl
