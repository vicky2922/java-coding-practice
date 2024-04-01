package Leetcode;

public class Leetcode2962 {

	public static void main(String[] args) {
		int[] nums = {1,3,2,3,3};
		Leetcode2962 obj = new Leetcode2962();
		System.out.println(obj.countSubarrays(nums, 2));
	}
	
	public long countSubarrays(int[] nums, int k) {
		int max = 0;
		for(int n : nums) {
			max = Math.max(max, n);
		}
		
		int countMax = 0;
		int start = 0;
		long ans = 0;
		
		for(int n : nums) {
			if(n == max) 
				countMax++;
			while(countMax == k) {
				if(nums[start]==max) 
					countMax--;
				start++;
			}
			//System.out.println(start);
			ans += start;
		}
		return ans;
        
    }

}

/*
Count Subarrays Where Max Element Appears at Least K Times

Medium

You are given an integer array nums and a positive integer k.

Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.

A subarray is a contiguous sequence of elements within an array.
*/
