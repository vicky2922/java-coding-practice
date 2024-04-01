package Leetcode;

public class Leetcode279 {

	public static int numSquares(int n) {
		if(n<=3) {
			return n;
		}
		int[] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		
		for(int i = 4; i<n+1;i++) {
			dp[i]=i;//for 4 -> 1+1+1+1 
			for (int j = 1; j <= Math.floor(Math.sqrt(i)); j++) {
				int temp = j * j;
				dp[i] = Math.min(dp[i], 1 + dp[i - temp]);
			}
		}
        return dp[n];
    }

	public static void main(String[] args) {
		System.out.println(numSquares(12));
	}

}
