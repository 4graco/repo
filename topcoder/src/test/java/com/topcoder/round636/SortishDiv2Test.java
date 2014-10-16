package com.topcoder.round636;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortishDiv2Test {

	@Test
	public void testCount() {
		SortishDiv2 sortishDiv2 = new SortishDiv2();
		assertEquals(2, sortishDiv2.ways(5, new int[] { 4, 0, 0, 2, 0 }));
		assertEquals(5, sortishDiv2.ways(4, new int[] { 0, 0, 0, 0 }));
		assertEquals(1, sortishDiv2.ways(2, new int[] { 1, 3, 2 }));
		assertEquals(0, sortishDiv2.ways(2, new int[] { 1, 2, 0, 5, 0, 0 }));
	}
}
