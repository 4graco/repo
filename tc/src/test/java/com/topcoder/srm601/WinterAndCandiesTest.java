package com.topcoder.srm601;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WinterAndCandiesTest {

	@Parameters
	public static Collection<int[][]> data() {
		return Arrays
				.asList(new int[][][] { { { 3 }, { 1, 3, 2 } },
						{ { 4 }, { 1, 1, 2 } },
						{ { 9 }, { 1, 3, 2, 5, 7, 4, 5, 4 } },
						{ { 62 }, { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 } },
						{ { 0 }, { 2 } } });
	}

	int expectedResult;
	int[] types;

	public WinterAndCandiesTest(int expectedResult[], int[] types) {
		this.expectedResult = expectedResult[0];
		this.types = types;
	}

	@Test
	public void testGetNumber() {
		WinterAndCandies winterAndCandies = new WinterAndCandies();
		assertEquals(expectedResult, winterAndCandies.getNumber(types));
	}

}
