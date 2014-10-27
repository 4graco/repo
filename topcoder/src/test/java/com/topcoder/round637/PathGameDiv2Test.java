package com.topcoder.round637;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PathGameDiv2Test {

	@Test
	public void testCalc() {
		PathGameDiv2 PathGameDiv2 = new PathGameDiv2();
		assertEquals(2, PathGameDiv2.calc(new String[] { "#....", "...#." }));
		assertEquals(0, PathGameDiv2.calc(new String[] { "#", "." }));
		assertEquals(1, PathGameDiv2.calc(new String[] { ".", "." }));
		assertEquals(13, PathGameDiv2.calc(new String[] { "....#.##.....#...........", "..#......#.......#..#...." }));
	}
}
