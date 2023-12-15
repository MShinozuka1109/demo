package com.example.demo.api.carbon;

import org.springframework.stereotype.Repository;

@Repository
public class EnergyLocationRepository {
	EnergyLocation findByLocation(String location) {
        return new EnergyLocation(location, 0.4);
    }

}
