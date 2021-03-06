/*******************************************************************************
 * Copyright (c) 2011 MadRobot.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *  Elton Kent - initial API and implementation
 ******************************************************************************/
package it.michelepiccirillo.mirror.beans;

public class IntrospectionException extends Exception {

	/**
	 * Provide a brief description of serialVersionUID.
	 * Specify the purpose of this field.
	 *
	 */
	private static final long serialVersionUID = 1365256381098719405L;

	/**
	 * Constructs an <code>IntrospectionException</code> with a
	 * detailed message.
	 * 
	 * @param mess
	 *            Descriptive message
	 */
	public IntrospectionException(String mess) {
		super(mess);
	}
}
