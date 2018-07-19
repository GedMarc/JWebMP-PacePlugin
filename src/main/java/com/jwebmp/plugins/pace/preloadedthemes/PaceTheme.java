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
package com.jwebmp.plugins.pace.preloadedthemes;

import com.jwebmp.base.references.CSSReference;
import com.jwebmp.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.plugins.pace.PaceThemeColour;

/**
 * Specifies a valid pace theme
 *
 * @author GedMarc
 */
public enum PaceTheme
{
	Barbershop(new CSSReference("CSSPaceBarberShop", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-barber-shop.min.css",
	                            "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-barber-shop.min.css")),
	BigCounter(new CSSReference("CSSPaceBigCounter", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-big-counter.min.css",
	                            "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-big-counter.min.css")),
	Bounce(new CSSReference("CSSPaceBounce", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-bounce.min.css",
	                        "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-bounce.min.css")),
	CenterAtom(new CSSReference("CSSPaceCenterAtom", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-center-atom.min.css",
	                            "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-center-atom.min.css")),
	CenterCircle(new CSSReference("CSSPaceCenterCircle", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-center-circle.min.css",
	                              "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-center-circle.min.css")),
	CenterRader(new CSSReference("CSSPaceCenterRader", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-center-rader.min.css",
	                             "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-center-radar.min.css")),
	CenterSimple(new CSSReference("CSSPaceCenterSimple", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-center-simple.min.css",
	                              "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-center-simple.min.css")),
	CornerIndicator(new CSSReference("CSSPaceCornerIndicator", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-corner-indicator.min.css",
	                                 "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-corner-indicator.min.css")),
	FillLeft(new CSSReference("CSSPaceFillLeft", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-fill-left.min.css",
	                          "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-fill-left.min.css")),
	Flash(new CSSReference("CSSPaceFlash", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-flash.min.css",
	                       "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-flash.min.css")),
	FlatTop(new CSSReference("CSSPaceFlatTop", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-flat-top.min.css",
	                         "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-flat-top.min.css")),
	LoadingProgressBar(new CSSReference("CSSPaceLoadingProgressBar", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-loading-bar.min.css",
	                                    "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-loading-bar.min.css")),
	MacOSX(new CSSReference("CSSPaceMacOSX", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-macosx.min.css",
	                        "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-mac-osx.min.css")),
	Minimal(new CSSReference("CSSPaceMinimal", 1.02, "bower_components/PACE/themes/xxXXxx/pace-theme-minimal.min.css",
	                         "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/xxXXxx/pace-theme-minimal.min.css"));

	private CSSReference CSSReference;
	private PaceThemeColour themeColour = PaceThemeColour.Red;

	/**
	 * Gets a pace theme
	 *
	 * @param CSSReference
	 */
	PaceTheme(CSSReference CSSReference)
	{
		this.CSSReference = CSSReference;
		this.CSSReference.setPriority(RequirementsPriority.First);
		this.CSSReference.setCanMinifyAtRemote(false);
		CSSReference.setSortOrder(0);
	}

	/**
	 * Returns the CSS Reference for pace and the theme
	 *
	 * @return
	 */
	public CSSReference getCSSReference()
	{
		CSSReference.setRemoteReference(CSSReference.getRemoteReference()
		                                            .replaceAll("xxXXxx", themeColour.toString()));
		CSSReference.setLocalReference(CSSReference.getLocalReference()
		                                           .replaceAll("xxXXxx", themeColour.toString()));
		return CSSReference;
	}

	/**
	 * Sets the CSS Reference for the pace theme
	 *
	 * @param CSSReference
	 *
	 * @return
	 */
	public PaceTheme setCSSReference(CSSReference CSSReference)
	{
		this.CSSReference = CSSReference;
		return this;
	}

	/**
	 * Gets the pace theme colour applied
	 *
	 * @return
	 */
	public PaceThemeColour getThemeColour()
	{
		return themeColour;
	}

	/**
	 * Sets the pace theme colour applied
	 *
	 * @param themeColour
	 *
	 * @return
	 */
	public PaceTheme setThemeColour(PaceThemeColour themeColour)
	{
		this.themeColour = themeColour;
		return this;
	}

}
