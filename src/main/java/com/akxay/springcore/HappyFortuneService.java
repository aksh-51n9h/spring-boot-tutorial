package com.akxay.springcore;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        String[] fortunes = {
                "Good luck and good wishes.",
                "Today is your lucky day.",
                "“All the luck in the world, all wished for you.",
                "May good fortune smile on you as you begin this new adventure.",
                "Go forth and conquer!"
        };

        Random rIndexGen = new Random();
        return fortunes[rIndexGen.nextInt(fortunes.length)];
    }
}
