package com.wilson.leecode;

public class P35 {
    public int searchInsert(int[] nums, int target){


       for (int i = 0 ; i < nums.length; i ++){
           if (nums[i] >= target)
               return i;
       }

       return nums.length;

    }

    public static void main(String... args) {
        P35 p28 = new P35();
    }


}
