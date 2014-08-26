package com.topcoder.round603;

import static org.junit.Assert.*;
import org.junit.Test;

public class MiddleCodeTest {

    @Test
    public void testEncode() {
        MiddleCode mc = new MiddleCode();
        assertEquals("ordw", mc.encode("word"));
        assertEquals("aaaaa", mc.encode("aaaaa"));
        assertEquals("caabbaa", mc.encode("abacaba"));
        assertEquals("ejghrs", mc.encode("shjegr"));
        assertEquals("afawadafawafaafsadadaa", mc.encode("adafaaaadafawafwfasdaa"));
    }
}
