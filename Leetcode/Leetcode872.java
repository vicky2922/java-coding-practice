package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode872 {

	
	public String DFS(TreeNode root, String s) {
		
		if(root.left==null && root.right==null) {
			return s+root.val+"#";
		} 
		if(root.left!=null){
            s = DFS(root.left,s);
        }
		if(root.right!=null){
            s = DFS(root.right,s);
        }
		return s;
	}
	
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		String leaf1 = DFS(root1, "");
		String leaf2 = DFS(root2, "");
		if(leaf1.equals(leaf2)) {
			return true;
		}
        return false;
    }

	public static void main(String[] args) {
		/*
		 * root1 = [3,5,1,6,2,9,8,null,null,7,4]
		 * root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
		 */
	}

}
