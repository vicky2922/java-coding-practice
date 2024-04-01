package Leetcode;

public class Leetcode198HouseRobber {

	//dynamic programming
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));

	}
	public static int rob(int[] nums) {
		int len = nums.length;
		int[] dp = new int[len];
		if(len <= 1) {
			return nums[0];
		} else {
			dp[0] = nums[0];
			dp[1] = nums[1];
			for(int i = 2 ; i<len; i++) {
				int max=Integer.MIN_VALUE;
				for(int j=0; j<i-1;j++) {
					if(max<dp[j]) {
						max=dp[j];
					}
				}
				dp[i] = max+nums[i];
			//	System.out.println(dp[i]);
			}
		}
        return Math.max(dp[len-1], dp[len-2]);
    }

}
