import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.pace.PaceLoaderPageConfigurator;

module com.jwebmp.plugins.pace {

	exports com.jwebmp.plugins.pace;
	exports com.jwebmp.plugins.pace.preloadedthemes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with PaceLoaderPageConfigurator;

}
