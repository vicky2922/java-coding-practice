package Leetcode;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Leetcode387 {
	
	public static int firstUniqChar(String s) {
		Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		String[] str = s.split("");
		for(int i=0; i<str.length; i++) {
			if(map.get(str[i])==1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "loveleetcode";
		System.out.println(firstUniqChar(str));
	}

}
