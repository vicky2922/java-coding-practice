package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Leetcode.resources.TreeNode;

public class Leetcode102_103_107 {
	
	static public List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null) return new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
		List<List<Integer>> output =new ArrayList<>();
		bfs.add(root);
		/* int level=0; //leetcode 103 update */
		while(!bfs.isEmpty()) {
			List<Integer> subList = new ArrayList<Integer>();
            int n = bfs.size();
			for(int i=0; i<n;i++) {
				TreeNode node = bfs.poll();
				subList.add(node.val);
				if(null!=node.left) {
					bfs.add(node.left);
				}
				if(null!=node.right) {
					bfs.add(node.right);
				}
			}
			/*leetcode 103 update
			if(level%2==0) {
				output.add(subList);
			} else {
				Collections.reverse(subList);
				output.add(subList);
			}
			level++;
			*/
			output.add(subList);
		}
		/*leetcode 107 update
		Collections.reverse(output);
		*/
        return output;
    }

	public static void main(String[] args) {

	}

}
/*
 * Binary Tree Level Order Traversal
 */
