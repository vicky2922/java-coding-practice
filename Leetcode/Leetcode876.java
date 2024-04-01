package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode876 {

	static public ListNode middleNode(ListNode head) {
		if(head == null || head.next==null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
        
    }

	public static void main(String[] args) {

	}

}

/*
876. Middle of the Linked List
*/