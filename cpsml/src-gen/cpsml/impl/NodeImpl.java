/**
 */
package cpsml.impl;

import cpsml.Component;
import cpsml.ConnectableElement;
import cpsml.ConnectionModule;
import cpsml.CpsmlPackage;
import cpsml.MessagingElement;
import cpsml.MessagingLink;
import cpsml.Node;
import cpsml.Position;
import cpsml.StatefulElement;
import cpsml.Status;

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
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.NodeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link cpsml.impl.NodeImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link cpsml.impl.NodeImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link cpsml.impl.NodeImpl#getConnectionModule <em>Connection Module</em>}</li>
 *   <li>{@link cpsml.impl.NodeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link cpsml.impl.NodeImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends NamedElementImpl implements Node {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.GOOD;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected EList<MessagingLink> subscription;

	/**
	 * The cached value of the '{@link #getPublication() <em>Publication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication()
	 * @generated
	 * @ordered
	 */
	protected EList<MessagingLink> publication;

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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.NODE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessagingLink> getSubscription() {
		if (subscription == null) {
			subscription = new EObjectContainmentEList<MessagingLink>(MessagingLink.class, this,
					CpsmlPackage.NODE__SUBSCRIPTION);
		}
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessagingLink> getPublication() {
		if (publication == null) {
			publication = new EObjectContainmentEList<MessagingLink>(MessagingLink.class, this,
					CpsmlPackage.NODE__PUBLICATION);
		}
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionModule> getConnectionModule() {
		if (connectionModule == null) {
			connectionModule = new EObjectContainmentEList<ConnectionModule>(ConnectionModule.class, this,
					CpsmlPackage.NODE__CONNECTION_MODULE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsmlPackage.NODE__POSITION,
					oldPosition, newPosition);
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
						EOPPOSITE_FEATURE_BASE - CpsmlPackage.NODE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpsmlPackage.NODE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.NODE__POSITION, newPosition,
					newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, CpsmlPackage.NODE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.NODE__SUBSCRIPTION:
			return ((InternalEList<?>) getSubscription()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.NODE__PUBLICATION:
			return ((InternalEList<?>) getPublication()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.NODE__CONNECTION_MODULE:
			return ((InternalEList<?>) getConnectionModule()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.NODE__POSITION:
			return basicSetPosition(null, msgs);
		case CpsmlPackage.NODE__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
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
		case CpsmlPackage.NODE__STATUS:
			return getStatus();
		case CpsmlPackage.NODE__SUBSCRIPTION:
			return getSubscription();
		case CpsmlPackage.NODE__PUBLICATION:
			return getPublication();
		case CpsmlPackage.NODE__CONNECTION_MODULE:
			return getConnectionModule();
		case CpsmlPackage.NODE__POSITION:
			return getPosition();
		case CpsmlPackage.NODE__COMPONENT:
			return getComponent();
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
		case CpsmlPackage.NODE__STATUS:
			setStatus((Status) newValue);
			return;
		case CpsmlPackage.NODE__SUBSCRIPTION:
			getSubscription().clear();
			getSubscription().addAll((Collection<? extends MessagingLink>) newValue);
			return;
		case CpsmlPackage.NODE__PUBLICATION:
			getPublication().clear();
			getPublication().addAll((Collection<? extends MessagingLink>) newValue);
			return;
		case CpsmlPackage.NODE__CONNECTION_MODULE:
			getConnectionModule().clear();
			getConnectionModule().addAll((Collection<? extends ConnectionModule>) newValue);
			return;
		case CpsmlPackage.NODE__POSITION:
			setPosition((Position) newValue);
			return;
		case CpsmlPackage.NODE__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
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
		case CpsmlPackage.NODE__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case CpsmlPackage.NODE__SUBSCRIPTION:
			getSubscription().clear();
			return;
		case CpsmlPackage.NODE__PUBLICATION:
			getPublication().clear();
			return;
		case CpsmlPackage.NODE__CONNECTION_MODULE:
			getConnectionModule().clear();
			return;
		case CpsmlPackage.NODE__POSITION:
			setPosition((Position) null);
			return;
		case CpsmlPackage.NODE__COMPONENT:
			getComponent().clear();
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
		case CpsmlPackage.NODE__STATUS:
			return status != STATUS_EDEFAULT;
		case CpsmlPackage.NODE__SUBSCRIPTION:
			return subscription != null && !subscription.isEmpty();
		case CpsmlPackage.NODE__PUBLICATION:
			return publication != null && !publication.isEmpty();
		case CpsmlPackage.NODE__CONNECTION_MODULE:
			return connectionModule != null && !connectionModule.isEmpty();
		case CpsmlPackage.NODE__POSITION:
			return position != null;
		case CpsmlPackage.NODE__COMPONENT:
			return component != null && !component.isEmpty();
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
		if (baseClass == StatefulElement.class) {
			switch (derivedFeatureID) {
			case CpsmlPackage.NODE__STATUS:
				return CpsmlPackage.STATEFUL_ELEMENT__STATUS;
			default:
				return -1;
			}
		}
		if (baseClass == MessagingElement.class) {
			switch (derivedFeatureID) {
			case CpsmlPackage.NODE__SUBSCRIPTION:
				return CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION;
			case CpsmlPackage.NODE__PUBLICATION:
				return CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION;
			default:
				return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
			case CpsmlPackage.NODE__CONNECTION_MODULE:
				return CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE;
			case CpsmlPackage.NODE__POSITION:
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
		if (baseClass == StatefulElement.class) {
			switch (baseFeatureID) {
			case CpsmlPackage.STATEFUL_ELEMENT__STATUS:
				return CpsmlPackage.NODE__STATUS;
			default:
				return -1;
			}
		}
		if (baseClass == MessagingElement.class) {
			switch (baseFeatureID) {
			case CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION:
				return CpsmlPackage.NODE__SUBSCRIPTION;
			case CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION:
				return CpsmlPackage.NODE__PUBLICATION;
			default:
				return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
			case CpsmlPackage.CONNECTABLE_ELEMENT__CONNECTION_MODULE:
				return CpsmlPackage.NODE__CONNECTION_MODULE;
			case CpsmlPackage.CONNECTABLE_ELEMENT__POSITION:
				return CpsmlPackage.NODE__POSITION;
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
