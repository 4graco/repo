package com.topcoder.round606;

import java.util.Arrays;

public class EllysSubstringSorter {

	String sortSubString(String S, int L, int beg, int end) {
		String resStr;
		char[] chArray = S.substring(beg, end).toCharArray();
		Arrays.sort(chArray);
		resStr = S.substring(0, beg) + new String(chArray) + S.substring(end, S.length());

		return resStr;
	}

	public String getMin(String S, int L) {
		String minStr = S;
		for (int i = 0; i < S.length() - L + 1; i++) {
			String curStr = sortSubString(S, L, i, i + L);
			if (curStr.compareTo(minStr) < 0) {
				minStr = curStr;
			}
		}
		return minStr;
	}

	public static void main(String[] args) {
		long time;
		String answer;
		String desiredAnswer;

		// <%:start-tests%>
		time = System.currentTimeMillis();

		answer = new EllysSubstringSorter().getMin("EEZFSLIPRLZGUKFGGZGGZFYBZYUXGPNTIDXFZTRL", 39);
		desiredAnswer = "BDEEFFFFGGGGGGIIKLLNPPRRSTTUUXXYYZZZZZZL";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}

		answer = new EllysSubstringSorter().getMin("ZZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2);
		desiredAnswer = "ZAZAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}

		answer = new EllysSubstringSorter().getMin("AAAAAAAAAAAAAAAAAACB", 13);
		desiredAnswer = "AAAAAAAAAAAAAAAAAABC";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}

		answer = new EllysSubstringSorter().getMin("WITHOUTITIMJUSTESPRIT", 21);
		desiredAnswer = "EHIIIIJMOPRSSTTTTTUUW";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}

		answer = new EllysSubstringSorter().getMin("TOPCODER", 4);
		System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
		desiredAnswer = "COPTODER";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}
		System.out.println();
		time = System.currentTimeMillis();
		answer = new EllysSubstringSorter().getMin("ESPRIT", 3);
		System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
		desiredAnswer = "EPRSIT";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}
		System.out.println();
		time = System.currentTimeMillis();
		answer = new EllysSubstringSorter().getMin("AAAAAAAAA", 2);
		System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
		desiredAnswer = "AAAAAAAAA";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}
		System.out.println();
		time = System.currentTimeMillis();
		answer = new EllysSubstringSorter().getMin("ABRACADABRA", 5);
		System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
		desiredAnswer = "AAABCRDABRA";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}
		System.out.println();
		time = System.currentTimeMillis();
		answer = new EllysSubstringSorter().getMin("BAZINGA", 6);
		System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
		desiredAnswer = "ABGINZA";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}
		System.out.println();
		time = System.currentTimeMillis();
		answer = new EllysSubstringSorter().getMin("AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD", 21);
		System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
		desiredAnswer = "AAAAAABDDDEEIIIJOOSUWWWWDBPOAWDUISAWDOOPAWD";
		System.out.println("Your answer:");
		System.out.println("\t\"" + answer + "\"");
		System.out.println("Desired answer:");
		System.out.println("\t\"" + desiredAnswer + "\"");
		if (!answer.equals(desiredAnswer)) {
			System.out.println("DOESN'T MATCH!!!!");
		} else {
			System.out.println("Match :-)");
		}
		System.out.println();
	}
}
