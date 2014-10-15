package com.topcoder.round636;

/*
 * Single Round Match 636 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13480&rd=16079
 */
public class GameOfStones {

	private boolean isOdd(int x) {
		return (x & 1) == 1;
	}

	public int count(int[] stones) {
		int sum = 0;
		boolean possible = true;
		boolean parity = isOdd(stones[0]);
		for (int stone : stones) {
			possible = possible && (parity == isOdd(stone));
			sum += stone;
		}
		int numOfStones = sum / stones.length;
		possible = possible && (parity == isOdd(numOfStones));
		if (!possible || sum % stones.length != 0) {
			return -1;
		}
		int res = 0;
		for (int stone : stones) {
			res += Math.abs(stone - numOfStones) / 2;
		}
		return res / 2;
	}
}
