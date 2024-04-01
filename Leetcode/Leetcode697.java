package Leetcode;

import java.util.Arrays;

public class Leetcode697 {
	
	public static int findShortestSubArray(int[] nums) {
		int[] dp = new int[50000];
		int[] dp2 = new int[50000];
		Arrays.fill(dp, 0);
		Arrays.fill(dp2, -1);
		int max=0;
		for(int i = 0 ;i< nums.length;i++) {
			dp[nums[i]]++;
			if(max<dp[nums[i]]) {
				max=dp[nums[i]];
			}
			if(dp2[nums[i]]==-1) {
				dp2[nums[i]]=i;
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=nums.length-1;i>=0 ;i--) {
			if(max==dp[nums[i]] && min>=(i-dp2[nums[i]]+1)) {
				min=i-dp2[nums[i]]+1;
			}
			dp[nums[i]]=0;
		}
        return min;
    }

	public static void main(String[] args) {
		int[] nums = {2,1,1,2,1,3,3,3,1,3,1,3,2};
		System.out.println(findShortestSubArray(nums));
	}

}
