package com.topcoder.round629;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleCoveringEasyTest {

	@Test
	public void testSolve() {
		RectangleCoveringEasy a = new RectangleCoveringEasy();
		assertEquals(-1, a.solve(1, 1, 1, 1));
		assertEquals(1, a.solve(3, 5, 4, 6));
		assertEquals(1, a.solve(10, 20, 25, 15));
		assertEquals(1, a.solve(3, 10, 3, 12));
	}
}
