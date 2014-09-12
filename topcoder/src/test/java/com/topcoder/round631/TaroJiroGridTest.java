package com.topcoder.round631;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaroJiroGridTest {

	@Test
	public void tesTgetNumber() {
		TaroJiroGrid taroJiroGrid = new TaroJiroGrid();
		assertEquals(1, taroJiroGrid.getNumber(new String[] { "WB", "BB" }));
		assertEquals(1, taroJiroGrid.getNumber(new String[] { "WB", "WW" }));
		assertEquals(2, taroJiroGrid.getNumber(new String[] { "WB", "WB" }));
		assertEquals(2, taroJiroGrid.getNumber(new String[] { "WBBW", "WBWB", "WWBB", "BWWW" }));
		assertEquals(1, taroJiroGrid.getNumber(new String[] { "WBBWBB", "BBWBBW", "WWBWBW", "BWWBBB", "WBWBBW", "WWWBWB" }));
	}
}
