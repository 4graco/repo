package com.topcoder.round602;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PilingRectsDiv2Test {

    @Test
    public void testGetMax() {
        assertEquals(3, new PilingRectsDiv2().getmax(new int[]{1, 2, 3, 1}, new int[]{3, 2, 4, 4}, 3));
    }
}
