package com.akxhay.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach.setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
