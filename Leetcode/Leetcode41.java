package Leetcode;

public class Leetcode41 {

	public static void main(String[] args) {
		int[] nums = {3,4,-1,1,2};
		Leetcode41 obj = new Leetcode41();
		System.out.println(obj.firstMissingPositive(nums));
	}
	
	public int firstMissingPositive(int[] nums) {
		int n = nums.length;
        for(int i = 0 ; i< n ; i++) {
        	if(nums[i] <= 0 || nums[i] > n) {
        		nums[i] = n+1;
        	}
        }
        
        for(int i = 0 ; i<n;i++) {
        	int num = Math.abs(nums[i]);
        	if(num>n) {
        		continue;
        	}
        	num--;
        	if(nums[num]>0) {
        		nums[num] *= -1;
        	}
        }
        
        for(int i = 0 ; i<n; i++) {
        	if(nums[i] >=0 ) {
        		return i+1;
        	}
        }
        return n+1;
    }

}
/* First Missing Positive

Hard

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

*/
