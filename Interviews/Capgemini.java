package Interviews;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgemini {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		//1
		Optional<String> firstRepatChar =  Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).findFirst();
		System.out.println("firstRepatChar->" +firstRepatChar.get());
				
		Optional<String> firstnonRepatChar =	Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();
		System.out.println("firstnonRepatChar->" +firstnonRepatChar.get());
		
		//2
		System.out.println("Sorted Employees");
		List<Employee> listofEmp = new ArrayList<>();
		listofEmp.add(new Employee("Jhon", 1100, LocalDate.of(1999, 9, 23)));
		listofEmp.add(new Employee("Steav", 1500,LocalDate.of(1994, 9, 23)));
		listofEmp.add(new Employee("Emy", 1900, LocalDate.of(1997, 9, 23)));
		listofEmp.add(new Employee("Emy", 1100, LocalDate.of(1993, 9, 23)));
		listofEmp.add(new Employee("Emy", 1200, LocalDate.of(1998, 9, 23)));
		listofEmp.add(new Employee("Emy", 1900, LocalDate.of(1996, 9, 23)));
		listofEmp.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getDob)).forEach(e -> System.out.println(e.getName()+" - "+e.getDob()));
	}

}

/* 3

department wise employee count

select d.name, count(e.id) 
from 
employee e inner join department d 
on d.id = e.dep_id 
group by d.name;

*/

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