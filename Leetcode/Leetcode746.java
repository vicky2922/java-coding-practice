package Leetcode;

public class Leetcode746 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Explanation: You will start at index 0.
			- Pay 1 and climb two steps to reach index 2.
			- Pay 1 and climb two steps to reach index 4.
			- Pay 1 and climb two steps to reach index 6.
			- Pay 1 and climb one step to reach index 7.
			- Pay 1 and climb two steps to reach index 9.
			- Pay 1 and climb one step to reach the top.
			The total cost is 6.
		 */
		int[] cost = {1,100,1,1,1,100,1,1,100,1};
		int len = cost.length;
		int[] dp = new int[len+1];
		dp[0]=0;
		dp[1]=0;
		for(int i=2;i<len+1;i++) {
			dp[i]=Math.min(cost[i-1]+dp[i-1], cost[i-2]+dp[i-2]);
		}
		System.out.println(dp[len]);
	}

}
