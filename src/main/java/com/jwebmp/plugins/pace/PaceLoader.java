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

import com.jwebmp.core.Feature;
import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.servlets.interfaces.Loader;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.pace.preloadedthemes.PaceTheme;

/**
 * An implementation of Pace Loader
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Pace",
		description = "Automatic page load progress bar",
		url = "http://github.hubspot.com/pace/docs/welcome/")
public class PaceLoader
		extends Feature<PaceLoader, JavaScriptPart, PaceLoader>
		implements Loader, IPaceLoader
{


	/**
	 * The actual theme
	 */
	private PaceTheme theme;

	/**
	 * Creates a Pace Loader with a theme
	 *
	 * @param theme
	 */
	public PaceLoader(PaceTheme theme)
	{
		super("PaceLoader");
		this.theme = theme;
		FileTemplates.getTemplateVariables()
		             .put("PACE_TRACK_START;", new StringBuilder("Pace.options.ajax.trackWebSockets = false;" + getNewLine() + "\tPace.track(function(){" + getNewLine()));
		FileTemplates.getTemplateVariables()
		             .put("PACE_TRACK_END;", new StringBuilder("});" + getNewLine()));

		addJavaScriptReference(PaceLoaderReferencePool.PaceLoader.getJavaScriptReference());
		addCssReference(theme.getCSSReference());
	}

	/**
	 * A nicer view
	 *
	 * @return
	 */
	public IPaceLoader asMe()
	{
		return this;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addCssReference(theme.getCSSReference());
		}
		super.preConfigure();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		//Nothing Needed
	}

	/**
	 * Gets the current pace loader theme
	 *
	 * @return
	 */
	@Override
	public PaceTheme getTheme()
	{
		return theme;
	}

	/**
	 * Sets the theme for this pace loader
	 *
	 * @param theme
	 */
	@Override
	public void setTheme(PaceTheme theme)
	{
		this.theme = theme;
	}
}
