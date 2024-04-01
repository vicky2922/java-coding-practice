package Leetcode;

public class Leetcode2108 {

	public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            if(sb.reverse().toString().equals(words[i])) {
            	return words[i];
            }
        }
        return "";
    }
	
	public static void main(String[] args) {
		String[] words = {"def","ghi"};
		System.out.println("first palindrom - "+firstPalindrome(words));
	}

}
