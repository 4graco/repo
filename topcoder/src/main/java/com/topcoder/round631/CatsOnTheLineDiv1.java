package com.topcoder.round631;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Single Round Match 631 Round 1 - Division I, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=13279&rd=16062
 */
public class CatsOnTheLineDiv1 {

	public int getNumber(int[] position, int[] count, int time) {

		Map<Integer, Integer> cats = new HashMap<Integer, Integer>();
		for (int i = 0; i < position.length; i++) {
			cats.put(position[i], count[i]);
		}

		SortedSet<Integer> keys = new TreeSet<Integer>(cats.keySet());
		int num = 0;
		int availablePos = Integer.MIN_VALUE;
		int manyCatsPos = Integer.MIN_VALUE;
		for (Integer pos : keys) {
			Integer val = cats.get(pos);
			int startPos = Math.max(availablePos, pos - time);

			if (!((manyCatsPos >= pos - time) && (manyCatsPos <= pos + time))) {
				if (startPos + val > pos + time + 1) {
					num++;
					availablePos = startPos + 1;
					manyCatsPos = pos + time;
				} else {
					availablePos = startPos + val;
				}

			}
		}

		return num;
	}
}
