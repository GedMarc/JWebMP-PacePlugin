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
package za.co.mmagon.jwebswing.components.pace;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.components.pace.preloadedThemes.PaceTheme;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author GedMarc
 * @since 13 Feb 2017
 *
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
                   pluginLastUpdatedDate = "2017/03/04"
)
public class PaceLoaderConfigurator extends PageConfigurator
{

    private static final Logger log = LogFactory.getInstance().getLogger("PaceLoader");
    public static final String PaceEnabled = "pace-enabled";

    private static final long serialVersionUID = 1L;

    public static PaceTheme paceTheme = PaceTheme.Flash;

    public PaceLoaderConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            log.fine("Configuring pace");
            page.getBody().addFeature(new PaceLoader(paceTheme));
            log.fine("Pace was added to the body successfully");

        }
        return page;
    }
}
