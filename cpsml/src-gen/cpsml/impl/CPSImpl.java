/**
 */
package cpsml.impl;

import cpsml.CPS;
import cpsml.Controller;
import cpsml.CpsmlPackage;
import cpsml.Environment;
import cpsml.MessageBroker;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.CPSImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link cpsml.impl.CPSImpl#getMessageBroker <em>Message Broker</em>}</li>
 *   <li>{@link cpsml.impl.CPSImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPSImpl extends NamedElementImpl implements CPS {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environment;

	/**
	 * The cached value of the '{@link #getMessageBroker() <em>Message Broker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBroker()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBroker> messageBroker;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.CPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					CpsmlPackage.CPS__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBroker> getMessageBroker() {
		if (messageBroker == null) {
			messageBroker = new EObjectContainmentEList<MessageBroker>(MessageBroker.class, this,
					CpsmlPackage.CPS__MESSAGE_BROKER);
		}
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this, CpsmlPackage.CPS__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsmlPackage.CPS__ENVIRONMENT:
			return ((InternalEList<?>) getEnvironment()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.CPS__MESSAGE_BROKER:
			return ((InternalEList<?>) getMessageBroker()).basicRemove(otherEnd, msgs);
		case CpsmlPackage.CPS__CONTROLLER:
			return ((InternalEList<?>) getController()).basicRemove(otherEnd, msgs);
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
		case CpsmlPackage.CPS__ENVIRONMENT:
			return getEnvironment();
		case CpsmlPackage.CPS__MESSAGE_BROKER:
			return getMessageBroker();
		case CpsmlPackage.CPS__CONTROLLER:
			return getController();
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
		case CpsmlPackage.CPS__ENVIRONMENT:
			getEnvironment().clear();
			getEnvironment().addAll((Collection<? extends Environment>) newValue);
			return;
		case CpsmlPackage.CPS__MESSAGE_BROKER:
			getMessageBroker().clear();
			getMessageBroker().addAll((Collection<? extends MessageBroker>) newValue);
			return;
		case CpsmlPackage.CPS__CONTROLLER:
			getController().clear();
			getController().addAll((Collection<? extends Controller>) newValue);
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
		case CpsmlPackage.CPS__ENVIRONMENT:
			getEnvironment().clear();
			return;
		case CpsmlPackage.CPS__MESSAGE_BROKER:
			getMessageBroker().clear();
			return;
		case CpsmlPackage.CPS__CONTROLLER:
			getController().clear();
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
		case CpsmlPackage.CPS__ENVIRONMENT:
			return environment != null && !environment.isEmpty();
		case CpsmlPackage.CPS__MESSAGE_BROKER:
			return messageBroker != null && !messageBroker.isEmpty();
		case CpsmlPackage.CPS__CONTROLLER:
			return controller != null && !controller.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CPSImpl
