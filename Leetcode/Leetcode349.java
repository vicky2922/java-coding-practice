package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode349 {
	
	static public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0 ; i<nums1.length; i++) {
        	set1.add(nums1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0 ; i<nums2.length; i++) {
        	if(set1.contains(nums2[i])) {
        		set2.add(nums2[i]);
        	}
        }
        int[] output = new int[set2.size()];
        int i=0;
        for(Integer x : set2) {
        	output[i++] = x;
        }
        return output;
    }

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,3,1};
		int[] nums2 = {2,2};
		Arrays.stream(intersection(nums1, nums2)).forEach(System.out::println);
	}

}
/*
Intersection of Two Arrays
*/