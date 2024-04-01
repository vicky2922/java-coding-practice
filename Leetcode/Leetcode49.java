package Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode49 {

	public static void main(String[] args) {
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> output = Leetcode49.groupAnagrams(str);
		output.forEach(e -> System.out.println(e.toString()));
	}

	private static List<List<String>> groupAnagrams(String[] str) {
		String[] sortedStr = new String[str.length];
		for(int i = 0 ; i<str.length; i++) {
			String[] temp = str[i].split("");
			Arrays.sort(temp);
			sortedStr[i] = String.join("", temp);
			//System.out.println(sortedStr[i]);
		}
		Map<String, List<String>> groupedAnagrams = new HashMap<>();
		for(int i = 0 ; i<sortedStr.length; i++) {
			if(groupedAnagrams.containsKey(sortedStr[i])) {
				groupedAnagrams.get(sortedStr[i]).add(str[i]);
			} else {
				List<String> list = new ArrayList<>();
				list.add(str[i]);
				groupedAnagrams.put(sortedStr[i], list);
			}
		}
		List<List<String>> output = new ArrayList<>();
		for(String s : groupedAnagrams.keySet()) {
			output.add(groupedAnagrams.get(s));
		}
		return output;
	}

}
