/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.MessageBroker;
import cpsml.MessagingLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Messaging Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.MessagingLinkImpl#getMessageBroker <em>Message Broker</em>}</li>
 *   <li>{@link cpsml.impl.MessagingLinkImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessagingLinkImpl extends MinimalEObjectImpl.Container implements MessagingLink {
	/**
	 * The cached value of the '{@link #getMessageBroker() <em>Message Broker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBroker()
	 * @generated
	 * @ordered
	 */
	protected MessageBroker messageBroker;

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
	protected MessagingLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.MESSAGING_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBroker getMessageBroker() {
		if (messageBroker != null && messageBroker.eIsProxy()) {
			InternalEObject oldMessageBroker = (InternalEObject) messageBroker;
			messageBroker = (MessageBroker) eResolveProxy(oldMessageBroker);
			if (messageBroker != oldMessageBroker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER, oldMessageBroker, messageBroker));
			}
		}
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBroker basicGetMessageBroker() {
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageBroker(MessageBroker newMessageBroker) {
		MessageBroker oldMessageBroker = messageBroker;
		messageBroker = newMessageBroker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER,
					oldMessageBroker, messageBroker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTopics() {
		if (topics == null) {
			topics = new EDataTypeUniqueEList<String>(String.class, this, CpsmlPackage.MESSAGING_LINK__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			if (resolve)
				return getMessageBroker();
			return basicGetMessageBroker();
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
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
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			setMessageBroker((MessageBroker) newValue);
			return;
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
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
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			setMessageBroker((MessageBroker) null);
			return;
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
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
		case CpsmlPackage.MESSAGING_LINK__MESSAGE_BROKER:
			return messageBroker != null;
		case CpsmlPackage.MESSAGING_LINK__TOPICS:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (topics: ");
		result.append(topics);
		result.append(')');
		return result.toString();
	}

} //MessagingLinkImpl
