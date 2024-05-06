package Leetcode.may24;

import Leetcode.resources.ListNode;

public class May5_237 {

	public static void main(String[] args) {

	}
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
