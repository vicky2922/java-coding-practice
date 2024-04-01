package Interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Naggaro {

	public static void main(String[] args) {
		String str = "vickykciv";

		//1//check palindrom
		String tstr = str.replaceAll("\\s+", "").toLowerCase();
		System.out.println(IntStream.range(0, tstr.length()/2)
				.noneMatch(i -> tstr.charAt(i) != tstr.charAt(tstr.length()-i-1)));
		
		System.out.println(IntStream.range(0, tstr.length()/2)
				.allMatch(i -> tstr.charAt(i) == tstr.charAt(tstr.length()-i-1)));
		
		//2starting of s2 in s1
/*		String s1= "abcd";
		String s2 = "cd";

		String[] strArr = s1.split(s2);

		if(strArr[0].length==s1.length){sop("not present");}
		else{
		return strArr[0].length+1;
		}
		*/
		
		
		//3// return string with highest vowels
		List<String> listStr = Arrays.asList("vicky", "hiten", "bhuv");
		int maxCnt=0;
		String finalString="";
		for(String s:listStr) {
			int cnt=0;
			for(char c:s.toCharArray()) {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					cnt++;
				}
			}
			if(cnt>maxCnt) {
				maxCnt=cnt;
				finalString=s;
			}
		}
		System.out.println("without stream - "+finalString);
		
		//with stream api - max
		Optional<String> output = listStr.stream().max((e, v) -> (e.toLowerCase().replaceAll("[^aeiou]", "").length()
				- v.toLowerCase().replaceAll("[^aeiou]", "").length()));
		System.out.println("with stream max - " + output.get());
		
		//with stream api - reduce
		Optional<String> output2 = listStr.stream().reduce((e, v) -> e.toLowerCase().replaceAll("[^aeiou]", "")
				.length() > v.toLowerCase().replaceAll("[^aeiou]", "").length() ? e : v);
		System.out.println("with stream reduce - " + output2.get());
		
		//4// count of vowels in each strings
		Map<String, Integer> counts = listStr.stream().collect(
				Collectors.toMap(Function.identity(), e -> e.toLowerCase().replaceAll("[^aeiou]", "").length()));
		counts.forEach((e, v) -> {
			System.out.println(e + " [" + v + "]");
		});
		
		
	}

}
