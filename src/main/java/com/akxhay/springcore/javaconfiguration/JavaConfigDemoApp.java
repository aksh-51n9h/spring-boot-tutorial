package com.akxhay.springcore.javaconfiguration;

import com.akxhay.springcore.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring java config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach coach = context.getBean("myTennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
