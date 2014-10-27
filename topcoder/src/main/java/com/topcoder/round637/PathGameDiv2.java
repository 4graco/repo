package com.topcoder.round637;

/*
 * Single Round Match 637 Round 1 - Division II, Level Two
 * http://community.topcoder.com/stat?c=problem_statement&pm=13506&rd=16080
 */
public class PathGameDiv2 {

	public int calc(String[] board) {

		int count = 0;
		int prBlack = -1;
		for (int i = 0; i < board[0].length(); i++) {
			if (board[0].charAt(i) == board[1].charAt(i)) {
				count++;
				continue;
			}
			if (prBlack != -1 && board[prBlack].charAt(i) != '#') {
				count--;
			}
			prBlack = (board[0].charAt(i) == '#') ? 0 : 1;
		}
		return count;
	}
}
