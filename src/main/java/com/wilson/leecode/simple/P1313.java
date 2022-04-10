package com.wilson.leecode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 */
public class P1313 {

    public int[] decompressRLElist(int[] nums) {

        int total = 0;
        for (int i = 0; i < nums.length; i += 2) {
            total += nums[i];
        }

        int[] res = new int[total];

        for (int i = 0, j = 0; i < nums.length; i += 2) {
            while (nums[i]-- > 0)
                res[j++] = nums[i + 1];
        }

        return res;
    }


    public static void main(String... args) {
        P1313 instance = new P1313();
    }

}
