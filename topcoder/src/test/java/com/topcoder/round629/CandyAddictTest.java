package com.topcoder.round629;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CandyAddictTest {

	@Test
	public void testSolve() {
		CandyAddict candyAddict = new CandyAddict();
		assertTrue(Arrays.equals(new long[] { 2, 1, 6, 2, 7 }, candyAddict.solve(new int[] { 5, 5, 5, 5, 5 }, new int[] { 3, 3, 3, 3, 3 }, new int[] { 1, 2, 3, 4, 5 })));
		assertTrue(Arrays.equals(
		        new long[] { 342568367000000000L, 60496729000000000L, 253614062000000001L, 773875166L, 609483745L },
		        candyAddict.solve(new int[] { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 }, new int[] { 1, 2, 3, 999999998, 999999999 }, new int[] { 342568368,
		                560496730, 586947396, 386937583, 609483745 })));
	}
}
