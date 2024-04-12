package Leetcode;

import java.util.Arrays;

public class Leetcode75 {

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		Leetcode75 obj = new Leetcode75();
		Arrays.stream(obj.sortColors(nums)).forEach(System.out::println);
	}
	
    public int[] sortColors(int[] nums) {
     int zeros=0;
     int ones=0;
     int twos=0;
     for(int i=0;i<nums.length;i++) {
    	 if(nums[i]==0)
    		 zeros++;
    	 else if(nums[i]==1)
    		 ones++;
    	 else
    		 twos++;
     }
     int i=0;
     while(zeros--!=0) {
    	 nums[i++]=0;
     }
     while(ones--!=0) {
    	 nums[i++]=1;
     }
     while(twos--!=0) {
    	 nums[i++]=2;
     }
     
     return nums;
    }

}
