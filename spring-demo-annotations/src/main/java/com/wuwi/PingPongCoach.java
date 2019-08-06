package com.wuwi;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author uk00500
 * 03.06.2019
 */

@Component
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@Setter(onMethod = @__(@Autowired))
public class PingPongCoach implements Coach {

    @NonNull
    @Autowired
    @Qualifier("randomFortuneClass")
    FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return ("ping pong!");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    @Autowired
    public String getDailyFortunePongPong(@Qualifier("pongPingFortuneService") FortuneService fortuneService) {
        System.out.println("hello from getDailyFortunePongPong method xD + " + fortuneService.getFortune());
        return fortuneService.getFortune();
    }
}
