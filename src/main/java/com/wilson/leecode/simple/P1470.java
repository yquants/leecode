package com.wilson.leecode.simple;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/shuffle-the-array/
 */
public class P1470 {

    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[2 * n];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                /**
                 * soruce - target
                 * 0 - 0
                 * 1 - 2
                 * 2 - 4
                 * 3 - 6
                 */
                res[i] = nums[i / 2];
            } else {
                /**
                 * target - source
                 * 1 - n
                 * 3 - n + 1
                 * 5 - n + 2
                 */
                res[i] = nums[n + i / 2];
            }
        }

        return res;
    }

    public static void main(String... args) {
        P1470 instance = new P1470();
        Arrays.stream(instance.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)).forEach(System.out::println);
    }

}
