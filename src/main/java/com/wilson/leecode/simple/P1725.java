package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 */
public class P1725 {

    public int countGoodRectangles(int[][] rectangles) {
        int maxSqure = 0;
        int number = 0;
        for (int i = 0; i < rectangles.length; i++) {

            int current = this.getMaxSquare(rectangles[i]);
            if (current == maxSqure)
                number++;

            if (current > maxSqure) {
                maxSqure = current;
                number = 1;
            }
        }
        return number;
    }

    private int getMaxSquare(int[] rectangle) {
        if (rectangle[0] > rectangle[1])
            return rectangle[1];
        return rectangle[0];
    }

    public static void main(String... args) {
        P1725 instance = new P1725();
        System.out.println(3 == instance.countGoodRectangles(new int[][]{
                {5, 8}, {3, 9}, {5, 12}, {16, 5}
        }));
    }

}
