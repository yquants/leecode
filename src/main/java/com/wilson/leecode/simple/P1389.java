package com.wilson.leecode.simple;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 */
public class P1389 {

    /**
     *
     * @param nums
     * @param index
     * @return
     */
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> target = new LinkedList<>();
        for (int i = 0; i < index.length; i++) {
            target.add(index[i], nums[i]);
        }
        int[] ans = new int[index.length];
        int pos = 0;
        //速度快
        for (int i : target)
            ans[pos++] = i;
        return ans;

        //速度慢
//        return target.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String... args) {
        P1389 instance = new P1389();

        Arrays.stream(instance.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})).forEach(System.out::println);
    }

}
