package com.topcoder.round608;

public class OneDimensionalRobotEasy {

	public int finalPosition(String commands, int A, int B) {

		int pos = 0;
		for (int i = 0; i < commands.length(); i++) {
			if ((commands.charAt(i) == 'R') && (pos < B)) {
				pos++;
			} else {
				if ((commands.charAt(i) == 'L') && (pos > -A)) {
					pos--;
				}
			}
		}
		return pos;
	}
}
