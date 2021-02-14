package com.example.weather.repository;

import com.example.weather.domain.CloudinessInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudinessInfoRepository extends JpaRepository<CloudinessInfo, Long> {
}
