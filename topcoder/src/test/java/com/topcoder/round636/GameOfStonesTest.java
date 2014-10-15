package com.topcoder.round636;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfStonesTest {

	@Test
	public void testCount() {
		GameOfStones gameOfStones = new GameOfStones();
		assertEquals(3, gameOfStones.count(new int[] { 7, 15, 9, 5 }));
		assertEquals(-1, gameOfStones.count(new int[] { 10, 16 }));
		assertEquals(-1, gameOfStones.count(new int[] { 2, 8, 4 }));
		assertEquals(0, gameOfStones.count(new int[] { 17 }));
		assertEquals(-1, gameOfStones.count(new int[] { 10, 15, 20, 12, 1, 20 }));
	}
}
