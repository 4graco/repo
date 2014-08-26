package com.topcoder.round602;

public class TypoCoderDiv2 {

    public int count(int[] rating) {

        int count = rating[0] >= 1200 ? 1 : 0;
        for (int i = 1; i < rating.length; i++) {
            if ((rating[i - 1] < 1200 && rating[i] >= 1200)
                    || (rating[i - 1] >= 1200 && rating[i] < 1200)) {
                count++;
            }
        }
        return count;
    }
}
