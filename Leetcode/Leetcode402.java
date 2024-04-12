package Leetcode;

import java.util.Stack;

public class Leetcode402 {

	public static void main(String[] args) {
		String num = "1432219";
		Leetcode402 obj = new Leetcode402();
		System.out.println(obj.removeKdigits(num, 3));
	}
	
    public String removeKdigits(String num, int k) {
    	if(num.length()==k)
    		return "0";
        StringBuilder ans = new StringBuilder();
        Stack<Character> mono =new Stack<>();
        for(char c : num.toCharArray()) {
        	while(k>0 && !mono.isEmpty() && mono.peek()>c) {
        		k--;
        		mono.pop();
        	}
        	mono.push(c);
        }
        while(k-- > 0)
        	mono.pop();
        for(char c : mono) {
        	if(c == '0' && ans.length()==0)
        		continue;
        	ans.append(c);
        }
        return ans.length()==0 ? "0" : ans.toString();
    }

}

/*
 * Remove K Digits

MONOTONIC STACK

Medium

Given string num representing a non-negative integer num, and an integer k, 
return the smallest possible integer after removing k digits from num.

Input: num = "10200", k = 1
Output: "200"

Input: num = "1432219", k = 3
Output: "1219"

Input: num = "10", k = 2
Output: "0"
*/
