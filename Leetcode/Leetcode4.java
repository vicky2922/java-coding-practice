package Leetcode;

public class Leetcode4 {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] merged = new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(nums1[i]<nums2[j]) {
				merged[k++]=nums1[i];
				i++;
			} else if(nums1[i]>nums2[j]) {
				merged[k++]=nums2[j];
				j++;
			} else {
				merged[k++]=nums1[i];
				merged[k++]=nums2[j];
				i++;
				j++;
			}
		}
		if(i==m) {
			while(j<n) {
				merged[k++]=nums2[j++];
			}
		} else if(j==n) {
			while(i<m) {
				merged[k++]=nums1[i++];
			}
		}
		
		double ans=0.0;
		if((m+n)%2==0) {
			ans = (double)(merged[(m+n)/2] + merged[(m+n-1)/2])/2;
		} else {
			ans = (double) merged[(m+n)/2];
		}
		return ans;
        
    }

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

}
