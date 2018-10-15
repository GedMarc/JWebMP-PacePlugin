/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.pace.preloadedthemes.PaceTheme;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 13 Feb 2017
 */
@PluginInformation(pluginName = "Pace Loader",
		pluginUniqueName = "pace-loader",
		pluginDescription = "Pace is a Javascript and CSS library to automatically add beautiful progress and activity indicators for page loads and ajax navigation",
		pluginVersion = "1.0.2",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "js, loader, pace",
		pluginSubtitle = "Automatically add a progress bar to your site",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-PacePlugin",
		pluginSourceUrl = "https://github.com/HubSpot/pace/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-PacePlugin/wiki",
		pluginOriginalHomepage = "http://github.hubspot.com/pace/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/PacePlugin.jar/download",
		pluginIconUrl = "bower_components/PACE/logo.jpg",
		pluginIconImageUrl = "bower_components/PACE/example.png",
		pluginLastUpdatedDate = "2017/03/04")
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
	public Page configure(Page page)
	{
		page.getBody()
		    .addFeature(new PaceLoader(PaceLoaderPageConfigurator.paceTheme));

		return page;
	}

	@Override
	public boolean enabled()
	{
		return PaceLoaderPageConfigurator.enabled;
	}

}
