package com.example.buoi2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return " Today is Happy Fortune!";
    }
}
