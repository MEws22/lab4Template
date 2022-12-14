package production.messageBroker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.ac.tuwien.big.cpsml.codegen.lib.Linkable;
	
public class External implements Linkable{

	private String name;
	private List<String> topics;
	private List<String> weatherQueue;
	private List<String> tempQueue;
	
	public External(String name) {
		this.name = name;
		this.topics = Arrays.asList("weather","temp");
		weatherQueue = new ArrayList<String>();
		tempQueue = new ArrayList<String>();
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
		case "weather": weatherQueue.add(msg);
			break;
		case "temp": tempQueue.add(msg);
			break;
		}
		System.out.println("    " + this.name + ": 📩️ New Message added to queue " + (msg.split("-")[0]));
	}
	
	@Override
	public List<String> retrieveMessages(String topic, String recipient) {
		List<String> returnMsg = new ArrayList<String>();
		List<String> queue = new ArrayList<String>();
		
		switch (topic){
			case "weather": queue = weatherQueue;
				break;
			case "temp": queue = tempQueue;
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
		System.out.println("        > WeatherQueue size: " + weatherQueue.size());
		System.out.println("        > TempQueue size: " + tempQueue.size());
		System.out.print("    "+this.name + " clearing queues ...");
		weatherQueue.clear();
		System.out.print("weatherQueue cleared,");
		tempQueue.clear();
		System.out.print("tempQueue cleared,");
		System.out.print(this.name +" clearing completed");
		System.out.println();
		System.out.println();
	}
}

