package com.wilson.leecode;

public class P67 {

    public String addBinary(String a, String b) {

        int len = a.length() > b.length() ? a.length() : b.length();

        char[] res = new char[len];
        len--;

        char jw = '0';
        int i = a.length() - 1;
        int j = b.length() - 1;

        for (; i >= 0 && j >= 0; i--, j--) {
            int r = add(a.charAt(i), b.charAt(j), jw);
            switch (r) {
                case 11:
                    jw = '1';
                    res[len--] = '1';
                    break;
                case 10:
                    jw = '1';
                    res[len--] = '0';
                    break;
                case 0:
                    jw = '0';
                    res[len--] = '0';
                    break;
                default: // case 1:
                    jw = '0';
                    res[len--] = '1';
                    break;
            }
        }

        while (i >= 0) {
            int v = add(a.charAt(i), jw);
            switch (v) {
                case 11:
                    jw = '1';
                    res[len--] = '1';
                    break;
                case 10:
                    jw = '1';
                    res[len--] = '0';
                    break;
                case 0:
                    jw = '0';
                    res[len--] = '0';
                    break;
                default: // case 1:
                    jw = '0';
                    res[len--] = '1';
                    break;
            }
            i--;
        }

        while (j >= 0) {
            int v = add(b.charAt(j), jw);
            switch (v) {
                case 11:
                    jw = '1';
                    res[len--] = '1';
                    break;
                case 10:
                    jw = '1';
                    res[len--] = '0';
                    break;
                case 0:
                    jw = '0';
                    res[len--] = '0';
                    break;
                default: // case 1:
                    jw = '0';
                    res[len--] = '1';
                    break;
            }
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
