package com.topcoder.round631;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class CatsOnTheLineDiv2 {

	private final String POSSIBLE = "Possible";
	private final String IMPOSSIBLE = "Impossible";

	public String getAnswer(int[] position, int[] count, int time) {

		Map<Integer, Integer> cats = new HashMap<Integer, Integer>();
		for (int i = 0; i < position.length; i++) {
			cats.put(position[i], count[i]);
		}

		SortedSet<Integer> keys = new TreeSet<Integer>(cats.keySet());
		int availablePos = Integer.MIN_VALUE;
		for (Integer pos : keys) {
			Integer val = cats.get(pos);
			int startPos = Math.max(availablePos, pos - time);
			availablePos = startPos + val;
			if (availablePos > pos + time + 1) {
				return IMPOSSIBLE;
			}
		}

		return POSSIBLE;
	}
}
