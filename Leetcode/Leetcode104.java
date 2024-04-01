package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode104 {
	
	static  public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max ( maxDepth(root.left) , maxDepth(root.right) );
    }

	public static void main(String[] args) {
	}

}
/*
Maximum Depth of Binary Tree
*/