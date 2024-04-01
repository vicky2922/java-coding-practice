package Leetcode;

public class Leetcode231and268 {

	public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i = 0 ; i <n;i++){
            sum-=nums[i];
        }
        return sum==0?0:sum;
    }
	
	public static boolean isPowerOfTwo(int n) {
		return n>0 && ((n&(n-1))==0);
	}
	public static void main(String[] args) {
		//231
		System.out.println(isPowerOfTwo(3));
		
		//268
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}

}
