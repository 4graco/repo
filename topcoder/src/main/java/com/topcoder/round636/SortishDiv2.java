package com.topcoder.round636;

import java.util.HashSet;
import java.util.Set;

/*
 * Single Round Match 636 Round 1 - Division II, Level Two
 * http://community.topcoder.com/stat?c=problem_statement&pm=13500&rd=16079
 */
public class SortishDiv2 {

	private int getSortForEl(int[] seq, int pos, boolean countPrev) {
		int count = 0;
		for (int i = 0; i < pos && countPrev; i++) {
			if (seq[i] < seq[pos]) {
				count++;
			}
		}
		for (int i = pos + 1; i < seq.length; i++) {
			if (seq[i] != 0 && seq[i] > seq[pos]) {
				count++;
			}
		}
		return count;
	}

	private int getSortForEl(int[] seq, int pos) {
		return getSortForEl(seq, pos, false);
	}

	private Set<Integer> getMissedNum(int[] seq) {
		Set<Integer> num = new HashSet<Integer>();
		boolean[] allNum = new boolean[seq.length];
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] != 0) {
				allNum[seq[i] - 1] = true;
			}
		}
		for (int i = 0; i < seq.length; i++) {
			if (!allNum[i]) {
				num.add(i + 1);
			}
		}
		return num;
	}

	private int countSortForMissedNum(int[] seq, Set<Integer> misNum, int sortedness, int currSort, int fromPos) {
		if (misNum.isEmpty()) {
			if (sortedness == currSort) {
				return 1;
			} else {
				return 0;
			}
		}

		int index = fromPos;
		while (seq[index] != 0) {
			index++;
		}

		Set<Integer> tempSet = new HashSet<Integer>(misNum);
		int count = 0;
		for (Integer num : misNum) {
			tempSet.remove(num);
			seq[index] = num;
			int tempSort = currSort;
			tempSort += getSortForEl(seq, index, true);
			count += countSortForMissedNum(seq, tempSet, sortedness, tempSort, index + 1);
			tempSet.add(num);
			seq[index] = 0;
		}
		return count;
	}

	private int countSortForMissedNum(int[] seq, Set<Integer> misNum, int sortedness, int currSort) {
		return countSortForMissedNum(seq, misNum, sortedness, currSort, 0);
	}

	public int ways(int sortedness, int[] seq) {
		int currSort = 0;
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] == 0) {
				continue;
			}
			currSort += getSortForEl(seq, i);
		}
		Set<Integer> missedNum = getMissedNum(seq);
		return countSortForMissedNum(seq, missedNum, sortedness, currSort);
	}
}
