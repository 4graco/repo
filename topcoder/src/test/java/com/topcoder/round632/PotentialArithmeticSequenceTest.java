package com.topcoder.round632;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PotentialArithmeticSequenceTest {

	@Test
	public void tesnumberOfSubsequences() {
		PotentialArithmeticSequence potentialArithmeticSequence = new PotentialArithmeticSequence();
		assertEquals(28, potentialArithmeticSequence.numberOfSubsequences(new int[] { 0, 1, 0, 2, 0, 1, 0 }));
		assertEquals(7, potentialArithmeticSequence.numberOfSubsequences(new int[] { 0, 0, 0, 0, 0, 0, 0 }));
		assertEquals(8, potentialArithmeticSequence.numberOfSubsequences(new int[] { 0, 0, 0, 0, 1, 1, 1 }));
		assertEquals(11, potentialArithmeticSequence.numberOfSubsequences(new int[] { 0, 100, 0, 2, 0 }));
		assertEquals(49, potentialArithmeticSequence.numberOfSubsequences(new int[] { 1, 11, 3, 0, 1, 0, 1, 0, 1, 0, 1, 0, 3, 0, 2, 0, 0, 0, 0, 1, 2, 3, 20 }));
		assertEquals(
		        229,
		        potentialArithmeticSequence.numberOfSubsequences(new int[] { 0, 1, 0, 1, 0, 1, 0, 3, 0, 1, 0, 8, 0, 1, 0, 7, 0, 1, 0, 9, 0, 1, 0, 8, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1,
		                0, 1, 0, 1, 0, 1, 0, 1, 0, 3, 0, 1, 0, 0 }));

		assertEquals(
		        435,
		        potentialArithmeticSequence.numberOfSubsequences(new int[] { 1, 0, 3, 0, 1, 0, 2, 0, 1, 328775416, 703983279, 0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 569029877, 2, 0, 1, 0,
		                481526113, 0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1, 0, 4, 0, 1, 0, 68708759, 0, 1, 0 }));

		assertEquals(
		        330,
		        potentialArithmeticSequence.numberOfSubsequences(new int[] { 1, 0, 2, 0, 143183056, 0, 3, 0, 1, 368457178, 2, 0, 1, 0, 4, 0, 1, 0, 2, 0, 1, 0, 521448595, 0, 1, 0,
		                2, 0, 1, 0, 5, 0, 1, 0, 2, 0, 1, 0, 3, 688509958, 1, 0, 2, 0, 1, 474627720, 4, 0, 1, 0 }));
		assertEquals(
		        1275,
		        potentialArithmeticSequence.numberOfSubsequences(new int[] { 1000000000, 0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1, 0, 4, 0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1,
		                0, 5, 0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1, 0, 4, 0 }));

		assertEquals(
		        1275,
		        potentialArithmeticSequence.numberOfSubsequences(new int[] { 0, 2, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1, 0, 4, 0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1, 0, 5, 0, 1, 0, 2,
		                0, 1, 0, 3, 0, 1, 0, 2, 0, 1, 0, 4, 0, 1, 0, 2 }));

	}
}
