package Leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode1642 {

	public static int furthestBuilding(int[] heights, int bricks, int ladders) {
		int i=0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(i = 0; i< heights.length-1;i++) {
			if(heights[i+1]<=heights[i]) {
				continue;
			} else if(heights[i+1]>heights[i]){
				int bricksNeeded = heights[i+1]-heights[i];
				bricks -= bricksNeeded;
				pq.add(bricksNeeded);
				if(!pq.isEmpty() && bricks<0) {
					bricks+=pq.peek();
					pq.poll();
					ladders--;
				}
				if(ladders<0) {
					break;
				}
			}
		/*	if(bricks>=(heights[i+1]-heights[i])) {
				bricks=bricks-(heights[i+1]-heights[i]);
				continue;
			}
			if(ladders>0) {
				ladders--;
				continue;
			}
			break;*/
		}
        return i;
    }

	public static void main(String[] args) {
		int[] heights = {1,5,1,2,3,4,10000};
		System.out.println(furthestBuilding(heights, 4, 1));
	}

}
