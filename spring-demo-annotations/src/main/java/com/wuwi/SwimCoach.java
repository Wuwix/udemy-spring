package com.wuwi;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.Collections;

/**
 * @author uk00500
 * 19.06.2019
 */

@RequiredArgsConstructor
@Getter
@Setter
public class SwimCoach implements Coach {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @NonNull
    FortuneService fortuneService;

    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "swim a lot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
