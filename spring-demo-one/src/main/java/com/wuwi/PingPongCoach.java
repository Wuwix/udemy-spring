package com.wuwi;

import lombok.Setter;

/**
 * @author uk00500
 * 24.05.2019
 */
@Setter
public class PingPongCoach implements Coach{

    private String email;
    private String team;

    FortuneService fortuneService;

    public PingPongCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Play hard in ping-pong in PWPW";
    }

    @Override
    public String getFortune() {
        return "Zrób to! " + fortuneService.getFortune() + "\nEmail: " + this.email + "\nTeam: " + this.team;
    }
}
