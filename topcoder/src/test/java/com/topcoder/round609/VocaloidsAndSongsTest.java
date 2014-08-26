package com.topcoder.round609;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VocaloidsAndSongsTest {

	@Test
	public void testCount() {
		VocaloidsAndSongs a = new VocaloidsAndSongs();
		assertEquals(6, a.count(3, 1, 1, 1));
		assertEquals(9, a.count(3, 3, 1, 1));
		assertEquals(0, a.count(50, 10, 10, 10));
		assertEquals(81451692, a.count(18, 12, 8, 9));
		assertEquals(81451692, a.count(18, 9, 8, 12));
		assertEquals(198591037, a.count(50, 25, 25, 25));

	}
}
