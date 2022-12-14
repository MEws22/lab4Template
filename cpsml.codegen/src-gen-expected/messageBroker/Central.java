package production.messageBroker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.ac.tuwien.big.cpsml.codegen.lib.Linkable;
	
public class Central implements Linkable{

	private String name;
	private List<String> topics;
	private List<String> tempQueue;
	private List<String> productionQueue;
	private List<String> logisticsQueue;
	
	public Central(String name) {
		this.name = name;
		this.topics = Arrays.asList("temp","production","logistics");
		tempQueue = new ArrayList<String>();
		productionQueue = new ArrayList<String>();
		logisticsQueue = new ArrayList<String>();
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	@Override
	public String getTopics(){
		return topics.toString();
	}
	
	@Override
	public void queueMessage(String msg) {
		switch (msg.split("-")[0]){
		case "temp": tempQueue.add(msg);
			break;
		case "production": productionQueue.add(msg);
			break;
		case "logistics": logisticsQueue.add(msg);
			break;
		}
		System.out.println("    " + this.name + ": 📩️ New Message added to queue " + (msg.split("-")[0]));
	}
	
	@Override
	public List<String> retrieveMessages(String topic, String recipient) {
		List<String> returnMsg = new ArrayList<String>();
		List<String> queue = new ArrayList<String>();
		
		switch (topic){
			case "temp": queue = tempQueue;
				break;
			case "production": queue = productionQueue;
				break;
			case "logistics": queue = logisticsQueue;
				break;
		}
		
		for (String msg : queue) {
			if (msg.split("-")[1].equals(recipient) | msg.split("-")[1].equals("")) {
				returnMsg.add(msg);
			}
		}
		return returnMsg;
	}
	
	public void step(){
		System.out.println("    📨 " + this.name + " queues info:");
		System.out.println("        > TempQueue size: " + tempQueue.size());
		System.out.println("        > ProductionQueue size: " + productionQueue.size());
		System.out.println("        > LogisticsQueue size: " + logisticsQueue.size());
		System.out.print("    "+this.name + " clearing queues ...");
		tempQueue.clear();
		System.out.print("tempQueue cleared,");
		productionQueue.clear();
		System.out.print("productionQueue cleared,");
		logisticsQueue.clear();
		System.out.print("logisticsQueue cleared,");
		System.out.print(this.name +" clearing completed");
		System.out.println();
		System.out.println();
	}
}

