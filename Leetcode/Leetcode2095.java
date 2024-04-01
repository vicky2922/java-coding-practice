package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode2095 {

	static public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) {
        	head=null;
        	return head;
        }
        ListNode fast = head;
        ListNode  slow = head;
        while(fast!=null && fast.next!=null) {
        	slow = slow.next;
        	fast=fast.next.next;
        }
        if(slow.next!=null) {
        	slow.val = slow.next.val;
        	slow.next = slow.next.next;
        } else {
        	head.next = null;
        }
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

