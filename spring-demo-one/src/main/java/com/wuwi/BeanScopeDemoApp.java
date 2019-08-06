package com.wuwi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author uk00500
 * 28.05.2019
 */
//@SpringBootApplication


public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean b = myCoach == alphaCoach;

        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getFortune());

        System.out.println("Result: " + b);
        System.out.println("Memory location for myCoach: " + myCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        context.close();


    }
}
