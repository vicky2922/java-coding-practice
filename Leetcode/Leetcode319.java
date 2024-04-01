package Leetcode;

import java.util.Arrays;

public class Leetcode319 {

	static public int bulbSwitch(int n) {
		return (int) Math.sqrt(n+0.5);
    }
	
	public static void main(String[] args) {
		System.out.println(bulbSwitch(5));
	}

}
