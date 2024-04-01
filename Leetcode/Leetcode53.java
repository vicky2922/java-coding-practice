package Leetcode;

public class Leetcode53 {
	public static int maxSubArray(int[] nums) {
        int maxTill=0, max=Integer.MIN_VALUE;
        for(int i = 0; i <nums.length;i++){
            maxTill = maxTill+nums[i];
            if(max<maxTill){
                max=maxTill;
            }
            if(maxTill<0){
                maxTill=0;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

}
