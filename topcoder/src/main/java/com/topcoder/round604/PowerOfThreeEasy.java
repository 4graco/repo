package com.topcoder.round604;

public class PowerOfThreeEasy {

    public String ableToGet(int x, int y) {
        boolean flag = true;
        int i = 0;
        while (flag) {
            int p = (int) Math.pow(3, i);
            if (x >= p || y >= p) {
                i++;
            } else {
                i--;
                flag = false;
            }

        }
        boolean res = true;
        for (int j = i; j >= 0 && res; j--) {
            int p = (int) Math.pow(3, j);
            if (x > y) {
                x = x - p;
            } else {
                y = y - p;
            }
            if (x < 0 || y < 0) {
                res = false;
            }
        }
        if (x != 0 || y != 0) {
            res = false;
        }
        return res ? "Possible" : "Impossible";
    }
}
