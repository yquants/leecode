package com.wilson.leecode.simple;

public class P69 {
    public int mySqrt(int x) {

        return check(x, 0, x);

    }

    private int check(int x, int min, int max) {

        if (min * min == x)
            return min;
        if (max * max == x)
            return max;

        int mid = (min + max) / 2;
        int y = x / mid;
        if (y == mid)
            return mid;

        if (y > mid) {
            if (mid == max - 1)
                return mid;
            return check(x, mid, max);
        }

        if (mid == min + 1)
            return min;
        return check(x, min, mid);
    }

    public static void main(String... args) {

        P69 p69 = new P69();
        System.out.println(p69.mySqrt(2147395599));
    }


}
