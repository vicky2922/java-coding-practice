package Leetcode;

public class Leetcode28 {

	public static int strStr(String haystack, String needle) {
		/*
		haystack="#"+haystack+"#";
		String[] str = haystack.split(needle);
		if(str[0].length() == haystack.length()) {
			return -1;
		}
        return str[0].length()-1;
        */
		return haystack.indexOf(needle);
    }

	public static void main(String[] args) {
		String s = "leetcodeleet";
		String t = "leet";
		System.out.println(strStr(s, t));
	}

}
