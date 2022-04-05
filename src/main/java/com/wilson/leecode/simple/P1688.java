package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/count-of-matches-in-tournament/
 */
public class P1688 {

    public int numberOfMatches(int n) {

        if (n == 2)
            return 1;
        if (n == 1)
            return 0;

        return n / 2 + numberOfMatches(n % 2 == 0 ? n / 2 : n / 2 + 1);
    }


    public static void main(String... args) {
        P1688 instance = new P1688();
        System.out.println(6 == instance.numberOfMatches(7));
        System.out.println(13 == instance.numberOfMatches(14));
    }

}
