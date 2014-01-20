package com.interview;

import java.util.Arrays;

public class StringUtil {

    public String removeSpaces(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            if (c != ' ') {
                arr[i] = arr[j];
                i++;
            }
        }
        return new String(Arrays.copyOfRange(arr, 0, i));
    }

    public String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        int end = str.length() - 1;
        return str.charAt(end) + reverse(str.substring(1, end)) + str.charAt(0);
    }

    public String reverseSeq(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseSeq(str.substring(1)) + str.charAt(0);
    }

    public int countWords(String str) {
        int count = 0;
        if (str != null && !str.isEmpty()) {
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ' && !flag) {
                    flag = true;
                    count++;
                }
                if (str.charAt(i) == ' ') {
                    flag = false;
                }
            }
        }
        return count;
    }

    public void printLong(long num) {
        if (num < 0) {
            System.out.print('-');
            printLong(-num);
            return;
        }
        if (num / 10 != 0) {
            printLong(num / 10);
        }
        System.out.print(num % 10);
    }

}
