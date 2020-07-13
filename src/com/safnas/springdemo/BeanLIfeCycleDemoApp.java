package com.safnas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLIfeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLIfeCycle-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		context.close();
	}

}
