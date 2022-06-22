package com.akxhay.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) throws Exception {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        TrackCoach coach = context.getBean("myCoach", TrackCoach.class);
        System.out.println(coach.getDailyWorkout());

        // call destroy method in case of prototype bean scope
        coach.destroy();

        // close context
        context.close();
    }
}
