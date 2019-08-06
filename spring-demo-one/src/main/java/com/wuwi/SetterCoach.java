package com.wuwi;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
public class SetterCoach implements Coach {

	private String email;
	private String team;

	public SetterCoach() {
		System.out.println("From no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("From setter");
	}

	@Autowired
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Setting hard!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune() + "\nEmail: " + this.email + "\nTeam: " + this.team;
	}
}










