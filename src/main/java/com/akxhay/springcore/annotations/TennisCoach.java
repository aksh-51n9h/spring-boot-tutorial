package com.akxhay.springcore.annotations;

import com.akxhay.springcore.Coach;
import com.akxhay.springcore.FortuneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myTennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {

    // field injection
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("TennisCoach.TennisCoach");
    }

    // constructor injection
    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    // setter injection
    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach.setFortuneService");
        this.fortuneService = fortuneService;
    }
    */

    // setter injection custom function name
    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("TennisCoach.doSomeCrazyStuff");
        this.fortuneService = fortuneService;
    }
    */

    // add a init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("TrackCoach.doMyStartupStuff");
    }

    // add a destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach.doMyCleanupStuff");
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TennisCoach.destroy");
    }
}
