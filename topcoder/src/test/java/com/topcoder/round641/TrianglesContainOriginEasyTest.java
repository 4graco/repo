package com.topcoder.round641;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.topcoder.rount641.TrianglesContainOriginEasy;

public class TrianglesContainOriginEasyTest {

	@Test
	public void testCount() {
		TrianglesContainOriginEasy trianglesContainOriginEasy = new TrianglesContainOriginEasy();
		assertEquals(1, trianglesContainOriginEasy.count(
				new int[] { -1, -1, 1 }, new int[] { 1, -1, 0 }));
		assertEquals(2, trianglesContainOriginEasy.count(new int[] { -1, -1, 1,
				2 }, new int[] { 1, -1, 2, -1 }));
		assertEquals(8, trianglesContainOriginEasy.count(new int[] { -1, -2, 3,
				3, 2, 1 }, new int[] { -2, -1, 1, 2, 3, 3 }));
		assertEquals(256, trianglesContainOriginEasy.count(new int[] { 1, 5,
				10, 5, -5, 7, -9, -6, -3, 0, 8, 8, 1, -4, 7, -3, 10, 9, -6 },
				new int[] { 5, -6, -3, 4, -2, -8, -7, 2, 7, 4, 2, 0, -4, -8, 7,
						5, -5, -2, -9 }));
	}
}
