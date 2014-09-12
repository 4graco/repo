package com.topcoder.round629;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * Does not pass the tests. Should be corrected
 */
public class CandyCollection {

	private class ShapeTypeNum implements Comparable<ShapeTypeNum> {

		int shape;
		int num;
		int type;

		ShapeTypeNum(int shape, int type, int num) {
			this.num = num;
			this.type = type;
			this.shape = shape;
		}

		@Override
		public int compareTo(ShapeTypeNum x) {
			return this.num - x.num;
		}
	}

	private ShapeTypeNum getOtherTypeForShape(ShapeTypeNum vertex, int[] Type1, int[] Number1, int[] Type2, int[] Number2) {
		int otherType;
		int otherNum;
		if (vertex.type == Type1[vertex.shape]) {
			otherType = Type2[vertex.shape];
			otherNum = Number1[vertex.shape] + 1;
		} else {
			otherType = Type1[vertex.shape];
			otherNum = Number2[vertex.shape] + 1;
		}

		return new ShapeTypeNum(vertex.shape, otherType, otherNum);
	}

	int solve(int[] Type1, int[] Number1, int[] Type2, int[] Number2) {

		int count = Type1.length;
		PriorityQueue<ShapeTypeNum> queue = new PriorityQueue<ShapeTypeNum>(10);
		for (int i = 0; i < count; i++) {
			queue.add(new ShapeTypeNum(i, Type1[i], Number2[i] + 1));
			queue.add(new ShapeTypeNum(i, Type2[i], Number1[i] + 1));
		}
		Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
		int candySum = 0;
		while (visited.size() < count) {
			ShapeTypeNum vertex = queue.poll();
			if (visited.containsKey(vertex.type)) {
				continue;
			}

			ShapeTypeNum otherVertex = getOtherTypeForShape(vertex, Type1, Number1, Type2, Number2);
			if ((Type1[vertex.shape] == vertex.type && Number2[vertex.shape] + 1 < otherVertex.num)
			        || (Type2[vertex.shape] == vertex.type && Number1[vertex.shape] + 1 < otherVertex.num)) {
				if (visited.containsKey(otherVertex.type)) {
					if (visited.get(otherVertex.type) > otherVertex.num - vertex.num) {
						candySum -= visited.get(otherVertex.type);
						candySum += otherVertex.num - vertex.num;
						visited.put(otherVertex.type, otherVertex.num - vertex.num);
					}
				} else {
					otherVertex.num -= vertex.num;
					queue.add(otherVertex);
				}

			} else {
				if (visited.containsKey(otherVertex.type)) {
					candySum -= visited.get(otherVertex.type);
				}
				visited.put(otherVertex.type, 0);
			}
			candySum += vertex.num;
			visited.put(vertex.type, vertex.num);
		}
		return candySum;
	}
}
