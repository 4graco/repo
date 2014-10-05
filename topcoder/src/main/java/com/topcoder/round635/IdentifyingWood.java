package com.topcoder.round635;

/*
 * Single Round Match 635 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13487&rd=16078
 */
public class IdentifyingWood {

	static final String OK = "Yep, it's wood.";
	static final String NOPE = "Nope.";

	public String check(String s, String t) {
		char[] first = s.toCharArray();
		char[] second = t.toCharArray();

		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (first[i] == second[j]) {
				j++;
			}
			if (j >= t.length()) {
				return OK;
			}
		}
		return NOPE;
	}
}
