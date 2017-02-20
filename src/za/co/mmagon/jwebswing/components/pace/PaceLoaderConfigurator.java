/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.components.pace;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author GedMarc
 * @since 13 Feb 2017
 *
 */
@PluginInformation(pluginName = "Pace Loader", pluginUniqueName = "pace-loader", pluginDescription = "Pace is a Javascript and CSS library to automatically add beautiful progress and activity indicators for page loads and ajax navigation", pluginVersion = "1.0.2",
        pluginDependancyUniqueIDs = "", pluginCategories = "js, loader, pace", pluginSubtitle = "Automatically add a progress bar to your site",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-PacePlugin", pluginSourceUrl = "https://github.com/HubSpot/pace/",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-PacePlugin/wiki",
        pluginOriginalHomepage = "http://github.hubspot.com/pace/")
public class PaceLoaderConfigurator extends PageConfigurator
{

    private static final Logger log = LogFactory.getInstance().getLogger("PaceLoader");
    public static final String PaceEnabled = "pace-enabled";

    private static final long serialVersionUID = 1L;

    public PaceLoaderConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
//        if (!page.isConfigured())
//        {
//            if (page.getBody().readChildrenPropertyFirstResult(PaceEnabled, true))
//            {
//                log.fine("Configuring pace");
////                page.getBody().
//            }
//        }
        return page;
    }
}
