package JavaConcepts;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		// Creating a Box for Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setData(10);
        System.out.println("Integer value: " + integerBox.getData());

        // Creating a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setData("Hello, world!");
        System.out.println("String value: " + stringBox.getData());
        
        //Creating integer list
        GenericList<Integer> integerList = new GenericList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.display();

        //Creating String list
        GenericList<String> stringList = new GenericList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.display();
	}

}

class Box<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class GenericList<T> {
    private List<T> list;

    public GenericList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public void display() {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
