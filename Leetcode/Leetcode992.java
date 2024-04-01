package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode992 {

	public static void main(String[] args) {
		int[] nums = {1,2,1,2,3};
		Leetcode992 obj = new Leetcode992();
		System.out.println(obj.subarraysWithKDistinct(nums, 2));
	}
	
	public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindowAtmost(nums, k) - slidingWindowAtmost(nums, k-1);
    }

	private int slidingWindowAtmost(int[] nums, int k) {
		int start = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int ans = 0;
		for(int end = 0 ; end<nums.length; end++) {
			map.put(nums[end], map.getOrDefault(nums[end], 0)+1);
			
			while(map.size()>k) {
				map.put(nums[start], map.get(nums[start])-1);
				
				if(map.get(nums[start]) == 0)
					map.remove(nums[start]);
				
				start++;
			}
			
			ans += end-start+1;
		}
		return ans;
	}

}

/*
Subarrays with K Different Integers

Hard

Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.

 
*/