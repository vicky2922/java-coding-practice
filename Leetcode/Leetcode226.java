package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode226 {
	
	 static public TreeNode invertTree(TreeNode root) {
	       invertTreeRec(root);
	       return root;
	 }

	private static void invertTreeRec(TreeNode root) {
		if(root ==null) return;
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;
		
		invertTreeRec(root.left);
		invertTreeRec(root.right);
	}

	public static void main(String[] args) {

	}

}
/*
Invert Binary Tree
*/