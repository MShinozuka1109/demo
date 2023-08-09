package com.example.demo.api.carbon;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarbonServiceHelperTest {
	 @Test
	    void testCalcCarbon(){  // CarbonServiceHelper#calcCarbon() をテストする
	        EmissionSource s1 = new EmissionSource("S1", 10, 0.02);
	        EmissionSource s2 = new EmissionSource("S2", 0.1, 1);
	        
	        assertThat(CarbonServiceHelper.calcCarbon(s1, s2)).isEqualTo(0.3);  // 10*0.02+0.1+1 = 0.3 になるはず
	    }

}
