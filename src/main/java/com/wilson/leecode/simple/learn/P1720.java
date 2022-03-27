package com.wilson.leecode.simple.learn;

/**
 * https://leetcode-cn.com/problems/decode-xored-array/submissions/
 *
 * 两个数a和b 异或 得到 c, 那么将 a 和 c 异或 可得到 b
 */
public class P1720 {

    public int[] decode(int[] encoded, int first) {

        int[] res = new int[encoded.length + 1];
        res[0] = first;
        for (int i = 0; i < encoded.length; i ++){
            res[i+1] = res[i] ^ encoded[i];
        }

        return res;
    }

    public static void main(String... args) {
        P1720 instance = new P1720();
    }

}
