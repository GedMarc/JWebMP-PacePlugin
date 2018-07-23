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
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-PacePlugin",
		pluginSourceUrl = "https://github.com/HubSpot/pace/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-PacePlugin/wiki",
		pluginOriginalHomepage = "http://github.hubspot.com/pace/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/PacePlugin.jar/download",
		pluginIconUrl = "bower_components/PACE/logo.jpg",
		pluginIconImageUrl = "bower_components/PACE/example.png",
		pluginLastUpdatedDate = "2017/03/04")
public class PaceLoaderPageConfigurator
		implements IPageConfigurator
{
	private static PaceTheme paceTheme = PaceTheme.Flash;

	public PaceLoaderPageConfigurator()
	{
		//Nothing Needed
	}

	@SuppressWarnings("unused")
	public static PaceTheme getPaceTheme()
	{
		return paceTheme;
	}

	public static void setPaceTheme(PaceTheme paceTheme)
	{
		PaceLoaderPageConfigurator.paceTheme = paceTheme;
	}

	@Override
	public Page configure(Page page)
	{
		page.getBody()
		    .addFeature(new PaceLoader(paceTheme));

		return page;
	}

}
