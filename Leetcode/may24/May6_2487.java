package Leetcode.may24;

import Leetcode.resources.ListNode;

public class May6_2487 {

	public static void main(String[] args) {

	}
	
	public ListNode removeNodes(ListNode head) {
        head = this.reverseList(head);
        ListNode curr = head;
        while(curr.next!=null) {
        	if(curr.next.val < curr.val) {
        		curr.next = curr.next.next;
        	}else{
        	curr = curr.next;
            }
        }
        head = this.reverseList(head);
        return head;
    }
	
	public ListNode reverseList(ListNode head) {
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

}
