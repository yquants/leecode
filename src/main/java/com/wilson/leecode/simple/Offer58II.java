package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class Offer58II {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String... args) {
        Offer58II instance = new Offer58II();
        System.out.println("umghlrlose".equals(instance.reverseLeftWords("lrloseumgh", 6)));
    }

}
