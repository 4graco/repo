package com.topcoder.round608;

import java.util.Arrays;

public class MysticAndCandiesEasy {

	public int minBoxes(int C, int X, int[] high) {
		Arrays.sort(high);

		int left = C - X;
		int i;
		for (i = 0; i < high.length && left > 0; i++) {
			left = left - high[i];
			if (left < 0) {
				break;
			}
		}

		return high.length - i;
	}
}
