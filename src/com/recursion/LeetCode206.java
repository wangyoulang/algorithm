package com.recursion;

import com.common.ListNode;

import java.util.List;

/**
 * 206 反转链表
 */
public class LeetCode206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = null;
        ListNode rev = reverseList(head);
        System.out.println();
    }
    public static ListNode reverseList(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}
