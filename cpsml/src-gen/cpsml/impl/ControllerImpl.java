/**
 */
package cpsml.impl;

import cpsml.Controller;
import cpsml.CpsmlPackage;
import cpsml.MessagingElement;
import cpsml.MessagingLink;

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
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.ControllerImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link cpsml.impl.ControllerImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link cpsml.impl.ControllerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cpsml.impl.ControllerImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends NamedElementImpl implements Controller {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessagingLink> getSubscription() {
		if (subscription == null) {
			subscription = new EObjectContainmentEList<MessagingLink>(MessagingLink.class, this,
					CpsmlPackage.CONTROLLER__SUBSCRIPTION);
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
					CpsmlPackage.CONTROLLER__PUBLICATION);
		}
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.CONTROLLER__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTopics() {
		if (topics == null) {
			topics = new EDataTypeUniqueEList<String>(String.class, this, CpsmlPackage.CONTROLLER__TOPICS);
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
		case CpsmlPackage.CONTROLLER__SUBSCRIPTION:
			return ((InternalEList<?>) getSubscription()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.CONTROLLER__PUBLICATION:
			return ((InternalEList<?>) getPublication()).basicRemove(otherEnd, msgs);
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
		case CpsmlPackage.CONTROLLER__SUBSCRIPTION:
			return getSubscription();
		case CpsmlPackage.CONTROLLER__PUBLICATION:
			return getPublication();
		case CpsmlPackage.CONTROLLER__DESCRIPTION:
			return getDescription();
		case CpsmlPackage.CONTROLLER__TOPICS:
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
		case CpsmlPackage.CONTROLLER__SUBSCRIPTION:
			getSubscription().clear();
			getSubscription().addAll((Collection<? extends MessagingLink>) newValue);
			return;
		case CpsmlPackage.CONTROLLER__PUBLICATION:
			getPublication().clear();
			getPublication().addAll((Collection<? extends MessagingLink>) newValue);
			return;
		case CpsmlPackage.CONTROLLER__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CpsmlPackage.CONTROLLER__TOPICS:
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
		case CpsmlPackage.CONTROLLER__SUBSCRIPTION:
			getSubscription().clear();
			return;
		case CpsmlPackage.CONTROLLER__PUBLICATION:
			getPublication().clear();
			return;
		case CpsmlPackage.CONTROLLER__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CpsmlPackage.CONTROLLER__TOPICS:
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
		case CpsmlPackage.CONTROLLER__SUBSCRIPTION:
			return subscription != null && !subscription.isEmpty();
		case CpsmlPackage.CONTROLLER__PUBLICATION:
			return publication != null && !publication.isEmpty();
		case CpsmlPackage.CONTROLLER__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CpsmlPackage.CONTROLLER__TOPICS:
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
		if (baseClass == MessagingElement.class) {
			switch (derivedFeatureID) {
			case CpsmlPackage.CONTROLLER__SUBSCRIPTION:
				return CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION;
			case CpsmlPackage.CONTROLLER__PUBLICATION:
				return CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION;
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
		if (baseClass == MessagingElement.class) {
			switch (baseFeatureID) {
			case CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION:
				return CpsmlPackage.CONTROLLER__SUBSCRIPTION;
			case CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION:
				return CpsmlPackage.CONTROLLER__PUBLICATION;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", topics: ");
		result.append(topics);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
