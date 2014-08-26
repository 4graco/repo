package com.topcoder.round629;

public class RectangleCoveringEasy {

	public int solve(int holeH, int holeW, int boardH, int boardW) {
		if ((holeH <= boardH && holeW <= boardW && (holeH < boardH || holeW < boardW)) || (holeH <= boardW && holeW <= boardH && (holeH < boardW || holeW < boardH))) {
			return 1;
		}
		return -1;
	}
}
