package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
 */
public class P2160 {

    public int minimumSum(int num) {

        int first = 10, second = 10, third = 10, forth = 10;

        while (num > 0) {
            int n = num % 10;
            num = num / 10;
            if (n < first){
                forth = third;
                third = second;
                second = first;
                first = n;
            }else if (n < second){
                forth = third;
                third = second;
                second = n;
            }
            else if (n < third){
                forth = third;
                third = n;
            }
            else if (n < forth){
                forth = n;
            }
        }

        return first * 10 + second * 10 + third + forth;
    }

    public static void main(String... args) {
        P2160 instance = new P2160();
        System.out.println(52 == instance.minimumSum(2392));
    }

}
