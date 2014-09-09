package com.topcoder.round629;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class RectangleCovering {

	private class MinComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer x, Integer y) {
			return y - x;
		}
	}

	private int findBoardSum(Queue<Integer> boardScope, int hole) {
		int courSum = 0;
		int i;
		for (i = 0; !boardScope.isEmpty(); i++) {
			if (courSum >= hole) {
				break;
			}
			courSum += boardScope.poll();
		}

		return (courSum >= hole) ? i : -1;
	}

	public int minimumNumber(int holeH, int holeW, int[] boardH, int[] boardW) {

		MinComparator minComp = new MinComparator();
		Queue<Integer> horizontalBords = new PriorityQueue<>(10, minComp);
		Queue<Integer> verticalBords = new PriorityQueue<>(10, minComp);

		for (int i = 0; i < boardH.length; i++) {
			if ((boardH[i] > holeH) && (boardW[i] > holeH)) {
				horizontalBords.add(Math.max(boardW[i], boardH[i]));
			}
			if ((boardH[i] > holeH) ^ (boardW[i] > holeH)) {
				horizontalBords.add(Math.min(boardW[i], boardH[i]));
			}
			if ((boardW[i] > holeW) && (boardH[i] > holeW)) {
				verticalBords.add(Math.max(boardH[i], boardW[i]));
			}
			if ((boardW[i] > holeW) ^ (boardH[i] > holeW)) {
				verticalBords.add(Math.min(boardH[i], boardW[i]));
			}
		}

		int sumWBoard = findBoardSum(verticalBords, holeH);
		int sumHBoard = findBoardSum(horizontalBords, holeW);
		int minNum = -1;
		if ((sumWBoard > -1) && (sumHBoard > -1)) {
			minNum = Math.min(sumWBoard, sumHBoard);
		}
		if ((sumWBoard > -1) ^ (sumHBoard > -1)) {
			minNum = Math.max(sumWBoard, sumHBoard);
		}
		return minNum;
	}
}
