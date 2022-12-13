package at.ac.tuwien.big.cpsml.codegen.lib;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ac.tuwien.big.cpsml.codegen.xtend.CpsmlGenerator;

public class SimulatorGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "cpsml";
	}

	@Override
	protected String getFileExtensions() {
		return "cps";
	}

	public Class<? extends IGenerator2> bindIGenerator() {
		return CpsmlGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
