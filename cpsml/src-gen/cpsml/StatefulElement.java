/**
 */
package cpsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.StatefulElement#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getStatefulElement()
 * @model abstract="true"
 * @generated
 */
public interface StatefulElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link cpsml.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see cpsml.Status
	 * @see #setStatus(Status)
	 * @see cpsml.CpsmlPackage#getStatefulElement_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link cpsml.StatefulElement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see cpsml.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // StatefulElement
