package Leetcode;
import java.util.Arrays;

public class Leetcode238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 0};
		Arrays.stream(productExceptSelf(nums)).forEach(e -> System.out.println(e));

	}
	public static int[] productExceptSelf(int[] nums) {
		boolean isZero = false;
		boolean isNz = false;
		int zeroCount = 0;
		int[] output = new int[nums.length];
		int product=1;
		for(int i = 0 ; i<nums.length; i++) {
			if(nums[i]!=0) {
				isNz=true;
				product=product*nums[i];
			} else {
				isZero=true;
				zeroCount++;
			}
		}
		for(int i = 0 ; i<nums.length; i++) {
			if(isZero) {
				if(nums[i]==0 && isNz && zeroCount==1) {
					output[i]=product;
				}else {
					output[i]=0;
				}
			} else {
				output[i]=product/nums[i];
			}
		}
		return output;
        
    }
}
