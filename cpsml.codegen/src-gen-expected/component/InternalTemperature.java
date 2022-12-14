package production.component;

import java.util.List;

public class InternalTemperature {
	
	private String name;
	private double frequency;
	private String topic;
	private int internalStepCount;
	
	public InternalTemperature(String name) {
		this.name = name;
		this.frequency = 0.25;
		this.topic = "temp";
		this.internalStepCount = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTopic(){
		return this.topic;
	}
	
	public int getTemperature(){
		System.out.println("    🟣  Sensor timed function execution: " + this.name + " -> getTemperature() returning type INT");
		return 291155745;
	}
	
	public void addMessageToNodeOutgoingCache(String topic, String msgContent, String recipient, List<String> msgOutCache) {
		msgOutCache.add(topic + "-" + recipient + "-" + msgContent);
	}
	
	public void step(List<String> msgOutCache) {
		if (this.internalStepCount % (1/frequency) == 0 ) {
			addMessageToNodeOutgoingCache(this.topic, "" + this.getTemperature(), "NONE" , msgOutCache);
		}
		this.internalStepCount++;
	}
}
