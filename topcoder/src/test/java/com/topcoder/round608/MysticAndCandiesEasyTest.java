package com.topcoder.round608;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MysticAndCandiesEasyTest {

	@Parameters
	public static Collection<int[][]> data() {
		return Arrays.asList(new int[][][] {
		        { { 1 }, { 10 }, { 10 }, { 20 } },
		        { { 4 }, { 10 }, { 7 }, { 3, 3, 3, 3, 3 } },
		        { { 3 }, { 100 }, { 63 }, { 12, 34, 23, 45, 34 } },
		        { { 22 }, { 19 }, { 12 }, { 12, 9, 15, 1, 6, 4, 9, 10, 10, 10, 14, 14, 1, 1, 12, 10, 9, 2, 3, 6, 1, 7, 3, 4, 10, 3, 14 } },
		        {
		                { 15 },
		                { 326 },
		                { 109 },
		                { 9, 13, 6, 6, 6, 16, 16, 16, 10, 16, 4, 3, 10, 8, 11, 17, 12, 5, 7, 8, 7, 4, 15, 7, 14, 2, 2, 1, 17, 1, 7, 7, 12, 17, 2, 9, 7, 1, 8, 16, 7, 4, 16, 2, 13,
		                        3, 13, 1, 17, 6 } } });
	}

	int expectedResult, c, x;
	int[] high;

	public MysticAndCandiesEasyTest(int[] expectedResult, int[] c, int[] x, int[] high) {
		this.expectedResult = expectedResult[0];
		this.c = c[0];
		this.x = x[0];
		this.high = high;
	}

	@Test
	public void testMinBoxes() {
		MysticAndCandiesEasy mysticAndCandies = new MysticAndCandiesEasy();
		assertEquals(expectedResult, mysticAndCandies.minBoxes(c, x, high));
	}
}
