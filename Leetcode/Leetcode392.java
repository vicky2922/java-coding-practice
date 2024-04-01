package Leetcode;

public class Leetcode392 {

	public static void main(String[] args) {
		String s="axc";
		String t="ahbgdc";
		Leetcode392 obj = new Leetcode392();
		System.out.println(obj.isSubsequence(s, t));
	}
	
	 public boolean isSubsequence(String s, String t) {
	        int i=0,j=0;
	        int m = s.length();
	        int n = t.length();
	        while(i<m && j<n) {
	        	if(s.charAt(i)==t.charAt(j)) {
	        		i++;
	        	}
	        	j++;
	        }
	        return i==m;
	 }

}
