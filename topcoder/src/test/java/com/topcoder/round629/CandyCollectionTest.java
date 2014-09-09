package com.topcoder.round629;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CandyCollectionTest {

	@Test
	public void test() {
		CandyCollection candyCollection = new CandyCollection();
		assertEquals(2, candyCollection.solve(new int[] { 0, 0 }, new int[] { 1, 1 }, new int[] { 1, 1 }, new int[] { 1, 1 }));
		assertEquals(3, candyCollection.solve(new int[] { 0, 0 }, new int[] { 2, 5 }, new int[] { 1, 1 }, new int[] { 2, 5 }));
		assertEquals(5, candyCollection.solve(new int[] { 0, 0, 2, 3 }, new int[] { 1, 1, 2, 2 }, new int[] { 1, 1, 3, 2 }, new int[] { 1, 1, 2, 2 }));
		assertEquals(20, candyCollection.solve(new int[] { 0, 1, 2, 3 }, new int[] { 5, 5, 10, 13 }, new int[] { 1, 2, 3, 0 }, new int[] { 8, 8, 10, 15 }));
		assertEquals(
		        5105,
		        candyCollection.solve(new int[] { 12, 9, 0, 16, 9, 18, 12, 3, 6, 0, 8, 2, 10, 6, 5, 2, 14, 10, 5, 13 }, new int[] { 895, 704, 812, 323, 334, 674, 665, 142, 712,
		                254, 869, 548, 645, 663, 758, 38, 860, 724, 742, 530 }, new int[] { 1, 4, 7, 11, 15, 8, 18, 13, 17, 17, 19, 14, 7, 11, 4, 1, 15, 19, 3, 16 }, new int[] {
		                779, 317, 36, 191, 843, 289, 107, 41, 943, 265, 649, 447, 806, 891, 730, 371, 351, 7, 102, 394 }));
	}
}
