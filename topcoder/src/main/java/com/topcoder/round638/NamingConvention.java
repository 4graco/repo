package com.topcoder.round638;

/*
 * Single Round Match 638 Round 1 - Division II, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13521&rd=16081
 */
public class NamingConvention {

	public String toCamelCase(String variableName) {
		int size = variableName.length();
		char[] newName = new char[size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (variableName.charAt(i) != '_') {
				newName[index] = variableName.charAt(i);
			} else {
				i++;
				newName[index] = Character.toUpperCase(variableName.charAt(i));
			}
			index++;
		}
		return String.copyValueOf(newName, 0, index);
	}
}
