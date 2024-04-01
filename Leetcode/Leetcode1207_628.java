package Leetcode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Leetcode1207_628 {

	/* 1207
	 * Example 2:
		Input: arr = [1,2]
		Output: false
		
		Example 3:
		Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
		Output: true
	 */
	
	/*628
	 * Example 1:
		Input: nums = [1,2,3]
		Output: 6
		
		Example 2:
		Input: nums = [1,2,3,4]
		Output: 24
		
		Example 3:
		Input: nums = [-1,-2,-3]
		Output: -6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1,2};
		boolean b = uniqueOccurrences(arr);
		System.out.println(b);
		
		int[] arr2 = {-100,-98,-1,2,3,4};
		int x = maximumProduct(arr2);
		System.out.println(x);
	}

	private static int maximumProduct(int[] arr2) {
		Arrays.sort(arr2);
		int len = arr2.length;
		int mul1 = arr2[len-1]*arr2[len-2]*arr2[len-3];
		int mul2 = Integer.MIN_VALUE;
		if(len>=4) {
			mul2 = arr2[len-1]*arr2[0]*arr2[1];
		}
		return Math.max(mul1, mul2);
	}

	private static boolean uniqueOccurrences(Integer[] arr) {
	/*	Map<Integer, Long> occu = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<Long> uniq = new HashSet<>();
		for(Integer e : occu.keySet()) {
			if(uniq.contains(occu.get(e))) {
				return false;
			}
			uniq.add(occu.get(e));
		}
		return true;
		*/
		Map<Integer, Long> occu = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(occu.containsKey(arr[i])) {
				occu.put(arr[i], occu.get(arr[i])+1);
			} else {
				occu.put(arr[i], (long) 1);
			}
		}
		Set<Long> uniq = new HashSet<>();
		for(Integer e : occu.keySet()) {
			if(uniq.contains(occu.get(e))) {
				return false;
			}
			uniq.add(occu.get(e));
		}
		return true;
		
	}

}
