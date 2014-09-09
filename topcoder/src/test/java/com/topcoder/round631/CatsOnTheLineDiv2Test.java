/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topcoder.round631;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author User1
 */
public class CatsOnTheLineDiv2Test {

	private final String POSSIBLE = "Possible";
	private final String IMPOSSIBLE = "Impossible";

	@Test
	public void testFindSuitableDensity() {
		CatsOnTheLineDiv2 catsOnTheLineDiv2 = new CatsOnTheLineDiv2();
		assertEquals(POSSIBLE, catsOnTheLineDiv2.getAnswer(new int[] { 0 }, new int[] { 7 }, 3));
		assertEquals(IMPOSSIBLE, catsOnTheLineDiv2.getAnswer(new int[] { 0 }, new int[] { 8 }, 3));
		assertEquals(IMPOSSIBLE, catsOnTheLineDiv2.getAnswer(new int[] { 0, 1 }, new int[] { 3, 1 }, 0));
		assertEquals(IMPOSSIBLE, catsOnTheLineDiv2.getAnswer(new int[] { 5, 0, 2 }, new int[] { 2, 3, 5 }, 2));
		assertEquals(POSSIBLE, catsOnTheLineDiv2.getAnswer(new int[] { 5, 1, -10, 7, 12, 2, 10, 20 }, new int[] { 3, 4, 2, 7, 1, 4, 3, 4 }, 6));
	}
}