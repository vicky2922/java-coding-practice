package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
	
	public static int lengthOfLongestSubstring(String str) {
		int end=0,start=0,max=0;
		Set<Character> set = new HashSet<>();
		while(end<str.length()) {
			if(!set.contains(str.charAt(end))) {
				set.add(str.charAt(end));
				max= Math.max(set.size(), max);//keep track of max lenght
				end++;
			} else {
				set.remove(str.charAt(start));//slide window to make unique substring
				start++;
			}
		}
        return max;
        /*
         int n = s.length();
        int maxLen = 0;
        int[] index = new int[128]; // Array to store the index of characters

        for (int left = 0, right = 0; right < n; right++) {
            char ch = s.charAt(right);
            left = Math.max(left, index[ch]); // Update left pointer if character is repeated
            maxLen = Math.max(maxLen, right - left + 1);
            index[ch] = right + 1; // Update the index of current character
        }

        return maxLen;
         */
    }

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
