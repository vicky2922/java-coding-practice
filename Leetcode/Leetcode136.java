package Leetcode;

public class Leetcode136 {

	public static int singleNumber(int[] nums) {
		int answer=nums[0];
		for(int i =1;i<nums.length;i++) {
			answer = answer^nums[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] nums = {4,4,2,1,2};
		System.out.println(singleNumber(nums));
	}

}
