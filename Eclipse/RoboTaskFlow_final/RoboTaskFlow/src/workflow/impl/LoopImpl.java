/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Link;
import workflow.Loop;
import workflow.LoopType;
import workflow.Task;
import workflow.Workflow;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.LoopImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.LoopImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link workflow.impl.LoopImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link workflow.impl.LoopImpl#getType <em>Type</em>}</li>
 *   <li>{@link workflow.impl.LoopImpl#getNumIterations <em>Num Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends TaskImpl implements Loop {
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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LoopType TYPE_EDEFAULT = LoopType.WHILE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LoopType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumIterations() <em>Num Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumIterations() <em>Num Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumIterations()
	 * @generated
	 * @ordered
	 */
	protected int numIterations = NUM_ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.LOOP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.LOOP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, WorkflowPackage.LOOP__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, WorkflowPackage.LOOP__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LoopType newType) {
		LoopType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.LOOP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumIterations() {
		return numIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumIterations(int newNumIterations) {
		int oldNumIterations = numIterations;
		numIterations = newNumIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.LOOP__NUM_ITERATIONS, oldNumIterations, numIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.LOOP__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.LOOP__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.LOOP__NAME:
				return getName();
			case WorkflowPackage.LOOP__TASKS:
				return getTasks();
			case WorkflowPackage.LOOP__LINKS:
				return getLinks();
			case WorkflowPackage.LOOP__TYPE:
				return getType();
			case WorkflowPackage.LOOP__NUM_ITERATIONS:
				return getNumIterations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.LOOP__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.LOOP__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case WorkflowPackage.LOOP__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case WorkflowPackage.LOOP__TYPE:
				setType((LoopType)newValue);
				return;
			case WorkflowPackage.LOOP__NUM_ITERATIONS:
				setNumIterations((Integer)newValue);
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
			case WorkflowPackage.LOOP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.LOOP__TASKS:
				getTasks().clear();
				return;
			case WorkflowPackage.LOOP__LINKS:
				getLinks().clear();
				return;
			case WorkflowPackage.LOOP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WorkflowPackage.LOOP__NUM_ITERATIONS:
				setNumIterations(NUM_ITERATIONS_EDEFAULT);
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
			case WorkflowPackage.LOOP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.LOOP__TASKS:
				return tasks != null && !tasks.isEmpty();
			case WorkflowPackage.LOOP__LINKS:
				return links != null && !links.isEmpty();
			case WorkflowPackage.LOOP__TYPE:
				return type != TYPE_EDEFAULT;
			case WorkflowPackage.LOOP__NUM_ITERATIONS:
				return numIterations != NUM_ITERATIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Workflow.class) {
			switch (derivedFeatureID) {
				case WorkflowPackage.LOOP__NAME: return WorkflowPackage.WORKFLOW__NAME;
				case WorkflowPackage.LOOP__TASKS: return WorkflowPackage.WORKFLOW__TASKS;
				case WorkflowPackage.LOOP__LINKS: return WorkflowPackage.WORKFLOW__LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Workflow.class) {
			switch (baseFeatureID) {
				case WorkflowPackage.WORKFLOW__NAME: return WorkflowPackage.LOOP__NAME;
				case WorkflowPackage.WORKFLOW__TASKS: return WorkflowPackage.LOOP__TASKS;
				case WorkflowPackage.WORKFLOW__LINKS: return WorkflowPackage.LOOP__LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", type: ");
		result.append(type);
		result.append(", numIterations: ");
		result.append(numIterations);
		result.append(')');
		return result.toString();
	}

} //LoopImpl
