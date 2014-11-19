package com.topcoder.tco14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WolfCarpetTest {
	@Test
	public void testCount() {
		WolfCarpet wolfCarpet = new WolfCarpet();
		assertEquals(4, wolfCarpet.count(1, 1, 2, 3));
		assertEquals(11, wolfCarpet.count(0, 0, 0, 10));
		assertEquals(0, wolfCarpet.count(1, 1, 1, 1));
		assertEquals(414, wolfCarpet.count(5, 12, 40, 26));
		assertEquals(750000002000000001l,
				wolfCarpet.count(0, 0, 1000000000, 1000000000));
		assertEquals(6979871694045002l,
				wolfCarpet.count(81695509, 209408464, 949118329, 220137366));
	}
}
