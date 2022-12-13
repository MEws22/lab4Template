/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Messaging Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.MessagingLink#getMessageBroker <em>Message Broker</em>}</li>
 *   <li>{@link cpsml.MessagingLink#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getMessagingLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='messagingElementConnectedToMB_c2 commonTopicsWithNode_cS1a commonTopicsWithMB_cS1b'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot messagingElementConnectedToMB_c2='\n\t\t\tif self.oclContainer.oclIsTypeOf(Node) then\n\t\t\t\tself.oclContainer.oclAsType(Node).connectionModule-&gt;exists(cM | \n\t\t\t\t\t\t(cM.oclIsTypeOf(WiredModule) implies\n\t\t\t\t\t\t\tcM.oclAsType(WiredModule).connect-&gt;exists(c|c.oclContainer = self.messageBroker) or\n\t\t\t\t\t\t\tcM.oclAsType(WiredModule).connectOpposite-&gt;exists(c|c.oclContainer = self.messageBroker)\n\t\t\t\t\t\t)\n\t\t\t\t\t\tand\n\t\t\t\t\t\t(cM.oclIsTypeOf(WirelessModule) implies\n\t\t\t\t\t\t\tcM.oclAsType(WirelessModule).connect-&gt;exists(c|c.oclContainer = self.messageBroker) or\n\t\t\t\t\t\t\tcM.oclAsType(WirelessModule).connectOpposite-&gt;exists(c|c.oclContainer = self.messageBroker)\n\t\t\t\t\t\t)\n\t\t\t\t)\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t' commonTopicsWithNode_cS1a='\n\t\t\tself.topics-&gt;forAll(t1 | self.messageBroker.topics-&gt;exists(t2 | t1 = t2) )\n\t\t' commonTopicsWithMB_cS1b='\n\t\t\tif self.oclContainer.oclIsTypeOf(Node) then\n\t\t\t\tself.topics-&gt;forAll(t1 | self.oclContainer.oclAsType(Node).component.topic-&gt;exists(t2 | t1 = t2) )\n\t\t\telse\n\t\t\t\tself.topics-&gt;forAll(t1 | self.oclContainer.oclAsType(Controller).topics-&gt;exists(t2 | t1 = t2) )\n\t\t\tendif\n\t\t'"
 * @generated
 */
public interface MessagingLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Broker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Broker</em>' reference.
	 * @see #setMessageBroker(MessageBroker)
	 * @see cpsml.CpsmlPackage#getMessagingLink_MessageBroker()
	 * @model required="true"
	 * @generated
	 */
	MessageBroker getMessageBroker();

	/**
	 * Sets the value of the '{@link cpsml.MessagingLink#getMessageBroker <em>Message Broker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Broker</em>' reference.
	 * @see #getMessageBroker()
	 * @generated
	 */
	void setMessageBroker(MessageBroker value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' attribute list.
	 * @see cpsml.CpsmlPackage#getMessagingLink_Topics()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTopics();

} // MessagingLink
