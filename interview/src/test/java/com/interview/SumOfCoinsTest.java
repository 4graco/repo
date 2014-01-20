package com.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfCoinsTest {

	@Test
	public void testGetSumOfCoins() {
		int[] coins = new int[] { 2, 5, 6, 25, 50 };
		int k = 3;

		assertEquals(3, new SumOfCoins().getSumOfCoins(coins, k).length);
	}

}
