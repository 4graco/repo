package com.topcoder.tco14;

public class WolfInDarkRoom {

	private boolean getBoard(int N, int M, int r, int c) {
		return (r == N - 1 || r == 0 || c == 0 || c == M - 1);
	}

	private boolean isSameBoard(int N, int M, int newR, int newC, int oldR,
			int oldC) {
		return (newR == oldR && (newR == 0 || newR == N - 1))
				|| (newC == oldC && (newC == 0 || newC == M - 1));
	}

	public int count(int N, int M, int r, int c) {
		int bordSize = 2 * N + 2 * (M - 2);
		int cellCount = bordSize;
		int k = 1;
		if (!getBoard(N, M, r, c)) {
			cellCount++;
		}

		int maxLength = Math.max(N, M);
		while (k <= maxLength) {
			int cell = 0;
			int oldR = r;
			int oldC = c;
			int steps = (k - 1) % 4;
			if (steps == 0) {
				cell = Math.min(k, N - r - 1);
				r += cell;
			}
			if (steps == 1) {
				cell = Math.min(k, c);
				c -= cell;
			}
			if (steps == 2) {
				cell = Math.min(k, r);
				r -= cell;
			}
			if (steps == 3) {
				cell = Math.min(k, M - c - 1);
				c += cell;
			}
			r = Math.min(r, N-1);
			c = Math.min(c, M-1);

			if (!isSameBoard(N, M, r, c, oldR, oldC)) {
				cellCount += cell;
				if (getBoard(N, M, r, c) && cell > 0) {
					cellCount--;
				}
			}
			k++;
		}
		return cellCount;
	}
}
