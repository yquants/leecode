package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/richest-customer-wealth/
 */
public class P1672 {

    public int maximumWealth(int[][] accounts) {

        int max = -10000;
        for (int i = 0; i < accounts.length; i++) {
            int current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
            }
            if (current > max) {
                max = current;
            }
        }

        return max;

    }

    public static void main(String... args) {
        P1672 instance = new P1672();
    }

}
