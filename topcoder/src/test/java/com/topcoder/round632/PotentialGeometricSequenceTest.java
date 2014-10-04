package com.topcoder.round632;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PotentialGeometricSequenceTest {

	@Test
	public void tesNumberOfSubsequences() {
		PotentialGeometricSequence potentialGeometricSequence = new PotentialGeometricSequence();
		assertEquals(6, potentialGeometricSequence.numberOfSubsequences(new int[] { 0, 1, 2 }));
		assertEquals(5, potentialGeometricSequence.numberOfSubsequences(new int[] { 1, 2, 4 }));
		assertEquals(10, potentialGeometricSequence.numberOfSubsequences(new int[] { 3, 2, 1, 0 }));
		assertEquals(9, potentialGeometricSequence.numberOfSubsequences(new int[] { 1, 2, 4, 8, 16 }));
		assertEquals(37, potentialGeometricSequence.numberOfSubsequences(new int[] { 1, 3, 5, 5, 5, 5, 64, 4, 23, 2, 3, 4, 5, 4, 3 }));
	}
}
