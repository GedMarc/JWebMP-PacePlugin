module com.jwebmp.plugins.pace {

	exports com.jwebmp.plugins.pace;
	exports com.jwebmp.plugins.pace.preloadedthemes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.pace.PaceLoaderPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.pace.implementations.PaceExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.pace.implementations.PaceExclusionsModule;


	opens com.jwebmp.plugins.pace to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.pace.preloadedthemes to com.fasterxml.jackson.databind, com.jwebmp.core;
}
