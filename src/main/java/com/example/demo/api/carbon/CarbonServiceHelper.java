package com.example.demo.api.carbon;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarbonServiceHelper {
	public static double calcCarbon(EmissionSource...emissionSources) {
		 return new BigDecimal(Stream.of(emissionSources)
		            .map(es -> es.activity()*es.intensity())
		            .collect(Collectors.summingDouble(Double::doubleValue)),
		            new MathContext(2, RoundingMode.DOWN)).doubleValue();
    }

}
