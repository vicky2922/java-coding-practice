package Leetcode;

import java.util.Arrays;

public class Leetcode997 {
	
	 static public int findJudge(int n, int[][] trust) {
		 if(n==1)
			 return -1;
		 boolean[] trustSomeone = new boolean[n+1];
		 int[] trustCount = new int[n+1];
		 Arrays.fill(trustSomeone, false);
		 Arrays.fill(trustCount, 0);
		 trustSomeone[0]=true;
		 int len = trust.length;
		 for(int i = 0; i<len ;i++) {
			 trustSomeone[trust[i][0]]=true;
			 trustCount[trust[i][1]]++;
		 }
		 for(int i = 1; i<n+1 ;i++) {
			 if(!trustSomeone[i] && trustCount[i]==n-1)
				 return i;
		 }
	     return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] trust = {{1,2}};
		System.out.println(findJudge(2, trust));
	}

}

/*
In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

 

Example 1:

Input: n = 2, trust = [[1,2]]
Output: 2
Example 2:

Input: n = 3, trust = [[1,3],[2,3]]
Output: 3

*/