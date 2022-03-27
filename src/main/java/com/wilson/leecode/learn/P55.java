package com.wilson.leecode.learn;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 *
 * 参考了讨论区的答案：
 * 遍历整个数组，如果前一个数是一个正数，那么把 前一个数 + 当前数 放在当前数组位置。
 *
 * 比如：
 * 1. 当遍历到第2个元素时，如果前一个数有帮助（即为正数），那么把第1个数加到第二个数上并放在第2个元素位置上，表示这是前两个元素最大子数组和。
 * 2. 当遍历到第3个元素时，前面两个元素的最大子数组已经确定了，并且"最大子数组和"已经放在了第2个元素位置上，
 *      如果前面的最大子数组有用（和为正），那么就加到第3个元素上
 *      如果前面的最大子数组没用（和为负），那么就单独从第3个元素开始找最大子数组
 *
 * 核心思想：
 */
public class P55 {

    public int maxSubArray(int[] nums) {

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
           nums[i] = nums[i] + Math.max(0, nums[i-1]);
           if (nums[i] > max)
                max = nums[i];
        }

        return max;
    }


    public static void main(String... args) {
        P55 empty = new P55();
        System.out.println(empty.maxSubArray(new int[]{
                -2,1,-3,4,-1,2,1,-5,4
        }));
    }

}
