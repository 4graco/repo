package com.topcoder.round628;

/*
 * Single Round Match 628 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13280&rd=16009
 */
public class BishopMove {

	private boolean isOdd(int n) {
		return ((n & 1) == 1);
	}

	public int howManyMoves(int r1, int c1, int r2, int c2) {
		if (isOdd(r1 + c1) != isOdd(r2 + c2)) {
			return -1;
		}
		if (r1 == r2 && c1 == c2) {
			return 0;
		}
		if (((r1 - c1) == (r2 - c2)) || ((r1 + c1) == (r2 + c2))) {
			return 1;
		}
		return 2;
	}
}
