package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class P1614 {


    public int maxDepth(String s) {

        int max = 0;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('(' == c) {
                if (++current > max)
                    max = current;
            }
            if (')' == c && current > 0) {
                current--;
            }
        }

        return max;

    }


    public static void main(String... args) {
        P1614 instance = new P1614();
        System.out.println(3 == instance.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(3 == instance.maxDepth("(1)+((2))+(((3)))"));
    }

}
