/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.ParameterDefinition;
import catalogue.ParameterType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import workflow.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.ParameterDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link catalogue.impl.ParameterDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link catalogue.impl.ParameterDefinitionImpl#getBoundTo <em>Bound To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDefinitionImpl extends EObjectImpl implements ParameterDefinition {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.NUMBER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoundTo() <em>Bound To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundTo()
	 * @generated
	 * @ordered
	 */
	protected Parameter boundTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.PARAMETER_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.PARAMETER_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.PARAMETER_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getBoundTo() {
		if (boundTo != null && boundTo.eIsProxy()) {
			InternalEObject oldBoundTo = (InternalEObject)boundTo;
			boundTo = (Parameter)eResolveProxy(oldBoundTo);
			if (boundTo != oldBoundTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CataloguePackage.PARAMETER_DEFINITION__BOUND_TO, oldBoundTo, boundTo));
			}
		}
		return boundTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetBoundTo() {
		return boundTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundTo(Parameter newBoundTo) {
		Parameter oldBoundTo = boundTo;
		boundTo = newBoundTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.PARAMETER_DEFINITION__BOUND_TO, oldBoundTo, boundTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CataloguePackage.PARAMETER_DEFINITION__NAME:
				return getName();
			case CataloguePackage.PARAMETER_DEFINITION__TYPE:
				return getType();
			case CataloguePackage.PARAMETER_DEFINITION__BOUND_TO:
				if (resolve) return getBoundTo();
				return basicGetBoundTo();
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
		case CataloguePackage.PARAMETER_DEFINITION__NAME:
			setName((String)newValue);
			// Si se intenta cambiar el nombre del ParamDef y está vinculado (boundTo) 
			// a un parameter, poner el nombre de dicho parametro
			if(getBoundTo()!=null)
				setName(boundTo.getName());
			return;
		case CataloguePackage.PARAMETER_DEFINITION__TYPE:
			setType((ParameterType)newValue);
			// Si se intenta cambiar el tipo del ParamDef y está vinculado (boundTo) 
			// a un parameter, poner el tipo de dicho parametro
			if(getBoundTo()!=null)
				setType(boundTo.getParamDefinition().getType());
			return;
		case CataloguePackage.PARAMETER_DEFINITION__BOUND_TO:
			setBoundTo((Parameter)newValue);
			// Si se intenta cambiar el Parametrer al que está vinculado (boundTo) 
			// el ParamDef, poner como nombre y tipo del ParamDef los del Parameter
			if(getBoundTo()!=null){
				setName(boundTo.getName());
				setType(boundTo.getParamDefinition().getType());
			}
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
			case CataloguePackage.PARAMETER_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CataloguePackage.PARAMETER_DEFINITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CataloguePackage.PARAMETER_DEFINITION__BOUND_TO:
				setBoundTo((Parameter)null);
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
			case CataloguePackage.PARAMETER_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CataloguePackage.PARAMETER_DEFINITION__TYPE:
				return type != TYPE_EDEFAULT;
			case CataloguePackage.PARAMETER_DEFINITION__BOUND_TO:
				return boundTo != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ParameterDefinitionImpl
