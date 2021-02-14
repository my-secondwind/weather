package com.example.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast implements Serializable {
    @JsonProperty("moon_code")
    private int moonCode;
    private Date date;

    @JsonProperty("parts")
    private DayParts dayParts;

    public Forecast() {
    }

    public int getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(int moonCode) {
        this.moonCode = moonCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DayParts getDayParts() {
        return dayParts;
    }

    public void setDayParts(DayParts dayParts) {
        this.dayParts = dayParts;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "moonCode=" + moonCode +
                ", date=" + date +
                ", dayParts=" + dayParts +
                '}';
    }
}
