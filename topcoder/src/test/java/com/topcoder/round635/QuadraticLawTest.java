package com.topcoder.round635;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuadraticLawTest {

	@Test
	public void tesNumberOfSubsequences() {
		QuadraticLaw quadraticLaw = new QuadraticLaw();
		assertEquals(0, quadraticLaw.getTime(1));
		assertEquals(1, quadraticLaw.getTime(2));
		assertEquals(1, quadraticLaw.getTime(5));
		assertEquals(2, quadraticLaw.getTime(6));
		assertEquals(2, quadraticLaw.getTime(7));
		assertEquals(38, quadraticLaw.getTime(1482));
		assertEquals(999999999, quadraticLaw.getTime(1000000000000000000L));
		assertEquals(178770270, quadraticLaw.getTime(31958809614643170L));
	}
}
