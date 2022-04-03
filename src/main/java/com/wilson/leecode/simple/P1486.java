package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 */
public class P1486 {

    public int xorOperation(int n, int start) {

        int r = start;
        for (int i = 1; i < n; i++) {
            r = r ^ (start + 2 * i);
        }
        return r;
    }


    public static void main(String... args) {
        P1486 instance = new P1486();
    }

}
