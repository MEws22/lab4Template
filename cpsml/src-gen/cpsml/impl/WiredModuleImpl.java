/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.WiredModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wired Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.WiredModuleImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link cpsml.impl.WiredModuleImpl#getConnectOpposite <em>Connect Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WiredModuleImpl extends ConnectionModuleImpl implements WiredModule {
	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected EList<WiredModule> connect;

	/**
	 * The cached value of the '{@link #getConnectOpposite() <em>Connect Opposite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectOpposite()
	 * @generated
	 * @ordered
	 */
	protected EList<WiredModule> connectOpposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiredModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.WIRED_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WiredModule> getConnect() {
		if (connect == null) {
			connect = new EObjectWithInverseResolvingEList.ManyInverse<WiredModule>(WiredModule.class, this,
					CpsmlPackage.WIRED_MODULE__CONNECT, CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE);
		}
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WiredModule> getConnectOpposite() {
		if (connectOpposite == null) {
			connectOpposite = new EObjectWithInverseResolvingEList.ManyInverse<WiredModule>(WiredModule.class, this,
					CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE, CpsmlPackage.WIRED_MODULE__CONNECT);
		}
		return connectOpposite;
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnect()).basicAdd(otherEnd, msgs);
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return ((InternalEList<?>) getConnect()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return getConnect();
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			return getConnectOpposite();
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			getConnect().clear();
			getConnect().addAll((Collection<? extends WiredModule>) newValue);
			return;
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
			getConnectOpposite().addAll((Collection<? extends WiredModule>) newValue);
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			getConnect().clear();
			return;
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			getConnectOpposite().clear();
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
		case CpsmlPackage.WIRED_MODULE__CONNECT:
			return connect != null && !connect.isEmpty();
		case CpsmlPackage.WIRED_MODULE__CONNECT_OPPOSITE:
			return connectOpposite != null && !connectOpposite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WiredModuleImpl
