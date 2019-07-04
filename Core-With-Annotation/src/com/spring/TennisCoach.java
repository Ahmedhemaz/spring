package com.spring;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

    @Override
    public String getDailyworkout(){
        return "practice your backhand volley";
    }

}
