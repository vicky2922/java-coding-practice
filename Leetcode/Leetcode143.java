package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode143 {

	public static void main(String[] args) {

	}
	
	public void reorderList(ListNode head) {
		if (head == null || head.next == null)
            return;
		ListNode fast = head;
		ListNode slow =head;
		
		//find middle
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		//revrese from middle to last
		ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		//til here similer to 234
		
		//zig-zag distribute
		ListNode l1 =head;
		ListNode headNext = null;
		while(prev!=null) {
			headNext = l1.next;
			l1.next = prev;
			l1 = prev;
			prev = headNext;
		}
		
    }
	//1->2->3->4->5
	//1->2->3NL4<-5
	//h			  p
	
	//1->2->3->null
	
	//5->4->null
	
	
	

}

/*
143. Reorder List

You are given the head of a singly linked-list. The list can be represented as:

L0 -> L1 -> … -> Ln - 1 -> Ln
Reorder the list to be on the following form:

L0 -> Ln -> L1 -> Ln - 1 -> L2 -> Ln - 2 -> …

*/
