package Leetcode;

public class Leetcode724_1991 {
	
	static public int pivotIndex(int[] nums) {
		int l = nums.length;
        int[] sumLeft = new int[l];
        int[] sumRight = new int[l];
        sumRight[0]=0;
        for(int i = 1; i< l;i++) {
        	sumRight[i] = sumRight[i-1]+nums[i-1]; 
        }
        sumLeft[l-1]=0;
        for(int i = l-2; i>=0;i--) {
        	sumLeft[i] = sumLeft[i+1]+nums[i+1]; 
        }
        for(int i = 0; i< l;i++) {
        	if(sumLeft[i]==sumRight[i])
        		return i;
        }
        return -1;
    }

	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
	}
	//1,7,3,6,5,6
	//0,1,8,11,17,23
	//27,20,17,11,6,0
}

/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where 
the sum of all the numbers strictly to the left of the index is 
equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, 
then the left sum is 0 because there are no elements to the left. 
This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/