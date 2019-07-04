package com.spring;

public class BaseballCoach implements ICoach {

    private  IFortuneService fortuneService;

    public BaseballCoach(){}

    public BaseballCoach(IFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune(){
        return this.fortuneService.getFourtune();
    }
}
