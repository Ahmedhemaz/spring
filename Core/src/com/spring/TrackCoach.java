package com.spring;

class TrackCoach implements ICoach {

    private IFortuneService fortuneService;


    public TrackCoach(){}

    public TrackCoach(IFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune(){
        return this.fortuneService.getFourtune();
    }

}
