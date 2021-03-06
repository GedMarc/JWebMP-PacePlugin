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
package com.jwebmp.plugins.pace.preloadedThemes;

import com.jwebmp.core.Page;
import com.jwebmp.core.generics.WebReference;
import com.jwebmp.plugins.pace.PaceLoaderPageConfigurator;
import com.jwebmp.plugins.pace.PaceThemeColour;
import com.jwebmp.plugins.pace.preloadedthemes.PaceTheme;
import org.junit.jupiter.api.Test;

/**
 * @author ged_m
 */
public class PaceThemeTest
{

	public PaceThemeTest()
	{
	}

	/**
	 * Test of values method, of class PaceTheme.
	 */
	@Test
	public void testValues()
	{
		PaceTheme pc = PaceTheme.Barbershop;
		synchronized (pc.getCSSReference())
		{
			PaceLoaderPageConfigurator.setPaceTheme(pc);
			pc.setThemeColour(PaceThemeColour.Orange);
			WebReference.setIsLocal(false);
			System.out.println(pc.getCSSReference());
		}

		Page p = new Page();
		p.add("");
		System.out.println(p.toString(true));
	}

}
