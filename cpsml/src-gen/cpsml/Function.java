/**
 */
package cpsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.Function#getParameter <em>Parameter</em>}</li>
 *   <li>{@link cpsml.Function#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link cpsml.Function#isHasReturn <em>Has Return</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='returnAndNotNull_c3 sensorRequiresReturn_c3'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot returnAndNotNull_c3='\n\t\t\tself.hasReturn implies returnDataType &lt;&gt; DataType::NULL' sensorRequiresReturn_c3='\n\t\t\tself.oclContainer.oclIsTypeOf(Sensor) implies hasReturn\n\t\t\t'"
 * @generated
 */
public interface Function extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link cpsml.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see cpsml.CpsmlPackage#getFunction_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Return Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cpsml.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Data Type</em>' attribute.
	 * @see cpsml.DataType
	 * @see #setReturnDataType(DataType)
	 * @see cpsml.CpsmlPackage#getFunction_ReturnDataType()
	 * @model
	 * @generated
	 */
	DataType getReturnDataType();

	/**
	 * Sets the value of the '{@link cpsml.Function#getReturnDataType <em>Return Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Data Type</em>' attribute.
	 * @see cpsml.DataType
	 * @see #getReturnDataType()
	 * @generated
	 */
	void setReturnDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Has Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Return</em>' attribute.
	 * @see #setHasReturn(boolean)
	 * @see cpsml.CpsmlPackage#getFunction_HasReturn()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasReturn();

	/**
	 * Sets the value of the '{@link cpsml.Function#isHasReturn <em>Has Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Return</em>' attribute.
	 * @see #isHasReturn()
	 * @generated
	 */
	void setHasReturn(boolean value);

} // Function
