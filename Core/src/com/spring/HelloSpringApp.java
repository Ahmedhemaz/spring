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
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        // call methods on the bean

        System.out.println(baseBallCoach.getDailyWorkout());
        System.out.println(baseBallCoach.getDailyFortune());
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeamName());

        // close the context

        context.close();
    }
}
