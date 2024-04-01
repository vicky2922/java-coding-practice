package JavaConcepts;

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
Note 1: For primitive data types (int, char, etc.), 
one does not need to create a copy in the getter and setter methods, 
as the concept of references is absent for the primitive data types.

Note 2: Strings object types also work on the references. 
However, unlike the above examples, one does not need to take care of the String references exposed to the outside world. 
It is because Strings are immutable. Thus, when one manipulates the string in the main method (or anywhere else), 
a new String object is created, and the previous one remains untouched.

*/