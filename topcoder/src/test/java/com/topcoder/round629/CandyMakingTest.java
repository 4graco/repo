package com.topcoder.round629;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CandyMakingTest {

	@Test
	public void testFindSuitableDensity() {
		CandyMaking a = new CandyMaking();
		assertEquals(0.0, a.findSuitableDensity(new int[] { 5 }, new int[] { 1000 }), 1e-9);
		assertEquals(1000.0, a.findSuitableDensity(new int[] { 10, 10 }, new int[] { 1000, 2000 }), 1e-9);
		assertEquals(5250.0, a.findSuitableDensity(new int[] { 10, 20, 40 }, new int[] { 4000, 2000, 1000 }), 1e-9);
		assertEquals(999999.9999673415, a.findSuitableDensity(new int[] { 30621, 30620, 2 }, new int[] { 1, 1, 1000000 }), 1e-9);
		assertEquals(
		        983673.2727272725,
		        a.findSuitableDensity(new int[] { 1234, 1541, 3321, 1234, 123, 123, 3414, 123, 12, 2442, 1421, 1223, 3232, 1123, 2121 }, new int[] { 3213, 1231, 232143, 44312,
		                132132, 142424, 123123, 41341, 41244, 21312, 232131, 2312, 2322, 11, 2223 }), 1e-9);

	}
}
