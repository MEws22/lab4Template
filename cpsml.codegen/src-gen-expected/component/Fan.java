package production.component;

import java.util.Arrays;
import java.util.Iterator;

public class Fan{
	
	private String name;
	private int runs;
	private int ratedRuns;
	private String topic;
	
	public Fan(String name) {
		this.name = name;
		this.runs = 70;
		this.ratedRuns = 100;
		this.topic = "temp";
	}
	
	public void turnOn(){
		System.out.println("    🔵  Actuator called function execution: " + this.name + " -> turnOn() returning type NULL");
		return ;
	} 
	public void turnOff(){
		System.out.println("    🔵  Actuator called function execution: " + this.name + " -> turnOff() returning type NULL");
		return ;
	} 

	public String getName() {
		return name;
	}
	
	public String getTopic(){
		return this.topic;
	}
	
	public void step(){
	}
}
