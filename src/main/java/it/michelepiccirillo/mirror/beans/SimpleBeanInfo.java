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


/** This is a support class to make it easier for people to provide
* BeanInfo classes.
* <p>
* It defaults to providing "noop" information, and can be selectively
* overriden to provide more explicit information on chosen topics.
* When the introspector sees the "noop" values, it will apply low
* level introspection and design patterns to automatically analyze
* the target bean.
*/

public class SimpleBeanInfo implements BeanInfo  {

   /**
    * Deny knowledge about the class and customizer of the bean.
    * You can override this if you wish to provide explicit info.
    */
   public BeanDescriptor  getBeanDescriptor() {
	   return null;
   }

   /**
    * Deny knowledge of a default event. You can override this
    * if you wish to define a default event for the bean.
    */
	public int getDefaultEventIndex() {
	   return -1;
   }

   /**
    * Deny knowledge of a default property. You can override this
    * if you wish to define a default property for the bean.
    */
	public int getDefaultPropertyIndex() {
	   return -1;
   }

   /**
    * Deny knowledge of event sets. You can override this
    * if you wish to provide explicit event set info.
    */
	public EventSetDescriptor [] getEventSetDescriptors() {
	   return null;
   }

   /**
    * Deny knowledge of methods. You can override this
    * if you wish to provide explicit method info.
    */
	public MethodDescriptor [] getMethodDescriptors() {
	   return null;
   }

   /**
    * Deny knowledge of properties. You can override this
    * if you wish to provide explicit property info.
    */
	public PropertyDescriptor [] getPropertyDescriptors() {
	   return null;
   }

	public BeanInfo[] getAdditionalBeanInfo() {
		return null;
	}




}
