package Leetcode;

public class Leetcode2540 {

	static public int getCommon(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int i=0,j=0;
        while(i<l1 && j<l2) {
        	if(nums1[i]==nums2[j]) {
        		return nums1[i];
        	} else if(nums1[i]>nums2[j]) {
        		j++;
        	} else {
        		i++;
        	} 
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4,5};
		int[] nums2 = {5};
		System.out.println(getCommon(nums1, nums2));
	}

}

/*
Given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.


*/