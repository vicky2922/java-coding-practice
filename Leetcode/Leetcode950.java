package Leetcode;

import java.util.Arrays;

public class Leetcode950 {

	public static void main(String[] args) {
		int[] deck = {17,13,11,2,3,5,7};
		Leetcode950 obj = new Leetcode950();
		Arrays.stream(obj.deckRevealedIncreasing(deck)).forEach(System.out::println);
	}
	
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] ans = new int[n];
        int deckIndex = 0;
        int ansIndex = 0;
        boolean skip = false;
        while(deckIndex<n) {
        	if(ans[ansIndex] == 0) {
        		if(!skip) {
        			ans[ansIndex] = deck[deckIndex];
        			deckIndex++;
        		}
        		skip = !skip;
        	}
        	ansIndex = (ansIndex+1)%n;
        }
        return ans;
    }

}
