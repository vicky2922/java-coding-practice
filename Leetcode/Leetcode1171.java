package Leetcode;

import java.util.HashMap;
import java.util.Map;

import Leetcode.resources.ListNode;

public class Leetcode1171 {
	
	static public ListNode removeZeroSumSublists(ListNode head) {
        ListNode startNode = new ListNode(0);
        startNode.next=head;
        
        int preFixSum = 0 ;
        Map<Integer, ListNode> map = new HashMap<>();
        map.put(preFixSum, startNode);
        
        while(head!=null) {
        	preFixSum+=head.val;
        	map.put(preFixSum, head);
        	head=head.next;
        }
        
        head = startNode;
        /*1,2,3,-3,1
        0->1->3->0->1
        this 0 to next 0 */
        /*1,2,3,-3,4
        0->1->3->6->3->7
        this 3 to next 3 */
        /*1,2,3,-3,-2
       	0->1->3->6->3->1
       	this 1 to next 1 */
        preFixSum=0;
        while(head!=null) {
        	preFixSum+=head.val;
        	head.next = map.get(preFixSum).next;
        	head = head.next;
        }
        return startNode.next;
    }
	
	public static void main(String[] args) {
		
	}

}
