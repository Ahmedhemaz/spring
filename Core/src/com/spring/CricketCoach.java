package com.spring;

public class CricketCoach implements ICoach{

    private IFortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

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
