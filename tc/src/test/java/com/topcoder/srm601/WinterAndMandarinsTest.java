package com.topcoder.srm601;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WinterAndMandarinsTest {

	@Parameters
	public static Collection<int[][]> data() {
		return Arrays.asList(new int[][][] { { { 10 }, { 10, 20, 30 }, { 2 } },
				{ { 3 }, { 4, 7, 4 }, { 3 } },
				{ { 2 }, { 4, 1, 2, 3 }, { 3 } },
				{ { 1 }, { 5, 4, 6, 1, 9, 4, 2, 7, 5, 6 }, { 4 } },
				{ { 27 }, { 47, 1000000000, 1, 74 }, { 2 } } });
	}

	int expectedResult;
	int[] bags;
	int K;

	public WinterAndMandarinsTest(int[] expectedResult, int[] bags, int[] K) {
		this.expectedResult = expectedResult[0];
		this.bags = bags;
		this.K = K[0];
	}

	@Test
	public void testGetNumber() {
		WinterAndMandarins wam = new WinterAndMandarins();
		assertEquals(expectedResult, wam.getNumber(bags, K));
	}

}
