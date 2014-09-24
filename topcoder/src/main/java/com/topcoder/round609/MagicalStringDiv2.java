package com.topcoder.round609;

/*
 * Single Round Match 609 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13004&rd=15842
 */
public class MagicalStringDiv2 {

	public int minimalMoves(String S) {
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (i < S.length() / 2 && S.charAt(i) == '<') {
				count++;
			}
			if (i >= S.length() / 2 && S.charAt(i) == '>') {
				count++;
			}
		}
		return count;
	}

}
