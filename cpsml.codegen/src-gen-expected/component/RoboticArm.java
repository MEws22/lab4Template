package production.component;

import java.util.Arrays;
import java.util.Iterator;

public class RoboticArm{
	
	private String name;
	private int runs;
	private int ratedRuns;
	private String topic;
	
	public RoboticArm(String name) {
		this.name = name;
		this.runs = 0;
		this.ratedRuns = 100;
		this.topic = "logistics";
	}
	
	public void grab(int strength){
		System.out.println("    🔵  Actuator called function execution: " + this.name + " -> grab() returning type NULL");
		return ;
	} 
	public void grab(String[] input){
		Iterator<String> inputIter = Arrays.asList(input).iterator();
		
		grab( Integer.parseInt(inputIter.next()));
		return;
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
