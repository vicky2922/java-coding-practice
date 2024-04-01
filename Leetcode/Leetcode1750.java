package Leetcode;

public class Leetcode1750 {

	static public int minimumLength(String s) {
		int n = s.length();
		int start = 0;
		int end = n-1;
		while(start<end) {
			if(s.charAt(start)==s.charAt(end)) {
				char temp = s.charAt(start);
				while( start<n && s.charAt(start)==temp) {
					start++;
				}
				while(end>=0 && s.charAt(end)==temp ) {
					end--;
				}
			} else {
				break;
			}
		}
		//System.out.println(s.substring(start,end+1));
        return Math.max(0, end+1-start);
    }
	
	public static void main(String[] args) {
		System.out.println(minimumLength("bbbbbbbbbbbb"));
	}

}
