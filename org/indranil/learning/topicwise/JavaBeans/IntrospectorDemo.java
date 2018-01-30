package org.indranil.learning.topicwise.JavaBeans;

import java.beans.*;

public class IntrospectorDemo {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("org.indranil.learning.topicwise.JavaBeans.Colors");
			BeanInfo beanInfo = Introspector.getBeanInfo(c);
			
			System.out.println("Properties:");
			PropertyDescriptor propertyDescriptor[] = beanInfo.getPropertyDescriptors();
			for(int i =0; i<propertyDescriptor.length;i++) {
				System.out.println("\t" + propertyDescriptor[i].getName());
			}
				System.out.println("Events:");
				EventSetDescriptor eventSetDescriptor[] = beanInfo.getEventSetDescriptors();
				for(int i =0; i<eventSetDescriptor.length;i++) {
					System.out.println("\t" + eventSetDescriptor[i].getName());
				}
			}
			catch(Exception e) {
				System.out.println("Exception Caught. " + e);
			}
		}

}
