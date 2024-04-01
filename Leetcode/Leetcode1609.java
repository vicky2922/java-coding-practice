package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

import Leetcode.resources.TreeNode;

public class Leetcode1609 {

	static public boolean isEvenOddTree(TreeNode root) {
		if(root==null) return true;
		Queue<TreeNode> bfs = new LinkedList<>();
		
		bfs.add(root);
		int level=0;
		
		while(!bfs.isEmpty()) {
			int size = bfs.size();
			int x= level%2==0  ? Integer.MIN_VALUE: Integer.MAX_VALUE;
			
			for(int i = 0 ; i<size; i++) {
				TreeNode node =bfs.poll();
				
				//at even level
				if(level%2==0) {
					//odd value and increasing
					if(node.val%2!=1 || node.val<=x) {
						return false;
					}
				} else if(level%2==1) {//at odd level
					if(node.val%2!=0 ||node.val>=x) {//even value and decresing
						return false;
					}
					
				}
				x = node.val;
				
				if(node.left!=null)
					bfs.add(node.left);
				if(node.right!=null)
					bfs.add(node.right);
			}
			level++;
		}
        return true;
    }

	public static void main(String[] args) {

	}

}

/*
1609. Even Odd Tree
A binary tree is named Even-Odd if it meets the following conditions:

The root of the binary tree is at level index 0, its children are at level index 1, 
their children are at level index 2, etc.

For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.
*/