package com.topcoder.round632;

/*
 *  Single Round Match 632 Round 1 - Division II, Level Two
 *  http://community.topcoder.com/stat?c=problem_statement&pm=13390&rd=16075
 */
public class PotentialGeometricSequence {

	public int numberOfSubsequences(int[] d) {
		if (d.length <= 1) {
			return d.length;
		}

		int res = 3;
		int count = 2;
		int dif = d[0] - d[1];
		for (int i = 2; i < d.length; i++) {
			int currDif = d[i - 1] - d[i];
			if (currDif == dif) {
				count++;
			} else {
				dif = currDif;
				count = 2;
			}
			res += count;
		}
		return res;
	}
}
