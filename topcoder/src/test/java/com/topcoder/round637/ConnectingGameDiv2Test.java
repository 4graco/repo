package com.topcoder.round637;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConnectingGameDiv2Test {

	@Test
	public void testGetmin() {
		ConnectingGameDiv2 connectingGameDiv2 = new ConnectingGameDiv2();
		assertEquals(2, connectingGameDiv2.getmin(new String[] { "AA", "BC" }));
		assertEquals(4, connectingGameDiv2.getmin(new String[] { "AAB", "ACD", "CCD" }));
		assertEquals(8, connectingGameDiv2.getmin(new String[] { "iii", "iwi", "iii" }));
		assertEquals(6, connectingGameDiv2.getmin(new String[] { "rng58", "Snuke", "Sothe" }));
		assertEquals(14, connectingGameDiv2.getmin(new String[] { "yyAArJqjWTH5", "yyEEruYYWTHG", "hooEvutpkkb2", "OooNgFFF9sbi", "RRMNgFL99Vmm", "R76XgFF9dVVV", "SKnZUPf88Vee" }));
	}
}
