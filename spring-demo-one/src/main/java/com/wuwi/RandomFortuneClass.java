package com.wuwi;

import lombok.AllArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author uk00500
 * 24.05.2019
 */
@AllArgsConstructor
public class RandomFortuneClass implements FortuneService {

    private String array;

    @Override
    public String getFortune() {
        String[] strings = array.split(",");
        int randomNum = ThreadLocalRandom.current().nextInt(0, strings.length);
        String arrayValue = strings[randomNum];
        return arrayValue;
    }
}
