package Leetcode;

public class Leetcode2444 {

	public static void main(String[] args) {
		int[] nums = {1,3,5,2,7,5};
		Leetcode2444 obj = new Leetcode2444();
		System.out.println(obj.countSubarrays(nums, 1, 5));
	}
	
	public long countSubarrays(int[] nums, int minK, int maxK) {
        int badIdx = -1;
        int start = -1;
        int end = -1;
        long ans = 0;
        for(int i = 0 ;i< nums.length; i++) {
        	if(nums[i] > maxK || nums[i] <minK) 
        		badIdx = i;
        	if(nums[i] == minK) 
        		start = i;
        	if(nums[i] == maxK)
        		end = i;
        	
        	ans += Math.max(0, Math.min(start, end)-badIdx);
        }
        return ans;
    }

}
/*

Count Subarrays With Fixed Bounds

Hard

You are given an integer array nums and two integers minK and maxK.

A fixed-bound subarray of nums is a subarray that satisfies the following conditions:

The minimum value in the subarray is equal to minK.
The maximum value in the subarray is equal to maxK.
Return the number of fixed-bound subarrays.

A subarray is a contiguous part of an array.

*/