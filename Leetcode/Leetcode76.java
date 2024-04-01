package Leetcode;

public class Leetcode76 {

	public static String minWindow(String s, String t) {
		String[] str = s.split(t);
		System.out.println(str[1]);
        return "$$";
    }
	public static void main(String[] args) {
		String s = "#leetcode#";
		String t = "leet";
		System.out.println(minWindow(s, t));

	}

}
