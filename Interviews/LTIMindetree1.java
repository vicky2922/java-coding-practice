package Interviews;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class LTIMindetree1 {

	public static void main(String[] args) {
		String str = "vicky i am a good developer";

		Map<String, Long> singleOccu = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
		//.map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(singleOccu);
		
		// Experimenting with Functional Interface
		Square sq = (int x) -> x*x;
		Square sq2 = (int x) -> x+x;
		
		System.out.println(sq.calculate(5));
		System.out.println(sq2.calculate(5));	
		
		//Inbuilt FI
		Runnable ru = () -> {
			System.out.println("Hello");
		};
		ru.run();
	}

}
