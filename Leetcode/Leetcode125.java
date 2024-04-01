package Leetcode;
/*
 * A phrase is a palindrome if, 
 * after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
	Given a string s, return true if it is a palindrome, or false otherwise.
	
	Example 1:
	Input: s = "A man, a plan, a canal: Panama"
	Output: true
	Explanation: "amanaplanacanalpanama" is a palindrome.
	
	Example 2:
	race a car
	false
 */
public class Leetcode125 {
	
	public static boolean isPalindrome(String s) {
		s=s.replaceAll("[^A-Za-z0-9]", "");
		s=s.toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
        return s.equals(sb.toString());
    }

	public static void main(String[] args) {
		String str=" ";
		System.out.println(isPalindrome(str));
		
	}

}
