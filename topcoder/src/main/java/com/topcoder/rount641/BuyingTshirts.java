package com.topcoder.rount641;

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
