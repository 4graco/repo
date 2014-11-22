package com.topcoder.tco14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnEasyProblemTest {

	@Test
	public void testSolve() {
		AnEasyProblem anEasyProblem = new AnEasyProblem();
		assertEquals(3, anEasyProblem.solve(6));
		assertEquals(-1, anEasyProblem.solve(7));
		assertEquals(15, anEasyProblem.solve(100));
		assertEquals(1428571, anEasyProblem.solve(1000000000000l));
	}
}
