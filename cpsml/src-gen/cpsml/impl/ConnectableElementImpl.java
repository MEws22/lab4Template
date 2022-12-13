/**
 */
package cpsml.impl;

import cpsml.ConnectableElement;
import cpsml.ConnectionModule;
import cpsml.CpsmlPackage;
import cpsml.Position;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.ConnectableElementImpl#getConnectionModule <em>Connection Module</em>}</li>
 *   <li>{@link cpsml.impl.ConnectableElementImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectableElementImpl extends MinimalEObjectImpl.Container implements ConnectableElement {
	/**
	 * The cached value of the '{@link #getConnectionModule() <em>Connection Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionModule()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionModule> connectionModule;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.CONNECTABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionModule> getConnectionModule() {
		if (connectionModule == null) {
			connectionModule = new EObjectContainmentEList<ConnectionModule>(ConnectionModule.class, this,
					CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE);
		}
		return connectionModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpsmlPackage.CONNECTABLE_ELEMENT__POSITION, oldPosition, newPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpsmlPackage.CONNECTABLE_ELEMENT__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpsmlPackage.CONNECTABLE_ELEMENT__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.CONNECTABLE_ELEMENT__POSITION,
					newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE:
			return ((InternalEList<?>) getConnectionModule()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.CONNECTABLE_ELEMENT__POSITION:
			return basicSetPosition(null, msgs);
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
		case CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE:
			return getConnectionModule();
		case CpsmlPackage.CONNECTABLE_ELEMENT__POSITION:
			return getPosition();
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
		case CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE:
			getConnectionModule().clear();
			getConnectionModule().addAll((Collection<? extends ConnectionModule>) newValue);
			return;
		case CpsmlPackage.CONNECTABLE_ELEMENT__POSITION:
			setPosition((Position) newValue);
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
		case CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE:
			getConnectionModule().clear();
			return;
		case CpsmlPackage.CONNECTABLE_ELEMENT__POSITION:
			setPosition((Position) null);
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
		case CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE:
			return connectionModule != null && !connectionModule.isEmpty();
		case CpsmlPackage.CONNECTABLE_ELEMENT__POSITION:
			return position != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectableElementImpl
