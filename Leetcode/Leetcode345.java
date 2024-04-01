package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode345 {
	 public static String reverseVowels(String s) {
	        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
	        Set<Character> vowelsSet = new HashSet<>();
	        for(int i = 0 ; i<vowels.length;i++) {
	        	vowelsSet.add(vowels[i]);
	        }
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0 ; i<s.length();i++) {
	        	if(vowelsSet.contains(s.charAt(i))) {
	        		sb.append(s.charAt(i));
	        	}
	        }
	        sb.reverse();
	        String vowelString = sb.toString();
	        int j =0;
	        StringBuilder output = new StringBuilder();
	        for(int i = 0 ; i<s.length();i++) {
	        	if(vowelsSet.contains(s.charAt(i))) {
	        		output.append(vowelString.charAt(j++));
	        	} else {
	        		output.append(s.charAt(i));
	        	}
	        }
	        return output.toString();
	   }
	 
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(reverseVowels(s));

	}

}
