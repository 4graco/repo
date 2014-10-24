package com.topcoder.round637;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreaterGameDiv2Test {

	@Test
	public void testCalc() {
		GreaterGameDiv2 greaterGameDiv2 = new GreaterGameDiv2();
		assertEquals(1, greaterGameDiv2.calc(new int[] { 1, 3 }, new int[] { 4, 2 }));
		assertEquals(0, greaterGameDiv2.calc(new int[] { 1, 3, 5, 7, 9 }, new int[] { 2, 4, 6, 8, 10 }));
		assertEquals(1, greaterGameDiv2.calc(new int[] { 2 }, new int[] { 1 }));
		assertEquals(6, greaterGameDiv2.calc(new int[] { 3, 5, 9, 16, 14, 20, 15, 17, 13, 2 }, new int[] { 6, 18, 1, 8, 7, 10, 11, 19, 12, 4 }));
	}
}
