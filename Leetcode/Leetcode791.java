package Leetcode;

import java.util.Arrays;

public class Leetcode791 {

	public static void main(String[] args) {
		String order = "cba";
		String s = "abcd";
		System.out.println(customSortString(order,s));
	}

	private static String customSortString(String order, String s) {
		int[] freq = new int[128];
		Arrays.fill(freq, 0);
		for(int i = 0 ; i< s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< order.length(); i++) {
			if(freq[order.charAt(i)]!=0) {
				while(freq[order.charAt(i)]!=0) {
					sb.append(order.charAt(i));
					freq[order.charAt(i)]--;
				}
			}
		}
		for(int i = 0 ; i< freq.length; i++) {
			if(freq[i]!=0) {
				while(freq[i]!=0) {
					sb.append((char)i);
					freq[i]--;
				}
			}
		}
		return sb.toString();
	}

}
