package Leetcode;

public class Leetcode27 {
	public static int removeElement(int[] nums, int val) {
		int p=0,count=0;
		for(int i = 0; i<nums.length;i++) {
			if(nums[i]==val) {
				count++;
			} else {
				nums[p++]=nums[i];
			}
		}
        return nums.length-count;
    }

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val =2;
		System.out.println(Leetcode27.removeElement(nums, val));
		
	}

}
