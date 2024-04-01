package JavaConcepts;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println("Arraylist example");
		try {
			for(Integer x : list1) {
				System.out.println(x);
				list1.add(1);
			}
		} catch(ConcurrentModificationException e) {
			e.printStackTrace();
		}
		
		list1 = new CopyOnWriteArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println("CopyOnWriteArrayList example");
		for(Integer x : list1) {
			System.out.println(x);
			list1.add(1);
		}
		System.out.println("Printing after adding");
		for(Integer x : list1) {
			System.out.println(x);
		}
		
		
	}

}
