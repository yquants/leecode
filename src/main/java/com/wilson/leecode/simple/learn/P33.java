package com.wilson.leecode.simple.learn;

/**
 * https://leetcode-cn.com/problems/o8SXZn/
 */
public class P33 {


    public int storeWater(int[] bucket, int[] vat) {

        int min = 1000000;
        int second = 0;
        int max = 0;
        int[] needed = new int[bucket.length];

        for (int i = 0; i < bucket.length; i++) {
            int needed4i = ceilDiv(vat[i], bucket[i]);
            needed[i] = needed4i;
            if (needed4i >= max) {
                second = max;
                max = i;
            }
            if (needed4i < min)
                min = needed4i;
        }




//        needed[second]
        return max;
    }

    private int ceilDiv(int a, int b) {
        return (int) Math.ceil((double) a / b);
    }

    private int minTimes(int bucket, int vet){
        int times = ceilDiv(vet, bucket);
        int min = ceilDiv(vet, bucket);

        while (bucket <= vet/2){
            bucket ++;
            times ++;
            int tmp = times + ceilDiv(vet, bucket);
            if (tmp < min)
                min = tmp;
        }

        return min;
    }



    public static void main(String... args) {
        P33 p33 = new P33();
//        System.out.println(4 == p33.storeWater(new int[]{1, 3}, new int[]{6, 8}));
//        System.out.println(3 == p33.storeWater(new int[]{9,0,1}, new int[]{0,2,2}));

        System.out.println(p33.minTimes(5,16));
    }

}
