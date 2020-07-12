package com.safnas.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
