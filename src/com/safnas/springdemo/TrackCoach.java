package com.safnas.springdemo;

public class TrackCoach implements Coach {

	//define a private field
	FortuneService fortuneService;
	
	//create a constructor
	TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
