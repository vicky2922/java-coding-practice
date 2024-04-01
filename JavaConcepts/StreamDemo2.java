package JavaConcepts;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		String myName = "vickybhuvadishabhuva";
		
		//grouping by concept
		Arrays.stream(myName.split("")).collect(Collectors.groupingBy(Function.identity())).forEach((k,v) -> System.out.println(k+" : "+v));
		
		//calculate frequency of each char
		Map<String, Long> occu = Arrays.stream(myName.split(""))
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(occu);
		
		//find all duplicate
		List<String> duplicate = Arrays.stream(myName.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicate);
		
		//find all uniqe char
		List<String> uniqe = Arrays.stream(myName.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(uniqe);
		
		/* First non repeat character
		grouping by make HashMap
		so define linkedHashMap */
		Optional<String> firstNonRepeat = Arrays.stream(myName.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();
		System.out.println(firstNonRepeat.get());
		
		//second highest number from array
		int[] nums = {5,9,11,2,8,21,1};
		Optional<Integer> secondHighest = Arrays.stream(nums).boxed()	//need to convert to wrapper class
			.sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(secondHighest.get());
		
		//longest string from givem array
		String[] strings = {"java","techie","springboot","microservices"};
		//by max
		Optional<String> longestStr = Arrays.stream(strings).max((e1,e2)->e1.length()-e2.length());
		System.out.println(longestStr.get());
		//by reduce
		Optional<String> longestStr2 = Arrays.stream(strings).reduce((e1,e2)->e1.length()>e2.length()?e1:e2);
		System.out.println(longestStr2.get());
		
		//find element starts with 1
		List<String> oneArray = Arrays.stream(nums)
				.boxed().map(s->s+"")
				.filter(e->e.startsWith("1")).collect(Collectors.toList());
		System.out.println(oneArray);
		
		//String join example
		List<String> nos = Arrays.asList("1","2","3","4");
		String joined = String.join("-", nos);
		System.out.println(joined);
		
		//sort a map with stream
		List<Movie2> movieList = Arrays.asList(new Movie2(1, "Jawan", 4, 2019), new Movie2(2, "Pathan", 3, 2019),
				new Movie2(3, "Kantara", 5, 2019), new Movie2(4, "Jailer", 4, 2019), new Movie2(5, "Fighter", 5, 2024),
				new Movie2(6, "Animal", 5, 2023), new Movie2(7, "Dil Bechara", 4, 2020), new Movie2(8, "KGF", 4, 2021),
				new Movie2(9, "Pushpa", 4, 2022));

		System.out.println("--- Group movie list with rating ---");
		Map<Integer, List<String>> movieWithRating = movieList.stream().collect(
				Collectors.groupingBy(Movie2::getRating, Collectors.mapping(Movie2::getName, Collectors.toList())));
		System.out.println(movieWithRating);
		
		System.out.println("--- sort frequncy map by comparing key ---");
		occu.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("---  sort frequncy map by comparing value ---");
		occu.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("---  sort movie map by comparing key ---");
		movieWithRating.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("--- sort movie map by comparing name ---");
		Map<Movie2,Integer> movieMap = movieList.stream().collect(Collectors.toMap(Function.identity(), Movie2::getId));
		
		movieMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Movie2::getName)))
			.forEach((k)->System.out.println(k.getKey().getName()+" "+k.getValue()));
		
		System.out.println("--- Find Movie from list for given ids ---");
		int[] movieIds = {2,4,5,6,9};
		movieList.stream()
			.filter(e -> IntStream.of(movieIds).anyMatch(id -> id == e.getId()))
			.map(Movie2::getName)
			.forEach(System.out::println);
		
		
	}
}


class Movie2 {
	private int id;
	private String name;
	private int rating;
	private int year;
	
	public Movie2(int id, String name, int rating, int year) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getRating() {
		return rating;
	}
	public int getYear() {
		return year;
	}

}