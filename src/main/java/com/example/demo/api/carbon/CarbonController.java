package com.example.demo.api.carbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carbon")

public class CarbonController {
	 @Autowired
	    ServerCarbonService service;
	    
	    @GetMapping("/server")
	    public double getServerCarbon(String model, int quantity, double hours, String location) {
	        return service.calcServerCarbon(model, quantity, hours, location);
	    }

}
