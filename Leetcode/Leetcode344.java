package Leetcode;

public class Leetcode344 {
	
	static public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<j;i++,j--) {
        	char t = s[i];
        	s[i]=s[j];
        	s[j]=t;
        }
    }

	public static void main(String[] args) {

	}

}

/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/