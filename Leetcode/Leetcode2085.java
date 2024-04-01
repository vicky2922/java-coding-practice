package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2085 {
	
	static public int countWords(String[] words1, String[] words2) {
		
		Map<String, Integer> counts = new HashMap<>();
        for (String w : words1) {
            if (counts.containsKey(w)) {
                counts.put(w, counts.get(w)+1);
            } else {
                counts.put(w, 1);
            }
        }
        for (String w : words2) {
            if (counts.containsKey(w) && counts.get(w) < 2) {
                counts.put(w, counts.get(w)-1);
            }
        }
        int result = 0;
        for (String entry : counts.keySet()) {
            if (counts.get(entry) == 0) {
                result++;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		String[] words1 = {"leetcode","is","amazing","as","is"};
		String[] words2 = {"amazing","leetcode","is"};
		System.out.println(countWords(words1, words2));
	}

}
/*
2085. Count Common Words With One Occurrence

Given two string arrays words1 and words2, 

return the number of strings that appear exactly once in each of the two arrays.

*/