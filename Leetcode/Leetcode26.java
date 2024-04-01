package Leetcode;
import java.util.Arrays;

public class Leetcode26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(Leetcode26.removeDuplicates(arr));
	}

	private static int removeDuplicates(int[] nums) {
	//	return (int) Arrays.stream(nums).distinct().count();
		int p=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[p]!=nums[i]) {
				nums[++p]=nums[i];
			}
		}
		return p+1;
	}

}
