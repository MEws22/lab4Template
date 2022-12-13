/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.MessageBroker#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getMessageBroker()
 * @model
 * @generated
 */
public interface MessageBroker extends NamedElement, ConnectableElement {
	/**
	 * Returns the value of the '<em><b>Topics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' attribute list.
	 * @see cpsml.CpsmlPackage#getMessageBroker_Topics()
	 * @model upper="4"
	 * @generated
	 */
	EList<String> getTopics();

} // MessageBroker
