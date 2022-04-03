package com.wilson.leecode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class P2006 {

    public int countKDifference(int[] nums, int k) {
        return (method2(nums, k));
    }

    private int method1(int[] nums, int k) {
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            map.put(current - k, map.getOrDefault(current - k, 0) + 1);
            map.put(current + k, map.getOrDefault(current + k, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current)) {
                res += map.get(current);
            }
        }

        return res / 2;
    }


    private int method2(int[] nums, int k) {
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            map.put(current - k, map.getOrDefault(current - k, 0) + 1);
            map.put(current + k, map.getOrDefault(current + k, 0) + 1);

            if (map.containsKey(current)) {
                res += map.get(current);
            }
        }

        return res;
    }


    public static void main(String... args) {
        P2006 instance = new P2006();
        System.out.println(4 == instance.countKDifference(new int[]{1, 2, 2, 1}, 1));
        System.out.println(0 == instance.countKDifference(new int[]{1, 3}, 3));
        System.out.println(3 == instance.countKDifference(new int[]{3, 2, 1, 5, 4}, 2));
    }

}
