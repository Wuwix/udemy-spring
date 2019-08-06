package com.wuwi;

import org.springframework.stereotype.Component;

/**
 * @author uk00500
 * 03.06.2019
 */

@Component("tennisCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return ("ćwicz zawsze backhand");
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
