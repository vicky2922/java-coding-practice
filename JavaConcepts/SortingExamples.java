package JavaConcepts;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SortingExamples {

	public static void main(String[] args) {
//#############	
		int[] nums = { 1, 4, 3, 2, 6 };
		int[] descnums = IntStream.of(nums)
		.boxed()	//to use comparator -> int to Integer (primitive to wrapper)
		.sorted(Comparator.reverseOrder())
		.mapToInt(e->e).toArray();
		
		int[] ascenums = IntStream.of(nums).sorted().toArray();
//#############	
		List<String> names = Arrays.asList("Vicky", "Rahul", "Meet", "Rajan", "Kishan", "Akki", "Kartik", "Dhaval", "Rathin", "Shrey");
	//	names.stream().sorted().forEach(System.out::println);
	//	names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//#############	
		List<Employee> listofEmp = new ArrayList<>();
		listofEmp.add(new Employee("Jhon", 1100, LocalDate.of(1999, 9, 23)));
		listofEmp.add(new Employee("Steav", 1500,LocalDate.of(1994, 9, 23)));
		listofEmp.add(new Employee("Emy", 1900, LocalDate.of(1997, 9, 23)));
		listofEmp.add(new Employee("Emy", 1100, LocalDate.of(1993, 9, 23)));
		listofEmp.add(new Employee("Emy", 1200, LocalDate.of(1998, 9, 23)));
		listofEmp.add(new Employee("Emy", 1900, LocalDate.of(1996, 9, 23)));
	//	listofEmp.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).forEach(e -> System.out.println(e.getName()+" - "+e.getSalary()));
	//	listofEmp.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getDob)).forEach(e -> System.out.println(e.getName()+" - "+e.getDob()));
//#############		
		List<Movie> movieList = Arrays.asList(new Movie(1, "Jawan", 4, 2023), 
				  new Movie(2, "Pathan", 3, 2023), 
				  new Movie(3, "Kantara", 5, 2022),
				  new Movie(4, "Jailer", 4, 2023),
				  new Movie(5, "Fighter", 5, 2024),
				  new Movie(6, "Animal", 5, 2023),
				  new Movie(7, "Dil Bechara", 4, 2020),
				  new Movie(8, "KGF", 4, 2021),
				  new Movie(9, "Pushpa", 4, 2022));
	//	movieList.stream().sorted(Comparator.comparing(Movie::getYear).thenComparing(Movie::getRating)).forEach(e -> System.out.println(e.getName()+" - "+e.getRating()+" - "+e.getYear()));
	//	movieList.stream().filter(e -> e.getYear()==2023).sorted(Comparator.comparing(Movie::getRating).reversed()).forEach(e -> System.out.println(e.getName()+" - "+e.getRating()+" - "+e.getYear()));
//#############			
		String[] strArray = {"jawan", "kick", "96", "dil bechara"};
		//sort string array based on length
	//	Arrays.stream(strArray).sorted().forEach(System.out::println);
		Arrays.stream(strArray).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
//#############	
	}

}

class Movie {
	private int id;
	private String name;
	private int rating;
	private int year;
	
	public Movie(int id, String name, int rating, int year) {
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
class Employee {
	private String name;
	private double salary;
	private LocalDate dob;

	public Employee(String name, double salary, LocalDate dob) {
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getDob() {
		return dob;
	}

}
