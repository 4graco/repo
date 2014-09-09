package com.topcoder.round629;

public class CandyAddict {

	long soldForOneQuery(int x, int y, int z) {
		if (x == y) {
			return 0;
		}
		int curr = 1;
		int prev = 1;
		do {
			prev = curr;
			curr = (int) Math.floor((double) ((long) curr * (long) x) / (double) y) + 1;
		} while (curr <= z);

		long getMany = (long) x * (long) z;
		long spendOnCandy = (long) Math.floor((long) prev * (long) x / y) * y;
		return getMany - spendOnCandy;
	}

	long soldForOneQuery_(int x, int y, int z) {

		return 0;
	}

	long[] solve(int[] X, int[] Y, int[] Z) {
		int size = X.length;
		long[] Q = new long[size];

		for (int i = 0; i < size; i++) {
			Q[i] = soldForOneQuery(X[i], Y[i], Z[i]);
		}
		return Q;
	}
}
