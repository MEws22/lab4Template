/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.ConnectableElement#getConnectionModule <em>Connection Module</em>}</li>
 *   <li>{@link cpsml.ConnectableElement#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Module</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.ConnectionModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Module</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getConnectableElement_ConnectionModule()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionModule> getConnectionModule();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see cpsml.CpsmlPackage#getConnectableElement_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link cpsml.ConnectableElement#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // ConnectableElement
