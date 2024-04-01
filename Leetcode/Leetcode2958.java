package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2958 {

	public static void main(String[] args) {
		int[] nums = {1,2,1,2,1,2,1,2};
		Leetcode2958 obj = new Leetcode2958();
		System.out.println(obj.maxSubarrayLength(nums, 1));
	}
	
	public int maxSubarrayLength(int[] nums, int k) {
        int left = -1;
        int maxLength = 0;
        Map<Integer, Integer> occur = new HashMap<>();
        for(int right = 0 ; right < nums.length; right++) {
        	occur.put(nums[right], occur.getOrDefault(nums[right], 0)+1);
        	while(occur.get(nums[right])>k) {
        		left++;
        		occur.put(nums[left], occur.get(nums[left])-1);
        	}
        	maxLength = Math.max(maxLength, right-left);
        }
        return maxLength;
    }

}
/*

Length of Longest Subarray With at Most K Frequency

Medium

You are given an integer array nums and an integer k.

The frequency of an element x is the number of times it occurs in an array.

An array is called good if the frequency of each element in this array is less than or equal to k.

Return the length of the longest good subarray of nums.

A subarray is a contiguous non-empty sequence of elements within an array.

*/