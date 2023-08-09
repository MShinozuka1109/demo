package com.example.demo.api.carbon;

public record EmissionSource(
		String name,  // 排出源名
	    double activity,  // 活動量
	    double intensity   // 原単位
	    ) {

}
