package com.topcoder.tco14;

public class WolfPrefix {

	final static int MODULO = 1000000007;

	private int getCountOfPrefix(String[] S, int index) {
		int numOfString = S.length;
		String name = S[index];
		boolean findMatch = false;
		while (!findMatch && name.length() > 0) {
			for (int i = 0; i < numOfString; i++) {
				if (i == index) {
					continue;
				}
				if (S[i].length() >= name.length()
						&& S[i].substring(0, name.length()).equals(name)) {
					findMatch = true;
				}
			}
			if (!findMatch) {
				name = name.substring(0, name.length() - 1);
			}
		}
		return S[index].length() - name.length();
	}

	public int count(String[] S) {

		long res = 1;
		int numOfString = S.length;
		for (int i = 0; i < numOfString; i++) {
			int count = getCountOfPrefix(S, i);
			res = (res * (long) count) % MODULO;
		}
		return (int) res;
	}
}
