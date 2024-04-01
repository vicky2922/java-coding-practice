package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode61 {
	 public static ListNode rotateRight(ListNode head, int k) {
		 if(head == null || head.next==null || k==0) return head;
		 ListNode tail=head;
		 ListNode newHead=head;

		 int len=1;
		 while(tail.next!=null){
			 len++;
		     tail=tail.next;
		 }
		 tail.next=head;
		 k=k%len;
		 for(int i=0;i<len-k;i++)   
			 tail=tail.next;
		 newHead=tail.next;
		 tail.next=null;
		 return newHead;
	        
	}
	public static void main(String[] args) {

	}

}
/*
Rotate List
*/