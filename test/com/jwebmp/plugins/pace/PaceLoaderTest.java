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

import com.jwebmp.BaseTestClass;
import com.jwebmp.Page;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.components.pace.PaceLoader;
import com.jwebmp.components.pace.PaceThemeColour;
import com.jwebmp.components.pace.preloadedthemes.PaceTheme;
import org.junit.jupiter.api.Test;

/**
 * @author ged_m
 */
public class PaceLoaderTest
		extends BaseTestClass
{

	public PaceLoaderTest()
	{
	}

	/**
	 * Test of setTheme method, of class PaceLoader.
	 */
	@Test
	public void testSetTheme()
	{
		PaceLoader pl = new PaceLoader(PaceTheme.Barbershop);

		pl.getTheme()
		  .setThemeColour(PaceThemeColour.Orange);
		System.out.println(pl.toString());

	}

	@Test
	public void testPageConfiguration()
	{
		Page p = getInstance();
		p.getOptions()
		 .setDynamicRender(false);
		PaceLoader pl;
		p.getBody()
		 .addFeature(pl = new PaceLoader(PaceTheme.Bounce));
		pl.getTheme()
		  .setThemeColour(PaceThemeColour.Orange);
		System.out.println(p.toString(true));
	}

	@Test
	public void testAngularPageConfiguration()
	{
		Page p = getInstance();
		AngularPageConfigurator.setRequired(true);
		p.getOptions()
		 .setDynamicRender(false);
		PaceLoader pl;
		p.getBody()
		 .addFeature(pl = new PaceLoader(PaceTheme.Bounce));
		pl.getTheme()
		  .setThemeColour(PaceThemeColour.Orange);
		System.out.println(p.toString(true));
	}

}
