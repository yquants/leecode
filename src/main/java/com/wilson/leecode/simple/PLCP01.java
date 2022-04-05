package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/guess-numbers/
 */
public class PLCP01 {

    public int game(int[] guess, int[] answer) {
        int res = 0;
        for (int i = 0; i < guess.length; i++) {
            res += guess[i] == answer[i] ? 1 : 0;
        }

        return res;
    }

    public static void main(String... args) {
        PLCP01 instance = new PLCP01();
    }

}
