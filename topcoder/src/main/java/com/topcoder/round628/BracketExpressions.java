package com.topcoder.round628;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * Single Round Match 628 Round 1 - Division II, Level Two
 * http://community.topcoder.com/stat?c=problem_statement&pm=13243&rd=16009
 */
public class BracketExpressions {

	private static final Map<Character, Character> pairBrackets = new HashMap<>();

	static {
		pairBrackets.put('{', '}');
		pairBrackets.put('(', ')');
		pairBrackets.put('[', ']');
	}

	private boolean isOpen(char bracket) {
		return pairBrackets.containsKey(bracket);
	}

	private boolean isClose(char bracket) {
		return pairBrackets.containsValue(bracket);
	}

	private char getClosedBracket(char bracket) {
		return pairBrackets.get(bracket);
	}

	public String ifPossible(String expression) {
		if (expression.isEmpty()) {
			return "possible";
		}
		if ((expression.length() & 1) == 1) {
			return "impossible";
		}

		Stack<Integer> next = new Stack<Integer>();
		next.push(0);
		while ((!next.empty()) && (next.peek() < expression.length())) {
			int nextCheck = next.pop();
			if (expression.charAt(nextCheck) == 'X') {
				next.addAll(ifPossible(expression.toCharArray(), '(', nextCheck + 1));
				next.addAll(ifPossible(expression.toCharArray(), '{', nextCheck + 1));
				next.addAll(ifPossible(expression.toCharArray(), '[', nextCheck + 1));
			} else {
				next.addAll(ifPossible(expression.toCharArray(), expression.charAt(nextCheck), nextCheck + 1));

			}
		}
		if ((!next.empty()) && (next.peek() == expression.length())) {
			return "possible";
		}
		return "impossible";
	}

	private Stack<Integer> ifPossible(char[] str, char ch, int pos) {
		Stack<Integer> returnPos = new Stack<Integer>();

		if (isClose(ch) || pos >= str.length) {
			return returnPos;
		}
		Stack<Integer> checkPos = new Stack<Integer>();
		checkPos.push(pos);
		while (!checkPos.empty()) {
			int nextCheck = checkPos.pop();
			if (nextCheck == str.length) {
				continue;
			}
			if (isOpen(str[nextCheck])) {
				checkPos.addAll(ifPossible(str, str[nextCheck], nextCheck + 1));
			}
			if (str[nextCheck] == 'X') {
				returnPos.push(nextCheck + 1);
				checkPos.addAll(ifPossible(str, '{', nextCheck + 1));
				checkPos.addAll(ifPossible(str, '[', nextCheck + 1));
				checkPos.addAll(ifPossible(str, '(', nextCheck + 1));

			}
			if (isClose(str[nextCheck]) && (getClosedBracket(ch) == str[nextCheck])) {
				returnPos.push(nextCheck + 1);
			}
		}
		return returnPos;
	}
}
