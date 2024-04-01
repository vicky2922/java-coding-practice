package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode206 {
	
	static public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null) {
        	next = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = next;
        }
        return prev;
    }
	
	static public ListNode reverseListWithRecursion(ListNode head) {
        if(head == null || head.next==null) {
        	return head;
        }
        
        ListNode rest = reverseListWithRecursion(head.next);
        head.next.next = head;
        head.next = null;
        
        return rest;
    }

	public static void main(String[] args) {

	}

}

/*
Reverse Linked List
*/