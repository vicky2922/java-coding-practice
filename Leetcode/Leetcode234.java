package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode234 {

	public static void main(String[] args) {

	}
	
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
            return true;
		ListNode fast = head;
		ListNode slow =head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		ListNode prev = null;
		while(slow!=null) {
			ListNode next = slow.next;
			slow.next = prev;
			prev=slow;
			slow=next;
		}
		
		while(prev!=null) {
			if(head.val != prev.val) 
				return false;
			head=head.next;
			prev=prev.next;
		}
        return true;
    } 
	
	//1->2->2->1->null
//1st h		s	  f
//    1->2  null<-2<-1
//2nd h      s,n     p

}
