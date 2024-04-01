package Leetcode;

public class Leetcode58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "    a good        example";
		System.out.println(lengthOfLastWord(str));

	}
	public static int lengthOfLastWord(String s) {
		/*
		s = s.trim();
		String[] str = s.split("\\s+");
		return str[str.length-1].length();
		*/
		
		s = s.trim();
		int count=0;
		for(int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i)==' ') {
				break;
			}
			count++;
		}
		return count;
		
		
    }

}
