package com.learnSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	private static AnnotationConfigApplicationContext context;
	private static Object object;

	public static void main(String[] args) {
		// launching spring context
		context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("salman"));// name of the bean to retrieve the bean
		System.out.println(context.getBean(Person.class));// name of the class to retrieve the bean
		System.out.println(context.getBean("address"));

	}
}
