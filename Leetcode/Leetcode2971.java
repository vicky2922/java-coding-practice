package Leetcode;

import java.util.Arrays;

public class Leetcode2971 {

	public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = n - 1; i >= 2; i--) {
            if (sum - nums[i] > nums[i]) {
                return sum;
            }
            sum -= nums[i];
        }
        return -1;    }
	
	public static void main(String[] args) {
		int[] nums = {5,5,50};
		System.out.println(largestPerimeter(nums));
	}

}
