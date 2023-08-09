package com.example.demo.api.carbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServerCarbonService {
	 @Autowired
	    ServerCarbonRepository serverRepository;
	    
	    @Autowired
	    EnergyLocationRepository energyLocationRepository;
	    
	    public double calcServerCarbon(String model, int quantity, double hours, String location){
	        
	        Server server = serverRepository.findByModel(model);  // サーバのデータを取得
	        
	        EnergyLocation eloc = energyLocationRepository.findByLocation(location);  // ロケーションのデータを取得
	        
	        EmissionSource serverEmission = new EmissionSource("Server", quantity, server.carbon());  // 活動量（台数）と原単位（内包炭素）を設定
	        EmissionSource electricityEmission = new EmissionSource("Electricity", hours*server.averagePower(), eloc.intensity());  // 活動量（時間×平均消費電力）と原単位（ロケーションの炭素強度）を設定
	        
	        return CarbonServiceHelper.calcCarbon(serverEmission, electricityEmission);
	    }

}
