package Leetcode;

public class Leetcode713 {

	public static void main(String[] args) {
		int[] nums = {10,5,2,6};
		Leetcode713 obj = new Leetcode713();
		System.out.println(obj.numSubarrayProductLessThanK(nums, 100));

	}
	
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1;
        int left = 0;
        int count = 0;
        for(int right = 0 ; right < nums.length; right++) {
        	prod *= nums[right];
        	if(prod >= k && left <= right) {
        		prod /= nums[left];
        		left++;
        	}
        	count += right - left + 1;
        }
        return count;
    }

}
