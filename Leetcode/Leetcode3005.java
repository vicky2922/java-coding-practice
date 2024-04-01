package Leetcode;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Leetcode3005 {
	
	static public int maxFrequencyElements(int[] nums) {
		
		Map<Integer, Long> freq = IntStream.of(nums).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		long max = 0;
		for(Integer l : freq.keySet()) {
			if(max<freq.get(l)) {
				max = freq.get(l);
			}
		}
		long answer = 0;
		for(Integer l : freq.keySet()) {
			if(max==freq.get(l)) {
				answer+=max;
			}
		}
		return (int)answer;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,1,4};
		System.out.println(maxFrequencyElements(nums));
	}

}

/*
3005. Count Elements With Maximum Frequency

You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
*/