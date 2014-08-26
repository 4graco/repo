package com.topcoder.round602;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BlackBoxDiv2Test {

	@Parameters
	public static Collection<String[]> data() {
		return Arrays.asList(new String[][] { { "7", "BB", "BB" }, { "25", "BB", "BBB" }, { "1", "...", "....." }, { "0", "...", "BBB" }, { "16081", "...BB.B....", "B.B.B.B.B" },
		        { "771030153", "BBBBB.BBBBBBBBB.BBBBBBB.BBBB.B.BB..BB.B.BBBBBBBBBB", ".B.BBB..BBBBBB.BBBB.B...BBBB.BB.BBBBBBBBBB.....BBB" },
		        { "795333334", "BBBB...BB.BBB.BBBBBB.BBBB..BB.BB..BBBB.BBBBBBB..B.", "BBBBBBBBBBBBBBBBBBBBBBBBBBB..BBBBBBBBBBBBBBB.BBBB" }, });
	}

	String front, side;
	int expectedResult;

	public BlackBoxDiv2Test(String expectedResult, String front, String side) {
		this.expectedResult = Integer.parseInt(expectedResult);
		this.front = front;
		this.side = side;
	}

	@Test
	public void testCount() {
		BlackBoxDiv2 bb = new BlackBoxDiv2();
		assertEquals(expectedResult, bb.count(front, side));
	}
}
