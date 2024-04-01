package Leetcode;

public class Leetcode1827 {
	static public int minOperations(int[] nums) {
		int op=0;
		if(nums.length==1) {
			return 0;
		}
		for(int i=1;i<nums.length; i++) {
			if(nums[i]<=nums[i-1]) {
				int temp = nums[i];
				nums[i] = nums[i-1]+1;
				op =op+(nums[i]-temp);
			}
		}
        return op;
    }

	public static void main(String[] args) {
		int[] nums = {1,5,2,4,1};
		System.out.println(minOperations(nums));
	}

}
