package com.topcoder.round633;

/*
 * Single Round Match 633 Round 1 - Division II, Level Two
 * http://community.topcoder.com/stat?c=problem_statement&pm=13463&rd=16076
 */
public class Jumping {

	private final String ABLE = "Able";
	private final String NOTABLE = "Not able";

	public String ableToGet(int x, int y, int[] jumpLengths) {
		long dist = x * x + y * y;
		long max = 0;
		long sum = 0;
		for (int jumpLength : jumpLengths) {
			max = Math.max(max, jumpLength);
			sum += jumpLength;
		}
		long getAway = 2 * max - sum;
		if (getAway > 0) {
			getAway = getAway * getAway;
		}
		long asFarCanGet = sum * sum;
		if (getAway <= dist && asFarCanGet >= dist) {
			return ABLE;
		}
		return NOTABLE;
	}
}
