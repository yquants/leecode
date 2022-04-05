package com.wilson.leecode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 */
public class P1512 {

    public int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            int last = map.getOrDefault(nums[i], 0);
            total += last;
            map.put(nums[i], last + 1);
        }

        return total;
    }

    public static void main(String... args) {
        P1512 instance = new P1512();
        System.out.println(4 == instance.numIdenticalPairs(new int[]{
                1, 2, 3, 1, 1, 3
        }));
    }

}
