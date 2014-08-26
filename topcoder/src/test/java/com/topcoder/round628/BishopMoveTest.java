package com.topcoder.round628;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BishopMoveTest {

	@Test
	public void testHowManyMoves() {
		BishopMove a = new BishopMove();
		assertEquals(1, a.howManyMoves(4, 6, 7, 3));
		assertEquals(0, a.howManyMoves(2, 5, 2, 5));
		assertEquals(2, a.howManyMoves(1, 3, 5, 5));
		assertEquals(-1, a.howManyMoves(4, 6, 7, 4));
	}

}
