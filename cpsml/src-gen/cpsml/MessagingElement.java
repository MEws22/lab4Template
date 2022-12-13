/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Messaging Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.MessagingElement#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link cpsml.MessagingElement#getPublication <em>Publication</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getMessagingElement()
 * @model abstract="true"
 * @generated
 */
public interface MessagingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.MessagingLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getMessagingElement_Subscription()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessagingLink> getSubscription();

	/**
	 * Returns the value of the '<em><b>Publication</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.MessagingLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getMessagingElement_Publication()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessagingLink> getPublication();

} // MessagingElement
