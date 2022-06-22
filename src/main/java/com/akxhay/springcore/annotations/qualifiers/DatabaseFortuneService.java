package com.akxhay.springcore.annotations.qualifiers;

import com.akxhay.springcore.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
