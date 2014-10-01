package com.topcoder.round632;

/*
 * Single Round Match 632 Round 1 - Division I, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13389&rd=16075
 */
public class PotentialArithmeticSequence {

	private int pow2(int pow) {
		return (int) Math.pow(2, pow);
	}

	private int getNextMaxPos(int maxPos, int[] d) {
		return maxPos + pow2(d[maxPos]);
	}

	private boolean isRightNumForSeq(int posInSeq, int i, int[] d) {
		int count = 0;
		while ((posInSeq & 1) == 0) {
			count++;
			posInSeq = posInSeq >> 1;
		}
		return count == d[i];
	}

	public int numberOfSubsequences(int[] d) {
		if (d.length == 1) {
			return 1;
		}

		int resNum = 1;
		int maxPos = 0;
		int countFrom = 0;
		for (int i = 1; i < d.length; i++) {
			int numInSeq = i - countFrom;
			if (d[i] > d[maxPos] && i == getNextMaxPos(maxPos, d)) {
				maxPos = i;
				resNum += numInSeq + 1;
				continue;
			}
			if ((d[i] < d[maxPos]) && isRightNumForSeq(i - maxPos, i, d)) {
				resNum += numInSeq + 1;
				continue;
			}

			boolean findNextMax = true;
			while (findNextMax && maxPos < i) {
				findNextMax = false;
				for (int j = maxPos + 1; j <= i; j++) {
					if ((i <= getNextMaxPos(j, d)) || (i == j)) {
						countFrom = maxPos + 1;
						maxPos = j;
						for (int k = j; k < i; k++) {
							if ((d[k] >= d[maxPos]) || isRightNumForSeq(k - j, k, d)) {
								break;
							}
						}
						break;
					}
				}
				if (d[i] > d[maxPos] && i == getNextMaxPos(maxPos, d)) {
					maxPos = i;
				} else if (d[i] == d[maxPos] || !isRightNumForSeq(i - maxPos, i, d)) {
					findNextMax = true;
				}
			}
			resNum += i - countFrom + 1;
		}
		return resNum;
	}
}
