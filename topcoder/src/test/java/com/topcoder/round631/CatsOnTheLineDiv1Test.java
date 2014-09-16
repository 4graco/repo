package com.topcoder.round631;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatsOnTheLineDiv1Test {

	@Test
	public void testFindSuitableDensity() {
		CatsOnTheLineDiv1 catsOnTheLineDiv1 = new CatsOnTheLineDiv1();
		assertEquals(0, catsOnTheLineDiv1.getNumber(new int[] { 0 }, new int[] { 7 }, 3));
		assertEquals(1, catsOnTheLineDiv1.getNumber(new int[] { 0 }, new int[] { 6 }, 2));
		assertEquals(3, catsOnTheLineDiv1.getNumber(new int[] { 4, 7, 47 }, new int[] { 4, 7, 4 }, 1));
		assertEquals(2, catsOnTheLineDiv1.getNumber(new int[] { 3, 0, 7, 10 }, new int[] { 3, 7, 4, 5 }, 2));
		assertEquals(1, catsOnTheLineDiv1.getNumber(new int[] { -5, 0, 7 }, new int[] { 47, 85, 10 }, 6));
		assertEquals(5, catsOnTheLineDiv1.getNumber(new int[] { -8, 12, -15, -20, 17, -5, 7, 10 }, new int[] { 20, 10, 7, 9, 2, 8, 11, 10 }, 2));
	}
}
