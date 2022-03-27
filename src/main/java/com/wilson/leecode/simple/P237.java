package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class P237 {

    public void deleteNode(ListNode node) {

        ListNode current = node;
        ListNode next = current.next;
        while (next != null){
            current.val = next.val;
            if (next.next != null) {
                next = next.next;
                current = current.next;
            }else{
                current.next = null;
                next =null;
            }
        }
    }
    public static void main(String... args) {
        P237 instance = new P237();
    }

}
