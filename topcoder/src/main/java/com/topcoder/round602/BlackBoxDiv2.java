package com.topcoder.round602;

public class BlackBoxDiv2 {

    static int MODULO = 1000000007;

    private int getSize(String s) {
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                size++;
            }
        }
        return size;
    }

    private int factModulo(int k, int m) {
        int res = 1;
        for (int i = 1; i <= k; i++) {
            res *= i;
        }
        return res;
    }

    private int factModulo(int k) {
        return factModulo(k, MODULO);
    }

    private int powerModulo(int k, int p, int n, int m) {
        int add = ((int) Math.pow(2, n) - 2) * 2;
        int res = 1;

        for (int i = 0; i < p - 2; i++) {
            res = res * k + add;
        }
        return res;
    }

    private int powerModulo(int k, int p, int n) {
        return powerModulo(k, p, n, MODULO);
    }

    public int sumModulo(int n, int m) {
        int res = 0;
        int nFact = factModulo(n, m);
        for (int k = 1; k <= n; k++) {
            res += nFact / (factModulo(k, m) * factModulo(n - k, m));
        }
        return res;
    }

    public int sumModulo(int n) {
        return sumModulo(n, MODULO);
    }

    private int countVariants(int n, int p, int m) {
        int res = 7;
        for (int i = 0; i < n - 2; i++) {
            res = res * 3 + 4;
        }

        int add = ((int) Math.pow(2, n) - 2) * 2;
        int k = sumModulo(n);
        for (int i = 0; i < p - 2; i++) {
            res = res * k + add;
        }


        return res;
    }

    private int countVariants(int n, int p) {
        return countVariants(n, p, MODULO);
    }

    public int count(String front, String side) {
        int n = getSize(front), m = getSize(side);
        if (n == 0 && m == 0) {
            return 1;
        } else if (n == 0 || m == 0) {
            return 0;
        } else if (n == 1 || m == 1) {
            return 1;
        }

        int a = countVariants(n, m);
        int b = powerModulo(sumModulo(n), m, n);

        return a;
    }
}
