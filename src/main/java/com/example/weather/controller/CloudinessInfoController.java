package com.example.weather.controller;

import com.example.weather.domain.CloudinessInfo;
import com.example.weather.service.CloudinessInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudinessInfoController {
    private final CloudinessInfoService cloudinessInfoService;

    public CloudinessInfoController(CloudinessInfoService cloudinessInfoService) {
        this.cloudinessInfoService = cloudinessInfoService;
    }

    @GetMapping("/cloudiness")
    public ResponseEntity<CloudinessInfo> getCloudinessInfo() {
        CloudinessInfo cloudinessInfo = cloudinessInfoService.getStatistic();
        return cloudinessInfo != null
                ? new ResponseEntity<>(cloudinessInfo, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
