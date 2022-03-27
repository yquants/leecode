package com.wilson.leecode.simple;

public class P67 {

    public String addBinary(String a, String b) {

        int len = a.length() > b.length() ? a.length() : b.length();

        char[] res = new char[len];
        len--;

        char jw = '0';
        int i = a.length() - 1;
        int j = b.length() - 1;

        for (; i >= 0 && j >= 0; i--, j--) {
            int v = add(a.charAt(i), b.charAt(j), jw);
            jw = v >= 10 ? '1' : '0';
            res[len--] = v % 10 == 1 ? '1' : '0';
        }

        while (i >= 0) {
            int v = add(a.charAt(i), jw);
            jw = v >= 10 ? '1' : '0';
            res[len--] = v % 10 == 1 ? '1' : '0';
            i--;
        }

        while (j >= 0) {
            int v = add(b.charAt(j), jw);
            jw = v >= 10 ? '1' : '0';
            res[len--] = v % 10 == 1 ? '1' : '0';
            j--;
        }

        return jw == '0' ? new String(res) : "1" + new String(res);
    }


    private int add(char a, char b) {
        if (a != b)
            return 1;
        if (a == '1')
            return 10;
        return 0;
    }

    private int add(char a, char b, char c) {
        int v = add(a, b);
        if (c == '0')
            return v;
        if (v == 1)
            return 10;
        return v + 1;
    }

    public static void main(String... args) {
        P67 p67 = new P67();
        System.out.println("0".equals(p67.addBinary("0", "0")));
    }

}
