package com.topcoder.round633;

/*
 * Single Round Match 633 Round 1 - Division I, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13234&rd=16076
 */
public class PeriodicJumping {

	private boolean check(long max, long sum, int dist) {
		long longJump = 2 * max - sum;
		if (longJump <= dist && dist <= sum) {
			return true;
		}
		return false;
	}

	public int minimalTime(int x, int[] jumpLengths) {
		long max = 0;
		long sum = 0;
		int count = 0;
		while (!check(max, sum, Math.abs(x)) && count < jumpLengths.length) {
			int jump = jumpLengths[count % jumpLengths.length];
			max = Math.max(max, jump);
			sum += jump;
			count++;
		}
		if (check(max, sum, Math.abs(x))) {
			return count;
		}
		count = jumpLengths.length * (int) (Math.abs(x) / sum);
		sum = sum * (int) (Math.abs(x) / sum);
		while (!check(max, sum, Math.abs(x))) {
			int jump = jumpLengths[count % jumpLengths.length];
			sum += jump;
			count++;
		}

		return count;
	}
}
