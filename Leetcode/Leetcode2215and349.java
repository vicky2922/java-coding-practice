package Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode2215and349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,1,2,3};
		int[] nums2 = {2,2,3,4,5};
		System.out.println(findDifference(nums1, nums2).toString());

	}

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> distinct1 = new HashSet<>();
		for(int i=0; i<nums1.length; i++) {
			distinct1.add(nums1[i]);
		}
		Set<Integer> distinct2 = new HashSet<>();
		for(int i=0; i<nums2.length; i++) {
			distinct2.add(nums2[i]);
		}
		List<Integer> list1 = new ArrayList<>();
		for(Integer e : distinct1) {
			if(!distinct2.contains(e)) {
				list1.add(e);
			}
		}
		List<Integer> list2 = new ArrayList<>();
		for(Integer e : distinct2) {
			if(!distinct1.contains(e)) {
				list2.add(e);
			}
		}
		List<List<Integer>> output = new ArrayList<>();
		output.add(list1);
		output.add(list2);
		
		return output;
        
    }
	
	
	//349
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> distinct1 = new HashSet<>();
		for(int i=0; i<nums1.length; i++) {
			distinct1.add(nums1[i]);
		}
		Set<Integer> distinct2 = new HashSet<>();
		for(int i=0; i<nums2.length; i++) {
			distinct2.add(nums2[i]);
		}
		List<Integer> list1 = new ArrayList<>();
		for(Integer e : distinct1) {
			if(distinct2.contains(e)) {
				list1.add(e);
			}
		}
		int len = list1.size();
		int[] output = new int[len];
		for(int i=0; i<len;i++) {
			output[i]= list1.get(i);
		}
		return output;
        
    }

}
