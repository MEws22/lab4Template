/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.CPS#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link cpsml.CPS#getMessageBroker <em>Message Broker</em>}</li>
 *   <li>{@link cpsml.CPS#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getCPS()
 * @model
 * @generated
 */
public interface CPS extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getCPS_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Message Broker</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.MessageBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Broker</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getCPS_MessageBroker()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageBroker> getMessageBroker();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getCPS_Controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getController();

} // CPS
