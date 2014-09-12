package com.topcoder.round631;

/*
 *  Single Round Match 631 Round 1 - Division II, Level One
 *  http://community.topcoder.com/stat?c=problem_statement&pm=13394&rd=16062
 */
public class TaroGrid {

	public int getNumber(String[] grid) {
		int max = 1;
		for (int i = 0; i < grid[0].length(); i++) {
			int count = 1;
			String prev = grid[0];
			String curr;
			for (int j = 1; j < grid.length; j++) {
				curr = grid[j];
				if (prev.charAt(i) == curr.charAt(i)) {
					count++;
				} else {
					if (count > max) {
						max = count;
					}
					count = 1;
				}
				prev = curr;
			}
			if (count > max) {
				max = count;
			}
		}
		return max;
	}
}
