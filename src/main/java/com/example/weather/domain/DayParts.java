package com.example.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DayParts implements Serializable {
    @JsonProperty("day_short")
    private InfoShort day;

    public DayParts() {
    }

    public InfoShort getDay() {
        return day;
    }

    public void setDay(InfoShort day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "DayParts{" +
                "day=" + day +
                '}';
    }
}
