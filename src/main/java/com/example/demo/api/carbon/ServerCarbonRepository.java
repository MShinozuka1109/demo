package com.example.demo.api.carbon;

import org.springframework.stereotype.Repository;

@Repository
public class ServerCarbonRepository {
	Server findByModel(String model){
        return new Server(model, 5000, 15);
	}

}
