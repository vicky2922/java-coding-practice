package Leetcode;

public class Leetcode1422 {

	public static int maxScore(String s) {
		int max=0;
		int left=0,right=0;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)=='1') {
				right++;
			}
		}
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)=='0') {
				left++;
			}else {
				right--;
			}
			max=Math.max(max, left+right);
		}
		return max;
		
		/*
		int len = s.length();
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 0;
        right[len-1]=0;
        String[] bin = s.split("");
        for(int i=1; i<len; i++) {
        	if((bin[i-1]).equals("0")) {
        		left[i]=left[i-1]+1;
        	} else {
        		left[i]=left[i-1];
        	}
        }
        for(int i=len-2; i>=0; i--) {
        	if((bin[i+1]).equals("1")) {
        		right[i]=right[i+1]+1;
        	} else {
        		right[i]=right[i+1];
        	}
        }
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<len-1; i++) {
        	if(max<left[i+1]+right[i]) {
        		max = left[i+1]+right[i];
        	}
        }
        System.out.println(max);
        */
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "011101";
		System.out.println(maxScore(s));
		
		
	}

}
