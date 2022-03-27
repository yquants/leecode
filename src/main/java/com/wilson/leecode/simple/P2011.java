package com.wilson.leecode.simple;

/**
 *
 */
public class P2011 {

    public int finalValueAfterOperations(String[] operations) {

        int r = 0;
        for (String str: operations){
            switch (str){
                case "++X":
                case "X++":
                    r++;
                    break;
                case "--X":
                case "X--":
                    r--;
                    break;

            }
        }
        return r;
    }

    public static void main(String... args) {
        P2011 instance = new P2011();
    }

}
