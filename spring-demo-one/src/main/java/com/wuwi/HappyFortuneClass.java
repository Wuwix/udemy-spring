package com.wuwi;

/**
 * @author uk00500
 * 24.05.2019
 */
public class HappyFortuneClass implements FortuneService {


    @Override
    public String getFortune() {
        return "Dzisiaj jest twój szczęśliwy dzień!";
    }
}
