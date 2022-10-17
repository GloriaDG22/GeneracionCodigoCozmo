/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workflow.Link;
import workflow.Task;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow.impl.TaskImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link workflow.impl.TaskImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected Link outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected Link incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getOutgoing() {
		if (outgoing != null && outgoing.eIsProxy()) {
			InternalEObject oldOutgoing = (InternalEObject)outgoing;
			outgoing = (Link)eResolveProxy(oldOutgoing);
			if (outgoing != oldOutgoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.TASK__OUTGOING, oldOutgoing, outgoing));
			}
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoing(Link newOutgoing, NotificationChain msgs) {
		Link oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__OUTGOING, oldOutgoing, newOutgoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(Link newOutgoing) {
		if (newOutgoing != outgoing) {
			NotificationChain msgs = null;
			if (outgoing != null)
				msgs = ((InternalEObject)outgoing).eInverseRemove(this, WorkflowPackage.LINK__SOURCE, Link.class, msgs);
			if (newOutgoing != null)
				msgs = ((InternalEObject)newOutgoing).eInverseAdd(this, WorkflowPackage.LINK__SOURCE, Link.class, msgs);
			msgs = basicSetOutgoing(newOutgoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__OUTGOING, newOutgoing, newOutgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (Link)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.TASK__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(Link newIncoming, NotificationChain msgs) {
		Link oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(Link newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, WorkflowPackage.LINK__TARGET, Link.class, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, WorkflowPackage.LINK__TARGET, Link.class, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.TASK__OUTGOING:
				if (outgoing != null)
					msgs = ((InternalEObject)outgoing).eInverseRemove(this, WorkflowPackage.LINK__SOURCE, Link.class, msgs);
				return basicSetOutgoing((Link)otherEnd, msgs);
			case WorkflowPackage.TASK__INCOMING:
				if (incoming != null)
					msgs = ((InternalEObject)incoming).eInverseRemove(this, WorkflowPackage.LINK__TARGET, Link.class, msgs);
				return basicSetIncoming((Link)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.TASK__OUTGOING:
				return basicSetOutgoing(null, msgs);
			case WorkflowPackage.TASK__INCOMING:
				return basicSetIncoming(null, msgs);
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
			case WorkflowPackage.TASK__OUTGOING:
				if (resolve) return getOutgoing();
				return basicGetOutgoing();
			case WorkflowPackage.TASK__INCOMING:
				if (resolve) return getIncoming();
				return basicGetIncoming();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.TASK__OUTGOING:
				setOutgoing((Link)newValue);
				return;
			case WorkflowPackage.TASK__INCOMING:
				setIncoming((Link)newValue);
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
			case WorkflowPackage.TASK__OUTGOING:
				setOutgoing((Link)null);
				return;
			case WorkflowPackage.TASK__INCOMING:
				setIncoming((Link)null);
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
			case WorkflowPackage.TASK__OUTGOING:
				return outgoing != null;
			case WorkflowPackage.TASK__INCOMING:
				return incoming != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
