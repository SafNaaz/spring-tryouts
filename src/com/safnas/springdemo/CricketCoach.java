package com.safnas.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no arg constructor");
	}
	
	//setter method

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
