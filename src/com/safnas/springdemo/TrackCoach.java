package com.safnas.springdemo;

public class TrackCoach implements Coach {

	//define a private field
	FortuneService fortuneService;
	
	//empty constructor to avoid errors
	public TrackCoach() {
	}
	
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
	
	//init method
	public void doMyStartUpStuff(){
		System.out.println("TrackCoach : inside doMyStartUpStuff");
	}
	
	//destroy method
	public void doMyCleanUpStuff(){
		System.out.println("TrackCoach : inside doMyCleanUpStuff");
	}

}
