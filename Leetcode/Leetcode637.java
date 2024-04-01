package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Leetcode.resources.TreeNode;

public class Leetcode637 {

	static public List<Double> averageOfLevels(TreeNode root) {
		if(root==null) return new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
		List<Double> output =new ArrayList<>();
		bfs.add(root);
		while(!bfs.isEmpty()) {
			double avg = 0.0;
            int n = bfs.size();
			for(int i=0; i<n;i++) {
				TreeNode node = bfs.poll();
				avg+=node.val;
				if(null!=node.left) {
					bfs.add(node.left);
				}
				if(null!=node.right) {
					bfs.add(node.right);
				}
			}
			avg=avg/n;
			output.add(avg);
		}
		return output;
    }
	
	public static void main(String[] args) {

	}

}
/*
 * Average of Levels in Binary Tree
 */
