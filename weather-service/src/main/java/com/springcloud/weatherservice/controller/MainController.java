package com.springcloud.weatherservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {

    @GetMapping
    public String getWeather() {

        String[] weatherArray =
            new String[] { "Rainy", "Stormy", "Sunny", "Cloudy", "Hot", "Cold", "Dry", "Wet", "Windy" };
        int index = new Random().nextInt(9);
        return weatherArray[index];
    }
}
