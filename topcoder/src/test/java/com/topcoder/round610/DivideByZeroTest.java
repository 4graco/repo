package com.topcoder.round610;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideByZeroTest {

	@Test
	public void testCount() {
		DivideByZero a = new DivideByZero();
		assertEquals(11, a.CountNumbers(new int[] { 1, 5, 8, 30, 15, 4 }));

	}
}