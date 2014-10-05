package com.topcoder.round635;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IdentifyingWoodTest {

	@Test
	public void tesCheck() {
		IdentifyingWood identifyingWood = new IdentifyingWood();
		assertEquals(IdentifyingWood.OK, identifyingWood.check("absdefgh", "asdf"));
		assertEquals(IdentifyingWood.NOPE, identifyingWood.check("oxoxoxox", "ooxxoo"));
		assertEquals(IdentifyingWood.OK, identifyingWood.check("oxoxoxox", "xxx"));
		assertEquals(IdentifyingWood.OK, identifyingWood.check("qwerty", "qwerty"));
		assertEquals(IdentifyingWood.NOPE, identifyingWood.check("string", "longstring"));
	}
}
