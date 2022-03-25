package com.wilson.leecode;

public class P83 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode lastNode = head;
        if (lastNode == null)
            return head;
        ListNode next = head.next;
        while (next != null){
            if (lastNode.val == next.val){
                lastNode.next = next.next;
            }
            else{
                lastNode = next;
            }
            next = next.next;
        }

        return head;
    }


    public static void main(String... args) {
    }

}
