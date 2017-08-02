package com.algorithms.lists;

import java.util.Stack;

/**
 * Created by kmulpuri on 7/3/17.
 */

class Node {
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}

public class ReverseSingleLinkedList {

    public Node createList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        return n1;
    }

    public static void printList(Node head) {
        while(head != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }

    public Node reverseListUsingStack(Node head) {
        Node root = head;
        Stack<Node> stack = new Stack<>();
        while(root != null) {
            stack.push(root);
            root = root.next;
        }
        Node temp = null;
        if(!stack.isEmpty()) head = temp = stack.pop();
        while(!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public Node reverseListUsingStack_SwapValues(Node head) {
        Node root = head;
        Stack<Integer> stack = new Stack<>();
        while(root != null) {
            stack.push(root.val);
            root = root.next;
        }
        root = head;
        while(!stack.isEmpty()) {
            root.val = stack.pop();
            root = root.next;
        }
        return head;
    }

    public Node reverseList_iterative(Node head) {
        Node next = null;
        Node prev = null;
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public Node reverseList_recursive(Node head) {
        Node rest = null;
        if(head.next == null)
            return head;
       Node next_node = head.next;
       rest = reverseList_recursive(next_node);
       head.next.next = head;
       head.next = null;
       return rest;
    }

    public static void main(String args[]){
        ReverseSingleLinkedList rll = new ReverseSingleLinkedList();
        Node head = rll.createList();
        printList(head);
        //printList(rll.reverseListUsingStack(head));
        //printList(rll.reverseListUsingStack_SwapValues(head));
        //printList(rll.reverseList_iterative(head));
        printList(rll.reverseList_recursive(head));
    }
}
