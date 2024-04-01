package Leetcode;

public class Leetcode2827 {
	
	static public int numberOfBeautifulIntegers(int low, int high, int k) {
		int count = 0;
		int x = low % k;
		if (x != 0) {
			low += k - x;
		}
		if (high > 1e8) {
			high = (int) 1e8;
		}
		while (low <= high) {
			if (oddEven(low)) {
				count++;
			}
			low = low + k;
		}
		return count;
	}
	
	static boolean oddEven(int num) {
		int evenCount = 0, oddCount = 0;
		while (num != 0) {
			int digit = num % 10;
			if (digit % 2 == 0)
				evenCount++;
			else
				oddCount++;
			num = num / 10;
		}
		if (evenCount == oddCount)
			return true;
		return false;
	}
		

	public static void main(String[] args) {
		System.out.println(numberOfBeautifulIntegers(10, 18, 3));
	}

}

/*
2827. Number of Beautiful Integers in the Range
Hard

You are given positive integers low, high, and k.

A number is beautiful if it meets both of the following conditions:

The count of even digits in the number is equal to the count of odd digits.
The number is divisible by k.
Return the number of beautiful integers in the range [low, high].

*/
