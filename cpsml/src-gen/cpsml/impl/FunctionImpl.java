/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.DataType;
import cpsml.Function;
import cpsml.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.FunctionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link cpsml.impl.FunctionImpl#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link cpsml.impl.FunctionImpl#isHasReturn <em>Has Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends NamedElementImpl implements Function {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getReturnDataType() <em>Return Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType RETURN_DATA_TYPE_EDEFAULT = DataType.NULL;

	/**
	 * The cached value of the '{@link #getReturnDataType() <em>Return Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnDataType = RETURN_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasReturn() <em>Has Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasReturn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RETURN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasReturn() <em>Has Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasReturn()
	 * @generated
	 * @ordered
	 */
	protected boolean hasReturn = HAS_RETURN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, CpsmlPackage.FUNCTION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnDataType() {
		return returnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDataType(DataType newReturnDataType) {
		DataType oldReturnDataType = returnDataType;
		returnDataType = newReturnDataType == null ? RETURN_DATA_TYPE_EDEFAULT : newReturnDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.FUNCTION__RETURN_DATA_TYPE,
					oldReturnDataType, returnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasReturn() {
		return hasReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasReturn(boolean newHasReturn) {
		boolean oldHasReturn = hasReturn;
		hasReturn = newHasReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.FUNCTION__HAS_RETURN, oldHasReturn,
					hasReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.FUNCTION__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
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
		case CpsmlPackage.FUNCTION__PARAMETER:
			return getParameter();
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			return getReturnDataType();
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			return isHasReturn();
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
		case CpsmlPackage.FUNCTION__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			setReturnDataType((DataType) newValue);
			return;
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			setHasReturn((Boolean) newValue);
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
		case CpsmlPackage.FUNCTION__PARAMETER:
			getParameter().clear();
			return;
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			setReturnDataType(RETURN_DATA_TYPE_EDEFAULT);
			return;
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			setHasReturn(HAS_RETURN_EDEFAULT);
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
		case CpsmlPackage.FUNCTION__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case CpsmlPackage.FUNCTION__RETURN_DATA_TYPE:
			return returnDataType != RETURN_DATA_TYPE_EDEFAULT;
		case CpsmlPackage.FUNCTION__HAS_RETURN:
			return hasReturn != HAS_RETURN_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (returnDataType: ");
		result.append(returnDataType);
		result.append(", hasReturn: ");
		result.append(hasReturn);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
