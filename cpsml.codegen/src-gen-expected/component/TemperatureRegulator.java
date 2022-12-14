package production.component;

import java.util.Arrays;
import java.util.Iterator;

public class TemperatureRegulator{
	
	private String name;
	private int runs;
	private int ratedRuns;
	private String topic;
	
	public TemperatureRegulator(String name) {
		this.name = name;
		this.runs = 0;
		this.ratedRuns = 1000;
		this.topic = "temp";
	}
	
	public void setTemperature(int temperature){
		System.out.println("    🔵  Actuator called function execution: " + this.name + " -> setTemperature() returning type NULL");
		return ;
	} 
	public void setTemperature(String[] input){
		Iterator<String> inputIter = Arrays.asList(input).iterator();
		
		setTemperature( Integer.parseInt(inputIter.next()));
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
