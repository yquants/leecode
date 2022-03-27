package com.wilson.leecode.simple;

public class P70 {

    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairs (n - 1) + climbStairs (n-2);
    }

    public static void main(String... args) {
        P70 p70 = new P70();
       System.out.println( 89 == p70.climbStairs(45));
    }

}
