package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode57 {

	public static void main(String[] args) {
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval = {4,8};
		Leetcode57 obj = new Leetcode57();
		System.out.println(Arrays.deepToString(obj.insert(intervals, newInterval)));
	}
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> mergedIntervals = new ArrayList<>();
		int newStart = newInterval[0], newEnd = newInterval[1];
		boolean inserted = false;
		for(int[] currInterval : intervals) {
			int currStart = currInterval[0], currEnd = currInterval[1];
			
			//if its already addedd
			//or currEnd < newStart
			if(currEnd < newStart || inserted) {
				mergedIntervals.add(new int[] {currStart, currEnd});
				continue;
			}
			
			newStart = Math.min(newStart, currStart);
			
			//if limit complete
			if(newEnd < currStart) {
				mergedIntervals.add(new int[]{newStart, newEnd});
				mergedIntervals.add(new int[]{currStart, currEnd});
				inserted=true;
				continue;
			}
			
			if(newEnd <= currEnd) {
				mergedIntervals.add(new int[]{newStart, currEnd});
				inserted=true;
			}
		}
		
		if(!inserted) {
			mergedIntervals.add(new int[]{newStart, newEnd});
		}
		
		return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	}

}
