package Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode645 {

	public static int[] findErrorNums(int[] nums) {
		int l = nums.length;
		int[] freq = new int[l+1];
		Arrays.fill(freq, 0);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ;i < l ; i++) {
			freq[nums[i]]++;
		}
		for(int i = 1 ;i < l+1 ; i++) {
			if(freq[i]>1) {
				list.add(i);
			}
		}
		for(int i = 1 ;i < l+1 ; i++) {
			if(freq[i]==0) {
				list.add(i);
			}
		}
		int[] output = new int[list.size()];
		for(int i = 0 ;i < list.size() ; i++) {
			output[i] = list.get(i);
		}
        return output;
    }

	public static void main(String[] args) {
		int[] input = {1,1};
		int[] output = findErrorNums(input);
		for(int i = 0 ;i < output.length ; i++) {
			System.out.println(output[i]);
		}

	}

}
