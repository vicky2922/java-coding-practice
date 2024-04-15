package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode404 {

	public static void main(String[] args) {
		
	}
	int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        traversal(root);
        return sum;
    }
    
    private void traversal(TreeNode root) {
    	if(root == null)
    		return;
    	if(root.left != null && root.left.left==null && root.left.right==null)
    		sum += root.left.val;
    	traversal(root.left);
    	traversal(root.right);
    }

}
