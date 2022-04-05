package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 */
public class P1211 {


    public int balancedStringSplit(String s) {

        int res = 0;
        int rN = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'R') {
                if (rN++ == 0)
                    res++;
            }

            if (c == 'L') {
                if (rN-- == 0)
                    res++;
            }
        }
        return res;
    }


    public static void main(String... args) {
        P1211 instance = new P1211();
        System.out.println(4 == instance.balancedStringSplit("RLRRLLRLRL"));
        System.out.println(3 == instance.balancedStringSplit("RLLLLRRRLR"));
        System.out.println(1 == instance.balancedStringSplit("LLLLRRRR"));
    }

}
