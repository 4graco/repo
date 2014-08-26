package com.topcoder.round608;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OneDimensionalRobotEasyTest {

	@Test
	public void testFinalPosition() {
		assertEquals(2, new OneDimensionalRobotEasy().finalPosition("RRLRRLLR", 10, 10));

	}

}
