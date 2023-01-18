package production.component;

import java.util.List;

public class Scanner {
	
	private String name;
	private double frequency;
	private String topic;
	private int internalStepCount;
	
	public Scanner(String name) {
		this.name = name;
		this.frequency = 1.0;
		this.topic = "logistics";
		this.internalStepCount = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTopic(){
		return this.topic;
	}
	
	public String getContent(){
		System.out.println("    🟣  Sensor timed function execution: " + this.name + " -> getContent() returning type STRING");
		return "_DummyString_";
	}
	
	public void addMessageToNodeOutgoingCache(String topic, String msgContent, String recipient, List<String> msgOutCache) {
		msgOutCache.add(topic + "-" + recipient + "-" + msgContent);
	}
	
	public void step(List<String> msgOutCache) {
		if (this.internalStepCount % (1/frequency) == 0 ) {
			addMessageToNodeOutgoingCache(this.topic, "" + this.getContent(), "NONE" , msgOutCache);
		}
		this.internalStepCount++;
	}
}
