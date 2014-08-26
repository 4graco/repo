package com.topcoder.round602;

public class BlackBoxDiv2 {

	static int MODULO = 1000000007;

	private int correctModulo(long res) {
		int ret = (res < MODULO) ? (int) res : (int) (res % MODULO);
		return ret;
	}

	private int getSize(String s) {
		int size = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B') {
				size++;
			}
		}
		return size;
	}

	private int binomialCoefficient(int n, int k) {
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

	private int addPerm(int[][] a, int i, int j) {
		long res = 0;
		for (int k = 1; k < i; k++) {
			res += correctModulo((long) correctModulo((long) Math.pow(2, i - k)) * (long) correctModulo((long) a[i - k][j - 1] * (long) binomialCoefficient(i, i - k)));
			res = correctModulo(res);
		}

		return correctModulo(res);
	}

	public int count(String front, String side) {
		int n = getSize(front) + 1, m = getSize(side) + 1;
		if (n > m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		int[][] a = new int[n][m];
		if (n == 1 && m == 1) {
			return 1;
		} else if (n == 1 || m == 1) {
			return 0;
		} else if (n == 2 || m == 2) {
			return 1;
		}

		a[0][0] = 1;
		a[1][1] = 1;
		for (int i = 1; i < n; i++) {
			a[i][0] = 0;
			a[i][1] = 1;
		}
		for (int j = 1; j < m; j++) {
			a[0][j] = 0;
			a[1][j] = 1;
		}

		for (int i = 2; i < n; i++) {
			for (int j = i; j < m; j++) {
				a[i][j] = correctModulo((long) correctModulo(a[i][j - 1] * ((long) correctModulo((long) Math.pow(2, i) - 1))) + (long) (addPerm(a, i, j)));
				if (j < n) {
					a[j][i] = a[i][j];
				}
			}
		}

		return a[n - 1][m - 1];
	}
}
