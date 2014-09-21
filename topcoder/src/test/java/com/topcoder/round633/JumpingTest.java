package com.topcoder.round633;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpingTest {

	private final String ABLE = "Able";
	private final String NOTABLE = "Not able";

	@Test
	public void tesAbleToGet() {
		Jumping jumping = new Jumping();
		assertEquals(ABLE, jumping.ableToGet(4, 5, new int[] { 2, 5 }));
		assertEquals(NOTABLE, jumping.ableToGet(3, 4, new int[] { 4 }));
		assertEquals(NOTABLE, jumping.ableToGet(3, 4, new int[] { 6 }));
		assertEquals(ABLE, jumping.ableToGet(0, 1, new int[] { 100, 100 }));
		assertEquals(ABLE, jumping.ableToGet(300, 400, new int[] { 500 }));
		assertEquals(ABLE, jumping.ableToGet(11, 12, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		assertEquals(NOTABLE, jumping.ableToGet(11, 12, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100 }));
		assertEquals(
		        ABLE,
		        jumping.ableToGet(10, 10, new int[] { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000,
		                1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000,
		                1000, 1000, 1000 }));
	}
}
