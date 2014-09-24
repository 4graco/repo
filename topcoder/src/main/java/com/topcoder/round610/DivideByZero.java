package com.topcoder.round610;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Single Round Match 610 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=12911&rd=15843
 */
public class DivideByZero {

	public int CountNumbers(int[] numbers) {
		Set<Integer> nums = new LinkedHashSet<>();
		Set<Integer> newOnes;

		for (int i : numbers) {
			nums.add(i);
		}

		do {
			newOnes = new LinkedHashSet<>();
			for (int i : nums) {
				for (int j : nums) {
					if (i != j) {
						int res = Math.max(i, j) / Math.min(i, j);
						if (!nums.contains(res)) {
							newOnes.add(res);
						}
					}
				}
			}
			nums.addAll(newOnes);
		} while (!newOnes.isEmpty());

		return nums.size();
	}
}
