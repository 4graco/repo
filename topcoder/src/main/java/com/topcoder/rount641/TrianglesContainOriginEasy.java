package com.topcoder.rount641;

/*
 * Single Round Match 641 Round 1 - Division II, Level Two
 * http://community.topcoder.com/stat?c=problem_statement&pm=13547&rd=16084
 */
public class TrianglesContainOriginEasy {

	private int getSign(int x1, int y1, int x2, int y2) {
		return y1*x2 - x1*y2;
	}

	private boolean isInTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		int sign1 = getSign(x1, y1, x2, y2);
		int sign2 = getSign(x3, y3, x1, y1);
		int sign3 = getSign(x2, y2, x3, y3);
		if ((sign1 >= 0 && sign2 > 0 && sign3 > 0)
				|| (sign1 < 0 && sign2 < 0 && sign3 < 0)) {
			return true;
		}
		return false;
	}

	public int count(int[] x, int[] y) {
		int count = 0;
		int size = x.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					if (isInTriangle(x[i], y[i], x[j], y[j], x[k], y[k])) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
