package com.example.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherItem implements Serializable {
    @JsonProperty("now_dt")
    private Date currentDate;
    private List<Forecast> forecasts;

    public WeatherItem() {
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    @Override
    public String toString() {
        return "WeatherItem{" +
                "currentDate=" + currentDate +
                ", forecasts=" + forecasts +
                '}';
    }
}
