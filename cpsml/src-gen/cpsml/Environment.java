/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.Environment#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getEnvironment_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

} // Environment
