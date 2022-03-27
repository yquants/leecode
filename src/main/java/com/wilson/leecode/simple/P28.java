package com.wilson.leecode.simple;

public class P28 {
    public int strStr(String haystack, String needle) {


        int targetLen = needle.length();
        if (targetLen == 0)
            return 0;

        char c = needle.charAt(0);
        for (int i = 0; i <= haystack.length() - targetLen; i++) {
            if (haystack.charAt(i) == c){
                if (haystack.substring(i, i + targetLen).equals(needle))
                    return i;
            }
        }
        return -1;

    }

    public static void main(String... args) {
        P28 p28 = new P28();
        System.out.println(p28.strStr("hello","ll"));
    }


}
