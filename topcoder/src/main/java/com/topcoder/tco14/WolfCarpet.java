package com.topcoder.tco14;

public class WolfCarpet {

	private boolean isOdd(long x) {
		return ((x & 1) == 1);
	}

	public long count(int r1, int c1, int r2, int c2) {
		long size = 0;
		long r = r2 - r1 + 1;
		long c = c2 - c1 + 1;

		long countR = (r / 2);
		if (isOdd(r) && !isOdd(r1)) {
			countR++;
		}
		long countC = c / 2;
		if (isOdd(c) && !isOdd(c1)) {
			countC++;
		}
		size = countR * (long)c + countC * ((long)r - countR);
		return size;
	}
}
