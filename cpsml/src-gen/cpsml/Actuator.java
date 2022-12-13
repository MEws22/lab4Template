/**
 */
package cpsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cpsml.Actuator#getRuns <em>Runs</em>}</li>
 *   <li>{@link cpsml.Actuator#getRatedRuns <em>Rated Runs</em>}</li>
 * </ul>
 *
 * @see cpsml.CpsmlPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Component {
	/**
	 * Returns the value of the '<em><b>Runs</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' attribute.
	 * @see #setRuns(int)
	 * @see cpsml.CpsmlPackage#getActuator_Runs()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getRuns();

	/**
	 * Sets the value of the '{@link cpsml.Actuator#getRuns <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs</em>' attribute.
	 * @see #getRuns()
	 * @generated
	 */
	void setRuns(int value);

	/**
	 * Returns the value of the '<em><b>Rated Runs</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Runs</em>' attribute.
	 * @see #setRatedRuns(int)
	 * @see cpsml.CpsmlPackage#getActuator_RatedRuns()
	 * @model default="100" required="true"
	 * @generated
	 */
	int getRatedRuns();

	/**
	 * Sets the value of the '{@link cpsml.Actuator#getRatedRuns <em>Rated Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Runs</em>' attribute.
	 * @see #getRatedRuns()
	 * @generated
	 */
	void setRatedRuns(int value);

} // Actuator
