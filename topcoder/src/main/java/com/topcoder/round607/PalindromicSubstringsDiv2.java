package com.topcoder.round607;

import java.util.ArrayList;
import java.util.HashMap;

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

	boolean isPalindromic(String s, int beg, int end) {
		boolean res = true;
		for (int i = 0; i < (end - beg + 1) / 2; i++) {
			if (s.charAt(beg + i) != s.charAt(end - i)) {
				res = false;
				break;
			}
		}
		return res;
	}

	public int count(String[] S1, String[] S2) {

		String str = concatStr(S1, S2);
		HashMap<Character, ArrayList<Integer>> letterPosition = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (letterPosition.containsKey(str.charAt(i))) {
				letterPosition.get(str.charAt(i)).add(i);
			} else {
				ArrayList<Integer> newList = new ArrayList<>();
				newList.add(i);
				letterPosition.put(str.charAt(i), newList);
			}
		}

		int numOfPalStr = str.length();
		for (ArrayList<Integer> posList : letterPosition.values()) {
			for (int j = 0; j < posList.size(); j++) {
				for (int k = j + 1; k < posList.size(); k++) {
					if (isPalindromic(str, posList.get(j), posList.get(k))) {
						numOfPalStr++;
					}
				}
			}
		}

		return numOfPalStr;
	}
}
