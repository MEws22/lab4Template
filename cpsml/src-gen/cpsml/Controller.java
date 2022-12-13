/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.Controller#getDescription <em>Description</em>}</li>
 *   <li>{@link cpsml.Controller#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends NamedElement, MessagingElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cpsml.CpsmlPackage#getController_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cpsml.Controller#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' attribute list.
	 * @see cpsml.CpsmlPackage#getController_Topics()
	 * @model upper="10"
	 * @generated
	 */
	EList<String> getTopics();

} // Controller
