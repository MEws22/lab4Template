package production.component;

import java.util.Arrays;
import java.util.Iterator;

public class Motor{
	
	private String name;
	private int runs;
	private int ratedRuns;
	private String topic;
	
	public Motor(String name) {
		this.name = name;
		this.runs = 10;
		this.ratedRuns = 10000;
		this.topic = "logistics";
	}
	
	public void setSpeed(int speed){
		System.out.println("    🔵  Actuator called function execution: " + this.name + " -> setSpeed() returning type NULL");
		return ;
	} 
	public void setSpeed(String[] input){
		Iterator<String> inputIter = Arrays.asList(input).iterator();
		
		setSpeed( Integer.parseInt(inputIter.next()));
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
