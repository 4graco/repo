package com.topcoder.round607;

public class BoundingBox {

	int getMin(int a, int b) {
		return a < b ? a : b;
	}

	int getMax(int a, int b) {
		return a > b ? a : b;
	}

	public int smallestArea(int[] X, int[] Y) {
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		for (int i = 0; i < X.length; i++) {
			minX = getMin(X[i], minX);
			minY = getMin(Y[i], minY);
			maxX = getMax(X[i], maxX);
			maxY = getMax(Y[i], maxY);
		}

		return (maxX - minX) * (maxY - minY);
	}
}
