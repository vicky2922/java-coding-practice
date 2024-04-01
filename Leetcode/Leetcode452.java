package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode452 {

	public static void main(String[] args) {
		int[][] points = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		Leetcode452 obj = new Leetcode452();
		System.out.println(obj.findMinArrowShots(points));
	}

	public int findMinArrowShots(int[][] points) {
		Arrays.sort(points, Comparator.comparing(e -> e[0]));
		
		int arrow=1;
		int end = points[0][1];
		
		for(int i = 1 ; i< points.length; i++) {
			int currStart = points[i][0];
			int currEnd = points[i][1];
			
			if(end < currStart) {
				arrow++;
				end = currEnd;
			} else {
				end = Math.min(end, currEnd);
			}
		}
		
		return arrow;
	}

}
