package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // read spring config file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container

        ICoach tennisCoach = context.getBean("tennisCoach", ICoach.class);

        // call a method on the bean

        System.out.println(tennisCoach.getDailyworkout());

        // close the context

        context.close();


    }
}
