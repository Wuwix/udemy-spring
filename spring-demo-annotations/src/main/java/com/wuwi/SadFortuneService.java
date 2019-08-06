package com.wuwi;

/**
 * @author uk00500
 * 19.06.2019
 */
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "hello from sad service";
    }
}
