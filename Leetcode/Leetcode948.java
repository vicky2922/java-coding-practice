package Leetcode;

import java.util.Arrays;

public class Leetcode948 {
	
	static public int bagOfTokensScore(int[] tokens, int power) {
		Arrays.sort(tokens);
		int score = 0;
		int maxS = 0;
		int i = 0, j = tokens.length-1;
		while( i<=j) {
			if(tokens[i]<=power) {
				score++;
				power-=tokens[i];
				i++;
			} else if(score>0) {
				score--;
				power+=tokens[j];
				j--;
			} else {
				break;
			}
			maxS = Math.max(score, maxS);
		}
        return maxS;
    }

	public static void main(String[] args) {
		int[] token = {100,200,300,400};
		System.out.println(bagOfTokensScore(token, 200));
	}

}
