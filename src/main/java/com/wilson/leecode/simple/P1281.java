package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class P1281 {

    public int subtractProductAndSum(int n) {

        int m = 1, a = 0;

        while (n > 0) {
            int c = n % 10;
            m *= c;
            a += c;
            n = n / 10;
        }
        return m - a;
    }

    public static void main(String... args) {
        P1281 instance = new P1281();
        System.out.println(15 == instance.subtractProductAndSum(234));
    }

}
