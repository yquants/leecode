package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/na-ying-bi/
 */
public class PLCP06 {

    public int minCount(int[] coins) {
        int res = 0;
        for (int i = 0; i < coins.length; i++) {
            res += coins[i] % 2 == 0 ? coins[i] / 2 : coins[i] / 2 + 1;
        }
        return res;
    }

    public static void main(String... args) {
        PLCP06 instance = new PLCP06();
        System.out.println(4 == instance.minCount(new int[]{4, 2, 1}));
        System.out.println(8 == instance.minCount(new int[]{2, 3, 10}));
    }

}
