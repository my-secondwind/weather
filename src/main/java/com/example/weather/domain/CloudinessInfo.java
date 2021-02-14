package com.example.weather.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class CloudinessInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date startDate;
    private Date endDate;
    private int clearDay;
    private int slightlyCloudyDay;
    private int cloudyDay;
    private int overcastDay;

    public CloudinessInfo() {
    }

    public CloudinessInfo(Long id, Date startDate, Date endDate, int clearDay, int slightlyCloudyDay, int cloudyDay, int overcastDay) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.clearDay = clearDay;
        this.slightlyCloudyDay = slightlyCloudyDay;
        this.cloudyDay = cloudyDay;
        this.overcastDay = overcastDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getClearDay() {
        return clearDay;
    }

    public void setClearDay(int clearDay) {
        this.clearDay = clearDay;
    }

    public int getSlightlyCloudyDay() {
        return slightlyCloudyDay;
    }

    public void setSlightlyCloudyDay(int slightlyCloudyDay) {
        this.slightlyCloudyDay = slightlyCloudyDay;
    }

    public int getCloudyDay() {
        return cloudyDay;
    }

    public void setCloudyDay(int cloudyDay) {
        this.cloudyDay = cloudyDay;
    }

    public int getOvercastDay() {
        return overcastDay;
    }

    public void setOvercastDay(int overcastDay) {
        this.overcastDay = overcastDay;
    }

    @Override
    public String toString() {
        return "CloudinessInfo{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", clearDay=" + clearDay +
                ", slightlyCloudyDay=" + slightlyCloudyDay +
                ", cloudyDay=" + cloudyDay +
                ", overcastDay=" + overcastDay +
                '}';
    }
}
