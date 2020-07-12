package com.safnas.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		Coach baseballCoach = new TrackCoach(null);
		
		//call the object
		System.out.println(baseballCoach.getDailyWorkout());
		
		

	}

}
