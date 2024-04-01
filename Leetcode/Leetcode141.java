package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode141 {

	static public boolean hasCycle(ListNode head) {
		if(head==null || head.next==null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next!=null || fast.next.next!=null) {
			if(slow==fast) {
				return true;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
        return false;
    }
	
	public static void main(String[] args) {

	}

}
/*
 * cycle in linkedlist
 */
