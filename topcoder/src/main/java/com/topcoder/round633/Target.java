package com.topcoder.round633;

/*
 * Single Round Match 633 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13462&rd=16076
 */
public class Target {

	private boolean isOdd(int x) {
		return (x & 1) == 1;
	}

	public String[] draw(int n) {
		char[][] tar = new char[n][n];
		for (int i = 0; i < n / 2 + 1; i++) {
			for (int j = 0; j < n / 2 + 1; j++) {
				char ch = isOdd(Math.min(i, j)) ? ' ' : '#';
				tar[i][j] = tar[n - i - 1][n - j - 1] = tar[n - i - 1][j] = tar[i][n - j - 1] = ch;
			}
		}
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = new String(tar[i]);
		}

		return res;
	}
}
