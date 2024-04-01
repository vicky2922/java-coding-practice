package Leetcode;
import java.util.Arrays;

public class Leetcode1619 {
	public static double trimMean(int[] arr) {
		Arrays.parallelSort(arr);
		int sum = 0;
		int mod = arr.length*5/100;
		for(int i = mod; i< arr.length-mod;i++) {
			sum+=arr[i];
		}
        return (double)sum/(arr.length-mod*2);
    }
	public static void main(String[] args) {
		int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
		System.out.println(trimMean(arr));
	}

}
