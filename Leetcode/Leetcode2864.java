package Leetcode;

public class Leetcode2864 {
	
	static public String maximumOddBinaryNumber(String s) {
		int zeros=0,ones=0;
		int l = s.length();
		for(int i = 0; i<l;i++) {
			if(s.charAt(i)=='1') {
				ones++;
			} else {
				zeros++;
			}
		}
		char[] output = new char[l];
		output[l-1]='1';
		ones--;
		int i = l-2;
		while(zeros--!=0) {
			output[i--]='0';
		}
		while(ones--!=0) {
			output[i--]='1';
		}
        return new String(output);
    }

	public static void main(String[] args) {
		System.out.println(maximumOddBinaryNumber("1010"));
	}

}

/*
2864. Maximum Odd Binary Number

You are given a binary string s that contains at least one '1'.

You have to rearrange the bits in such a way that 
the resulting binary number is the maximum odd binary number that can be created from this combination.

Return a string representing the maximum odd binary number that can be created from the given combination.

Note that the resulting string can have leading zeros.

*/