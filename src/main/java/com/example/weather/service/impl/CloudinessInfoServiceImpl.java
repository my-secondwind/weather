package com.example.weather.service.impl;

import com.example.weather.domain.CloudinessInfo;
import com.example.weather.domain.Forecast;
import com.example.weather.domain.WeatherItem;
import com.example.weather.domain.builder.CloudinessInfoBuilder;
import com.example.weather.repository.CloudinessInfoRepository;
import com.example.weather.service.CloudinessInfoService;
import com.example.weather.service.WeatherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CloudinessInfoServiceImpl implements CloudinessInfoService {
    private final WeatherService weatherService;
    private final CloudinessInfoRepository cloudinessInfoRepository;

    public CloudinessInfoServiceImpl(WeatherService weatherService, CloudinessInfoRepository cloudinessInfoRepository) {
        this.weatherService = weatherService;
        this.cloudinessInfoRepository = cloudinessInfoRepository;
    }

    @Override
    public CloudinessInfo get() {
        WeatherItem weatherItem = weatherService.getWeatherItem();
        CloudinessInfo cloudinessInfo = computeCloudinessInfo(weatherItem);
        cloudinessInfoRepository.save(cloudinessInfo);
        return cloudinessInfo;
    }

    private CloudinessInfo computeCloudinessInfo(WeatherItem weatherItem) {
        CloudinessInfoBuilder cloudinessInfoBuilder = new CloudinessInfoBuilder();
        List<Forecast> forecasts = weatherItem.getForecasts();

        cloudinessInfoBuilder.setStartDate(forecasts.get(0).getDate())
                .setEndDate(forecasts.get(forecasts.size() - 1).getDate());

        List<Double> cloudinessList = forecasts.stream().map(it -> it.getDayParts().getDay().getCloudiness()).collect(Collectors.toList());
        cloudinessInfoBuilder.setClearDay((int) cloudinessList.stream().filter(it -> it == 0).count())
                .setSlightlyCloudyDay((int) cloudinessList.stream().filter(it -> (it > 0 && it <= 0.25)).count())
                .setCloudyDay((int) cloudinessList.stream().filter(it -> (it > 0.25 && it < 1)).count())
                .setOvercastDay((int) cloudinessList.stream().filter(it -> it == 1).count());
        return cloudinessInfoBuilder.build();
    }

}
