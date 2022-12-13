/**
 */
package cpsml.impl;

import cpsml.Actuator;
import cpsml.CpsmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.ActuatorImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link cpsml.impl.ActuatorImpl#getRatedRuns <em>Rated Runs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends ComponentImpl implements Actuator {
	/**
	 * The default value of the '{@link #getRuns() <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected int runs = RUNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedRuns() <em>Rated Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedRuns()
	 * @generated
	 * @ordered
	 */
	protected static final int RATED_RUNS_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getRatedRuns() <em>Rated Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedRuns()
	 * @generated
	 * @ordered
	 */
	protected int ratedRuns = RATED_RUNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRuns() {
		return runs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuns(int newRuns) {
		int oldRuns = runs;
		runs = newRuns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.ACTUATOR__RUNS, oldRuns, runs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRatedRuns() {
		return ratedRuns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedRuns(int newRatedRuns) {
		int oldRatedRuns = ratedRuns;
		ratedRuns = newRatedRuns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.ACTUATOR__RATED_RUNS, oldRatedRuns,
					ratedRuns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsmlPackage.ACTUATOR__RUNS:
			return getRuns();
		case CpsmlPackage.ACTUATOR__RATED_RUNS:
			return getRatedRuns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpsmlPackage.ACTUATOR__RUNS:
			setRuns((Integer) newValue);
			return;
		case CpsmlPackage.ACTUATOR__RATED_RUNS:
			setRatedRuns((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CpsmlPackage.ACTUATOR__RUNS:
			setRuns(RUNS_EDEFAULT);
			return;
		case CpsmlPackage.ACTUATOR__RATED_RUNS:
			setRatedRuns(RATED_RUNS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CpsmlPackage.ACTUATOR__RUNS:
			return runs != RUNS_EDEFAULT;
		case CpsmlPackage.ACTUATOR__RATED_RUNS:
			return ratedRuns != RATED_RUNS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (runs: ");
		result.append(runs);
		result.append(", ratedRuns: ");
		result.append(ratedRuns);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
