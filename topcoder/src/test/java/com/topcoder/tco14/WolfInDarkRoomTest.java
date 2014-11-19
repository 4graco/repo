package com.topcoder.tco14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WolfInDarkRoomTest {

	@Test
	public void testCount() {
		WolfInDarkRoom wolfInDarkRoom = new WolfInDarkRoom();
		assertEquals(8, wolfInDarkRoom.count(3, 3, 0, 0));
		assertEquals(9, wolfInDarkRoom.count(3, 3, 0, 2));
		assertEquals(30, wolfInDarkRoom.count(10, 4, 2, 3));
		assertEquals(292, wolfInDarkRoom.count(30, 18, 17, 11));
		assertEquals(793, wolfInDarkRoom.count(49, 40, 20, 2));
	}
}
