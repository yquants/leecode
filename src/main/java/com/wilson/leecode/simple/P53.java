package com.wilson.leecode.simple;

public class P53 {
    public int maxSubArray(int[] nums) {


        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0 && nums[i] < max)
                continue;

            int sum = nums[i];
            if (sum > max)
                max = sum;
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max)
                    max = sum;
            }
        }

        return max;


    }

    public static void main(String... args) {
        P53 p53 = new P53();
        int max = p53.maxSubArray(new int[]{-2, -1});
        System.out.println(max);
    }


}
