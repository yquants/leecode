package com.wilson.leecode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/cells-in-a-range-on-an-excel-sheet/
 */
public class P2194 {

    public List<String> cellsInRange(String s) {
        String[] cells = s.split(":");
        int cStart = cells[0].charAt(0), cEnd = cells[1].charAt(0);
        //字符'1'对应的ASCII码是49
        int rStart = cells[0].charAt(1) - 48, rEnd = cells[1].charAt(1) - 48;

        List<String> res = new ArrayList<>();

        for (int i = cStart; i <= cEnd; i++) {
            for (int j = rStart; j <= rEnd; j++) {
                res.add((char) i + "" + j);
            }
        }

        return res;
    }

    public static void main(String... args) {
        P2194 instance = new P2194();

        instance.cellsInRange("K1:L2").stream().forEach(
                x -> System.out.println(x)
        );

        instance.cellsInRange("A1:F1").stream().forEach(
                x -> System.out.println(x)
        );
    }

}
