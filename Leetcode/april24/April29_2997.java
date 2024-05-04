package Leetcode.april24;

public class April29_2997 {

	public static void main(String[] args) {
		April29_2997 obj = new April29_2997();
		int[] nums = {2,1,3,4};
		System.out.println(obj.minOperations(nums, 1));
	}
	
	public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int x : nums) {
        	sum = sum ^ x;
        }
        return getBitDiff(sum, k);
    }

	private int getBitDiff(int sum, int k) {
		int ans = 0;
		for(int i = 0 ; i<31 ; i++) {
			if(checkBit(sum, k, i))
				ans++;
		}
		return ans;
	}

	private boolean checkBit(int sum, int k, int i) {
		return (sum & (1 << i)) != (k & (1 << i));
	}

}
