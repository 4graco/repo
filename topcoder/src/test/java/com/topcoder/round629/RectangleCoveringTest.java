package com.topcoder.round629;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleCoveringTest {

	@Test
	public void testMinimumNumber() {
		RectangleCovering rectangleCovering = new RectangleCovering();
		assertEquals(2, rectangleCovering.minimumNumber(5, 5, new int[] { 8, 8, 8 }, new int[] { 2, 3, 4 }));
		assertEquals(-1, rectangleCovering.minimumNumber(10, 10, new int[] { 6, 6, 6, 6 }, new int[] { 6, 6, 6, 6 }));
		assertEquals(-1, rectangleCovering.minimumNumber(5, 5, new int[] { 5 }, new int[] { 5 }));
		assertEquals(1, rectangleCovering.minimumNumber(3, 5, new int[] { 6 }, new int[] { 4 }));
		assertEquals(
		        3,
		        rectangleCovering.minimumNumber(10000, 5000, new int[] { 12345, 12343, 12323, 12424, 1515, 6666, 6789, 1424, 11111, 25 }, new int[] { 1442, 2448, 42, 1818, 3535,
		                3333, 3456, 7890, 1, 52 }));

	}
}
