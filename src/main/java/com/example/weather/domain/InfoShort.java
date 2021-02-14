package com.example.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoShort implements Serializable {

    @JsonProperty("cloudness")
    private double cloudiness;

    public InfoShort() {
    }

    public double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(double cloudiness) {
        this.cloudiness = cloudiness;
    }

    @Override
    public String toString() {
        return "InfoShort{" +
                "cloudiness=" + cloudiness +
                '}';
    }
}
