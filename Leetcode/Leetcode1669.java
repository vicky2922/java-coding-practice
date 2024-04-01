package Leetcode;

import Leetcode.resources.ListNode;

public class Leetcode1669 {

	public static void main(String[] args) {

	}

	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		int i = 0;
		ListNode preA = list1;
		while (i != a - 1) {
			preA = preA.next;
			i++;
		}
		ListNode postB = preA;
		while (i != b + 1) {
			postB = postB.next;
			i++;
		}
		ListNode lastList2 = list2;
		while (lastList2.next != null) {
			lastList2 = lastList2.next;
		}
		preA.next = list2;
		lastList2.next = postB;
		return list1;
	}
}
