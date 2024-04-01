package Leetcode;
import java.util.Arrays;

public class Leetcode455 {
    public static int findContentChildren(int[] g, int[] s) {
    	Arrays.sort(g);
    	Arrays.sort(s);
    	int noOfChild=g.length;
    	int noOfCokie=s.length;
        int sp=0, c=0;
    	for(int gp=0; gp<noOfChild;gp++) {
    		while(sp<noOfCokie && s[sp]<g[gp]) {
    			sp++;
    		}
    		if(sp<noOfCokie ) {
    			c++;
    			sp++;
    		}else {
    			break;
    		}
    	}
    	return c;
    }
    
	public static void main(String[] args) {
		int[] g = {10,9,8,7};
		int[] s = {5,6,7,8};
		System.out.println(findContentChildren(g, s));
		
	}

}
