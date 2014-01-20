package com.interview;

public class Permutations {

    public void permutate(String pre, String str) {
        if (str == null || str.length() < 1) {
            System.out.println(pre + str);
        }
        for (int i = 0; i < str.length(); i++) {
            permutate(pre + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        }
    }

}
