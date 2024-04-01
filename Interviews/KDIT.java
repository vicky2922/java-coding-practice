package Interviews;

import java.util.HashMap;
import java.util.Map;

public class KDIT {

	public static void main(String[] args) {
		String str = "abcddcbaefgijpq";
		Map<Character, Integer> occ = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(!occ.containsKey(c)) {
				occ.put(c, 1);
			} else {
				occ.put(c, occ.get(c)+1);
			}
		}
	
		for(char c : occ.keySet()) {
			System.out.println(c+" : "+occ.get(c));
		}
		
		/*
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().forEach(e );
			*/
	}

}

class singletone{
	private static singletone singletonObj;
	
	public singletone() {
	}
	
	public static singletone getInstance() {
		if(singletonObj!= null) {
			return new singletone();
		}
		return singletonObj;
	}
	
}
