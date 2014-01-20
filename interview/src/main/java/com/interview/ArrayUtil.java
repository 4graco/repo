package com.interview;

public class ArrayUtil {

    public void printArrIntersection(int[] a1, int[] a2) {
        for (int i = 0, j = 0; i < a1.length && j < a2.length;) {
            if (a1[i] == a2[j]) {
                System.out.print(a1[i] + " ");
                i++;
                j++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else if (a1[i] < a2[j]) {
                i++;
            }
        }
    }

}
