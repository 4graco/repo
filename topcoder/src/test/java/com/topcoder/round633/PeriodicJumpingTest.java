package com.topcoder.round633;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PeriodicJumpingTest {

	@Test
	public void tesMinimalTime() {
		PeriodicJumping periodicJumping = new PeriodicJumping();
		assertEquals(5, periodicJumping.minimalTime(15, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		assertEquals(1, periodicJumping.minimalTime(5, new int[] { 5 }));
		assertEquals(2, periodicJumping.minimalTime(1, new int[] { 10 }));
		assertEquals(11, periodicJumping.minimalTime(-10, new int[] { 2, 3, 4, 500, 6, 7, 8 }));
		assertEquals(1000000000, periodicJumping.minimalTime(-1000000000, new int[] { 1 }));
		assertEquals(0, periodicJumping.minimalTime(0, new int[] { 19911120 }));
		assertEquals(
		        953613251,
		        periodicJumping.minimalTime(-953613251, new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }));

	}
}
