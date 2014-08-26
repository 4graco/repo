package com.topcoder.round601;

import java.util.Arrays;

public class WinterAndMandarins {
	public int getNumber(int[] bags, int K) {
		Arrays.sort(bags);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= bags.length - K; i++) {
			int delta = bags[i + K - 1] - bags[i];
			if (delta < min)
				min = delta;
		}
		return min;
	}
}
