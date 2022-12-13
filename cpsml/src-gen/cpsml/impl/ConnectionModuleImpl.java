/**
 */
package cpsml.impl;

import cpsml.ConnectionModule;
import cpsml.CpsmlPackage;
import cpsml.Protocol;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.ConnectionModuleImpl#getSupportedProtocols <em>Supported Protocols</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectionModuleImpl extends NamedElementImpl implements ConnectionModule {
	/**
	 * The cached value of the '{@link #getSupportedProtocols() <em>Supported Protocols</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> supportedProtocols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.CONNECTION_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getSupportedProtocols() {
		if (supportedProtocols == null) {
			supportedProtocols = new EDataTypeUniqueEList<Protocol>(Protocol.class, this,
					CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS);
		}
		return supportedProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			return getSupportedProtocols();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			getSupportedProtocols().clear();
			getSupportedProtocols().addAll((Collection<? extends Protocol>) newValue);
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
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			getSupportedProtocols().clear();
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
		case CpsmlPackage.CONNECTION_MODULE__SUPPORTED_PROTOCOLS:
			return supportedProtocols != null && !supportedProtocols.isEmpty();
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
		result.append(" (supportedProtocols: ");
		result.append(supportedProtocols);
		result.append(')');
		return result.toString();
	}

} //ConnectionModuleImpl
