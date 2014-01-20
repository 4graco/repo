package com.interview;

/**
 * Hello world!
 * 
 */
public class App {

    // print N! permutation of the characters of the string s (in order)
    public static void perm1(String s) {
        perm1("", s);
    }

    private static void perm1(String prefix, String s) {
        int N = s.length();
        if (N == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < N; i++) {
                perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
            }
        }

    }

    public static void main(String[] args) {
        Integer a = Integer.MAX_VALUE;
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(a + 1));
        // System.out.println(Integer.toBinaryString(-1));
        System.out.println(a);
        System.out.println(a + 1);
        System.out.println(2 - a);
        System.out.println(-2 - a);
        System.out.println(2 * a);
        System.out.println(4 * a);
        System.out.println(Math.sqrt(2) * Math.sqrt(2));
        // perm1("Hello");
    }
}
