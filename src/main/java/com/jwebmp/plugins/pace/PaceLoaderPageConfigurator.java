/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.pace;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.pace.preloadedthemes.PaceTheme;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 13 Feb 2017
 */
@PluginInformation(pluginName = "Pace Loader",
		pluginUniqueName = "pace-loader",
		pluginDescription = "Pace is a Javascript and CSS library to automatically add beautiful progress and activity indicators for page loads and ajax navigation",
		pluginVersion = "1.2.3",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "js, loader, pace",
		pluginSubtitle = "Automatically add a progress bar to your site",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-PacePlugin",
		pluginSourceUrl = "https://github.com/CodeByZach/pace",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-PacePlugin/wiki",
		pluginOriginalHomepage = "https://codebyzach.github.io/pace/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.javascript/jwebmp-pace-loader",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/14",
		pluginGroupId = "com.jwebmp.plugins.javascript",
		pluginArtifactId = "jwebmp-pace-loader",
		pluginModuleName = "com.jwebmp.plugins.pace",
		pluginStatus = PluginStatus.Released
		
)
public class PaceLoaderPageConfigurator
		implements IPageConfigurator<PaceLoaderPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private static PaceTheme paceTheme = PaceTheme.Flash;

	public PaceLoaderPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return PaceLoaderPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		PaceLoaderPageConfigurator.enabled = mustEnable;
	}

	@SuppressWarnings("unused")
	public static PaceTheme getPaceTheme()
	{
		return PaceLoaderPageConfigurator.paceTheme;
	}

	public static void setPaceTheme(PaceTheme paceTheme)
	{
		PaceLoaderPageConfigurator.paceTheme = paceTheme;
	}

	@NotNull
	@Override
	public Page<?> configure(Page<?> page)
	{
		StringBuilder beforeTemplate = FileTemplates.getTemplateVariables()
				.get("BEFORE_AJAX_CALL;");
		if (beforeTemplate == null)
		{
			beforeTemplate = new StringBuilder();
		}
		StringBuilder afterTemplate = FileTemplates.getTemplateVariables()
				.get("AFTER_AJAX_CALL;");
		if (afterTemplate == null)
		{
			afterTemplate = new StringBuilder();
		}
		if(!beforeTemplate.toString().contains("Pace.options.ajax.trackWebSockets"))
		{
			FileTemplates.getTemplateVariables()
					.put("BEFORE_AJAX_CALL;",
							beforeTemplate.append("Pace.options.ajax.trackWebSockets = false;")
									.append("\n")
									.append("\tPace.track(function(){")
									.append("\n"));
			FileTemplates.getTemplateVariables()
					.put("AFTER_AJAX_CALL;", afterTemplate.append("});")
							.append("\n"));

		}

		page.getBody().addJavaScriptReference(PaceLoaderReferencePool.PaceLoader.getJavaScriptReference());
		if(paceTheme == null) {
			page.getBody().addCssReference(PaceLoaderReferencePool.PaceLoader.getCssReference());
		}

		page.getBody().addCssReference(paceTheme.getCSSReference());

		return page;
	}

	@Override
	public boolean enabled()
	{
		return PaceLoaderPageConfigurator.enabled;
	}

}
