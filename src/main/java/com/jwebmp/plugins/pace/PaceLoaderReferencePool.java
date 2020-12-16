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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.base.servlets.interfaces.ReferencePool;

/**
 * @author GedMarc
 * @version 1.0
 * @since Mar 4, 2015
 */
public enum PaceLoaderReferencePool
		implements ReferencePool
{
	
	/**
	 * Put Pace Loader First
	 */
	PaceLoader(new JavascriptReference("PACE", 1.23, "bower_components/PACE/pace.min.js",
	                                   "https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/pace.min.js", 0),
	           new CSSReference("PACE", 1.23, "bower_components/PACE/pace-theme-default.min.css"), -1)
	;

	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;
	
	PaceLoaderReferencePool(JavascriptReference javaScriptReference, int sortOrder)
	{
		this.javaScriptReference = javaScriptReference;
		this.javaScriptReference.setSortOrder(sortOrder);
		javaScriptReference.setPriority(RequirementsPriority.Top_Shelf);
	}
	
	PaceLoaderReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference, int sortOrder)
	{
		this.javaScriptReference = javaScriptReference;
		this.javaScriptReference.setSortOrder(sortOrder);
		this.cssReference = cssReference;
		javaScriptReference.setPriority(RequirementsPriority.Top_Shelf);
	}
	
	@Override
	public CSSReference getCssReference()
	{
		return this.cssReference;
	}
	
	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}
	
	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}
	
	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
}
