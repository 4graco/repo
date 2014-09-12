package com.topcoder.round631;

import java.util.Arrays;

/*
 * Single Round Match 631 Round 1 - Division I, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13393&rd=16062
 */
public class TaroJiroGrid {

	private boolean isCorrect(String[] grid) {
		for (int i = 0; i < grid[0].length(); i++) {
			int count = 1;
			String prev = grid[0];
			String curr;
			for (int j = 1; j < grid.length; j++) {
				curr = grid[j];
				if (prev.charAt(i) == curr.charAt(i)) {
					count++;
				} else {
					if (count > grid.length / 2) {
						return false;
					}
					count = 1;
				}
				prev = curr;
			}
			if (count > grid.length / 2) {
				return false;
			}
		}

		return true;
	}

	public int getNumber(String[] grid) {
		if (isCorrect(grid)) {
			return 0;
		}

		for (int i = 0; i < grid.length; i++) {
			String temp = grid[i];
			char[] chars = new char[temp.length()];
			Arrays.fill(chars, 'W');
			grid[i] = new String(chars);
			if (isCorrect(grid)) {
				return 1;
			}
			Arrays.fill(chars, 'B');
			grid[i] = new String(chars);
			if (isCorrect(grid)) {
				return 1;
			}
			grid[i] = temp;
		}
		return 2;
	}
}
