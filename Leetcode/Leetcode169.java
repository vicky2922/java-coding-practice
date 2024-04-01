package Leetcode;

public class Leetcode169 {

	public static int majorityElement(int[] nums) {
        int major=0, count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                major=nums[i];
            }
            if(major==nums[i]){
                count++;
            } else{
                count--;
            }
        }
        return major;
    }
	
	public static void main(String[] args) {
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}

}
