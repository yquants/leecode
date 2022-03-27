package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */

public class P88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }

            else if (nums1[i] == nums2[j]) {
                nums1[k--] = nums1[i--];
                nums1[k--] = nums2[j--];
            }

            else if (nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }

    public static void main(String... args) {
        P88 p88 = new P88();

        p88.merge(new int[]{1, 2, 3, 0, 0, 0},
                3,
                new int[]{2, 5, 6},
                3);

    }

}
