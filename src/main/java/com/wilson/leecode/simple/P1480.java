package com.wilson.leecode.simple;

/**
 *
 */
public class P1480 {

    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        return nums;
    }

    public static void main(String... args) {
        P1480 instance = new P1480();
        for (int num: instance.runningSum(new int[]{3,1,2,10,1}))
            System.out.println(num);
    }

}
