package Leetcode;

import java.util.Arrays;

public class Leetcode55 {
	
	static public boolean canJump(int[] nums) {
		
		int n = nums.length-1;

        for(int i=n; i>=0; i--){
            if(nums[i]+i >= n){
                n = i;
            }
        }
            if(n == 0){
              return true;
            }

        return false;
        
        /*
		int n = nums.length;
		boolean[] dp = new boolean[n];
		Arrays.fill(dp, false);
		dp[n-1]=true;
		for(int i = n-2;i>=0;i--) {
			System.out.println(i);
			for(int j=0;j<nums[i]&&(i+j+1)<n;j++) {
				System.out.println(i+" "+j);
				if(dp[i+j+1]) {
					dp[i]=true;
					break;
				}
				System.out.println(i+" "+j+" "+dp[i]);
			}
		}
        return dp[0];
        */
    }

	public static void main(String[] args) {
		int[] nums= {3,2,1,0,4};//{2,3,1,1,4};//{2,5,0,0};//
		System.out.println(canJump(nums));
		
	}

}

/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index. 
 */
