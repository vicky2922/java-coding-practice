package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

import Leetcode.resources.TreeNode;

public class Leetcode513 {

	public static int findBottomLeftValue(TreeNode root) {
		if(root == null) return -1;
		Queue<TreeNode> bfs = new LinkedList<>();
		int leftMostVal = 0;
		bfs.add(root);
		while(!bfs.isEmpty()) {
			TreeNode leftMost = bfs.poll();
			leftMostVal = leftMost.val;
			if(leftMost.right!=null) {
				bfs.add(leftMost.right);
			}
			if(leftMost.left!=null) {
				bfs.add(leftMost.left);
			}
		}
        return leftMostVal;
    }
	public static void main(String[] args) {

	}

}

/*
513. Find Bottom Left Tree Value

Given the root of a binary tree, return the leftmost value in the last row of the tree.
*/ 