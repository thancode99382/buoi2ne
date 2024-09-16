package com.example.buoi2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
    }

    @Override
    public String getDailyWorkout() {
        return "practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "I love today ";
    }
}
