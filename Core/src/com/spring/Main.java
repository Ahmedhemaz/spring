package com.spring;

public class Main {

    public static void main(String[] args) {

        // create the object

        ICoach baseballCoach = new BaseballCoach();

        ICoach trackCoach = new TrackCoach();

        // use the object

        System.out.println(baseballCoach.getDailyWorkout());

        System.out.println(trackCoach.getDailyWorkout());
    }
}
