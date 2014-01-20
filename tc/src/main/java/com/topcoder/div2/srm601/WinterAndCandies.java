package com.topcoder.div2.srm601;

public class WinterAndCandies {
	public int getNumber(int[] types) {
		int[] countArr = new int[50];
		for (int i = 0; i < types.length; i++) {
			countArr[types[i] - 1]++;
		}
		int sum = countArr[0];
		int mult = countArr[0];
		for (int i = 1; sum != 0 && countArr[i] != 0 && i < countArr.length; i++) {
			mult *= countArr[i];
			sum += mult;
		}
		return sum;
	}
}
