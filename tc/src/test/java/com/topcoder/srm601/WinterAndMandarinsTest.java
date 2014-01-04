package com.topcoder.srm601;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WinterAndMandarinsTest {

	@Test
	public void testGetNumber() {
		WinterAndMandarins wam = new WinterAndMandarins();
		assertEquals(10, wam.getNumber(new int[] { 10, 20, 30 }, 2));
		assertEquals(3, wam.getNumber(new int[] { 4, 7, 4 }, 3));
		assertEquals(2, wam.getNumber(new int[] { 4, 1, 2, 3 }, 3));
		assertEquals(1,
				wam.getNumber(new int[] { 5, 4, 6, 1, 9, 4, 2, 7, 5, 6 }, 4));
		assertEquals(27, wam.getNumber(new int[] { 47, 1000000000, 1, 74 }, 2));
	}

}
