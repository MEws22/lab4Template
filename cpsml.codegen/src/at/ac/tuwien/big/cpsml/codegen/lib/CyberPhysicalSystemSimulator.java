package at.ac.tuwien.big.cpsml.codegen.lib;

import java.util.Optional;
import java.util.stream.Stream;

import at.ac.tuwien.big.cpsml.codegen.CyberPhysicalSystemRunnerProvider;

public class CyberPhysicalSystemSimulator {

	private static final String PRODUCTION_RUNNER = "production";
	
	public static void main(String[] args) {
		boolean stepwise = Stream.of(args).filter(a -> "-s".equals(a)).findAny().isPresent();
		Optional<String> runnerArg = Stream.of(args).filter(a -> PRODUCTION_RUNNER.equals(a)).findAny();
		Optional<String> scenarioFile = Stream.of(args).filter(a -> a.endsWith(".json")).findAny();
		
		if (!runnerArg.isPresent()) {
			printUsage();
		}
		
		if (!scenarioFile.isPresent()) {
			printUsage();
		}
		
		CyberPhysicalSystemRunner runner = PRODUCTION_RUNNER.equals(runnerArg.get()) ? CyberPhysicalSystemRunnerProvider.getProductionRunner() : null;
		
		JsonScenarioSimulator simulator = new JsonScenarioSimulator();
									
		if (stepwise) {
			simulator.simulateStepwise(runner, scenarioFile.get());
		} else {
			simulator.simulate(runner, scenarioFile.get());
		}
	}
	
	private static void printUsage() {
		System.err.println("Usage:");
		System.err.println(" CyberPhysicalSystemSimulator [-s] (production) scenariofile");
		System.exit(1);
	}
}
