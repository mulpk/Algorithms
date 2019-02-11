package com.algorithms.lists;

import java.util.TreeSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class DeleteNthNodeFromEnd_SLL {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowPtr, fastPtr;
        slowPtr = fastPtr = head;
        // make the difference between pointer n
        while(n > 0 && fastPtr != null) {
            fastPtr = fastPtr.next;
            n--;
        }
        // if faster pointer is null then the node to be deleted is first one
        if(fastPtr == null) {
            return head.next;
        }
        // move the pointers till faster pointer reaches the end of list
        while(fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        // slower pointer must be at (n+1)th node from the end, so deleting nth node
        if(slowPtr.next != null) {
            slowPtr.next = slowPtr.next.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        //before
        printList(one);

        removeNthFromEnd(one, 2);
        //after
        printList(one);
    }
}

