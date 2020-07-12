package com.safnas.springdemo;

public class BaseballCoach implements Coach{
	
	FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getFortune() {
		return "just do it:" + fortuneService.getFortune();
	}

}
