import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.pace.PaceLoaderPageConfigurator;
import com.jwebmp.plugins.pace.implementations.PaceExclusionsModule;

module com.jwebmp.plugins.pace {

	exports com.jwebmp.plugins.pace;
	exports com.jwebmp.plugins.pace.preloadedthemes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with PaceLoaderPageConfigurator;
	provides IGuiceScanJarExclusions with PaceExclusionsModule;
	provides IGuiceScanModuleExclusions with PaceExclusionsModule;


	opens com.jwebmp.plugins.pace to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.pace.preloadedthemes to com.fasterxml.jackson.databind, com.jwebmp.core;
}
