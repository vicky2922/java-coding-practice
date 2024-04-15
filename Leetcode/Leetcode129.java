package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode129 {

	public static void main(String[] args) {
		
	}
	
	public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

	private int dfs(TreeNode root, int sumTillNow) {
		if(root == null)
			return 0;
		sumTillNow = sumTillNow*10 + root.val;
		if(root.left==null && root.right==null)
			return sumTillNow;
		return dfs(root.left, sumTillNow) + dfs(root.right, sumTillNow);
	}
	
	

}
