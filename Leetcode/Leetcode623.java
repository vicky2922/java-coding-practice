package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

import Leetcode.resources.TreeNode;

public class Leetcode623 {

	public static void main(String[] args) {

	}
	
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
    	if(depth==1) {
    		TreeNode newNode = new TreeNode(val);
    		newNode.left=root;
    		root = newNode;
    		return root;
    	}
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.add(root);
        int level=1;
        while(level<depth-1) {
        	int n = bfs.size();
        	for(int i = 0 ; i<n ;i++) {
        		TreeNode node = bfs.poll();
        		if(node.left!=null)
        			bfs.add(node.left);
        		if(node.right!=null)
        			bfs.add(node.right);
        	}
        	level++;
        }
        while(!bfs.isEmpty()) {
        	TreeNode node = bfs.poll();
        	if(node.left!=null) {
        		TreeNode leftNode = node.left;
        		TreeNode newNode = new TreeNode(val);
        		node.left = newNode;
        		newNode.left = leftNode;
        	} else {
        		TreeNode newNode = new TreeNode(val);
        		node.left = newNode;
        	}
        	if(node.right!=null) {
        		TreeNode rightNode = node.right;
        		TreeNode newNode = new TreeNode(val);
        		node.right = newNode;
        		newNode.right = rightNode;
        	} else {
        		TreeNode newNode = new TreeNode(val);
        		node.right = newNode;
        	}
        }
        return root;
    }

}
