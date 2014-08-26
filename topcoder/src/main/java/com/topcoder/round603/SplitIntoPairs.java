package com.topcoder.round603;

public class SplitIntoPairs {

	boolean isOdd(int a) {
		return (a & 1) == 1;
	}

	public int makepairs(int[] A, int X) {
		int res = A.length / 2;
		int count = 0, minNeg = Integer.MIN_VALUE, minPos = Integer.MAX_VALUE;

		for (int element : A) {
			if (element < 0) {
				count++;
				if (minNeg < element) {
					minNeg = element;
				}
			} else {
				if (minPos > element) {
					minPos = element;
				}
			}
		}
		if (isOdd(count) && ((long) minPos * (long) minNeg < X)) {
			res -= 1;
		}

		return res;
	}
}
