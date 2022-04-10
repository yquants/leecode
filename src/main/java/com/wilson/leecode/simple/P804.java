package com.wilson.leecode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/unique-morse-code-words/
 */
public class P804 {


    public int uniqueMorseRepresentations(String[] words) {
        //a - 97
        final String[] MORSE = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        Set<String> res = new HashSet<>();

        int len = words.length;
        if (len == 1)
            return 1;
        for (int i = 0; i < len; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                sb.append(MORSE[word.charAt(j) - 97]);
            }
            res.add(sb.toString());

            /**
             * stream方法的效率并不高
             String decoded = words[i].chars().mapToObj(x -> MORSE[x - 97]).reduce((String a, String b) -> a + b).get();
             res.add(decoded);
             */

        }
        return res.size();
    }


    public static void main(String... args) {
        P804 instance = new P804();
        System.out.println(2 == instance.uniqueMorseRepresentations(new String[]{
                "gin", "zen", "gig", "msg"
        }));
    }

}
