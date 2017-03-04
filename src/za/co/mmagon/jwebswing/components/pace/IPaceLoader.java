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

import za.co.mmagon.jwebswing.components.pace.preloadedThemes.PaceTheme;

/**
 *
 * @author GedMarc
 * @since 13 Feb 2017
 * 
 */
public interface IPaceLoader 
{

    /**
     * Gets the current pace loader theme
     *
     * @return
     */
    PaceTheme getTheme();

    /**
     * Sets the theme for this pace loader
     *
     * @param theme
     */
    void setTheme(PaceTheme theme);

}
