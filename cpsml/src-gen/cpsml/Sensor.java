/**
 */
package cpsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.Sensor#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Component {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(float)
	 * @see cpsml.CpsmlPackage#getSensor_Frequency()
	 * @model default="0" required="true"
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link cpsml.Sensor#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

} // Sensor
