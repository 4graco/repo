package com.topcoder.round604;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FoxConnection2 {

	class Node {

		int num;
		int lenOfSubtree;
		ArrayList<Integer> connection;

		Node(int myNum) {
			num = myNum;
			lenOfSubtree = 0;
			connection = new ArrayList<>();
		}

		int getLenOfSubtree() {
			return lenOfSubtree;
		}

		void addConnection(Node newCon) {
			connection.add(newCon.num);
			lenOfSubtree += newCon.getLenOfSubtree() + 1;
		}

		void removeConnection(Node oldCon) {
			connection.remove(oldCon.num);
			lenOfSubtree = lenOfSubtree - oldCon.getLenOfSubtree() - 1;
		}
	}

	public int ways(int[] A, int[] B, int k) {
		// HashMap<Integer, Node> tree = new HashMap();
		List<Integer>[] arrayCount = new LinkedList[A.length];
		for (int i = 0; i < A.length; i++) {
			if (arrayCount[A[i]] == null) {
				arrayCount[A[i]] = new LinkedList<>();
			}
			if (arrayCount[B[i]] == null) {
				arrayCount[B[i]] = new LinkedList<>();
			}
			arrayCount[A[i]].add(B[i]);
			arrayCount[B[i]].add(A[i]);
		}

		boolean findOne = false;
		for (int i = 0; i < A.length && !findOne; i++) {
			if (arrayCount[i].size() == 1) {
				findOne = true;
			}
		}

		return 0;
	}
}
