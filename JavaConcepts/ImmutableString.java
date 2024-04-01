package JavaConcepts;

public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Sachin";
		String str2 = "Sachin";
		//refering same object in string pool
		System.out.println(str1==str2);
		
		String str3 = new String("Sachin");//create new object in heap memory
		System.out.println(str3==str2);
		
	}

}
