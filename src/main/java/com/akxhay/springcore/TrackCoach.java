package com.akxhay.springcore;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach , DisposableBean {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach(){

    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach.doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach.doMyCleanupStuff");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach.destroy");
    }
}
