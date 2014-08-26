package com.topcoder.round609;

public class PackingBallsDiv2 {

	public int minPacks(int R, int G, int B) {
		int count = 0;
		count += R / 3;
		count += G / 3;
		count += B / 3;
		R = R % 3;
		G = G % 3;
		B = B % 3;
		if (R == 0 && B == 0 && G == 0) {
			return count;
		} else if ((R == 0 && B == 0) || (B == 0 && G == 0) || (R == 0 && G == 0)) {
			count++;
			return count;
		} else {
			count += Math.max(Math.max(R, B), G);
		}
		return count;
	}
}
