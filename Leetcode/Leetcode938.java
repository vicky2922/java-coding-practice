package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode938 {
	
	public int traverse(TreeNode root, int sum, int low, int high) {
		
		if(root==null) {
			return sum;
		}
		
		if(root.val>=low && root.val<=high) {
			sum+=root.val;
		}
		sum=traverse(root.left,sum, low, high);
		sum=traverse(root.right,sum, low, high);
		return sum;
	}
	
	public int rangeSumBST(TreeNode root, int low, int high) {
        return traverse(root, 0, low, high);
    }

	public static void main(String[] args) {
		/*
		 * root = [10,5,15,3,7,null,18]
		 * low 7
		 * high 15
		 */
	}

}
