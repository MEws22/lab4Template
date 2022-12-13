/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wireless Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.WirelessModule#getConnect <em>Connect</em>}</li>
 *   <li>{@link cpsml.WirelessModule#getConnectOpposite <em>Connect Opposite</em>}</li>
 *   <li>{@link cpsml.WirelessModule#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getWirelessModule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rangePositive_cS4 distancesWihtinRange_c4 noConnectionToSelf_cS3a'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot rangePositive_cS4='\n\t\t\tself.range &gt;= 0' distancesWihtinRange_c4='\n\t\t\tself.connect-&gt;forAll(p|\n\t\t\t\t(\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x)*\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x) +\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y)*\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y) + \n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z)*\n\t\t\t\t \t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z)\n\t\t\t\t ) &lt;= (self.range * self.range).min(p.range * p.range)\n\t\t)' noConnectionToSelf_cS3a='\n\t\t\tself.connect-&gt;excludes(self)\n\t\t'"
 * @generated
 */
public interface WirelessModule extends ConnectionModule {
	/**
	 * Returns the value of the '<em><b>Connect</b></em>' reference list.
	 * The list contents are of type {@link cpsml.WirelessModule}.
	 * It is bidirectional and its opposite is '{@link cpsml.WirelessModule#getConnectOpposite <em>Connect Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect</em>' reference list.
	 * @see cpsml.CpsmlPackage#getWirelessModule_Connect()
	 * @see cpsml.WirelessModule#getConnectOpposite
	 * @model opposite="connectOpposite"
	 * @generated
	 */
	EList<WirelessModule> getConnect();

	/**
	 * Returns the value of the '<em><b>Connect Opposite</b></em>' reference list.
	 * The list contents are of type {@link cpsml.WirelessModule}.
	 * It is bidirectional and its opposite is '{@link cpsml.WirelessModule#getConnect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Opposite</em>' reference list.
	 * @see cpsml.CpsmlPackage#getWirelessModule_ConnectOpposite()
	 * @see cpsml.WirelessModule#getConnect
	 * @model opposite="connect"
	 * @generated
	 */
	EList<WirelessModule> getConnectOpposite();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(float)
	 * @see cpsml.CpsmlPackage#getWirelessModule_Range()
	 * @model required="true"
	 * @generated
	 */
	float getRange();

	/**
	 * Sets the value of the '{@link cpsml.WirelessModule#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(float value);

} // WirelessModule
