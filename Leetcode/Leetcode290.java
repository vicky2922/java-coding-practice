package Leetcode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode290 {

    public static boolean wordPattern(String pattern, String s) {
    	String[] str = s.split(" ");
		Map<Character, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		if(pattern.length()!=str.length){
            return false;
        }
		for(int i = 0 ; i<pattern.length();i++) {
			if(!map.containsKey(pattern.charAt(i))) {
				if(set.contains(str[i])) {
					return false;
				}
				map.put(pattern.charAt(i), str[i]);
				set.add(str[i]);
			} else {
				if(!map.get(pattern.charAt(i)).equals(str[i])) {
					return false;
				}
			}
		}
        return true;
    }
    
	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog dog dog dog";
		System.out.println(wordPattern(pattern, s));
	}

}
