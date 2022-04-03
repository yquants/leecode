package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class P771 {

    public int numJewelsInStones(String jewels, String stones) {

        /**
         * Streaming()的性能比普通的方法差很多
         * Method3比method2的优势在于string.contains()比较慢
         */

        return this.method3(jewels, stones);
    }

    private int method1(String jewels, String stones) {

        return (int) stones.chars().filter(x -> jewels.contains("" + (char) x)).count();
    }

    private int method2(String jewels, String stones) {

        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            res += jewels.contains("" + stones.charAt(i)) ? 1 : 0;
        }
        return res;
    }

    //参考了评论区
    private int method3(String jewels, String stones) {
        /**
         *  a - 65
         *  A - 97
         */
        int[] res = new int[60];
        int total = 0;

        for (int i = 0; i < stones.length(); i++) {
            res[stones.charAt(i)-65] = res[stones.charAt(i)-65] + 1;
        }

        for (int i = 0; i < jewels.length(); i++) {
            total += res[jewels.charAt(i)-65] ;
        }
        return total;
    }

    public static void main(String... args) {
        P771 instance = new P771();
        System.out.println(3 == instance.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(0 == instance.numJewelsInStones("z", "ZZ"));
    }

}
