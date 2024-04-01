package Leetcode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1624 {
	public static int maxLengthBetweenEqualCharacters(String s) {
		Map<Character, Integer> mapS = new HashMap<>();
		for(int i =0; i<s.length(); i++) {
			mapS.put(s.charAt(i), i);
		}
		int maxLength = Integer.MIN_VALUE;
		for(int i =0; i<s.length(); i++) {
			if(mapS.get(s.charAt(i))-i-1>maxLength) {
				maxLength=mapS.get(s.charAt(i))-i-1;
			}
		}
        return Math.max(maxLength, -1);
    }

	public static void main(String[] args) {
		String str = "abbaba";
		System.out.println(Leetcode1624.maxLengthBetweenEqualCharacters(str));
	}

}
