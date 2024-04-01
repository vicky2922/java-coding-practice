package Leetcode;

import java.util.stream.IntStream;

public class Leetcode2798 {
	
	static public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		return (int) IntStream.of(hours).filter(e -> e>=target).count();
	}

	public static void main(String[] args) {
		int[] hours = {0,1,2,3,4};
		System.out.println(numberOfEmployeesWhoMetTarget(hours, 2));
	}

}
