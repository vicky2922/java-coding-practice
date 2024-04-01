package Leetcode;

import java.util.stream.IntStream;

public class Leetcode977 {

	 public static int[] sortedSquares(int[] nums) {
		 return IntStream.of(nums).map(e->e*e).sorted().toArray();
	 }
	 
	public static void main(String[] args) {
		int[] nums = {-7,-3,2,3,11};
		IntStream.of(sortedSquares(nums)).forEach(System.out::println);
	}

}
/*
Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

*/