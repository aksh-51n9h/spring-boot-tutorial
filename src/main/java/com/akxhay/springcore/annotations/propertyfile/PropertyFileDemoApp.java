package com.akxhay.springcore.annotations.propertyfile;

import com.akxhay.springcore.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyFileDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        // get the bean from spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        // close context
        context.close();
    }
}
