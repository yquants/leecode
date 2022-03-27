package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/build-array-from-permutation/
 */
public class P1920 {

    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i ++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String... args) {
        P1920 instance = new P1920();
    }

}
