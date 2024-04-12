package Leetcode;

public class Leetcode42 {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};//{4,2,0,3,2,5};
		Leetcode42 obj = new Leetcode42();
		System.out.println(obj.trap(height));
		
	}
	
    public int trap(int[] height) {
    	int n = height.length;
        int[] maxLeft = new int[n];
        maxLeft[0] = height[0];
        for(int i = 1 ; i<n ; i++) {
        	maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
        }
        int[] maxRight = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ; i--) {
        	maxRight[i] = Math.max(maxRight[i+1], height[i]);
        }
        for(int i = 0 ; i<n ; i++) {
        	maxRight[i] = Math.min(maxRight[i], maxLeft[i]);
        }
        int answer=0;
        for(int i = 0 ; i<n ; i++) {
        	answer += Math.abs(maxRight[i]-height[i]);
        }
        return answer;
    }

}
// 0,1,0,2,1,0,1,3,2,1,2,1 ..1 original
// 0,1,1,2,2,2,2,3,3,3,3,3 ..2 maxLeft
// 3,3,3,3,3,3,3,3,2,2,2,1 ..3 maxRight
// 0,1,1,2,2,2,2,3,2,2,2,1 ..4 min(maxLeft, maxRight)
// 0,0,1,0,1,2,1,0,0,1,0,0 ..5 (4-1)


/*
 * 
 * Trapping Rain Water

Hard

Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.
*/
