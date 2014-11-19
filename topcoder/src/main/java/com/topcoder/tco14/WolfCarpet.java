package com.topcoder.tco14;

public class WolfCarpet {

	private boolean isOdd(long x) {
		return ((x & 1) == 1);
	}

	private long countEvenIndex(int x1, int x2) {
		long x = x2 - x1 + 1;
		long count = (x / 2);
		if (isOdd(x) && !isOdd(x1)) {
			count++;
		}
		return count;
	}

	public long count(int r1, int c1, int r2, int c2) {
		long size = 0;
		long r = r2 - r1 + 1;
		long c = c2 - c1 + 1;

		long countR = countEvenIndex(r1, r2);
		long countC = countEvenIndex(c1, c2);
		
		size = countR * (long) c + countC * ((long) r - countR);
		return size;
	}
}
