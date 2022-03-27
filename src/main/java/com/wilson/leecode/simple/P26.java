package com.wilson.leecode.simple;

public class P26 {
    public int removeDuplicates(int[] nums) {


        int index = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i ++){
            if (nums[i] == last)
                continue;
            else{
                nums[index ++] = nums[i];
                last = nums[i];
            }
        }
        return index;



    }

    public static void main(String... args) {
        P26 p26 = new P26();
        p26.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
