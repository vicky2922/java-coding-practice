package Leetcode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Leetcode300 {
	public static int lengthOfLIS(int[] nums) {
	/*	int l = nums.length;
		int[] dp = new int[l];
		Arrays.fill(dp, 1);
		for(int i = 1; i<l;i++) {
			for(int j = 0; j<i;j++) {
				if(nums[i]>nums[j] && dp[j]+1>dp[i]) {
					dp[i] = dp[j]+1;
				}
			}
		}
		OptionalInt max = Arrays.stream(dp).max();
        return max.getAsInt();
        */
		
		int[] ar = Arrays.stream(nums).distinct().sorted().toArray();
		int n = nums.length;
		int m = ar.length;
		int dp[][] = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (nums[i - 1] == ar[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[n][m];
    }
	public static void main(String[] args) {
		int[] nums = {1,3,6,7,9,4,10,5,6};
		System.out.println(lengthOfLIS(nums));
	}

}
