package Leetcode;
import java.util.Arrays;
//REMAINING
public class Leetcode1235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] startTime = {6,15,7,11,1,3,16,2};
		int[] endTime = {19,18,19,16,10,8,19,8};
		int[] profit = {2,9,1,19,5,7,3,19};
		System.out.println("Max profit = "+jobScheduling(startTime, endTime, profit));
	}
	
	//2 9 1 19 
	public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
		int len = startTime.length;
		int maxProfit = Integer.MIN_VALUE;
		int[] dp = new int[len];
		Arrays.fill(dp, 0);
		dp[0]= profit[0];
		for (int i = 1; i < len; i++) {
			for(int j=0; j<i;j++ ) {
				if(endTime[j]<=startTime[i] || endTime[i]<=startTime[j]) {
					dp[i]=profit[i]+dp[j];
				} else {
					dp[i] = Math.max(dp[i], profit[i]);
				}
			}
			
		}
		for (int i = 0; i < len; i++) {
			System.out.print(dp[i]+ " ");
			if(maxProfit<dp[i]) {
				maxProfit=dp[i];
			}
		}
		System.out.println();
		return maxProfit;
	}

}
