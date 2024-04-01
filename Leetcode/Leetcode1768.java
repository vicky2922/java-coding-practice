package Leetcode;

public class Leetcode1768 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "xyz";
		System.out.println(mergeAlternately(str1, str2));
	}
	
	public static String mergeAlternately(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		StringBuilder str = new StringBuilder();
		for(int i = 0 ;i< Math.min(len1, len2); i++) {
			str.append(word1.charAt(i)).append(word2.charAt(i));
		}
		if(len1<len2) {
			str.append(word2.substring(len1));
		} else {
			str.append(word1.substring(len2));
		}
		return str.toString();
    }

}
