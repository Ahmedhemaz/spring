package com.spring;

public class CricketCoach implements ICoach{

    private IFortuneService fortuneService;

    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFourtune();
    }
}
