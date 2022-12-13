package at.ac.tuwien.big.cpsml.codegen.lib;

import java.util.Map;

public interface CyberPhysicalSystemRunner {
	
	public void setup(Map<String, DataSource<?>> dataSources);

	
	public void step();
}
