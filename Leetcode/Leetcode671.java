package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode671 {
	static  public int findSecondMinimumValue(TreeNode root) {
        return findMin(root, root.val);
    }
	
	private static int findMin(TreeNode root, int val) {
		if(root==null)
			return -1;
		if(root.val > val) {
			return root.val;
		}
		int x = findMin(root.left, val);
		int y = findMin(root.right, val);
		
		if(x==-1)
			return y;
		if(y==-1)
			return x;
		
		return Math.min(x, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
