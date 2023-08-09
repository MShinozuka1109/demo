package com.example.demo.api.carbon;

public record Server(
		String model,  // 機種
		double carbon,  // 内包炭素
		double averagePower  // 平均消費電力
		) {

}
