package com.wuwi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author uk00500
 * 03.06.2019
 */
public class SwimJavaConfigApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        System.out.println(((SwimCoach) swimCoach).getEmail());


        context.close();
    }
}
