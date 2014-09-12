package com.topcoder.round631;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaroGridTest {

	@Test
	public void tesTgetNumber() {
		TaroGrid taroGrid = new TaroGrid();
		assertEquals(1, taroGrid.getNumber(new String[] { "W" }));
		assertEquals(1, taroGrid.getNumber(new String[] { "WB", "BW" }));
		assertEquals(3, taroGrid.getNumber(new String[] { "BWW", "BBB", "BWB" }));
		assertEquals(3, taroGrid.getNumber(new String[] { "BWBW", "BBWB", "WWWB", "BWWW" }));
		assertEquals(3, taroGrid.getNumber(new String[] { "BWB", "BBW", "BWB" }));
		assertEquals(2, taroGrid.getNumber(new String[] { "BBWWBBWW", "BBWWBBWW", "WWBBWWBB", "WWBBWWBB", "BBWWBBWW", "BBWWBBWW", "WWBBWWBB", "WWBBWWBB" }));
	}
}
