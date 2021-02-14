package com.example.weather.domain.builder;

import com.example.weather.domain.CloudinessInfo;

import java.util.Date;

public class CloudinessInfoBuilder {
    private Long id;
    private Date startDate;
    private Date endDate;
    private int clearDay;
    private int slightlyCloudyDay;
    private int cloudyDay;
    private int overcastDay;

    public CloudinessInfoBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public CloudinessInfoBuilder setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public CloudinessInfoBuilder setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public CloudinessInfoBuilder setClearDay(int clearDay) {
        this.clearDay = clearDay;
        return this;
    }

    public CloudinessInfoBuilder setSlightlyCloudyDay(int slightlyCloudyDay) {
        this.slightlyCloudyDay = slightlyCloudyDay;
        return this;
    }

    public CloudinessInfoBuilder setCloudyDay(int cloudyDay) {
        this.cloudyDay = cloudyDay;
        return this;
    }

    public CloudinessInfoBuilder setOvercastDay(int overcastDay) {
        this.overcastDay = overcastDay;
        return this;
    }

    public CloudinessInfo build() {
        return new CloudinessInfo(id, startDate, endDate, clearDay, slightlyCloudyDay, cloudyDay, overcastDay);
    }
}