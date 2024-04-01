package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode543 {

	public static int diameterOfBinaryTree(TreeNode root) {
		if(root==null) return 0;
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		int lDiameter  = diameterOfBinaryTree(root.left);
		int rDiameter = diameterOfBinaryTree(root.right);
		
		return Math.max(lHeight+rHeight, Math.max(lDiameter, rDiameter));
	}

	private static int height(TreeNode root) {
		if(root == null) return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
543. Diameter of Binary Tree
Easy
Topics
Companies
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.
*/