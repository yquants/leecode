package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/goal-parser-interpretation/
 */
public class P1678 {

    public String interpret(String command) {

        return command.replace("()", "o").replace("(al)", "al");
    }


    public static void main(String... args) {
        P1678 instance = new P1678();
    }

}
