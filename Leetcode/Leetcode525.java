package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode525 {
	
	static public int findMaxLength(int[] nums) {
        int count=0, maxCount=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0 ; i< nums.length; i++) {
        	if(nums[i] == 0)
        		count-=1;
        	else
        		count+=1;
        	if(map.containsKey(count))
        		maxCount = Math.max(maxCount, i-map.get(count));
        	else
        		map.put(count, i);
        }
        return maxCount;
    }

	public static void main(String[] args) {
		int[] nums = {1,1,0,0,1,1,0,1,1};
		System.out.println(findMaxLength(nums));
	}
	
	//dry run
	//	 0,1,2, 3,4,5,6,7,8
	//   1,1,0, 0,1,1,0,1,1
	// 0,1,2,1, 0,1,2,1,2,3
//map -1,0,1,0,-1,0,1,0,1,8
//maxc 0,0,0,2, 4,4,4,6,6,6

}

/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
*/