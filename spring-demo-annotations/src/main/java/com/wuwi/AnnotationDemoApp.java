package com.wuwi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author uk00500
 * 03.06.2019
 */
public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("pingPongCoach", PingPongCoach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
//        System.out.println(((PingPongCoach) tennisCoach).getDailyFortunePongPong());


        context.close();
    }
}
