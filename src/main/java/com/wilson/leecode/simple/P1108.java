package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/defanging-an-ip-address/
 */
public class P1108 {

    public String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }

    public static void main(String... args) {
        P1108 instance = new P1108();
        System.out.println(instance.defangIPaddr("1.1.1.1"));
    }

}
