package com.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilTest {

    StringUtil util = new StringUtil();

    @Test
    public void testRemoveSpaces() {
        assertEquals("HelloWorld", util.removeSpaces("  Hell o Wo   rl d  "));
    }

    @Test
    public void testReverse() {
        assertEquals("olleH", util.reverse("Hello"));
        assertEquals("olleH", util.reverseSeq("Hello"));
    }

    @Test
    public void testCountWords() {
        assertEquals(7, util.countWords("Hello John, It's nice to meet you!"));
    }

    @Test
    public void testPrintLong() {
        util.printLong(-947);
        System.out.println();
        util.printLong(319);
    }

}
