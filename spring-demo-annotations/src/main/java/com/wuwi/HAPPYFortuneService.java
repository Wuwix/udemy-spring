package com.wuwi;

import org.springframework.stereotype.Component;

/**
 * @author uk00500
 * 03.06.2019
 */

@Component
public class HAPPYFortuneService implements FortuneService {

    @Override
    public String  getFortune() {
        return "Hello from happy service :) !";
    }
}
