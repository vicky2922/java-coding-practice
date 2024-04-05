package Leetcode;

public class Leetcode1614 {

	public static void main(String[] args) {
		String s = "(1)+((2))+(((3)))";
		Leetcode1614 obj = new Leetcode1614();
		System.out.println(obj.maxDepth(s));
	}
	
	public int maxDepth(String s) {
        int counter = 0;
        int maxDepth = 0;
        for(char c : s.toCharArray()) {
        	if(c=='(')
        		counter++;
        	if(c==')')
        		counter--;
        	maxDepth = Math.max(maxDepth, counter);
        }
        return maxDepth;
    }

}
