package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode2149 {

	public static int[] rearrangeArray(int[] nums) {
		int[] posNums = new int[nums.length/2];
		int[] negNums = new int[nums.length/2];
		int pos=0,neg=0;
		for(int i =0 ;i<nums.length;i++) {
			if(nums[i]>0) {
				posNums[pos++]=nums[i];
			} else {
				negNums[neg++]=nums[i];
			}
		}
		nums[0]=posNums[0];
		nums[1]=negNums[0];
		pos=1;
		neg=1;
		for(int i =2 ;i<nums.length;i++) {
			if(i%2==0) {
				nums[i]=posNums[pos++];
			} else {
				nums[i]=negNums[neg++];
			}
		}
		return nums;
		
		/*
		 int n=a.length;
        int []ans=new int[n];
       int posIndex=0,negIndex=1;
       for(int i=0;i<n;i++){
           if(a[i]>0){
               ans[posIndex]=a[i];
               posIndex+=2;
           }
           else{
               ans[negIndex]=a[i];
               negIndex+=2;
           }
       }
       return ans;
		 */
	}

	public static void main(String[] args) {
		int[] nums = {3,1,2,-5,-2,-4};
		Arrays.stream(rearrangeArray(nums)).forEach(System.out::println);
	}

}
