package com.topcoder.round607;

public class PalindromicSubstringsDiv2 {

	String concatStr(String[] S1, String[] S2) {
		String res = "";
		for (String element : S1) {
			res = res + element;
		}
		for (String element : S2) {
			res = res + element;
		}
		return res;
	}

	public int count(String[] S1, String[] S2) {
		String str = concatStr(S1, S2);
		int countStr = str.length();

		for (int i = 1; i < str.length(); i++) {
			for (int j = 1; i + j < str.length() && i - j >= 0; j++) {
				if (str.charAt(i + j) == str.charAt(i - j)) {
					countStr++;
				} else {
					break;
				}
			}
			for (int j = 1; i + j - 1 < str.length() & i - j >= 0; j++) {
				if (str.charAt(i + j - 1) == str.charAt(i - j)) {
					countStr++;
				} else {
					break;
				}
			}
		}

		return countStr;
	}
}
