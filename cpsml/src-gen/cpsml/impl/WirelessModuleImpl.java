/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.WirelessModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wireless Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.WirelessModuleImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link cpsml.impl.WirelessModuleImpl#getConnectOpposite <em>Connect Opposite</em>}</li>
 *   <li>{@link cpsml.impl.WirelessModuleImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WirelessModuleImpl extends ConnectionModuleImpl implements WirelessModule {
	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected EList<WirelessModule> connect;

	/**
	 * The cached value of the '{@link #getConnectOpposite() <em>Connect Opposite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectOpposite()
	 * @generated
	 * @ordered
	 */
	protected EList<WirelessModule> connectOpposite;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final float RANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected float range = RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WirelessModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.WIRELESS_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WirelessModule> getConnect() {
		if (connect == null) {
			connect = new EObjectWithInverseResolvingEList.ManyInverse<WirelessModule>(WirelessModule.class, this,
					CpsmlPackage.WIRELESS_MODULE__CONNECT, CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE);
		}
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WirelessModule> getConnectOpposite() {
		if (connectOpposite == null) {
			connectOpposite = new EObjectWithInverseResolvingEList.ManyInverse<WirelessModule>(WirelessModule.class,
					this, CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE, CpsmlPackage.WIRELESS_MODULE__CONNECT);
		}
		return connectOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(float newRange) {
		float oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.WIRELESS_MODULE__RANGE, oldRange,
					range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnect()).basicAdd(otherEnd, msgs);
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectOpposite()).basicAdd(otherEnd, msgs);
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return ((InternalEList<?>) getConnect()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			return ((InternalEList<?>) getConnectOpposite()).basicRemove(otherEnd, msgs);
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return getConnect();
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			return getConnectOpposite();
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			return getRange();
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			getConnect().clear();
			getConnect().addAll((Collection<? extends WirelessModule>) newValue);
			return;
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
			getConnectOpposite().addAll((Collection<? extends WirelessModule>) newValue);
			return;
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			setRange((Float) newValue);
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			getConnect().clear();
			return;
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
			return;
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			setRange(RANGE_EDEFAULT);
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
		case CpsmlPackage.WIRELESS_MODULE__CONNECT:
			return connect != null && !connect.isEmpty();
		case CpsmlPackage.WIRELESS_MODULE__CONNECT_OPPOSITE:
			return connectOpposite != null && !connectOpposite.isEmpty();
		case CpsmlPackage.WIRELESS_MODULE__RANGE:
			return range != RANGE_EDEFAULT;
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
		result.append(" (range: ");
		result.append(range);
		result.append(')');
		return result.toString();
	}

} //WirelessModuleImpl
