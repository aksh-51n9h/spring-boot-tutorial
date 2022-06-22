package com.akxhay.springcore.annotations.scope;

import com.akxhay.springcore.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myTennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("myTennisCoach", Coach.class);

        // check if they are same
        boolean result = theCoach == alphaCoach;

        // print out the results
        System.out.println("\nPointing to the same object: "  + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // close context
        context.close();
    }
}
