package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context  =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container

        ICoach baseBallCoach = context.getBean("baseballCoach", ICoach.class);
        ICoach trackCoach = context.getBean("trackCoach", ICoach.class);
        // call methods on the bean

        System.out.println(baseBallCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());

        // close the context

        context.close();
    }
}
