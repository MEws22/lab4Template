/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.ConnectionModule#getSupportedProtocols <em>Supported Protocols</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getConnectionModule()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='namingConvention_cS2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot namingConvention_cS2='\n\t\t\tself.name.substring(1, self.oclContainer.oclAsType(NamedElement).name.size()) = self.oclContainer.oclAsType(NamedElement).name.toUpper()\n\t\t'"
 * @generated
 */
public interface ConnectionModule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Supported Protocols</b></em>' attribute list.
	 * The list contents are of type {@link cpsml.Protocol}.
	 * The literals are from the enumeration {@link cpsml.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Protocols</em>' attribute list.
	 * @see cpsml.Protocol
	 * @see cpsml.CpsmlPackage#getConnectionModule_SupportedProtocols()
	 * @model required="true" upper="3" ordered="false"
	 * @generated
	 */
	EList<Protocol> getSupportedProtocols();

} // ConnectionModule
