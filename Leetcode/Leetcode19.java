package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode19 {
	
	static public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode first = head;
		ListNode second = head;
        for (int i = 0; i < n; i++) {
            if (second.next == null) {
                if (i == n - 1)
                    head = head.next;
                return head;
            }
            second = second.next;
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return head;
    }
	public static void main(String[] args) {
		
	}

}
