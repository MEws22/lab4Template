/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wired Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.WiredModule#getConnect <em>Connect</em>}</li>
 *   <li>{@link cpsml.WiredModule#getConnectOpposite <em>Connect Opposite</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getWiredModule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noConnectionToSelf_cS3b'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noConnectionToSelf_cS3b='\n\t\t\tself.connect-&gt;excludes(self)\n\t\t'"
 * @generated
 */
public interface WiredModule extends ConnectionModule {
	/**
	 * Returns the value of the '<em><b>Connect</b></em>' reference list.
	 * The list contents are of type {@link cpsml.WiredModule}.
	 * It is bidirectional and its opposite is '{@link cpsml.WiredModule#getConnectOpposite <em>Connect Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect</em>' reference list.
	 * @see cpsml.CpsmlPackage#getWiredModule_Connect()
	 * @see cpsml.WiredModule#getConnectOpposite
	 * @model opposite="connectOpposite"
	 * @generated
	 */
	EList<WiredModule> getConnect();

	/**
	 * Returns the value of the '<em><b>Connect Opposite</b></em>' reference list.
	 * The list contents are of type {@link cpsml.WiredModule}.
	 * It is bidirectional and its opposite is '{@link cpsml.WiredModule#getConnect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Opposite</em>' reference list.
	 * @see cpsml.CpsmlPackage#getWiredModule_ConnectOpposite()
	 * @see cpsml.WiredModule#getConnect
	 * @model opposite="connect"
	 * @generated
	 */
	EList<WiredModule> getConnectOpposite();

} // WiredModule
