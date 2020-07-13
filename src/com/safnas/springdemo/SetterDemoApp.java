package com.safnas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the config
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// retrieve bean
		CricketCoach myCoach = applicationContext.getBean("myCricketCoach", CricketCoach.class);
		// call method
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		

		// close context
		applicationContext.close();

	}

}
