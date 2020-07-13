package com.safnas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (myCoach == alphaCoach);
		
		System.out.println("\npointing to same location: "+result);
		System.out.println("\nMemory location of myCoach: "+myCoach);
		System.out.println("\nMemory location of alphaCoach: "+alphaCoach);
		
		context.close();
	}

}
