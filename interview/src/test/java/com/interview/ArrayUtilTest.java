package com.interview;

import org.junit.Test;

public class ArrayUtilTest {

    @Test
    public void testPrintArrIntersection() {
        int[] a1 = new int[] { 1, 4, 6, 8, 11, 15, 21, 27 };
        int[] a2 = new int[] { 2, 5, 8, 15, 27, 34, 52 };
        ArrayUtil au = new ArrayUtil();
        au.printArrIntersection(a1, a2);
    }

}
