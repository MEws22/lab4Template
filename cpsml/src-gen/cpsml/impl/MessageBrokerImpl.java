/**
 */
package cpsml.impl;

import cpsml.ConnectableElement;
import cpsml.ConnectionModule;
import cpsml.CpsmlPackage;
import cpsml.MessageBroker;
import cpsml.Position;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.MessageBrokerImpl#getConnectionModule <em>Connection Module</em>}</li>
 *   <li>{@link cpsml.impl.MessageBrokerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link cpsml.impl.MessageBrokerImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageBrokerImpl extends NamedElementImpl implements MessageBroker {
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
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> topics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.MESSAGE_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionModule> getConnectionModule() {
		if (connectionModule == null) {
			connectionModule = new EObjectContainmentEList<ConnectionModule>(ConnectionModule.class, this,
					CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE);
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
					CpsmlPackage.MESSAGE_BROKER__POSITION, oldPosition, newPosition);
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
						EOPPOSITE_FEATURE_BASE - CpsmlPackage.MESSAGE_BROKER__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpsmlPackage.MESSAGE_BROKER__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.MESSAGE_BROKER__POSITION, newPosition,
					newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTopics() {
		if (topics == null) {
			topics = new EDataTypeUniqueEList<String>(String.class, this, CpsmlPackage.MESSAGE_BROKER__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE:
			return ((InternalEList<?>) getConnectionModule()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.MESSAGE_BROKER__POSITION:
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
		case CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE:
			return getConnectionModule();
		case CpsmlPackage.MESSAGE_BROKER__POSITION:
			return getPosition();
		case CpsmlPackage.MESSAGE_BROKER__TOPICS:
			return getTopics();
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
		case CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE:
			getConnectionModule().clear();
			getConnectionModule().addAll((Collection<? extends ConnectionModule>) newValue);
			return;
		case CpsmlPackage.MESSAGE_BROKER__POSITION:
			setPosition((Position) newValue);
			return;
		case CpsmlPackage.MESSAGE_BROKER__TOPICS:
			getTopics().clear();
			getTopics().addAll((Collection<? extends String>) newValue);
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
		case CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE:
			getConnectionModule().clear();
			return;
		case CpsmlPackage.MESSAGE_BROKER__POSITION:
			setPosition((Position) null);
			return;
		case CpsmlPackage.MESSAGE_BROKER__TOPICS:
			getTopics().clear();
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
		case CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE:
			return connectionModule != null && !connectionModule.isEmpty();
		case CpsmlPackage.MESSAGE_BROKER__POSITION:
			return position != null;
		case CpsmlPackage.MESSAGE_BROKER__TOPICS:
			return topics != null && !topics.isEmpty();
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
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
			case CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE:
				return CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE;
			case CpsmlPackage.MESSAGE_BROKER__POSITION:
				return CpsmlPackage.CONNECTABLE_ELEMENT__POSITION;
			default:
				return -1;
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
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
			case CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE:
				return CpsmlPackage.MESSAGE_BROKER__CONNECTION_MODULE;
			case CpsmlPackage.CONNECTABLE_ELEMENT__POSITION:
				return CpsmlPackage.MESSAGE_BROKER__POSITION;
			default:
				return -1;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (topics: ");
		result.append(topics);
		result.append(')');
		return result.toString();
	}

} //MessageBrokerImpl
