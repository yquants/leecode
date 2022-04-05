package com.wilson.leecode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/find-center-of-star-graph/
 */
public class P1791 {

    public int findCenter(int[][] edges) {

        return method2(edges);
    }

    private int method1(int[][] edges) {
        int res = -1;
        int max = -1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            int s = edges[i][0], e = edges[i][1];
            int occ = map.getOrDefault(s, 0) + 1;
            map.put(s, occ);
            if (occ > max) {
                res = s;
                max = occ;
            }

            occ = map.getOrDefault(e, 0) + 1;
            map.put(e, occ);
            if (occ > max) {
                res = e;
                max = occ;
            }
        }

        return res;

    }

    private int method2(int[][] edges) {
        int s = edges[0][0], e = edges[0][1];
        if (s == edges[1][0] || s == edges[1][1])
            return s;
        return e;
    }

    public static void main(String... args) {
        P1791 instance = new P1791();

        System.out.println(2 == instance.findCenter(new int[][]{
                {1, 2}, {2, 3}, {4, 2}
        }));

        System.out.println(1 == instance.findCenter(new int[][]{
                {1, 2}, {5, 1}, {1, 3}, {1, 4}
        }));
    }

}
