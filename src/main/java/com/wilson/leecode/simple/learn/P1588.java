package com.wilson.leecode.simple.learn;

/**
 * https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 */
public class P1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            for (int j = 0; (j + i) <= arr.length; j++) {

                int total = 0;
                int len = 0;
                do {
                    total += arr[j + len];
                } while (++len < i);
                res += total;
            }
        }
        return res;
    }

    public static void main(String... args) {
        P1588 instance = new P1588();
        System.out.println(58 == instance.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
        System.out.println(66 == instance.sumOddLengthSubarrays(new int[]{10, 11, 12}));
    }

}
