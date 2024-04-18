package Leetcode;

import Leetcode.resources.TreeNode;

public class Leetcode988 {

	public static void main(String[] args) {

	}
	public String smallestString = null;
    public String smallestFromLeaf(TreeNode root) {
    	dfs(root, new StringBuilder());
        return smallestString;
    }
    public void dfs(TreeNode root, StringBuilder str) {
    	if(root == null)
    		return;
    	str.insert(0, (char)('a'+root.val));
    	if(root.left==null && root.right==null) {
    		updateSmallestString(str.toString());
    	} else {
    		dfs(root.left, str);
    		dfs(root.right, str);
    	}
    	str.deleteCharAt(0);
    }
	public void updateSmallestString(String str) {
		if(smallestString == null || str.compareTo(smallestString)<0) {
			smallestString = str;
		}
	}

}
