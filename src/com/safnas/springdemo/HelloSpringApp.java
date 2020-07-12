package com.safnas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve spring bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call injected method
		System.out.println(theCoach.getFortune());
		
		//close context
		context.close();

	}

}
