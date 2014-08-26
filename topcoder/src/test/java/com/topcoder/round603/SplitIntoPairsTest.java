package com.topcoder.round603;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplitIntoPairsTest {

	@Test
	public void testMakepairs() {
		assertEquals(0, new SplitIntoPairs().makepairs(new int[] { 2, -1 }, -1));
	}

}
