package com.interview;

public class Test {

    static int[] getSum(int[] coins, int k) {

        int[] mins = new int[k + 1];
        int[] nums = new int[k + 1];

        for (int i = 1; i < k + 1; i++) {
            mins[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= k; i++) {
            int currentCoin = 0;
            for (int coin : coins) {
                if (i - coin >= 0 && mins[i - coin] < mins[i]) {
                    mins[i] = mins[i - coin] + 1;
                    currentCoin = coin;
                }
            }
            nums[i] = currentCoin;
        }
        int idx = k;
        while (idx != 0 && nums[idx] != 0) {
            System.out.print(nums[idx] + " ");
            idx = idx - nums[idx];
        }
        return mins;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] coins = new int[] { 2, 5, 6, 25, 50 };
        int k = 3;
        getSum(coins, k);
    }
}
