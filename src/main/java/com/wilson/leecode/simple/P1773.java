package com.wilson.leecode.simple;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/count-items-matching-a-rule/submissions/
 */
public class P1773 {


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int res = 0;

        int index = 0;
        if ("color".equals(ruleKey))
            index = 1;
        if ("name".equals(ruleKey))
            index = 2;

        for (List<String> item : items) {
            res += ruleValue.equals(item.get(index)) ? 1 : 0;
        }

        return res;
    }

    public static void main(String... args) {
        P1773 instance = new P1773();
    }

}
