package com.topcoder.round607;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoundingBoxTest {

	@Test
	public void testSmallestArea() {
		assertEquals(12, new BoundingBox().smallestArea(new int[] { 0, 0, 1, 0, -1, 2 }, new int[] { 0, 1, 2, -2, 0, -1 }));

	}

}
