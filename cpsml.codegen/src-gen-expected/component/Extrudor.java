package production.component;

import java.util.Arrays;
import java.util.Iterator;

public class Extrudor{
	
	private String name;
	private int runs;
	private int ratedRuns;
	private String topic;
	
	public Extrudor(String name) {
		this.name = name;
		this.runs = 0;
		this.ratedRuns = 100;
		this.topic = "production";
	}
	
	public void startPrint(){
		System.out.println("    🔵  Actuator called function execution: " + this.name + " -> startPrint() returning type NULL");
		return ;
	} 
	public int getRemainingPrintDuration(){
		System.out.println("    🔵  Actuator called function execution: " + this.name + " -> getRemainingPrintDuration() returning type INT");
		return 2076191646;
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
