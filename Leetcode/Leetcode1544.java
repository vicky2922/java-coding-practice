package Leetcode;

import java.util.Stack;

public class Leetcode1544 {

	public static void main(String[] args) {
		Leetcode1544 obj = new Leetcode1544();
		String s = "leEeetcode";//"abBAcC";
		System.out.println(obj.makeGood(s));
	}
	
	public String makeGood(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(stack.isEmpty()) {
				stack.push(c);
			} else {
				if(stack.peek() == c+32 || stack.peek() == c-32) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
		StringBuilder sGood = new StringBuilder();
		while(!stack.isEmpty()) {
			sGood.append(stack.pop());
		}
        return sGood.reverse().toString();
    }

}
