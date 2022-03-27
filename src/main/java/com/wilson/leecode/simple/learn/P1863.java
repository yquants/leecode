package com.wilson.leecode.simple.learn;

/**
 * https://leetcode-cn.com/problems/sum-of-all-subset-xor-totals/
 *
 * 这道题的难点在于<b>找出一个数组的所有子数组</b>
 * 一个思路：
 * 对原数组的每个元素进行0/1标记（ 0 - 不要，1 - 要），则一共有2**N个排列组合;
 *
 * 几个小计巧：
 * 1. 由于上面的方法用的是0/1标记，可以看成是二进制数，这个二进制数的位数就是原数组的长度；
 * 2. 可以很轻松地知道上述二进制数的十进制表达方式下的范围，0 至 2**N - 1；
 * 3. 遍历上述 0 至 2**N-1区间（含）的所有数，如果该数的二进制表达方式下，该数位是1，那么表示当前子集里对应的原数组中的该位置的元素就要包括进来
 *
 *
 * TOD：
 * 1. 了解和实现DFS （Depth First Search）
 * 2. 如何知道一个二进制数有几个数位是1
 */
public class P1863 {

    public int subsetXORSum(int[] nums) {

        int len = nums.length;
        int totalSubArrays = (int) Math.pow(2, len) ;
        int total = xor(nums);
        for (int i = totalSubArrays-2; i > 0; i--) {
            int current = i;
            int[] subArray = new int[len]; //TODO： 能不能事先知道i对应二进制中一共有几个1
            int j_subArray = -1;
            int k_nums = len - 1;
            while (j_subArray++ < len) {
                //通过 按位与 来确定最后一位是0还是1
                if ((current & 1) == 1) {
                    subArray[j_subArray] = nums[k_nums];
                }
                current = current >> 1;
                k_nums --;
            }
            total += xor(subArray);
        }

        return total;

    }

    private int xor(int[] nums) {
        int r = 0;
        for (int num : nums)
            r = r ^ num;
        return r;
    }

    public static void main(String... args) {
        P1863 instance = new P1863();
        System.out.println(28 == instance.subsetXORSum(new int[]{5,1,6}));
    }

}
