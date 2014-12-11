package com.topcoder.rount641;

/*
 * Single Round Match 641 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13548&rd=16084
 */
public class BuyingTshirts {

	public int meet(int T, int[] Q, int[] P) {
		int days = 0;
		int sumQ = 0;
		int sumP = 0;
		for (int i = 0; i < Q.length; i++) {
			sumQ += Q[i];
			sumP += P[i];
			if (sumQ >= T && sumP >= T) {
				days++;
				sumQ -= T;
				sumP -= T;
			} else {
				if (sumQ >= T) {
					sumQ -= T;
				}
				if (sumP >= T) {
					sumP -= T;
				}
			}
		}
		return days;
	}
}
