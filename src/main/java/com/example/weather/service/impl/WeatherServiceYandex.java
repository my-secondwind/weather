package com.example.weather.service.impl;

import com.example.weather.domain.WeatherItem;
import com.example.weather.service.WeatherService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceYandex implements WeatherService {

    public static final String RESOURCE_URL = "https://api.weather.yandex.ru/v2/forecast?lat=52.43&lon=41.27";
    public static final String YANDEX_API_KEY_HEADER = "X-Yandex-API-Key";
    public static final String YANDEX_API_KEY_VALUE = "89afa801-160d-4a32-839d-d5d1c391f812";

    @Override
    public WeatherItem getWeatherItem() {
        ResponseEntity<WeatherItem> response = callForExternalResource();
        return response.getBody();
    }

    private ResponseEntity<WeatherItem> callForExternalResource() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(YANDEX_API_KEY_HEADER, YANDEX_API_KEY_VALUE);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(RESOURCE_URL
                , HttpMethod.GET
                , entity
                , WeatherItem.class);
    }
}
