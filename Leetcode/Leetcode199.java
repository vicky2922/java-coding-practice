package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Leetcode.resources.TreeNode;

public class Leetcode199 {
	
	static public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        if(root==null) return output;
        
        Queue<TreeNode> bfs = new LinkedList<>();
		bfs.add(root);
		
		while(!bfs.isEmpty()) {
			List<Integer> subList = new ArrayList<Integer>();
            int n = bfs.size();
			for(int i=0; i<n;i++) {
				TreeNode node = bfs.poll();
				if(i==n-1) {
					output.add(node.val);
				}
				if(null!=node.left) {
					bfs.add(node.left);
				}
				if(null!=node.right) {
					bfs.add(node.right);
				}
			}
		}
		return output;
    }

	public static void main(String[] args) {

	}

}
/*
Binary Tree Right Side View
*/