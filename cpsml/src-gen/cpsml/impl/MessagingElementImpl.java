/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.MessagingElement;
import cpsml.MessagingLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Messaging Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.MessagingElementImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link cpsml.impl.MessagingElementImpl#getPublication <em>Publication</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessagingElementImpl extends MinimalEObjectImpl.Container implements MessagingElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.MESSAGING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessagingLink> getSubscription() {
		if (subscription == null) {
			subscription = new EObjectContainmentEList<MessagingLink>(MessagingLink.class, this,
					CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION);
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
					CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION);
		}
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION:
			return ((InternalEList<?>) getSubscription()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION:
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
		case CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION:
			return getSubscription();
		case CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION:
			return getPublication();
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
		case CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION:
			getSubscription().clear();
			getSubscription().addAll((Collection<? extends MessagingLink>) newValue);
			return;
		case CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION:
			getPublication().clear();
			getPublication().addAll((Collection<? extends MessagingLink>) newValue);
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
		case CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION:
			getSubscription().clear();
			return;
		case CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION:
			getPublication().clear();
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
		case CpsmlPackage.MESSAGING_ELEMENT__SUBSCRIPTION:
			return subscription != null && !subscription.isEmpty();
		case CpsmlPackage.MESSAGING_ELEMENT__PUBLICATION:
			return publication != null && !publication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessagingElementImpl
