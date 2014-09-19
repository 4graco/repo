package com.topcoder.round633;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TargetTest {

	@Test
	public void testDraw() {
		Target target = new Target();
		assertTrue(Arrays.equals(new String[] { "#####", "#   #", "# # #", "#   #", "#####" }, target.draw(5)));
		assertTrue(Arrays.equals(new String[] { "#########", "#       #", "# ##### #", "# #   # #", "# # # # #", "# #   # #", "# ##### #", "#       #", "#########" },
		        target.draw(9)));
		assertTrue(Arrays.equals(new String[] { "#############", "#           #", "# ######### #", "# #       # #", "# # ##### # #", "# # #   # # #", "# # # # # # #",
		        "# # #   # # #", "# # ##### # #", "# #       # #", "# ######### #", "#           #", "#############" }, target.draw(13)));
		assertTrue(Arrays.equals(new String[] { "#################", "#               #", "# ############# #", "# #           # #", "# # ######### # #", "# # #       # # #",
		        "# # # ##### # # #", "# # # #   # # # #", "# # # # # # # # #", "# # # #   # # # #", "# # # ##### # # #", "# # #       # # #", "# # ######### # #",
		        "# #           # #", "# ############# #", "#               #", "#################" }, target.draw(17)));
	}
}
