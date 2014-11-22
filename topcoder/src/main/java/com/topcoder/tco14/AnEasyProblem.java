package com.topcoder.tco14;

public class AnEasyProblem {

	private long getArithmeticProgrSum(long first, long last, long numOfEl) {
		long sum = (first + last) * numOfEl / 2l;
		return (numOfEl > 0) ? sum : 0;
	}

	private int getMaxH(long sum) {
		int tmpH = (int) Math.ceil(Math.sqrt(2) * Math.sqrt(sum) - 1d / 2d);
		while (getArithmeticProgrSum(1, tmpH, tmpH) < sum) {
			tmpH++;
		}
		return tmpH;
	}

	public int solve(long sum) {
		int count = -1;
		int h = getMaxH(sum);
		int r = h;
		while (r >= 1) {
			long tmpSum = 0;
			tmpSum = getArithmeticProgrSum(1, h, h);
			if (2 * tmpSum < sum) {
				break;
			}
			tmpSum += getArithmeticProgrSum(h - 1, r, h - r);
			if (tmpSum == sum) {
				count = 2 * h - r;
				break;
			} else if (tmpSum > sum) {
				h--;
			} else if (tmpSum < sum) {
				r--;
			}
		}
		return count;
	}
}
