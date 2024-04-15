package Leetcode;

import java.util.ArrayList;
import java.util.List;

import Leetcode.resources.TreeNode;

public class Leetcode144_145 {

	public static void main(String[] args) {

	}
	List<Integer> ans = new ArrayList<>();
	
    public List<Integer> preorderTraversal(TreeNode root) {
    	pretraversal(root);
        return ans;
    }
	private void pretraversal(TreeNode root) {
		if(root==null)
			return;
		ans.add(root.val);
		pretraversal(root.left);
		pretraversal(root.right);
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		posttraversal(root);
        return ans;
    }
	private void posttraversal(TreeNode root) {
		if(root==null)
			return;
		posttraversal(root.left);
		posttraversal(root.right);
		ans.add(root.val);
	}

}

/*

PREORDER  and POSTORDER TRAVERSAL

*/