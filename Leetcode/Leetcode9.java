package Leetcode;

public class Leetcode9 {
	public static boolean isPalindrome(int x) {
		StringBuilder sb = new StringBuilder(x+"");
		sb.reverse();
		//System.out.println(sb.toString());
		if(sb.toString().equals(x+"")) {
			return true;
		}
        return false;
    }
	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
	}

}
