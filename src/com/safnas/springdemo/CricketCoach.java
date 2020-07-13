package com.safnas.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//private fields
	
	private String emailAddress;
	private String team;
	
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
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
