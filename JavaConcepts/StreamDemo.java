package JavaConcepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		int[] intArr = {1,6,4,3,6,9,2};
		
		Arrays.stream(intArr).sorted().toArray();//return int[]
		
		//to use comparator - need to convert to wrapper by boxed
		Arrays.stream(intArr).boxed().sorted(Comparator.reverseOrder()).toArray();//return object[]
		Arrays.stream(intArr).boxed().sorted(Comparator.reverseOrder()).mapToInt(e->e).toArray();//return int[]
		IntStream.of(intArr).sorted().toArray();//return int[]
		IntStream.of(intArr).boxed().sorted(Comparator.reverseOrder()).toArray();//return object[]
		IntStream.of(intArr).boxed().sorted(Comparator.reverseOrder()).mapToInt(e->e).toArray();//return int[]
		
		Arrays.stream(intArr).distinct().toArray();//return int[]
		IntStream.of(intArr).distinct().toArray();//return int[]
		
		Integer[] wrapArr= {1,2,5,3};
		Arrays.stream(wrapArr).sorted().toArray();//return object[]
		Arrays.stream(wrapArr).mapToInt(e->e).toArray();//return int[]
		
		String str = "#I love java#";
		String rev1 = Stream.of(str).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(""));
		//System.out.println(rev1);
		
		Optional<String> rev2 = str.chars().mapToObj(ch -> String.valueOf((char)ch)).reduce((e,v) -> v+e);
		//System.out.println(rev2.get());
		
	}

}
