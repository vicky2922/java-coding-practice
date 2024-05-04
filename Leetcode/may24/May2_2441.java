package Leetcode.may24;

import java.util.HashSet;
import java.util.Set;

public class May2_2441 {

	public static void main(String[] args) {
		May2_2441 obj = new May2_2441();
		int[] nums = {-1,10,6,7,-7,1};
		System.out.println(obj.findMaxK(nums));
	}
	
    public int findMaxK(int[] nums) {
    	int max = Integer.MIN_VALUE;
    	Set<Integer> set = new HashSet<>();
    	for(int i = 0 ; i < nums.length; i++) {
    		set.add(nums[i]);
    	}
    	for(int i = 0 ; i < nums.length; i++) {
    		if(nums[i]<0) {
    			int abs = Math.abs(nums[i]);
    			if(set.contains(abs) && max < abs) {
    				max = abs;
    			}
    		}
    	}
        return Math.max(max, -1);
    }

}
//EASY