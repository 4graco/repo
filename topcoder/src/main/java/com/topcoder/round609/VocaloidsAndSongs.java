package com.topcoder.round609;

/*
 * Single Round Match 609 Round 1 - Division II, Level Three
 * http://community.topcoder.com/stat?c=problem_statement&pm=12989&rd=15842
 */
public class VocaloidsAndSongs {

	static int MODULO = 1000000007;

	private int correctModulo(long res) {
		int ret = (res < MODULO) ? (int) res : (int) (res % MODULO);
		return ret;
	}

	private int binomialCoefficient(int n, int k) {
		if (k > n || k < 0) {
			return 0;
		}
		long res = 1;
		boolean[] arr = new boolean[k];
		int countDiv = 0;
		for (int i = n; i >= n - k + 1; i--) {
			res *= i;
			if (countDiv < k) {
				for (int j = k; j > 0; j--) {
					if (!arr[j - 1] && res % j == 0) {
						res = res / j;
						arr[j - 1] = true;
						countDiv++;
					}
				}
			} else {
				res = correctModulo(res);
			}
		}
		res = correctModulo(res);
		return (int) res;
	}

	public int count(int S, int gumi, int ia, int mayu) {
		long songByIAmdMayu = 0;
		for (int i = Math.min(S - gumi, ia); i >= 0; i--) {
			if (ia - i > gumi) {
				break;
			}

			if (S - gumi - i <= mayu) {
				int emptyPosLeft = S - gumi - i;
				long songByMayu = binomialCoefficient(gumi + i, mayu - emptyPosLeft);
				songByIAmdMayu += correctModulo(correctModulo((long) binomialCoefficient(S - gumi, i) * (long) binomialCoefficient(gumi, ia - i)) * songByMayu);
				songByIAmdMayu = correctModulo(songByIAmdMayu);
			}
		}
		int countAlb = correctModulo(binomialCoefficient(S, gumi) * songByIAmdMayu);
		return countAlb;
	}
}
