package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/design-parking-system/
 */
public class P1603 {

    private final int maxBig;
    private final int maxMedium;
    private final int maxSmall;

    private int curBig = 0, curMedium = 0, curSmall = 0;

    public P1603(int big, int medium, int small) {
        this.maxBig = big;
        this.maxMedium = medium;
        this.maxSmall = small;
    }

    public boolean addCar(int carType) {

        switch (carType) {
            case 1:
                return curBig++ < maxBig;
            case 2:
                return curMedium++ < maxMedium;
            case 3:
                return curSmall++ < maxSmall;
            default:
                return false;
        }
    }


    public static void main(String... args) {
    }

}
