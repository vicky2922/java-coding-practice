package Leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Leetcode242 {
	
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		Map<String, Long> map = new HashMap<>();
		map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		String[] tArr = t.split("");
		for (String x : tArr) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)-1);
				if(map.get(x)<0) {
					return false;
				}
			} else {
				return false;
			}
		}
        return true;
        /*
		String[] sArr = s.split("");
		Arrays.parallelSort(sArr);
		String sStr = String.join("", sArr);
		String[] tArr = t.split("");
		Arrays.parallelSort(tArr);
		String tStr = String.join("", tArr);
		if(!sStr.equals(tStr)) {
			return false;
		}
		return true;
		*/
    }

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagarar";
		System.out.println(isAnagram(s, t));
	}

}
