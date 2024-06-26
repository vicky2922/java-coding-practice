package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode101 {
	static public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
    }
	
	private static boolean isMirror(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 ==null) return true;
		
		if(root1!=null && root2!=null && root1.val == root2.val) {
			return (isMirror(root1.left, root2.right)
					&& isMirror(root1.right, root2.left));
		}
		 return false;
	}



	public static void main(String[] args) {

	}

}
/*
Symmetric Tree
*/