package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode205 {

	static public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length())
            return false;
        Map<Character, Character> replace = new HashMap<>();
        for(int i =0; i<s.length();i++){
            if(!replace.containsKey(s.charAt(i)) &&
                    !replace.containsKey(t.charAt(i))){
                replace.put(s.charAt(i), t.charAt(i));
            } else{
                if(s.charAt(i) != (replace.get(t.charAt(i))) ||
                        t.charAt(i) != (replace.get(s.charAt(i)))){
                    return false;
                }
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
