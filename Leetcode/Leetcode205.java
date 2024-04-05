package Leetcode;


public class Leetcode205 {

	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length())
            return false;
        int[] frqS = new int[127];
        int[] frqT = new int[127];
        for(int i =0; i<s.length();i++){
           if(frqS[s.charAt(i)] != frqT[t.charAt(i)])
        	   return false;
           frqS[s.charAt(i)] = i+1;
           frqT[t.charAt(i)] = i+1;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Leetcode205 obj = new Leetcode205();
		System.out.println(obj.isIsomorphic("badc", "baba"));
	}

}

/*
Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true
*/