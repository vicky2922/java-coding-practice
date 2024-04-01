package JavaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		// Map is use to tranform data
		List<String> countries = Arrays.asList("Bharat", "Nepal", "England", "Israel");
		List<String> mapCountries = countries.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(mapCountries);
		
		//Flat map is use to transform and flattern data
		//for nested/complex data
		List<List<String>> data = Arrays.asList(
				Arrays.asList("Java", "C#"),
				Arrays.asList("Angular", "React"),
				Arrays.asList("Mysql", "Mongodb"));
		List<String> flatmapData = data.stream().flatMap(List::stream).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(flatmapData);

	}

}
