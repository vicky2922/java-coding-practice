package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode560_930 {
	
	static public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefix = new HashMap<>();
        int count=0;
        int sum=0;
        prefix.put(0,1);
        for(int i =0;i<nums.length ;i++) {
        	sum += nums[i];
        	count += prefix.getOrDefault(sum-goal, 0);
        	prefix.put(sum, prefix.getOrDefault(sum, 0)+1);
        }
        return count;
    }

	public static void main(String[] args) {
		int[] nums = {1,0,1,0,1};
		System.out.println(numSubarraysWithSum(nums, 2));
	}
	//  1,0,1,0,1
	//0,1,1,2,2,3
	//0->1,1->2,2->2,3->1

}
/*
Subarray Sum Equals K

Given an array of integers nums and an integer k, 
return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Input: nums = [1,1,1], k = 2
Output: 2
*/