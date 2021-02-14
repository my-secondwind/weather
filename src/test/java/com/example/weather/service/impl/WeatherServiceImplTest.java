package com.example.weather.service.impl;

import org.junit.jupiter.api.Test;

class WeatherServiceImplTest {

    WeatherServiceImpl weatherService = new WeatherServiceImpl();

    @Test
    public void test1(){
        weatherService.getWeatherItem();
    }

}