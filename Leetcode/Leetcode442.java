package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode442 {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		Leetcode442 obj = new Leetcode442();
		System.out.println(obj.findDuplicates(nums));
	}
	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for(int i = 0 ;i < nums.length; i++){
            int number = Math.abs(nums[i]);
            int index = number-1;
            if(nums[index] < 0){
                output.add(number);
            } else{
                nums[index] *= -1;
            }
        }
        return output;
    }
}

/*
Find All Duplicates in an Array

Medium

Given an integer array nums of length n where all the integers of nums are in the range [1, n] 
and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
*/