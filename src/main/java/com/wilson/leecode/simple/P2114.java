package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/maximum-number-of-words-found-in-sentences/
 */

public class P2114 {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String str : sentences) {
            int words = str.split(" ").length;
            if (words > max)
                max = words;
        }
        return max;
    }

    public static void main(String... args) {
        P2114 instance = new P2114();
        System.out.println(6 == instance.mostWordsFound(new String[]{
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        }));
    }

}
