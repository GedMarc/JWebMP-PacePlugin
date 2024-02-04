import com.jwebmp.plugins.pace.implementations.PaceModuleInclusions;

module com.jwebmp.plugins.pace {

	exports com.jwebmp.plugins.pace;
	exports com.jwebmp.plugins.pace.preloadedthemes;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.pace.PaceLoaderPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with PaceModuleInclusions;

	opens com.jwebmp.plugins.pace to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.pace.preloadedthemes to com.fasterxml.jackson.databind, com.jwebmp.core;
}
