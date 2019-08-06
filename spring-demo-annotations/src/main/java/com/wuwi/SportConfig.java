package com.wuwi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author uk00500
 * 19.06.2019
 */

@Configuration
//@ComponentScan("com.wuwi")
@PropertySource("classpath:config.properties")
public class SportConfig {

    @Bean
    public FortuneService getSadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public FortuneService getRandomFortuneService() {
        return new RandomFortuneClass();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(getRandomFortuneService());
    }
}
