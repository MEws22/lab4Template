/**
 */
package cpsml.impl;

import cpsml.Actuator;
import cpsml.Component;
import cpsml.ConnectableElement;
import cpsml.ConnectionModule;
import cpsml.Controller;
import cpsml.CpsmlFactory;
import cpsml.CpsmlPackage;
import cpsml.DataType;
import cpsml.Environment;
import cpsml.Function;
import cpsml.MessageBroker;
import cpsml.MessagingElement;
import cpsml.MessagingLink;
import cpsml.NamedElement;
import cpsml.Node;
import cpsml.Parameter;
import cpsml.Position;
import cpsml.Protocol;
import cpsml.Sensor;
import cpsml.StatefulElement;
import cpsml.Status;
import cpsml.WiredModule;
import cpsml.WirelessModule;

import cpsml.util.CpsmlValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpsmlPackageImpl extends EPackageImpl implements CpsmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirelessModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiredModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statefulElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagingLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cpsml.CpsmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CpsmlPackageImpl() {
		super(eNS_URI, CpsmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CpsmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CpsmlPackage init() {
		if (isInited)
			return (CpsmlPackage) EPackage.Registry.INSTANCE.getEPackage(CpsmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCpsmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CpsmlPackageImpl theCpsmlPackage = registeredCpsmlPackage instanceof CpsmlPackageImpl
				? (CpsmlPackageImpl) registeredCpsmlPackage
				: new CpsmlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCpsmlPackage.createPackageContents();

		// Initialize created meta-data
		theCpsmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCpsmlPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CpsmlValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCpsmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CpsmlPackage.eNS_URI, theCpsmlPackage);
		return theCpsmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPS() {
		return cpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPS_Environment() {
		return (EReference) cpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPS_MessageBroker() {
		return (EReference) cpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPS_Controller() {
		return (EReference) cpsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Node() {
		return (EReference) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Function() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Topic() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Component() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameter() {
		return (EReference) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_ReturnDataType() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_HasReturn() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DataType() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Frequency() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_Runs() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_RatedRuns() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionModule() {
		return connectionModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionModule_SupportedProtocols() {
		return (EAttribute) connectionModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWirelessModule() {
		return wirelessModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWirelessModule_Connect() {
		return (EReference) wirelessModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWirelessModule_ConnectOpposite() {
		return (EReference) wirelessModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWirelessModule_Range() {
		return (EAttribute) wirelessModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiredModule() {
		return wiredModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiredModule_Connect() {
		return (EReference) wiredModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiredModule_ConnectOpposite() {
		return (EReference) wiredModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageBroker() {
		return messageBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageBroker_Topics() {
		return (EAttribute) messageBrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_X() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Y() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Z() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Description() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Topics() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatefulElement() {
		return statefulElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatefulElement_Status() {
		return (EAttribute) statefulElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagingElement() {
		return messagingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagingElement_Subscription() {
		return (EReference) messagingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagingElement_Publication() {
		return (EReference) messagingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagingLink() {
		return messagingLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagingLink_MessageBroker() {
		return (EReference) messagingLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessagingLink_Topics() {
		return (EAttribute) messagingLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElement() {
		return connectableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectableElement_ConnectionModule() {
		return (EReference) connectableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectableElement_Position() {
		return (EReference) connectableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpsmlFactory getCpsmlFactory() {
		return (CpsmlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cpsEClass = createEClass(CPS);
		createEReference(cpsEClass, CPS__ENVIRONMENT);
		createEReference(cpsEClass, CPS__MESSAGE_BROKER);
		createEReference(cpsEClass, CPS__CONTROLLER);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__NODE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__FUNCTION);
		createEAttribute(componentEClass, COMPONENT__TOPIC);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__COMPONENT);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__PARAMETER);
		createEAttribute(functionEClass, FUNCTION__RETURN_DATA_TYPE);
		createEAttribute(functionEClass, FUNCTION__HAS_RETURN);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DATA_TYPE);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__FREQUENCY);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__RUNS);
		createEAttribute(actuatorEClass, ACTUATOR__RATED_RUNS);

		connectionModuleEClass = createEClass(CONNECTION_MODULE);
		createEAttribute(connectionModuleEClass, CONNECTION_MODULE__SUPPORTED_PROTOCOLS);

		wirelessModuleEClass = createEClass(WIRELESS_MODULE);
		createEReference(wirelessModuleEClass, WIRELESS_MODULE__CONNECT);
		createEReference(wirelessModuleEClass, WIRELESS_MODULE__CONNECT_OPPOSITE);
		createEAttribute(wirelessModuleEClass, WIRELESS_MODULE__RANGE);

		wiredModuleEClass = createEClass(WIRED_MODULE);
		createEReference(wiredModuleEClass, WIRED_MODULE__CONNECT);
		createEReference(wiredModuleEClass, WIRED_MODULE__CONNECT_OPPOSITE);

		messageBrokerEClass = createEClass(MESSAGE_BROKER);
		createEAttribute(messageBrokerEClass, MESSAGE_BROKER__TOPICS);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);
		createEAttribute(positionEClass, POSITION__Z);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__DESCRIPTION);
		createEAttribute(controllerEClass, CONTROLLER__TOPICS);

		statefulElementEClass = createEClass(STATEFUL_ELEMENT);
		createEAttribute(statefulElementEClass, STATEFUL_ELEMENT__STATUS);

		messagingElementEClass = createEClass(MESSAGING_ELEMENT);
		createEReference(messagingElementEClass, MESSAGING_ELEMENT__SUBSCRIPTION);
		createEReference(messagingElementEClass, MESSAGING_ELEMENT__PUBLICATION);

		messagingLinkEClass = createEClass(MESSAGING_LINK);
		createEReference(messagingLinkEClass, MESSAGING_LINK__MESSAGE_BROKER);
		createEAttribute(messagingLinkEClass, MESSAGING_LINK__TOPICS);

		connectableElementEClass = createEClass(CONNECTABLE_ELEMENT);
		createEReference(connectableElementEClass, CONNECTABLE_ELEMENT__CONNECTION_MODULE);
		createEReference(connectableElementEClass, CONNECTABLE_ELEMENT__POSITION);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		statusEEnum = createEEnum(STATUS);
		protocolEEnum = createEEnum(PROTOCOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cpsEClass.getESuperTypes().add(this.getNamedElement());
		environmentEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getStatefulElement());
		nodeEClass.getESuperTypes().add(this.getNamedElement());
		nodeEClass.getESuperTypes().add(this.getStatefulElement());
		nodeEClass.getESuperTypes().add(this.getMessagingElement());
		nodeEClass.getESuperTypes().add(this.getConnectableElement());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getComponent());
		actuatorEClass.getESuperTypes().add(this.getComponent());
		connectionModuleEClass.getESuperTypes().add(this.getNamedElement());
		wirelessModuleEClass.getESuperTypes().add(this.getConnectionModule());
		wiredModuleEClass.getESuperTypes().add(this.getConnectionModule());
		messageBrokerEClass.getESuperTypes().add(this.getNamedElement());
		messageBrokerEClass.getESuperTypes().add(this.getConnectableElement());
		controllerEClass.getESuperTypes().add(this.getNamedElement());
		controllerEClass.getESuperTypes().add(this.getMessagingElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(cpsEClass, cpsml.CPS.class, "CPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCPS_Environment(), this.getEnvironment(), null, "environment", null, 0, -1, cpsml.CPS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPS_MessageBroker(), this.getMessageBroker(), null, "messageBroker", null, 0, -1,
				cpsml.CPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPS_Controller(), this.getController(), null, "controller", null, 0, -1, cpsml.CPS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_Node(), this.getNode(), null, "node", null, 0, -1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Function(), this.getFunction(), null, "function", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Component(), this.getComponent(), null, "component", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_ReturnDataType(), this.getDataType(), "returnDataType", null, 0, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_HasReturn(), ecorePackage.getEBoolean(), "hasReturn", null, 1, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_DataType(), this.getDataType(), "dataType", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Frequency(), ecorePackage.getEFloat(), "frequency", "0", 1, 1, Sensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Runs(), ecorePackage.getEInt(), "runs", "0", 1, 1, Actuator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_RatedRuns(), ecorePackage.getEInt(), "ratedRuns", "100", 1, 1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionModuleEClass, ConnectionModule.class, "ConnectionModule", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionModule_SupportedProtocols(), this.getProtocol(), "supportedProtocols", null, 1, 3,
				ConnectionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(wirelessModuleEClass, WirelessModule.class, "WirelessModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWirelessModule_Connect(), this.getWirelessModule(), this.getWirelessModule_ConnectOpposite(),
				"connect", null, 0, -1, WirelessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWirelessModule_ConnectOpposite(), this.getWirelessModule(), this.getWirelessModule_Connect(),
				"connectOpposite", null, 0, -1, WirelessModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWirelessModule_Range(), ecorePackage.getEFloat(), "range", null, 1, 1, WirelessModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiredModuleEClass, WiredModule.class, "WiredModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWiredModule_Connect(), this.getWiredModule(), this.getWiredModule_ConnectOpposite(),
				"connect", null, 0, -1, WiredModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiredModule_ConnectOpposite(), this.getWiredModule(), this.getWiredModule_Connect(),
				"connectOpposite", null, 0, -1, WiredModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageBrokerEClass, MessageBroker.class, "MessageBroker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageBroker_Topics(), ecorePackage.getEString(), "topics", null, 0, 4, MessageBroker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), ecorePackage.getEFloat(), "x", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Z(), ecorePackage.getEFloat(), "z", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_Topics(), ecorePackage.getEString(), "topics", null, 0, 10, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statefulElementEClass, StatefulElement.class, "StatefulElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatefulElement_Status(), this.getStatus(), "status", null, 1, 1, StatefulElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messagingElementEClass, MessagingElement.class, "MessagingElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessagingElement_Subscription(), this.getMessagingLink(), null, "subscription", null, 0, -1,
				MessagingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessagingElement_Publication(), this.getMessagingLink(), null, "publication", null, 0, -1,
				MessagingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messagingLinkEClass, MessagingLink.class, "MessagingLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessagingLink_MessageBroker(), this.getMessageBroker(), null, "messageBroker", null, 1, 1,
				MessagingLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessagingLink_Topics(), ecorePackage.getEString(), "topics", null, 1, -1, MessagingLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectableElementEClass, ConnectableElement.class, "ConnectableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectableElement_ConnectionModule(), this.getConnectionModule(), null, "connectionModule",
				null, 0, -1, ConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectableElement_Position(), this.getPosition(), null, "position", null, 1, 1,
				ConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.NULL);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);

		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.GOOD);
		addEEnumLiteral(statusEEnum, Status.WARNING);
		addEEnumLiteral(statusEEnum, Status.CRITICAL);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.DDS);
		addEEnumLiteral(protocolEEnum, Protocol.MQTT);
		addEEnumLiteral(protocolEEnum, Protocol.SMQTT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(nodeEClass, source, new String[] { "constraints", "statusBasedOnComponents_c1" });
		addAnnotation(functionEClass, source,
				new String[] { "constraints", "returnAndNotNull_c3 sensorRequiresReturn_c3" });
		addAnnotation(connectionModuleEClass, source, new String[] { "constraints", "namingConvention_cS2" });
		addAnnotation(wirelessModuleEClass, source,
				new String[] { "constraints", "rangePositive_cS4 distancesWihtinRange_c4 noConnectionToSelf_cS3a" });
		addAnnotation(wiredModuleEClass, source, new String[] { "constraints", "noConnectionToSelf_cS3b" });
		addAnnotation(messagingLinkEClass, source, new String[] { "constraints",
				"messagingElementConnectedToMB_c2 commonTopicsWithNode_cS1a commonTopicsWithMB_cS1b" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(nodeEClass, source, new String[] { "statusBasedOnComponents_c1",
				"\n\t\t\tself.status = Status::GOOD implies self.component->forAll(c| c.status = Status::GOOD)" });
		addAnnotation(functionEClass, source,
				new String[] { "returnAndNotNull_c3", "\n\t\t\tself.hasReturn implies returnDataType <> DataType::NULL",
						"sensorRequiresReturn_c3",
						"\n\t\t\tself.oclContainer.oclIsTypeOf(Sensor) implies hasReturn\n\t\t\t" });
		addAnnotation(connectionModuleEClass, source, new String[] { "namingConvention_cS2",
				"\n\t\t\tself.name.substring(1, self.oclContainer.oclAsType(NamedElement).name.size()) = self.oclContainer.oclAsType(NamedElement).name.toUpper()\n\t\t" });
		addAnnotation(wirelessModuleEClass, source, new String[] { "rangePositive_cS4", "\n\t\t\tself.range >= 0",
				"distancesWihtinRange_c4",
				"\n\t\t\tself.connect->forAll(p|\n\t\t\t\t(\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x)*\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).x) +\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y)*\n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).y) + \n\t\t\t\t\t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z)*\n\t\t\t\t \t (self.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z - p.oclContainer.oclAsType(ConnectableElement).position.oclAsType(Position).z)\n\t\t\t\t ) <= (self.range * self.range).min(p.range * p.range)\n\t\t)",
				"noConnectionToSelf_cS3a", "\n\t\t\tself.connect->excludes(self)\n\t\t" });
		addAnnotation(wiredModuleEClass, source,
				new String[] { "noConnectionToSelf_cS3b", "\n\t\t\tself.connect->excludes(self)\n\t\t" });
		addAnnotation(messagingLinkEClass, source, new String[] { "messagingElementConnectedToMB_c2",
				"\n\t\t\tif self.oclContainer.oclIsTypeOf(Node) then\n\t\t\t\tself.oclContainer.oclAsType(Node).connectionModule->exists(cM | \n\t\t\t\t\t\t(cM.oclIsTypeOf(WiredModule) implies\n\t\t\t\t\t\t\tcM.oclAsType(WiredModule).connect->exists(c|c.oclContainer = self.messageBroker) or\n\t\t\t\t\t\t\tcM.oclAsType(WiredModule).connectOpposite->exists(c|c.oclContainer = self.messageBroker)\n\t\t\t\t\t\t)\n\t\t\t\t\t\tand\n\t\t\t\t\t\t(cM.oclIsTypeOf(WirelessModule) implies\n\t\t\t\t\t\t\tcM.oclAsType(WirelessModule).connect->exists(c|c.oclContainer = self.messageBroker) or\n\t\t\t\t\t\t\tcM.oclAsType(WirelessModule).connectOpposite->exists(c|c.oclContainer = self.messageBroker)\n\t\t\t\t\t\t)\n\t\t\t\t)\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t",
				"commonTopicsWithNode_cS1a",
				"\n\t\t\tself.topics->forAll(t1 | self.messageBroker.topics->exists(t2 | t1 = t2) )\n\t\t",
				"commonTopicsWithMB_cS1b",
				"\n\t\t\tif self.oclContainer.oclIsTypeOf(Node) then\n\t\t\t\tself.topics->forAll(t1 | self.oclContainer.oclAsType(Node).component.topic->exists(t2 | t1 = t2) )\n\t\t\telse\n\t\t\t\tself.topics->forAll(t1 | self.oclContainer.oclAsType(Controller).topics->exists(t2 | t1 = t2) )\n\t\t\tendif\n\t\t" });
	}

} //CpsmlPackageImpl
