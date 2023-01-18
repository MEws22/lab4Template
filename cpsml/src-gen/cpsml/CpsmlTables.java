/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /cpsml/model/cpsml.ecore
 * using:
 *   /cpsml/model/cpsml.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package cpsml;

// import cpsml.CpsmlPackage;
// import cpsml.CpsmlTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * CpsmlTables provides the dispatch tables for the cpsml for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CpsmlTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CpsmlPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml = IdManager.getNsURIPackageId("http://big.tuwien.ac.at/cpsml", null, CpsmlPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_CPS = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("CPS", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = CpsmlTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Component = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Component", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ConnectableElement = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("ConnectableElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ConnectionModule = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("ConnectionModule", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Controller = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Controller", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Environment = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Environment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Function = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Function", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MessageBroker = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("MessageBroker", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MessagingElement = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("MessagingElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MessagingLink = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("MessagingLink", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NamedElement = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("NamedElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Node = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Node", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = CpsmlTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Position = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Position", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Sensor = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("Sensor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WiredModule = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("WiredModule", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WirelessModule = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getClassId("WirelessModule", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = CpsmlTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = CpsmlTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Protocol = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getEnumerationId("Protocol");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Status = CpsmlTables.PACKid_http_c_s_s_big_tuwien_ac_at_s_cpsml.getEnumerationId("Status");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_MessagingLink = TypeId.BAG.getSpecializedId(CpsmlTables.CLSSid_MessagingLink);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_GOOD = CpsmlTables.ENUMid_Status.getEnumerationLiteralId("GOOD");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_NULL = CpsmlTables.ENUMid_DataType.getEnumerationLiteralId("NULL");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Component = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_Component);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ConnectionModule = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_ConnectionModule);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Controller = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_Controller);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Environment = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_Environment);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Function = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_Function);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_MessageBroker = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_MessageBroker);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_MessagingLink = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_MessagingLink);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Node = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_Node);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_Parameter);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WiredModule = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_WiredModule);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WirelessModule = TypeId.ORDERED_SET.getSpecializedId(CpsmlTables.CLSSid_WirelessModule);
	public static final /*@NonInvalid*/ CollectionTypeId SET_ENUMid_Protocol = TypeId.SET.getSpecializedId(CpsmlTables.ENUMid_Protocol);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CpsmlTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Actuator = new EcoreExecutorType(CpsmlPackage.Literals.ACTUATOR, PACKAGE, 0);
		public static final EcoreExecutorType _CPS = new EcoreExecutorType(CpsmlPackage.Literals.CPS, PACKAGE, 0);
		public static final EcoreExecutorType _Component = new EcoreExecutorType(CpsmlPackage.Literals.COMPONENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ConnectableElement = new EcoreExecutorType(CpsmlPackage.Literals.CONNECTABLE_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ConnectionModule = new EcoreExecutorType(CpsmlPackage.Literals.CONNECTION_MODULE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Controller = new EcoreExecutorType(CpsmlPackage.Literals.CONTROLLER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(CpsmlPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Environment = new EcoreExecutorType(CpsmlPackage.Literals.ENVIRONMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Function = new EcoreExecutorType(CpsmlPackage.Literals.FUNCTION, PACKAGE, 0);
		public static final EcoreExecutorType _MessageBroker = new EcoreExecutorType(CpsmlPackage.Literals.MESSAGE_BROKER, PACKAGE, 0);
		public static final EcoreExecutorType _MessagingElement = new EcoreExecutorType(CpsmlPackage.Literals.MESSAGING_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _MessagingLink = new EcoreExecutorType(CpsmlPackage.Literals.MESSAGING_LINK, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(CpsmlPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Node = new EcoreExecutorType(CpsmlPackage.Literals.NODE, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(CpsmlPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _Position = new EcoreExecutorType(CpsmlPackage.Literals.POSITION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Protocol = new EcoreExecutorEnumeration(CpsmlPackage.Literals.PROTOCOL, PACKAGE, 0);
		public static final EcoreExecutorType _Sensor = new EcoreExecutorType(CpsmlPackage.Literals.SENSOR, PACKAGE, 0);
		public static final EcoreExecutorType _StatefulElement = new EcoreExecutorType(CpsmlPackage.Literals.STATEFUL_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Status = new EcoreExecutorEnumeration(CpsmlPackage.Literals.STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _WiredModule = new EcoreExecutorType(CpsmlPackage.Literals.WIRED_MODULE, PACKAGE, 0);
		public static final EcoreExecutorType _WirelessModule = new EcoreExecutorType(CpsmlPackage.Literals.WIRELESS_MODULE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Actuator,
			_CPS,
			_Component,
			_ConnectableElement,
			_ConnectionModule,
			_Controller,
			_DataType,
			_Environment,
			_Function,
			_MessageBroker,
			_MessagingElement,
			_MessagingLink,
			_NamedElement,
			_Node,
			_Parameter,
			_Position,
			_Protocol,
			_Sensor,
			_StatefulElement,
			_Status,
			_WiredModule,
			_WirelessModule
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Actuator__Actuator = new ExecutorFragment(Types._Actuator, CpsmlTables.Types._Actuator);
		private static final ExecutorFragment _Actuator__Component = new ExecutorFragment(Types._Actuator, CpsmlTables.Types._Component);
		private static final ExecutorFragment _Actuator__NamedElement = new ExecutorFragment(Types._Actuator, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Actuator__OclAny = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Actuator__OclElement = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Actuator__StatefulElement = new ExecutorFragment(Types._Actuator, CpsmlTables.Types._StatefulElement);

		private static final ExecutorFragment _CPS__CPS = new ExecutorFragment(Types._CPS, CpsmlTables.Types._CPS);
		private static final ExecutorFragment _CPS__NamedElement = new ExecutorFragment(Types._CPS, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _CPS__OclAny = new ExecutorFragment(Types._CPS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CPS__OclElement = new ExecutorFragment(Types._CPS, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, CpsmlTables.Types._Component);
		private static final ExecutorFragment _Component__NamedElement = new ExecutorFragment(Types._Component, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Component__StatefulElement = new ExecutorFragment(Types._Component, CpsmlTables.Types._StatefulElement);

		private static final ExecutorFragment _ConnectableElement__ConnectableElement = new ExecutorFragment(Types._ConnectableElement, CpsmlTables.Types._ConnectableElement);
		private static final ExecutorFragment _ConnectableElement__OclAny = new ExecutorFragment(Types._ConnectableElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConnectableElement__OclElement = new ExecutorFragment(Types._ConnectableElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ConnectionModule__ConnectionModule = new ExecutorFragment(Types._ConnectionModule, CpsmlTables.Types._ConnectionModule);
		private static final ExecutorFragment _ConnectionModule__NamedElement = new ExecutorFragment(Types._ConnectionModule, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _ConnectionModule__OclAny = new ExecutorFragment(Types._ConnectionModule, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConnectionModule__OclElement = new ExecutorFragment(Types._ConnectionModule, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Controller__Controller = new ExecutorFragment(Types._Controller, CpsmlTables.Types._Controller);
		private static final ExecutorFragment _Controller__MessagingElement = new ExecutorFragment(Types._Controller, CpsmlTables.Types._MessagingElement);
		private static final ExecutorFragment _Controller__NamedElement = new ExecutorFragment(Types._Controller, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Controller__OclAny = new ExecutorFragment(Types._Controller, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Controller__OclElement = new ExecutorFragment(Types._Controller, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, CpsmlTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Environment__Environment = new ExecutorFragment(Types._Environment, CpsmlTables.Types._Environment);
		private static final ExecutorFragment _Environment__NamedElement = new ExecutorFragment(Types._Environment, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Environment__OclAny = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Environment__OclElement = new ExecutorFragment(Types._Environment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Function__Function = new ExecutorFragment(Types._Function, CpsmlTables.Types._Function);
		private static final ExecutorFragment _Function__NamedElement = new ExecutorFragment(Types._Function, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Function__OclAny = new ExecutorFragment(Types._Function, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Function__OclElement = new ExecutorFragment(Types._Function, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MessageBroker__ConnectableElement = new ExecutorFragment(Types._MessageBroker, CpsmlTables.Types._ConnectableElement);
		private static final ExecutorFragment _MessageBroker__MessageBroker = new ExecutorFragment(Types._MessageBroker, CpsmlTables.Types._MessageBroker);
		private static final ExecutorFragment _MessageBroker__NamedElement = new ExecutorFragment(Types._MessageBroker, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _MessageBroker__OclAny = new ExecutorFragment(Types._MessageBroker, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MessageBroker__OclElement = new ExecutorFragment(Types._MessageBroker, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MessagingElement__MessagingElement = new ExecutorFragment(Types._MessagingElement, CpsmlTables.Types._MessagingElement);
		private static final ExecutorFragment _MessagingElement__OclAny = new ExecutorFragment(Types._MessagingElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MessagingElement__OclElement = new ExecutorFragment(Types._MessagingElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MessagingLink__MessagingLink = new ExecutorFragment(Types._MessagingLink, CpsmlTables.Types._MessagingLink);
		private static final ExecutorFragment _MessagingLink__OclAny = new ExecutorFragment(Types._MessagingLink, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MessagingLink__OclElement = new ExecutorFragment(Types._MessagingLink, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Node__ConnectableElement = new ExecutorFragment(Types._Node, CpsmlTables.Types._ConnectableElement);
		private static final ExecutorFragment _Node__MessagingElement = new ExecutorFragment(Types._Node, CpsmlTables.Types._MessagingElement);
		private static final ExecutorFragment _Node__NamedElement = new ExecutorFragment(Types._Node, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Node__Node = new ExecutorFragment(Types._Node, CpsmlTables.Types._Node);
		private static final ExecutorFragment _Node__OclAny = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Node__OclElement = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Node__StatefulElement = new ExecutorFragment(Types._Node, CpsmlTables.Types._StatefulElement);

		private static final ExecutorFragment _Parameter__NamedElement = new ExecutorFragment(Types._Parameter, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, CpsmlTables.Types._Parameter);

		private static final ExecutorFragment _Position__OclAny = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Position__OclElement = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Position__Position = new ExecutorFragment(Types._Position, CpsmlTables.Types._Position);

		private static final ExecutorFragment _Protocol__OclAny = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Protocol__OclElement = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Protocol__OclEnumeration = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Protocol__OclType = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Protocol__Protocol = new ExecutorFragment(Types._Protocol, CpsmlTables.Types._Protocol);

		private static final ExecutorFragment _Sensor__Component = new ExecutorFragment(Types._Sensor, CpsmlTables.Types._Component);
		private static final ExecutorFragment _Sensor__NamedElement = new ExecutorFragment(Types._Sensor, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _Sensor__OclAny = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Sensor__OclElement = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Sensor__Sensor = new ExecutorFragment(Types._Sensor, CpsmlTables.Types._Sensor);
		private static final ExecutorFragment _Sensor__StatefulElement = new ExecutorFragment(Types._Sensor, CpsmlTables.Types._StatefulElement);

		private static final ExecutorFragment _StatefulElement__OclAny = new ExecutorFragment(Types._StatefulElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StatefulElement__OclElement = new ExecutorFragment(Types._StatefulElement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StatefulElement__StatefulElement = new ExecutorFragment(Types._StatefulElement, CpsmlTables.Types._StatefulElement);

		private static final ExecutorFragment _Status__OclAny = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Status__OclElement = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Status__OclEnumeration = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Status__OclType = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Status__Status = new ExecutorFragment(Types._Status, CpsmlTables.Types._Status);

		private static final ExecutorFragment _WiredModule__ConnectionModule = new ExecutorFragment(Types._WiredModule, CpsmlTables.Types._ConnectionModule);
		private static final ExecutorFragment _WiredModule__NamedElement = new ExecutorFragment(Types._WiredModule, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _WiredModule__OclAny = new ExecutorFragment(Types._WiredModule, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WiredModule__OclElement = new ExecutorFragment(Types._WiredModule, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WiredModule__WiredModule = new ExecutorFragment(Types._WiredModule, CpsmlTables.Types._WiredModule);

		private static final ExecutorFragment _WirelessModule__ConnectionModule = new ExecutorFragment(Types._WirelessModule, CpsmlTables.Types._ConnectionModule);
		private static final ExecutorFragment _WirelessModule__NamedElement = new ExecutorFragment(Types._WirelessModule, CpsmlTables.Types._NamedElement);
		private static final ExecutorFragment _WirelessModule__OclAny = new ExecutorFragment(Types._WirelessModule, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WirelessModule__OclElement = new ExecutorFragment(Types._WirelessModule, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WirelessModule__WirelessModule = new ExecutorFragment(Types._WirelessModule, CpsmlTables.Types._WirelessModule);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Actuator__ratedRuns = new EcoreExecutorProperty(CpsmlPackage.Literals.ACTUATOR__RATED_RUNS, Types._Actuator, 0);
		public static final ExecutorProperty _Actuator__runs = new EcoreExecutorProperty(CpsmlPackage.Literals.ACTUATOR__RUNS, Types._Actuator, 1);

		public static final ExecutorProperty _CPS__controller = new EcoreExecutorProperty(CpsmlPackage.Literals.CPS__CONTROLLER, Types._CPS, 0);
		public static final ExecutorProperty _CPS__environment = new EcoreExecutorProperty(CpsmlPackage.Literals.CPS__ENVIRONMENT, Types._CPS, 1);
		public static final ExecutorProperty _CPS__messageBroker = new EcoreExecutorProperty(CpsmlPackage.Literals.CPS__MESSAGE_BROKER, Types._CPS, 2);

		public static final ExecutorProperty _Component__function = new EcoreExecutorProperty(CpsmlPackage.Literals.COMPONENT__FUNCTION, Types._Component, 0);
		public static final ExecutorProperty _Component__topic = new EcoreExecutorProperty(CpsmlPackage.Literals.COMPONENT__TOPIC, Types._Component, 1);
		public static final ExecutorProperty _Component__Node__component = new ExecutorPropertyWithImplementation("Node", Types._Component, 2, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.NODE__COMPONENT));

		public static final ExecutorProperty _ConnectableElement__connectionModule = new EcoreExecutorProperty(CpsmlPackage.Literals.CONNECTABLE_ELEMENT__CONNECTION_MODULE, Types._ConnectableElement, 0);
		public static final ExecutorProperty _ConnectableElement__position = new EcoreExecutorProperty(CpsmlPackage.Literals.CONNECTABLE_ELEMENT__POSITION, Types._ConnectableElement, 1);

		public static final ExecutorProperty _ConnectionModule__supportedProtocols = new EcoreExecutorProperty(CpsmlPackage.Literals.CONNECTION_MODULE__SUPPORTED_PROTOCOLS, Types._ConnectionModule, 0);
		public static final ExecutorProperty _ConnectionModule__ConnectableElement__connectionModule = new ExecutorPropertyWithImplementation("ConnectableElement", Types._ConnectionModule, 1, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.CONNECTABLE_ELEMENT__CONNECTION_MODULE));

		public static final ExecutorProperty _Controller__description = new EcoreExecutorProperty(CpsmlPackage.Literals.CONTROLLER__DESCRIPTION, Types._Controller, 0);
		public static final ExecutorProperty _Controller__topics = new EcoreExecutorProperty(CpsmlPackage.Literals.CONTROLLER__TOPICS, Types._Controller, 1);
		public static final ExecutorProperty _Controller__CPS__controller = new ExecutorPropertyWithImplementation("CPS", Types._Controller, 2, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.CPS__CONTROLLER));

		public static final ExecutorProperty _Environment__node = new EcoreExecutorProperty(CpsmlPackage.Literals.ENVIRONMENT__NODE, Types._Environment, 0);
		public static final ExecutorProperty _Environment__CPS__environment = new ExecutorPropertyWithImplementation("CPS", Types._Environment, 1, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.CPS__ENVIRONMENT));

		public static final ExecutorProperty _Function__hasReturn = new EcoreExecutorProperty(CpsmlPackage.Literals.FUNCTION__HAS_RETURN, Types._Function, 0);
		public static final ExecutorProperty _Function__parameter = new EcoreExecutorProperty(CpsmlPackage.Literals.FUNCTION__PARAMETER, Types._Function, 1);
		public static final ExecutorProperty _Function__returnDataType = new EcoreExecutorProperty(CpsmlPackage.Literals.FUNCTION__RETURN_DATA_TYPE, Types._Function, 2);
		public static final ExecutorProperty _Function__Component__function = new ExecutorPropertyWithImplementation("Component", Types._Function, 3, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.COMPONENT__FUNCTION));

		public static final ExecutorProperty _MessageBroker__topics = new EcoreExecutorProperty(CpsmlPackage.Literals.MESSAGE_BROKER__TOPICS, Types._MessageBroker, 0);
		public static final ExecutorProperty _MessageBroker__CPS__messageBroker = new ExecutorPropertyWithImplementation("CPS", Types._MessageBroker, 1, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.CPS__MESSAGE_BROKER));
		public static final ExecutorProperty _MessageBroker__MessagingLink__messageBroker = new ExecutorPropertyWithImplementation("MessagingLink", Types._MessageBroker, 2, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.MESSAGING_LINK__MESSAGE_BROKER));

		public static final ExecutorProperty _MessagingElement__publication = new EcoreExecutorProperty(CpsmlPackage.Literals.MESSAGING_ELEMENT__PUBLICATION, Types._MessagingElement, 0);
		public static final ExecutorProperty _MessagingElement__subscription = new EcoreExecutorProperty(CpsmlPackage.Literals.MESSAGING_ELEMENT__SUBSCRIPTION, Types._MessagingElement, 1);

		public static final ExecutorProperty _MessagingLink__messageBroker = new EcoreExecutorProperty(CpsmlPackage.Literals.MESSAGING_LINK__MESSAGE_BROKER, Types._MessagingLink, 0);
		public static final ExecutorProperty _MessagingLink__topics = new EcoreExecutorProperty(CpsmlPackage.Literals.MESSAGING_LINK__TOPICS, Types._MessagingLink, 1);
		public static final ExecutorProperty _MessagingLink__MessagingElement__publication = new ExecutorPropertyWithImplementation("MessagingElement", Types._MessagingLink, 2, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.MESSAGING_ELEMENT__PUBLICATION));
		public static final ExecutorProperty _MessagingLink__MessagingElement__subscription = new ExecutorPropertyWithImplementation("MessagingElement", Types._MessagingLink, 3, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.MESSAGING_ELEMENT__SUBSCRIPTION));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(CpsmlPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Node__component = new EcoreExecutorProperty(CpsmlPackage.Literals.NODE__COMPONENT, Types._Node, 0);
		public static final ExecutorProperty _Node__Environment__node = new ExecutorPropertyWithImplementation("Environment", Types._Node, 1, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.ENVIRONMENT__NODE));

		public static final ExecutorProperty _Parameter__dataType = new EcoreExecutorProperty(CpsmlPackage.Literals.PARAMETER__DATA_TYPE, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__Function__parameter = new ExecutorPropertyWithImplementation("Function", Types._Parameter, 1, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.FUNCTION__PARAMETER));

		public static final ExecutorProperty _Position__x = new EcoreExecutorProperty(CpsmlPackage.Literals.POSITION__X, Types._Position, 0);
		public static final ExecutorProperty _Position__y = new EcoreExecutorProperty(CpsmlPackage.Literals.POSITION__Y, Types._Position, 1);
		public static final ExecutorProperty _Position__z = new EcoreExecutorProperty(CpsmlPackage.Literals.POSITION__Z, Types._Position, 2);
		public static final ExecutorProperty _Position__ConnectableElement__position = new ExecutorPropertyWithImplementation("ConnectableElement", Types._Position, 3, new EcoreLibraryOppositeProperty(CpsmlPackage.Literals.CONNECTABLE_ELEMENT__POSITION));

		public static final ExecutorProperty _Sensor__frequency = new EcoreExecutorProperty(CpsmlPackage.Literals.SENSOR__FREQUENCY, Types._Sensor, 0);

		public static final ExecutorProperty _StatefulElement__status = new EcoreExecutorProperty(CpsmlPackage.Literals.STATEFUL_ELEMENT__STATUS, Types._StatefulElement, 0);

		public static final ExecutorProperty _WiredModule__connect = new EcoreExecutorProperty(CpsmlPackage.Literals.WIRED_MODULE__CONNECT, Types._WiredModule, 0);
		public static final ExecutorProperty _WiredModule__connectOpposite = new EcoreExecutorProperty(CpsmlPackage.Literals.WIRED_MODULE__CONNECT_OPPOSITE, Types._WiredModule, 1);

		public static final ExecutorProperty _WirelessModule__connect = new EcoreExecutorProperty(CpsmlPackage.Literals.WIRELESS_MODULE__CONNECT, Types._WirelessModule, 0);
		public static final ExecutorProperty _WirelessModule__connectOpposite = new EcoreExecutorProperty(CpsmlPackage.Literals.WIRELESS_MODULE__CONNECT_OPPOSITE, Types._WirelessModule, 1);
		public static final ExecutorProperty _WirelessModule__range = new EcoreExecutorProperty(CpsmlPackage.Literals.WIRELESS_MODULE__RANGE, Types._WirelessModule, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Actuator =
			{
				Fragments._Actuator__OclAny /* 0 */,
				Fragments._Actuator__OclElement /* 1 */,
				Fragments._Actuator__NamedElement /* 2 */,
				Fragments._Actuator__StatefulElement /* 2 */,
				Fragments._Actuator__Component /* 3 */,
				Fragments._Actuator__Actuator /* 4 */
			};
		private static final int /*@NonNull*/ [] __Actuator = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CPS =
			{
				Fragments._CPS__OclAny /* 0 */,
				Fragments._CPS__OclElement /* 1 */,
				Fragments._CPS__NamedElement /* 2 */,
				Fragments._CPS__CPS /* 3 */
			};
		private static final int /*@NonNull*/ [] __CPS = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__NamedElement /* 2 */,
				Fragments._Component__StatefulElement /* 2 */,
				Fragments._Component__Component /* 3 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConnectableElement =
			{
				Fragments._ConnectableElement__OclAny /* 0 */,
				Fragments._ConnectableElement__OclElement /* 1 */,
				Fragments._ConnectableElement__ConnectableElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __ConnectableElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConnectionModule =
			{
				Fragments._ConnectionModule__OclAny /* 0 */,
				Fragments._ConnectionModule__OclElement /* 1 */,
				Fragments._ConnectionModule__NamedElement /* 2 */,
				Fragments._ConnectionModule__ConnectionModule /* 3 */
			};
		private static final int /*@NonNull*/ [] __ConnectionModule = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Controller =
			{
				Fragments._Controller__OclAny /* 0 */,
				Fragments._Controller__OclElement /* 1 */,
				Fragments._Controller__MessagingElement /* 2 */,
				Fragments._Controller__NamedElement /* 2 */,
				Fragments._Controller__Controller /* 3 */
			};
		private static final int /*@NonNull*/ [] __Controller = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Environment =
			{
				Fragments._Environment__OclAny /* 0 */,
				Fragments._Environment__OclElement /* 1 */,
				Fragments._Environment__NamedElement /* 2 */,
				Fragments._Environment__Environment /* 3 */
			};
		private static final int /*@NonNull*/ [] __Environment = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Function =
			{
				Fragments._Function__OclAny /* 0 */,
				Fragments._Function__OclElement /* 1 */,
				Fragments._Function__NamedElement /* 2 */,
				Fragments._Function__Function /* 3 */
			};
		private static final int /*@NonNull*/ [] __Function = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MessageBroker =
			{
				Fragments._MessageBroker__OclAny /* 0 */,
				Fragments._MessageBroker__OclElement /* 1 */,
				Fragments._MessageBroker__ConnectableElement /* 2 */,
				Fragments._MessageBroker__NamedElement /* 2 */,
				Fragments._MessageBroker__MessageBroker /* 3 */
			};
		private static final int /*@NonNull*/ [] __MessageBroker = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MessagingElement =
			{
				Fragments._MessagingElement__OclAny /* 0 */,
				Fragments._MessagingElement__OclElement /* 1 */,
				Fragments._MessagingElement__MessagingElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __MessagingElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MessagingLink =
			{
				Fragments._MessagingLink__OclAny /* 0 */,
				Fragments._MessagingLink__OclElement /* 1 */,
				Fragments._MessagingLink__MessagingLink /* 2 */
			};
		private static final int /*@NonNull*/ [] __MessagingLink = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Node =
			{
				Fragments._Node__OclAny /* 0 */,
				Fragments._Node__OclElement /* 1 */,
				Fragments._Node__ConnectableElement /* 2 */,
				Fragments._Node__MessagingElement /* 2 */,
				Fragments._Node__NamedElement /* 2 */,
				Fragments._Node__StatefulElement /* 2 */,
				Fragments._Node__Node /* 3 */
			};
		private static final int /*@NonNull*/ [] __Node = { 1,1,4,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__NamedElement /* 2 */,
				Fragments._Parameter__Parameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Position =
			{
				Fragments._Position__OclAny /* 0 */,
				Fragments._Position__OclElement /* 1 */,
				Fragments._Position__Position /* 2 */
			};
		private static final int /*@NonNull*/ [] __Position = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Protocol =
			{
				Fragments._Protocol__OclAny /* 0 */,
				Fragments._Protocol__OclElement /* 1 */,
				Fragments._Protocol__OclType /* 2 */,
				Fragments._Protocol__OclEnumeration /* 3 */,
				Fragments._Protocol__Protocol /* 4 */
			};
		private static final int /*@NonNull*/ [] __Protocol = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Sensor =
			{
				Fragments._Sensor__OclAny /* 0 */,
				Fragments._Sensor__OclElement /* 1 */,
				Fragments._Sensor__NamedElement /* 2 */,
				Fragments._Sensor__StatefulElement /* 2 */,
				Fragments._Sensor__Component /* 3 */,
				Fragments._Sensor__Sensor /* 4 */
			};
		private static final int /*@NonNull*/ [] __Sensor = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StatefulElement =
			{
				Fragments._StatefulElement__OclAny /* 0 */,
				Fragments._StatefulElement__OclElement /* 1 */,
				Fragments._StatefulElement__StatefulElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __StatefulElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Status =
			{
				Fragments._Status__OclAny /* 0 */,
				Fragments._Status__OclElement /* 1 */,
				Fragments._Status__OclType /* 2 */,
				Fragments._Status__OclEnumeration /* 3 */,
				Fragments._Status__Status /* 4 */
			};
		private static final int /*@NonNull*/ [] __Status = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WiredModule =
			{
				Fragments._WiredModule__OclAny /* 0 */,
				Fragments._WiredModule__OclElement /* 1 */,
				Fragments._WiredModule__NamedElement /* 2 */,
				Fragments._WiredModule__ConnectionModule /* 3 */,
				Fragments._WiredModule__WiredModule /* 4 */
			};
		private static final int /*@NonNull*/ [] __WiredModule = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WirelessModule =
			{
				Fragments._WirelessModule__OclAny /* 0 */,
				Fragments._WirelessModule__OclElement /* 1 */,
				Fragments._WirelessModule__NamedElement /* 2 */,
				Fragments._WirelessModule__ConnectionModule /* 3 */,
				Fragments._WirelessModule__WirelessModule /* 4 */
			};
		private static final int /*@NonNull*/ [] __WirelessModule = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Actuator.initFragments(_Actuator, __Actuator);
			Types._CPS.initFragments(_CPS, __CPS);
			Types._Component.initFragments(_Component, __Component);
			Types._ConnectableElement.initFragments(_ConnectableElement, __ConnectableElement);
			Types._ConnectionModule.initFragments(_ConnectionModule, __ConnectionModule);
			Types._Controller.initFragments(_Controller, __Controller);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._Environment.initFragments(_Environment, __Environment);
			Types._Function.initFragments(_Function, __Function);
			Types._MessageBroker.initFragments(_MessageBroker, __MessageBroker);
			Types._MessagingElement.initFragments(_MessagingElement, __MessagingElement);
			Types._MessagingLink.initFragments(_MessagingLink, __MessagingLink);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Node.initFragments(_Node, __Node);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._Position.initFragments(_Position, __Position);
			Types._Protocol.initFragments(_Protocol, __Protocol);
			Types._Sensor.initFragments(_Sensor, __Sensor);
			Types._StatefulElement.initFragments(_StatefulElement, __StatefulElement);
			Types._Status.initFragments(_Status, __Status);
			Types._WiredModule.initFragments(_WiredModule, __WiredModule);
			Types._WirelessModule.initFragments(_WirelessModule, __WirelessModule);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__Actuator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__StatefulElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CPS__CPS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CPS__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CPS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CPS__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__StatefulElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ConnectableElement__ConnectableElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConnectableElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConnectableElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConnectionModule__ConnectionModule = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConnectionModule__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConnectionModule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConnectionModule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Controller__Controller = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Controller__MessagingElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Controller__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Controller__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Controller__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Environment__Environment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Environment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Function__Function = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Function__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Function__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Function__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MessageBroker__MessageBroker = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageBroker__ConnectableElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageBroker__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageBroker__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MessageBroker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MessagingElement__MessagingElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessagingElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MessagingElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MessagingLink__MessagingLink = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MessagingLink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MessagingLink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Node__Node = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__ConnectableElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__MessagingElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Node__StatefulElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Position__Position = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Position__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Position__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__Protocol = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__Sensor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__StatefulElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StatefulElement__StatefulElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StatefulElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StatefulElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Status__Status = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WiredModule__WiredModule = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WiredModule__ConnectionModule = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WiredModule__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WiredModule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WiredModule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WirelessModule__WirelessModule = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WirelessModule__ConnectionModule = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WirelessModule__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WirelessModule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WirelessModule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initOperations(_Actuator__Actuator);
			Fragments._Actuator__Component.initOperations(_Actuator__Component);
			Fragments._Actuator__NamedElement.initOperations(_Actuator__NamedElement);
			Fragments._Actuator__OclAny.initOperations(_Actuator__OclAny);
			Fragments._Actuator__OclElement.initOperations(_Actuator__OclElement);
			Fragments._Actuator__StatefulElement.initOperations(_Actuator__StatefulElement);

			Fragments._CPS__CPS.initOperations(_CPS__CPS);
			Fragments._CPS__NamedElement.initOperations(_CPS__NamedElement);
			Fragments._CPS__OclAny.initOperations(_CPS__OclAny);
			Fragments._CPS__OclElement.initOperations(_CPS__OclElement);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__NamedElement.initOperations(_Component__NamedElement);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);
			Fragments._Component__StatefulElement.initOperations(_Component__StatefulElement);

			Fragments._ConnectableElement__ConnectableElement.initOperations(_ConnectableElement__ConnectableElement);
			Fragments._ConnectableElement__OclAny.initOperations(_ConnectableElement__OclAny);
			Fragments._ConnectableElement__OclElement.initOperations(_ConnectableElement__OclElement);

			Fragments._ConnectionModule__ConnectionModule.initOperations(_ConnectionModule__ConnectionModule);
			Fragments._ConnectionModule__NamedElement.initOperations(_ConnectionModule__NamedElement);
			Fragments._ConnectionModule__OclAny.initOperations(_ConnectionModule__OclAny);
			Fragments._ConnectionModule__OclElement.initOperations(_ConnectionModule__OclElement);

			Fragments._Controller__Controller.initOperations(_Controller__Controller);
			Fragments._Controller__MessagingElement.initOperations(_Controller__MessagingElement);
			Fragments._Controller__NamedElement.initOperations(_Controller__NamedElement);
			Fragments._Controller__OclAny.initOperations(_Controller__OclAny);
			Fragments._Controller__OclElement.initOperations(_Controller__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._Environment__Environment.initOperations(_Environment__Environment);
			Fragments._Environment__NamedElement.initOperations(_Environment__NamedElement);
			Fragments._Environment__OclAny.initOperations(_Environment__OclAny);
			Fragments._Environment__OclElement.initOperations(_Environment__OclElement);

			Fragments._Function__Function.initOperations(_Function__Function);
			Fragments._Function__NamedElement.initOperations(_Function__NamedElement);
			Fragments._Function__OclAny.initOperations(_Function__OclAny);
			Fragments._Function__OclElement.initOperations(_Function__OclElement);

			Fragments._MessageBroker__ConnectableElement.initOperations(_MessageBroker__ConnectableElement);
			Fragments._MessageBroker__MessageBroker.initOperations(_MessageBroker__MessageBroker);
			Fragments._MessageBroker__NamedElement.initOperations(_MessageBroker__NamedElement);
			Fragments._MessageBroker__OclAny.initOperations(_MessageBroker__OclAny);
			Fragments._MessageBroker__OclElement.initOperations(_MessageBroker__OclElement);

			Fragments._MessagingElement__MessagingElement.initOperations(_MessagingElement__MessagingElement);
			Fragments._MessagingElement__OclAny.initOperations(_MessagingElement__OclAny);
			Fragments._MessagingElement__OclElement.initOperations(_MessagingElement__OclElement);

			Fragments._MessagingLink__MessagingLink.initOperations(_MessagingLink__MessagingLink);
			Fragments._MessagingLink__OclAny.initOperations(_MessagingLink__OclAny);
			Fragments._MessagingLink__OclElement.initOperations(_MessagingLink__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Node__ConnectableElement.initOperations(_Node__ConnectableElement);
			Fragments._Node__MessagingElement.initOperations(_Node__MessagingElement);
			Fragments._Node__NamedElement.initOperations(_Node__NamedElement);
			Fragments._Node__Node.initOperations(_Node__Node);
			Fragments._Node__OclAny.initOperations(_Node__OclAny);
			Fragments._Node__OclElement.initOperations(_Node__OclElement);
			Fragments._Node__StatefulElement.initOperations(_Node__StatefulElement);

			Fragments._Parameter__NamedElement.initOperations(_Parameter__NamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._Position__OclAny.initOperations(_Position__OclAny);
			Fragments._Position__OclElement.initOperations(_Position__OclElement);
			Fragments._Position__Position.initOperations(_Position__Position);

			Fragments._Protocol__OclAny.initOperations(_Protocol__OclAny);
			Fragments._Protocol__OclElement.initOperations(_Protocol__OclElement);
			Fragments._Protocol__OclEnumeration.initOperations(_Protocol__OclEnumeration);
			Fragments._Protocol__OclType.initOperations(_Protocol__OclType);
			Fragments._Protocol__Protocol.initOperations(_Protocol__Protocol);

			Fragments._Sensor__Component.initOperations(_Sensor__Component);
			Fragments._Sensor__NamedElement.initOperations(_Sensor__NamedElement);
			Fragments._Sensor__OclAny.initOperations(_Sensor__OclAny);
			Fragments._Sensor__OclElement.initOperations(_Sensor__OclElement);
			Fragments._Sensor__Sensor.initOperations(_Sensor__Sensor);
			Fragments._Sensor__StatefulElement.initOperations(_Sensor__StatefulElement);

			Fragments._StatefulElement__OclAny.initOperations(_StatefulElement__OclAny);
			Fragments._StatefulElement__OclElement.initOperations(_StatefulElement__OclElement);
			Fragments._StatefulElement__StatefulElement.initOperations(_StatefulElement__StatefulElement);

			Fragments._Status__OclAny.initOperations(_Status__OclAny);
			Fragments._Status__OclElement.initOperations(_Status__OclElement);
			Fragments._Status__OclEnumeration.initOperations(_Status__OclEnumeration);
			Fragments._Status__OclType.initOperations(_Status__OclType);
			Fragments._Status__Status.initOperations(_Status__Status);

			Fragments._WiredModule__ConnectionModule.initOperations(_WiredModule__ConnectionModule);
			Fragments._WiredModule__NamedElement.initOperations(_WiredModule__NamedElement);
			Fragments._WiredModule__OclAny.initOperations(_WiredModule__OclAny);
			Fragments._WiredModule__OclElement.initOperations(_WiredModule__OclElement);
			Fragments._WiredModule__WiredModule.initOperations(_WiredModule__WiredModule);

			Fragments._WirelessModule__ConnectionModule.initOperations(_WirelessModule__ConnectionModule);
			Fragments._WirelessModule__NamedElement.initOperations(_WirelessModule__NamedElement);
			Fragments._WirelessModule__OclAny.initOperations(_WirelessModule__OclAny);
			Fragments._WirelessModule__OclElement.initOperations(_WirelessModule__OclElement);
			Fragments._WirelessModule__WirelessModule.initOperations(_WirelessModule__WirelessModule);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Actuator = {
			CpsmlTables.Properties._Component__function,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._Actuator__ratedRuns,
			CpsmlTables.Properties._Actuator__runs,
			CpsmlTables.Properties._StatefulElement__status,
			CpsmlTables.Properties._Component__topic
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CPS = {
			CpsmlTables.Properties._CPS__controller,
			CpsmlTables.Properties._CPS__environment,
			CpsmlTables.Properties._CPS__messageBroker,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Component = {
			CpsmlTables.Properties._Component__function,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._StatefulElement__status,
			CpsmlTables.Properties._Component__topic
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConnectableElement = {
			CpsmlTables.Properties._ConnectableElement__connectionModule,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._ConnectableElement__position
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConnectionModule = {
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._ConnectionModule__supportedProtocols
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Controller = {
			CpsmlTables.Properties._Controller__description,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._MessagingElement__publication,
			CpsmlTables.Properties._MessagingElement__subscription,
			CpsmlTables.Properties._Controller__topics
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Environment = {
			CpsmlTables.Properties._NamedElement__name,
			CpsmlTables.Properties._Environment__node,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Function = {
			CpsmlTables.Properties._Function__hasReturn,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._Function__parameter,
			CpsmlTables.Properties._Function__returnDataType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MessageBroker = {
			CpsmlTables.Properties._ConnectableElement__connectionModule,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._ConnectableElement__position,
			CpsmlTables.Properties._MessageBroker__topics
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MessagingElement = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._MessagingElement__publication,
			CpsmlTables.Properties._MessagingElement__subscription
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MessagingLink = {
			CpsmlTables.Properties._MessagingLink__messageBroker,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._MessagingLink__topics
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Node = {
			CpsmlTables.Properties._Node__component,
			CpsmlTables.Properties._ConnectableElement__connectionModule,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._ConnectableElement__position,
			CpsmlTables.Properties._MessagingElement__publication,
			CpsmlTables.Properties._StatefulElement__status,
			CpsmlTables.Properties._MessagingElement__subscription
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			CpsmlTables.Properties._Parameter__dataType,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Position = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._Position__x,
			CpsmlTables.Properties._Position__y,
			CpsmlTables.Properties._Position__z
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Protocol = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Sensor = {
			CpsmlTables.Properties._Sensor__frequency,
			CpsmlTables.Properties._Component__function,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._StatefulElement__status,
			CpsmlTables.Properties._Component__topic
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StatefulElement = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._StatefulElement__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Status = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WiredModule = {
			CpsmlTables.Properties._WiredModule__connect,
			CpsmlTables.Properties._WiredModule__connectOpposite,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._ConnectionModule__supportedProtocols
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WirelessModule = {
			CpsmlTables.Properties._WirelessModule__connect,
			CpsmlTables.Properties._WirelessModule__connectOpposite,
			CpsmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CpsmlTables.Properties._WirelessModule__range,
			CpsmlTables.Properties._ConnectionModule__supportedProtocols
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initProperties(_Actuator);
			Fragments._CPS__CPS.initProperties(_CPS);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._ConnectableElement__ConnectableElement.initProperties(_ConnectableElement);
			Fragments._ConnectionModule__ConnectionModule.initProperties(_ConnectionModule);
			Fragments._Controller__Controller.initProperties(_Controller);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._Environment__Environment.initProperties(_Environment);
			Fragments._Function__Function.initProperties(_Function);
			Fragments._MessageBroker__MessageBroker.initProperties(_MessageBroker);
			Fragments._MessagingElement__MessagingElement.initProperties(_MessagingElement);
			Fragments._MessagingLink__MessagingLink.initProperties(_MessagingLink);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Node__Node.initProperties(_Node);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._Position__Position.initProperties(_Position);
			Fragments._Protocol__Protocol.initProperties(_Protocol);
			Fragments._Sensor__Sensor.initProperties(_Sensor);
			Fragments._StatefulElement__StatefulElement.initProperties(_StatefulElement);
			Fragments._Status__Status.initProperties(_Status);
			Fragments._WiredModule__WiredModule.initProperties(_WiredModule);
			Fragments._WirelessModule__WirelessModule.initProperties(_WirelessModule);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DataType__NULL = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.DATA_TYPE.getEEnumLiteral("NULL"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__BOOLEAN = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.DATA_TYPE.getEEnumLiteral("BOOLEAN"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__INT = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.DATA_TYPE.getEEnumLiteral("INT"), Types._DataType, 2);
		public static final EcoreExecutorEnumerationLiteral _DataType__STRING = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.DATA_TYPE.getEEnumLiteral("STRING"), Types._DataType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataType = {
			_DataType__NULL,
			_DataType__BOOLEAN,
			_DataType__INT,
			_DataType__STRING
		};

		public static final EcoreExecutorEnumerationLiteral _Protocol__DDS = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.PROTOCOL.getEEnumLiteral("DDS"), Types._Protocol, 0);
		public static final EcoreExecutorEnumerationLiteral _Protocol__MQTT = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.PROTOCOL.getEEnumLiteral("MQTT"), Types._Protocol, 1);
		public static final EcoreExecutorEnumerationLiteral _Protocol__SMQTT = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.PROTOCOL.getEEnumLiteral("SMQTT"), Types._Protocol, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Protocol = {
			_Protocol__DDS,
			_Protocol__MQTT,
			_Protocol__SMQTT
		};

		public static final EcoreExecutorEnumerationLiteral _Status__GOOD = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.STATUS.getEEnumLiteral("GOOD"), Types._Status, 0);
		public static final EcoreExecutorEnumerationLiteral _Status__WARNING = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.STATUS.getEEnumLiteral("WARNING"), Types._Status, 1);
		public static final EcoreExecutorEnumerationLiteral _Status__CRITICAL = new EcoreExecutorEnumerationLiteral(CpsmlPackage.Literals.STATUS.getEEnumLiteral("CRITICAL"), Types._Status, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Status = {
			_Status__GOOD,
			_Status__WARNING,
			_Status__CRITICAL
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DataType.initLiterals(_DataType);
			Types._Protocol.initLiterals(_Protocol);
			Types._Status.initLiterals(_Status);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CpsmlTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new CpsmlTables();
	}

	private CpsmlTables() {
		super(CpsmlPackage.eNS_URI);
	}
}
