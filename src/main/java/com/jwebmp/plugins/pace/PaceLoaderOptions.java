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

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;

/**
 * The window options for the pace loader
 *
 * @param <J>
 */
public class PaceLoaderOptions<J extends PaceLoaderOptions<J>>
		extends JavaScriptPart<J>
{
	private boolean elements;
	private boolean restartOnRequestAfter;
	private boolean ajax;
	private boolean document;
	private boolean eventLag;
	private boolean restartOnPushState;

	public PaceLoaderOptions()
	{
		//Nothing Needed
	}

	public boolean isElements()
	{
		return elements;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setElements(boolean elements)
	{
		this.elements = elements;
		return (J) this;
	}

	public boolean isRestartOnRequestAfter()
	{
		return restartOnRequestAfter;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setRestartOnRequestAfter(boolean restartOnRequestAfter)
	{
		this.restartOnRequestAfter = restartOnRequestAfter;
		return (J) this;
	}

	public boolean isAjax()
	{
		return ajax;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setAjax(boolean ajax)
	{
		this.ajax = ajax;
		return (J) this;
	}

	public boolean isDocument()
	{
		return document;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setDocument(boolean document)
	{
		this.document = document;
		return (J) this;
	}

	public boolean isEventLag()
	{
		return eventLag;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setEventLag(boolean eventLag)
	{
		this.eventLag = eventLag;
		return (J) this;
	}

	public boolean isRestartOnPushState()
	{
		return restartOnPushState;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setRestartOnPushState(boolean restartOnPushState)
	{
		this.restartOnPushState = restartOnPushState;
		return (J) this;
	}
}
