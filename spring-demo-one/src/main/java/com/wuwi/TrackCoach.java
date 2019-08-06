package com.wuwi;

public class TrackCoach implements Coach {

	FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune() + " Plus wlasny tekst z TrackCoach";
	}

	public void doStartupStuff() {
		System.out.println("Startup sout");
	}

	public void doEndStuff() {
		System.out.println("End sout");
	}


}










