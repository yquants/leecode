package com.wilson.leecode.simple.learn;

/**
 * https://leetcode-cn.com/problems/xoh6Oh/submissions/
 * <p>
 * 考点：
 * <li>除法可以用<b>位操作符</b>或<b>减法</b>来实现</li>
 * <li>a -= b; 的效率远高于 a = a - b;</li>
 * <li>int的极值，<b>|Integer.MIN_VALUE| = |Integer.MAX_VALUE| + 1</b> </li>
 * <li>判断两个数是否同号，可以用异或操作，int sign = (a >0)^(b>0)? -1 : 1; </li>
 */
public class OfferII001 {

    public int divide(int a, int b) {
        if (b == -1)
            return a != Integer.MIN_VALUE? -a: Integer.MAX_VALUE;
        if (b == 1)
            return a;

        return this.divideByShifting(a, b);
    }

    private int divideByMinus(int a, int b) {
        int aa = a;
        int bb = b;
        int r = 0;
        if (a > 0) {
            aa = -a;
        }
        if (b > 0)
            bb = -b;

        while (aa <= bb) {
            r++;
            aa -= bb;
        }

        if ((a > 0) ^ (b > 0)) {
            r = -r;
        }

        return r;
    }

    private int divideByShifting(int a, int b) {
        int aa = a > 0 ? -a : a;
        int bb = b > 0 ? -b : b;
        if (aa > bb)
            return 0;
        int cc = bb;
        int r = 1;

        while (bb << 1 < 0 && aa <= (bb<<1)) {
            r = r << 1;
            bb = bb << 1;
        }
        aa = aa -bb;
        while (aa <= cc){
            r ++;
            aa -= cc;
        }

        if ((a > 0) ^ (b > 0))
            return -r;

        return r;
    }

    public static void main(String... args) {
        OfferII001 offerII001 = new OfferII001();
//        System.out.println(offerII001.divide(10, 6));
        System.out.println(-2147483648 == offerII001.divide(-2147483648, 1));
        System.out.println(2147483647 == offerII001.divide(-2147483648, -1));
        System.out.println(offerII001.divide(-2147483648, 2));
        System.out.println(offerII001.divide(-2147483648, -2));
        System.out.println(2147483647 == offerII001.divide(2147483647, 1));
        System.out.println(-2147483647 == offerII001.divide(2147483647, -1));
        System.out.println(offerII001.divide(2147483647, 2));
        System.out.println(offerII001.divide(2147483647, -2));

//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
    }

}
