package com.topcoder.round637;

/*
 * Single Round Match 637 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13505&rd=16080
 */
public class GreaterGameDiv2 {

	public int calc(int[] snuke, int[] sothe) {
		int count = 0;
		for (int i = 0; i < snuke.length; i++) {
			if (snuke[i] > sothe[i]) {
				count++;
			}
		}
		return count;
	}
}
