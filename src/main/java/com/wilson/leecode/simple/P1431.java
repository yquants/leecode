package com.wilson.leecode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class P1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        List<Boolean> res = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= max ? Boolean.TRUE : Boolean.FALSE);
        }
        return res;
    }

    public static void main(String... args) {
        P1431 instance = new P1431();
    }

}
