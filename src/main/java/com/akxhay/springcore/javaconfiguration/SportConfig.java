package com.akxhay.springcore.javaconfiguration;

import com.akxhay.springcore.Coach;
import com.akxhay.springcore.FortuneService;
import com.akxhay.springcore.annotations.propertyfile.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.akxhay.springcore")
public class SportConfig {
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
