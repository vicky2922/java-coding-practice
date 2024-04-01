package Leetcode;

public class Leetcode151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "    a good        example";
		System.out.println(reverseWords(str));

	}
	public static String reverseWords(String s) {
		s = s.trim();
		String[] str = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i = str.length-1; i>0; i--) {
			sb.append(str[i]).append(" ");
		}
		sb.append(str[0]);
		return sb.toString();
    }

}
