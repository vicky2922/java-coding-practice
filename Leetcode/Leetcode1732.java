package Leetcode;

public class Leetcode1732 {
	
	public static int largestAltitude(int[] gain) {
        int maxAlt=0, max=0;
        for(int i = 0 ; i<gain.length;i++) {
        	max+=gain[i];
        	if(max>maxAlt) {
        		maxAlt=max;
        	}
        }
        return maxAlt;
    }

	public static void main(String[] args) {
		int[] gain = {-4,-3,-2,-1,4,3,2,-5,1,8,0};
		System.out.println(largestAltitude(gain));
	}

}
