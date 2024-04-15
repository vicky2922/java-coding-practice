package Leetcode;

import java.util.ArrayList;
import java.util.List;

import Leetcode.resources.TreeNode;

public class Leetcode94 {

	public static void main(String[] args) {

	}
	List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
    	traversal(root);
        return ans;
    }
	private void traversal(TreeNode root) {
		if(root==null)
			return;
		traversal(root.left);
        ans.add(root.val);
        traversal(root.right);
	}

}

/*

INORDER TRAVERSAL

*/