package com.topcoder.round635;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Single Round Match 635 Round 1 - Division II, Level Three
 * http://community.topcoder.com/stat?c=problem_statement&pm=13416&rd=16078
 */
@SuppressWarnings("rawtypes")
public class LonglongestPathTree {

	static private Map[] cache;

	private void initCache(int size) {
		cache = new Map[size];
		for (int i = 0; i < size; i++) {
			cache[i] = new HashMap();
		}
	}

	private boolean getDataFromCache(int root, int withoutNode, long[] maxP) {

		if ((withoutNode != -1) && (cache[root].get(withoutNode) != null)) {
			maxP[0] = ((Long[]) (cache[root].get(withoutNode)))[0];
			maxP[1] = ((Long[]) (cache[root].get(withoutNode)))[1];
			return true;
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	private void setDataToCache(int root, int withoutNode, long[] maxP) {

		if (withoutNode != -1) {
			Long[] array = new Long[2];
			array[0] = maxP[0];
			array[1] = maxP[1];
			cache[root].put(withoutNode, array);
		}
	}

	private class Node {

		ArrayList<Integer> links;
		ArrayList<Integer> weight;

		Node() {
			links = new ArrayList<Integer>();
			weight = new ArrayList<Integer>();
		}

		void addLink(int node, int w) {
			links.add(node);
			weight.add(w);
		}
	}

	private Node[] createTree(int[] A, int[] B, int[] L) {
		int sizeNode = A.length + 1;
		Node[] tree = new Node[sizeNode + 1];

		for (int i = 0; i < sizeNode; i++) {
			tree[i] = new Node();
		}

		for (int i = 0; i < A.length; i++) {
			tree[A[i]].addLink(B[i], L[i]);
			tree[B[i]].addLink(A[i], L[i]);
		}
		return tree;
	}

	private void findPath(Node[] tree, int root, int withoutNode, long[] maxP) {
		long maxG = 0;
		long max1 = 0;
		long max2 = 0;
		if (getDataFromCache(root, withoutNode, maxP)) {
			return;
		}

		for (int i = 0; i < tree[root].links.size(); i++) {
			int curr = tree[root].links.get(i);
			int currWeight = tree[root].weight.get(i);
			if (curr == withoutNode) {
				continue;
			}
			long[] getRes = new long[2];
			findPath(tree, curr, root, getRes);
			getRes[1] += currWeight;
			maxG = Math.max(maxG, getRes[0]);
			if (getRes[1] >= max1) {
				max2 = max1;
				max1 = getRes[1];
			} else if (getRes[1] > max2) {
				max2 = getRes[1];
			}
		}
		maxP[0] = Math.max(maxG, max1 + max2);
		maxP[1] = max1;
		setDataToCache(root, withoutNode, maxP);

	}

	private long getMaxPath(Node[] tree, int root, int withoutNode) {
		long[] maxP = new long[2];
		if (!getDataFromCache(root, withoutNode, maxP)) {
			findPath(tree, root, withoutNode, maxP);
			setDataToCache(root, withoutNode, maxP);
		}
		return maxP[0];
	}

	public long getLength(int[] A, int[] B, int[] L) {
		Node[] tree = createTree(A, B, L);
		initCache(A.length + 1);
		long max = getMaxPath(tree, 0, -1);
		for (int i = 0; i < A.length; i++) {
			long aPath = getMaxPath(tree, A[i], B[i]);
			long bPath = getMaxPath(tree, B[i], A[i]);
			max = Math.max(aPath + bPath + L[i], max);
		}
		return max;
	}
}
