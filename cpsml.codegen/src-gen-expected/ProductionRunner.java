package production;

import java.util.Arrays;
import java.util.Map;

import at.ac.tuwien.big.cpsml.codegen.lib.DataSource;
import at.ac.tuwien.big.cpsml.codegen.lib.CyberPhysicalSystemRunner;
import at.ac.tuwien.big.cpsml.codegen.lib.Util;


import production.environment.ProductionFloor;
import production.environment.ServiceRoom;
import production.environment.Warehouse;

import production.node.ThreedPrinter;
import production.node.Robot;
import production.node.CentralClimateControl;
import production.node.Scaffolding;
import production.node.ConveyorBelt;
	
import production.messageBroker.Central;
import production.messageBroker.External;


import production.controller.C1;
import production.controller.C2;

public class ProductionRunner implements CyberPhysicalSystemRunner {

	private C1 c1;
	private C2 c2;
	
	private Central central;
	private External external;
	
	private ProductionFloor productionFloor;
	private ServiceRoom serviceRoom;
	private Warehouse warehouse;
	
	private ThreedPrinter threedPrinter;
	private Robot robot;
	private CentralClimateControl centralClimateControl;
	private Scaffolding scaffolding;
	private ConveyorBelt conveyorBelt;
			
	private int stepCount = 0;
	
	@SuppressWarnings("unchecked")
	@Override
	public void setup(Map<String, DataSource<?>> dataSources) {
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=------------------------------------ Setup ------------------------------------=" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n" + Util.ANSI_RESET);
		
		//Setup Message Brokers:
		central = new Central("central");
		System.out.println("	Created Message Broker: " + central.toString());
		
		external = new External("external");
		System.out.println("	Created Message Broker: " + external.toString());
		
		
		System.out.println("---------------------------------------------------------------------------------");

		//Setup Environments:
		productionFloor = new ProductionFloor("productionFloor");
		System.out.println("	Created Environment: " + productionFloor.toString());
		
		serviceRoom = new ServiceRoom("serviceRoom");
		System.out.println("	Created Environment: " + serviceRoom.toString());
		
		warehouse = new Warehouse("warehouse");
		System.out.println("	Created Environment: " + warehouse.toString());
		
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//Setup Nodes:
		threedPrinter = new ThreedPrinter("threedPrinter");
		System.out.println("	Created Node: threedPrinter");
		robot = new Robot("robot");
		System.out.println("	Created Node: Robot");
		centralClimateControl = new CentralClimateControl("centralClimateControl");
		System.out.println("	Created Node: CentralClimateControl");
		scaffolding = new Scaffolding("scaffolding");
		System.out.println("	Created Node: Scaffolding");
		conveyorBelt = new ConveyorBelt("conveyorBelt");
		System.out.println("	Created Node: ConveyorBelt");

		System.out.println("---------------------------------------------------------------------------------");
		
		//Setup Controllers:
		c1 = new C1("c1",(DataSource<String>)dataSources.get("c1"));
		System.out.println("	Created Controller: C1");
		c2 = new C2("c2",(DataSource<String>)dataSources.get("c2"));
		System.out.println("	Created Controller: C2");
		System.out.println(Util.ANSI_BOLD + "\n=================================================================================\n" + Util.ANSI_RESET);
		
		//Create MessageLinks 
		threedPrinter.addSubscription(central,  Arrays.asList("temp","production"));
		threedPrinter.addPublication(central, Arrays.asList("temp"));
		threedPrinter.addPublication(central, Arrays.asList("production"));
		robot.addSubscription(central,  Arrays.asList("temp","logistics"));
		robot.addPublication(central, Arrays.asList("temp","logistics"));
		centralClimateControl.addSubscription(central,  Arrays.asList("temp"));
		centralClimateControl.addPublication(central, Arrays.asList("temp"));
		scaffolding.addPublication(central, Arrays.asList("logistics"));
		conveyorBelt.addSubscription(central,  Arrays.asList("logistics"));
		
		c1.addSubscription(central,  Arrays.asList("temp","production","logistics"));
		c1.addPublication(central, Arrays.asList("temp","production","logistics"));
		c2.addPublication(external, Arrays.asList("temp"));

		System.out.println(Util.ANSI_BOLD + "\n=================================================================================\n" + Util.ANSI_RESET);
	}
	
	@Override
	public void step() {
		stepCount++;
		System.out.println(Util.ANSI_BOLD + "==================================== Step " + (stepCount < 10 ? "0" : "") + stepCount + " ====================================\n" + Util.ANSI_RESET);
		
		c1.step();
		c2.step();
		
		System.out.println("---------------------------------------------------------------------------------");
		
		threedPrinter.step();
		robot.step();
		centralClimateControl.step();
		scaffolding.step();
		conveyorBelt.step();
		
		System.out.println("---------------------------------------------------------------------------------");
		
		central.step();
		external.step();
		
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
	}
}
