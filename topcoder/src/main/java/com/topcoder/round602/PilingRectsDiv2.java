package com.topcoder.round602;

public class PilingRectsDiv2 {

	public int getmax(int[] X, int[] Y, int limit) {
		int maxOverlapCount = 0;
		for (int i = 0; i < X.length; i++) {
			int currentOverlapCount = 0;
			int currentX = X[i], currentY = Y[i];
			for (int j = 0; j < X.length; j++) {
				int currentXX = Math.min(currentX, X[j]) * Math.min(currentY, Y[j]);
				int currentXY = Math.min(currentX, Y[j]) * Math.min(currentY, X[j]);
				if (currentXX > currentXY) {
					if (currentXX >= limit) {
						currentX = Math.min(currentX, X[j]);
						currentY = Math.min(currentY, Y[j]);
						currentOverlapCount++;
					}
				} else {
					if (currentXY >= limit) {
						currentX = Math.min(currentX, Y[j]);
						currentY = Math.min(currentY, X[j]);
						currentOverlapCount++;
					}
				}
			}
			if (currentOverlapCount > maxOverlapCount) {
				maxOverlapCount = currentOverlapCount;
			}
		}
		return maxOverlapCount == 0 ? -1 : maxOverlapCount;
	}
}
